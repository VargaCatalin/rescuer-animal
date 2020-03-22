package org.fasttrackit;

public class Game {


    Dog dog;
    Adopter adopter;
    Vet vet;

    public Game(Dog dog, Vet vet , Adopter adopter) {
        this.dog = dog;
        this.vet = vet;
        this.adopter = adopter;

    }


    public Game() {

    }
}
