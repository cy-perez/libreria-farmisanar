package com.example.libreriafarmisanar.collections;

public class Categories {

    private int id;
    private String description;

    public Categories() {
    }

    public Categories(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
