package org.fasttrackit;

public class Adopter {
    private String name;
    private int money;



    public Adopter(String name, int money) {

        this.name = name;
        this.money = money;


    }

    public Adopter() {

    }


    public void feed(Animal animal, Food food) {

        if(animal.getFavouriteFood().equals(food.getName() ) ) {
            animal.setHapinessLevel(animal.getHapinessLevel() + 2);
        }

        animal.setHungerLevel(animal.getHungerLevel() - 2);

        System.out.println(name + " just gave some " + food.getName() + "to" + animal.getName() + ".");

        System.out.println("New happiness level is: " + animal.getHapinessLevel());

   }

    public void doActivity(Animal animal, Activity activity){

        if (animal.getFavouriteActivity().equals(activity.getName())) {

            animal.setHapinessLevel(animal.getHapinessLevel() + 2);
        } else {
            animal.setHapinessLevel(animal.getHapinessLevel() + 1);
        }

        System.out.println(this.name + " is " + activity.getName() + " with " + animal.getName() + ".");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
