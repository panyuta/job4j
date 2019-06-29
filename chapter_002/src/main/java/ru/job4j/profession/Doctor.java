package ru.job4j.profession;

public class Doctor extends Profession {
    private String clinic;

    public Doctor() {
        this.clinic = "NULL";
    }

    public Doctor(String clinic) {
        this.clinic = clinic;
    }

    public void diagnose(Patient patient) {
    }
}
