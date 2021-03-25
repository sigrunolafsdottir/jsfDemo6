package com.example.jsfDemo6;

import com.example.jsfDemo6.Models.Kompis;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Named(value = "kompisController")
@SessionScoped
public class KompisController implements Serializable {

    private String firstname;
    private String lastname;
    private String validationText;

    private static List<Kompis> kompisar= new ArrayList<>();


    public KompisController() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public List<Kompis> getKompisar() {
        return kompisar;
    }

    public void setFirstname(List<Kompis> kompisar) {
        this.kompisar = kompisar;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getValidationText() {
        return validationText;
    }

    public void setValidationText(String validationText) {
        this.validationText = validationText;
    }

    public void addKompis()
    {
        validationText=firstname+" "+lastname +" is now added to phonebook";
        Kompis a=new Kompis(firstname,lastname);
        kompisar.add(a);
    }

}