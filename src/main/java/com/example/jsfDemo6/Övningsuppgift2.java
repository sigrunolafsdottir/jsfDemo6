package com.example.jsfDemo6;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named(value = "calcCompleteController")
@SessionScoped
public class Övningsuppgift2 implements Serializable {

    private int num1,num2,result;

    public Övningsuppgift2() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void add()
    {
        setResult(num1+num2);
    }

    public void sub()
    {
        setResult(num1-num2);
    }

    public void mult()
    {
        setResult(num1*num2);
    }

    public void divide()
    {
        setResult(num1/num2);
    }


}