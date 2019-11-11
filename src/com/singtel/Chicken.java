package com.singtel;

public class Chicken extends NonFlyingBird {

    boolean isRooster;

    public Chicken(boolean isRooster){
        this.isRooster = isRooster;
    }

    public void sing() {
        if(isRooster){
            System.out.println("Cock-a-doodle-doo");
        }else{
            System.out.println("Cluck Cluck");
        }

    }

}
