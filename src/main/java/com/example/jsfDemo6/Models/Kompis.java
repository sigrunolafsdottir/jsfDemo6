package com.example.jsfDemo6.Models;

import java.io.Serializable;

public class Kompis implements Serializable {
    String lastname;
    String firstname;

    public Kompis(String lastname, String firstname) {
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }




}