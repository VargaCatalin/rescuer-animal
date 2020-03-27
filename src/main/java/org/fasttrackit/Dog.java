package org.fasttrackit;


public class Dog extends Animal {


    public Dog(String name, int age, int hapinessLevel) {
        super(name, age, hapinessLevel);

    }

    public void showHapiness(){
        System.out.println("The dog is wiggling his tail!");
    }
}

