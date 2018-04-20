package org.redi.backend;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity(name = "courses") //required to be saved
public class Course {
    //you can get hibernate to create the id for you
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true, length = 11)
    int id;

    String room;
    String topic;

    @OneToOne
    @JoinColumn(name="id") ///column in teachers table
    Teacher teacher;

    int maxStudents;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "attends",
            joinColumns = { @JoinColumn(name = "courseId") },
            inverseJoinColumns = { @JoinColumn(name = "studentId") })
    List<Student> students  = new LinkedList<Student>(); //Doesnt work if reference type = LinkedList must use interface

    //hibernate requires constructor with no parameters
    public Course() { }

    public Course(String topic, String room, Teacher teacher, int maxStudents)
    {
        this.teacher = teacher;
        this.room = room;
        this.topic =  topic;
        this.maxStudents = maxStudents;
    }

    public void attendClass(Student student){
        if(students.size()< maxStudents)
            students.add(student);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
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
                "id=" + id +
                ", room='" + room + '\'' +
                ", topic='" + topic + '\'' +
                ", teacher=" + teacher +
                ", maxStudents=" + maxStudents +
                ", students=" + students +
                '}';
    }
}
