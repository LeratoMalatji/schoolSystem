package org.redi.backend;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.*;

@Entity(name = "teachers") //required to be saved
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true, length = 11)
    int teacherID;
    private  String name;
    private String profession;
   
    private String surname;
   	private String gender;
   	private String race;
   	private String nationality;
   	private String age;
   	private String password;

    

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Teaches",
            joinColumns = { @JoinColumn(name = "teacherID") },
            inverseJoinColumns = { @JoinColumn(name = "moduleId") })
    List<Module> module = new LinkedList<Module>();
    
    
    //hibernate requires constructor with no parameters
    public Teacher() { }

    public Teacher(String name , String profession, int teacherID) {
        this.name = name;
        this.profession = profession;
        this.teacherID = teacherID;
    }
    
    
    

    public int getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Module> getModule() {
		return module;
	}

	public void setModule(List<Module> module) {
		this.module = module;
	}

	@Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + teacherID +
                ", name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}
