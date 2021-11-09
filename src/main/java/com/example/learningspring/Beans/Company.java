package com.example.learningspring.Beans;

public class Company implements java.io.Serializable{
    private int userId;
    private String userName;
    public Company(){}
    public void setUserId(int userId){
        this.userId = userId;
    }
    public int getUserId(){
        return userId;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getUserName(){
        return userName;
    }

    @Override
    public String toString(){
        return "Employee: UserId :->  "+ userId + " UserName :-> "+userName;
    }
}