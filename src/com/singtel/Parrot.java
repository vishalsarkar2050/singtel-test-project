package com.singtel;

public class Parrot extends Bird {

    Singable singable;

    public Parrot(Singable singable){
        this.singable = singable;
    }

    @Override
    public void sing() {
        this.singable.sing();
    }
}
