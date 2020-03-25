package org.fasttrackit;

public class Vet {

    private String name;
    private String specialization;
    // Can be a Dentist, Asistent
    private String gender;
    private int age;
    private int priceTreatment;


    public Vet(String name, String specialization, String gender, int age) {
        this.name = name;
        this.specialization = specialization;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPriceTreatment() {
        return priceTreatment;
    }

    public void setPriceTreatment(int priceTreatment) {
        this.priceTreatment = priceTreatment;
    }
}
