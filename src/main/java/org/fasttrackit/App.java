package org.fasttrackit;


/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args )
    {
        System.out.println( "Welcome to animal rescuer!" );


        //Proprietes of Adopter !
        Adopter adopterProprietes = new Adopter("Andrei", 50);


        //////////////////////////////////////////////////////////////////////


        //Proprietes of Animal !
        Animal animalDog = new Animal("Max", 2, 10);


        System.out.println("Animal proprietes are:");
        System.out.println("Name: " + animalDog.name);
        System.out.println("Age: " + animalDog.age);
        System.out.println("Weight: " + animalDog.weight);
        System.out.println("Health: " + animalDog.healthLevel);
        System.out.println("Hunger level are: " + animalDog.hungerLevel);
        System.out.println("Hapiness level are: " + animalDog.hapinessLevel);
        System.out.println("Favourite food are: " + animalDog.favouriteFood);
        System.out.println("Unfavourable Food are: " + animalDog.unfavorableFood);
        System.out.println("Favourite activity are: " + animalDog.favouriteActivity);

        //////////////////////////////////////////////////////////////////////////////






        // DOG CONSTRUCTOR
        Dog dog = new Dog("Azor", 10, 10);





        // BIRD CONSTRUCTOR
        Bird bird = new Bird("Pollie", 2 ,10
        );


        BirdFood birdFood = new BirdFood("Blue");


        //Proprietes of Food

       Food foodProprietes = new Food(5 , "Bones" );

        foodProprietes.Weight = 1000;
        foodProprietes.price = 50;
        foodProprietes.stock = 5;


        System.out.println("Food name are: " + foodProprietes.name);
        System.out.println("Food weight is: " + foodProprietes.Weight);
        System.out.println("Price food is: " + foodProprietes.price);

        ////////////////////////////////////////////////////////////////////
        DogFood dogFood = new DogFood("Bones", 10, 5);

        //Proprietes of Vet

        Vet vetProprietes = new Vet("Petre", "Dentist" , "Male",  40 );
        vetProprietes.name = "Dorel";
        vetProprietes.age = 55;
        vetProprietes.gender = "Male";
        vetProprietes.specialization = "Dentist";
        vetProprietes.priceTreatment = 100;


        System.out.println("Vet name are: " + vetProprietes.name);
        System.out.println("Vet age is: " + vetProprietes.age);
        System.out.println("Vet gender are: " + vetProprietes.gender);
        System.out.println("Vet specialization is: " + vetProprietes.specialization);
        System.out.println("Price treatment is: " + vetProprietes.priceTreatment);


        Activity activityRecreation = new Activity("Running");

        activityRecreation.name = "Playing with kids";


        Environment environment = new Environment("Sunny", 30);






      //////////////////////////////////////////////////////////////////////

        //Game members

        Game game = new Game();

        Adopter adopter = new Adopter();
    }

}