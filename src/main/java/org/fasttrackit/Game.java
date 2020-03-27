package org.fasttrackit;

public class Game {


    private Dog dog;
  private  Adopter adopter;
  private  Vet vet;

    public Game(Dog dog, Vet vet , Adopter adopter) {
        this.dog = dog;
        this.vet = vet;
        this.adopter = adopter;

    }


    public Game() {

    }


    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Adopter getAdopter() {
        return adopter;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }
}
