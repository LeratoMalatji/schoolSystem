package org.redi.backend;

import javax.persistence.*;

@Entity(name = "students") //required to be saved
public class Student{
    //you can get hibernate to create the id for you. You must use the @id annotation to tell hibernate this is the
    //primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true, length = 11)
    private int studentID;

    //you can exclude this annotation when the variable name is the same as the column name in the table
    //@Column(name = "id")
    private String name;
    private String surname;
   	private String gender;
   	private String race;
   	private String nationality;
   	private String age;
   	private String password;

	
	private  Address address = new  Address();
	

	
	private ContactDetails contactDetails = new ContactDetails();
   	
   	
    //hibernate requires constructor with no parameters
    public Student() { }

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
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
	
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}

	@Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                '}';
    }
}
