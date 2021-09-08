package com.kremogen;

public class Dog {
    private final String name, dogOwner;

    public Dog(String name, String dogOwner){
        this.name = name;
        this.dogOwner = dogOwner;
    }

    public String getName(){
        return name;
    }

    public String getDogOwner(){
        return dogOwner;
    }

}
