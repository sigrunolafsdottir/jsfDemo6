package com.example.jsfDemo6;


import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 *
 * @author Admin
 */
@Named(value = "holaBean")
@RequestScoped
public class HolaBean implements Serializable{

    private String hello = "hola hello";

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    @PostConstruct
    public void init()
    {
            hello="hola mundo!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
    }

}