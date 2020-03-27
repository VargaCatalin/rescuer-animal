package org.fasttrackit;

public class Animal {

   private String name;
   private int age;
   private int weight;
   private int healthLevel;
   private int hungerLevel;
   private int hapinessLevel;
   private boolean medicalTreatment;
   private String favouriteFood;
   private String favouriteActivity;

    public Animal(String name, int age, int hapinessLevel) {

        this.name = name;
        this.age = age;
        this.hapinessLevel = hapinessLevel;



    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getHapinessLevel() {
        return hapinessLevel;
    }

    public void setHapinessLevel(int hapinessLevel) {
        this.hapinessLevel = hapinessLevel;
    }

    public boolean isMedicalTreatment() {
        return medicalTreatment;
    }

    public void setMedicalTreatment(boolean medicalTreatment) {
        this.medicalTreatment = medicalTreatment;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteActivity() {
        return favouriteActivity;
    }

    public void setFavouriteActivity(String favouriteActivity) {
        this.favouriteActivity = favouriteActivity;
    }
}
