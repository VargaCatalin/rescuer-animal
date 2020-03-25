package org.fasttrackit;

public class Adopter {
    String name; int money;



    public Adopter(String name, int money) {

        this.name = name;
        this.money = money;


    }

    public Adopter() {

    }


    public void feed(Animal animal, Food food) {
            animal.hungerLevel = animal.hungerLevel -2;
            System.out.println(name + " just gave some " + food.name + "to" + animal.name + ".");

   }

    public void doActivity(Animal animal, Activity activity){
        animal.hapinessLevel = animal.hapinessLevel + 2;
        System.out.println(this.name + " is " + activity.name + " with " + animal.name + ".");
    }

}
