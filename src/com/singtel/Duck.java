package com.singtel;

public class Duck extends Bird implements Swimmable {

    public void sing() {
        System.out.println("Quack Quack");
    }

    public void swim() {
        System.out.println("I am Swimming");
    }
}
