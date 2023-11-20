package com.example.solid.animals;
//open-closed principle.
public class Dog extends Animal{
    private String breed;

    public Dog(Integer id ,String name, String size, String sound,String type, String breed) {
        super(id ,name, size, sound,type);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public int eat(int amount) {
        System.out.println("Dog eats " + amount + " units of food");
        return amount - 50;
    }
}
