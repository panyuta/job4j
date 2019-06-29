package ru.job4j.profession;

public class Engineer extends Profession {
    private String practise;

    public Engineer() {
        this.practise = "NULL";
    }

    public Engineer(String practise) {
        this.practise = practise;
    }
}
