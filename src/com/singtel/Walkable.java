package com.singtel;

public interface Walkable {

    public default void walk(){
        System.out.println("I am walking");
    }
}
