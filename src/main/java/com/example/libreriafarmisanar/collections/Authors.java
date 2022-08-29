package com.example.libreriafarmisanar.collections;

import java.util.Date;

public class Authors {

    private int id;
    private String firstName;
    private String lastName;
    private Date dateDob;
    private String gender;
    private String contact;
    private String otherDetails;

    public Authors() {
    }

    public Authors(int id, String firstName, String lastName, Date dateDob, String gender, String contact, String otherDetails) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateDob = dateDob;
        this.gender = gender;
        this.contact = contact;
        this.otherDetails = otherDetails;
    }
}
