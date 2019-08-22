package org.redi.backend;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity(name = "courses") //required to be saved
public class Course {
    //you can get hibernate to create the id for you
   
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Id
    @Column(name = "id", nullable = false, unique = true, length = 11)
    private int courseId;

    private String room;
    private String courseName;
    private int duration;

    @OneToOne
    @JoinColumn(name="id") ///column in teachers table
    Teacher teacher;

    int maxStudents;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "ModuelCourse",
            joinColumns = { @JoinColumn(name = "courseId") },
            inverseJoinColumns = { @JoinColumn(name = "moduleId") })
    List<Module> module = new LinkedList<Module>();
    
    

  

	@OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "attends",
            joinColumns = { @JoinColumn(name = "courseId") },
            inverseJoinColumns = { @JoinColumn(name = "studentId") })
    List<Student> students  = new LinkedList<Student>(); //Doesnt work if reference type = LinkedList must use interface

	
    //hibernate requires constructor with no parameters
    public Course() { 
    	
    	
    }

    
    
    public List<Module> getModule() {
		return module;
	}



	public void setModule(List<Module> module) {
	
		
		this.module = module;
		
	}



	public Course(int courseId, String courseName,int duration, int maxStudents)
    {
    	this.maxStudents=maxStudents;
    	this.duration=duration;
       this.courseId=courseId;
        this.courseName =  courseName;
        this.maxStudents = maxStudents;
    }

    public void attendClass(Student student){
        if(students.size()< maxStudents)
            students.add(student);
    }

    public int getId() {
        return courseId;
    }

    public void setId(int id) {
        this.courseId = id;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getTopic() {
        return courseName;
    }

    public void setTopic(String topic) {
        this.courseName = topic;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + courseId +
                ", room='" + room + '\'' +
                ", topic='" + courseName + '\'' +
                ", teacher=" + teacher +
                ", maxStudents=" + maxStudents +
                ", students=" + students +
                '}';
    }
}
