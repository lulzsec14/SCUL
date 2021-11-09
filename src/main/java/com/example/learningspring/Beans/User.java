package com.example.learningspring.Beans;

public class User{
    private int id;
    private String name;
    private int age;
    public User(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

}
