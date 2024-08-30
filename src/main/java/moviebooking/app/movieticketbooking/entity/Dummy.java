package moviebooking.app.movieticketbooking.entity;

// import jakarta.persistence.Id;

// public class Dummy {
//     @Id
//     private int id;

//     private String user;
//     private int age;

//     public int getId(){
//         return id;
//     }
//     public void setId(int id){
//         this.id=id;

//     }
//     public String getUser(){
//         return user;
//     }
//     public void setUser(String User){
//         this.user=User;

//     }
//     public int getAge(){
//         return age;
//     }
//     public void setAge(int age){
//         this.age=age;
//     }
// }
// package com.example.movieticketbooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Dummy {
  
    @Id
    private int id;

    private String user;
    private int age;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getUser(){
        return user;
    }

    public void setUser(String user){
        this.user = user;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
