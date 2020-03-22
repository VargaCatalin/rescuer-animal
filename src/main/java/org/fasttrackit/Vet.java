package org.fasttrackit;

public class Vet {

    String name;
    String specialization;
    // Can be a Dentist, Asistent
    String gender;
    int age;
    int priceTreatment;


    public Vet(String name, String specialization, String gender, int age) {
        this.name = name;
        this.specialization = specialization;
        this.gender = gender;
        this.age = age;
    }
}
