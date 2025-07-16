package com.example.myapplication;

public class Animal {
    //Attribute
    boolean hasWing;
    String type;
    int numberOfLeg;
    //Method
    void move(){
        //do something
        System.out.println("move");
    }
    void communicate(){

}
    void changeType(String newType) {
        this.type = newType;
        }
    }