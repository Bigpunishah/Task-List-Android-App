package com.example.tasklist;

public class List {
    //Define instance variables for table column fields
    private int id;
    private String name;
    //Define constructors that can be used to create list object
    public List(){}

    public List(String name){
        this.name = name;
    }

    public List(int id, String name){
        this.id = id;
        this.name = name;
    }

    //Define the getter & setter
    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return name; //used for add/edit spinner
    }
}
