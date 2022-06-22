package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hello {

    public int getId() {
        return id;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "id=" + id +
                ", greeting='" + greeting + '\'' +
                '}';
    }

    @Id
    private int id;

    private String greeting;

    public Hello() {

    }
}