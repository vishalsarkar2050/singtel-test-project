package com.singtel;

public interface Flyable {

    default void fly(){
        System.out.println("I am flying");
    }
}
