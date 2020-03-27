package org.fasttrackit;


import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args )
    {

        //Introducing of game
        System.out.println( "Welcome to animal rescuer!" );
        System.out.println("Introduce your animal name!");
        Scanner scanner = new Scanner(System.in);
        String dogName = scanner.nextLine();


        //Proprietes of Adopter !
        Adopter adopter = new Adopter("Andrei", 50);
        System.out.println("Introduce your adopter name");
        Scanner scanner1 = new Scanner(System.in);


        //Proprietes of Vet
        Vet vetProprietes = new Vet("Petre", "Dentist" , "Male",  40 );
        vetProprietes.setName("Andreea");
        vetProprietes.setAge(35);
        vetProprietes.setGender("Female");

        System.out.println("Available Vets");
        System.out.println(vetProprietes.getName() + "," + vetProprietes.getGender() + "," + vetProprietes.getAge());


        //Proprietes of Animal !
        Animal animalDog = new Animal("Max", 2, 10);


        System.out.println("Animal proprietes are:");
        System.out.println("Name: " + animalDog.getName());
        System.out.println("Age: " + animalDog.getAge());
        System.out.println("Weight: " + animalDog.getWeight());
        System.out.println("Health: " + animalDog.getHealthLevel());
        System.out.println("Hunger level are: " + animalDog.getHungerLevel());
        System.out.println("Hapiness level are: " + animalDog.getHapinessLevel());
        System.out.println("Favourite food are: " + animalDog.getFavouriteFood());
        System.out.println("Favourite activity are: " + animalDog.getFavouriteActivity());

        //////////////////////////////////////////////////////////////////////////////


        // DOG CONSTRUCTOR
        Dog dog = new Dog("Azor", 10, 10);



        // BIRD CONSTRUCTOR
        Bird bird = new Bird("Pollie", 2 ,10
        );




        //Proprietes of Food

       Food food = new Food(5 , "Bones" );
        food.setWeight(1000);
        food.setPrice(50);
        food.setStock(5);


        System.out.println("Food name are: " + food.getName());
        System.out.println("Food weight is: " + food.getWeight());
        System.out.println("Price food is: " + food.getPrice());



       //Animal food
        DogFood dogFood = new DogFood("Bones", 10, 5);
        BirdFood birdFood = new BirdFood("Blue");






        // Activity

        Activity activity1 = new Activity("running");
        Activity activity2 = new Activity("walking");

        adopter.doActivity(dog, activity1);





        // Environment
        Environment environment = new Environment("Sunny", 30);



        //Game members

        Game game = new Game();

    }

}