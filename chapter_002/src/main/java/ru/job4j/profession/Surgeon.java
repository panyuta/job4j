package ru.job4j.profession;

public class Surgeon extends Doctor {
    private String scope;

    public Surgeon() {
        this.scope = "NULL";
    }

    public Surgeon(String scope) {
        this.scope = scope;
    }

    public void operate(Patient patient) {
    }
}
