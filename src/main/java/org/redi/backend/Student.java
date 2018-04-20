package org.redi.backend;

import javax.persistence.*;

@Entity //required to be saved
@Table(name = "students") //if your table is called student, then this is not required!
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

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                '}';
    }
}
