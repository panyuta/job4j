package ru.job4j.profession;

import java.util.*;

public class Profession {
    private String name;
    private String surname;
    private Date birthday;
    private Education education;

    public Profession() {
        this.name = "NULL";
        this.surname = "NULL";
        this.birthday = new Date();
        this.education = new Education();
    }

    public Profession(String name, String surname, Date birthday, Education education) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.education = education;
    }

    public String getName() {return this.name;}
    public String getSurname() {return this.surname;}
    public Date getBirthday() {return this.birthday;}
    public Education getEducation() {return this.education;}
}
