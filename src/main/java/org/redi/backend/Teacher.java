package org.redi.backend;

import javax.persistence.*;

@Entity(name = "teachers") //required to be saved
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true, length = 11)
    int teacherID;
    String name;
    String profession;

    //hibernate requires constructor with no parameters
    public Teacher() { }

    public Teacher(String name , String profession, int teacherID) {
        this.name = name;
        this.profession = profession;
        this.teacherID = teacherID;
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
