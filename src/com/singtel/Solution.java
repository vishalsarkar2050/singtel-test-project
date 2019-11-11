package com.singtel;

public class Solution {

    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(false),
                new Chicken(true),
                new Parrot(new Duck()),
                new Fish(),
                new Shark(),
                new Catterpiller(),
                new Clownfish(),
                new ButterFly()
        };

        int singableAnimal = 0;
        int walkableAnimal = 0;
        int swimmableAnimal = 0;
        int flyableAnimal = 0;

        for(Animal animal: animals){
            if(animal instanceof Singable) singableAnimal++;
            if(animal instanceof Walkable) walkableAnimal++;
            if(animal instanceof Swimmable) swimmableAnimal++;
            if(animal instanceof Flyable) flyableAnimal++;
        }

        System.out.printf("Singable: %d, Walkable: %d, Swimmable: %d, Flyable: %d", singableAnimal, walkableAnimal, swimmableAnimal, flyableAnimal);


    }

}
