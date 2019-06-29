package ru.job4j.profession;

public class Education {
    private String type;
    private String university;
    private String college;

    public Education() {
        this.type = "NULL";
        this.university = "NULL";
        this.college = "NULL";
    }

    public Education(String type, String university, String college) {
        this.type = type;
        this.university = university;
        this.college = college;
    }
}
