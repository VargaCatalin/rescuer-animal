package org.fasttrackit;

public class Bird extends Animal{

    private String feathers;

    public void showHapiness() {

        System.out.println("Your bird  sings");
    }


    public Bird(String name, int age, int hapinessLevel) {
        super(name, age, hapinessLevel);



    }


    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }
}
