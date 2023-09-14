package com.example.solid.animals;

import com.example.solid.interfaces.Critter;
import jakarta.persistence.*;

import java.util.Objects;

//Single Responsibility
@Entity
public class Animal implements Critter {

    @Id
    @SequenceGenerator(
            name = "animal_id_sequence",
            sequenceName = "animal_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "animal_id_sequence"
    )
    private Integer id;
    private String name;
    private String size;
    private String sound;

    public Animal(Integer id, String name, String size, String sound) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.sound = sound;
    }

    public Animal() {

    }

    public Integer getId() {return id;}

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getSound() {
        return sound;
    }

    public void setId(Integer id) {this.id = id;}

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int eat(int amount) {
        System.out.println("Animal eats " + amount + " units of food");
        return amount - 100;
    }

    public void sleep() {
        System.out.println("Animal sleeps");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return Objects.equals(getId(), animal.getId()) && Objects.equals(getName(), animal.getName()) && Objects.equals(getSize(), animal.getSize()) && Objects.equals(getSound(), animal.getSound());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSize(), getSound());
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}
