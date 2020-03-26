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

        if(animal.favouriteFood.equals(food.name)){
            animal.hapinessLevel = animal.hapinessLevel + 2;
        }

        animal.hungerLevel = animal.hungerLevel -2;
        System.out.println(name + " just gave some " + food.name + "to" + animal.name + ".");

        System.out.println("New happiness level is: " + animal.hapinessLevel);

   }

    public void doActivity(Animal animal, Activity activity){

        if (animal.favouriteActivity.equals(activity.name)) {
            animal.hapinessLevel = animal.hapinessLevel + 2;
    }
        else {
            animal.hapinessLevel++;
        }

        System.out.println(this.name + " is " + activity.name + " with " + animal.name + ".");
    }

}
