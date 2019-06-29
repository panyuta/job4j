package ru.job4j.profession;

public class Dentist extends Doctor {
    private String whatTypeOfClient;

    public Dentist() {
        this.whatTypeOfClient = "NULL";
    }

    public Dentist(String whatTypeOfClient) {
        this.whatTypeOfClient = whatTypeOfClient;
    }
}
