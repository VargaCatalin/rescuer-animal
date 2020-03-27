package org.fasttrackit;

public class Bird extends Animal{

    private String feathers;


    public Bird(String name, int age, int hapinessLevel) {
        super(name, age, hapinessLevel);

    }

    public void showHapiness(){
        System.out.println("The bird is flying!");
    }



    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }
}
