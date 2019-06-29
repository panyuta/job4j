package ru.job4j.profession;

public class Builder extends Engineer {
    private String scope;

    public Builder() {
        this.scope = "NULL";
    }

    public Builder(String scope) {
        this.scope = scope;
    }

    public void build(Building building) {}
}
