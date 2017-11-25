package com.example.priya.popuplistviewupdate;

/**
 * Created by Priya on 11/25/2017.
 */
public class Data {
    //private variables

    String name;

    int phno;
    int dob;


    public Data(){
    }

    public Data (String name, int phno, int dob) {

        this.name = name;
        this.phno = phno;
        this.dob = dob;

    }
    public  String getName(){

        return this.name;
    }

    public int getPhno(){

        return this.phno;
    }

    public int getDob(){
        return this.dob;
    }

    public void setName(String name){

        this.name = name;
    }

    public void setPhno(int phno){

        this.phno = phno;
    }

    public void setDob(int dob){

        this.dob = dob;
    }



}