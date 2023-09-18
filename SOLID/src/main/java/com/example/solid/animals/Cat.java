package com.example.solid.animals;

import jakarta.persistence.*;


//open-closed principle.
@Entity
@Table(name = "cat")
public class Cat extends Animal {
    private int lives;

    public Cat(Integer id, String name, String size, String sound,String type, int lives) {
        super(id, name, size, sound,type);
        this.lives = lives;
    }

    public Cat() {

    }


    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    @Override
    public int eat(int amount) {
        System.out.println("Cat eats " + amount + " units of food");
        return amount - 10;
    }
}
