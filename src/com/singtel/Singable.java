package com.singtel;

public interface Singable {

    default void sing(){
        System.out.println("I am Singing");
    };

}
