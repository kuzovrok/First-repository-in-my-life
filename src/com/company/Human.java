package com.company;

public class Human {
    String name;

    public String getName() { // геттер
        return name;
    }
    public void setName(String name) { // сеттер
        this.name = name;
    }
    void print() {
        System.out.println(name);
    }
}
