package com.example.solid;

import com.example.solid.interfaces.AnimalFeeder;
import com.example.solid.interfaces.CageCleaner;

public class Person implements AnimalFeeder, CageCleaner {


    @Override
    public void feedAnimal(String food, int quantity) {
        if (quantity > 0){
            System.out.println("Feeding " + quantity + " of " + food);
        } else {
            System.out.println("Not enough food 😢");
        }

    }

    @Override
    public void cleanCage(String size) {
        if (size.equals("small")) {
            System.out.println("Cleaning small cage");
        } else if (size.equals("medium")) {
            System.out.println("Cleaning medium cage");
        } else if (size.equals("large")) {
            System.out.println("Cleaning large cage");
        } else {
            System.out.println("Cleaning all cages");
        }
    }
}
