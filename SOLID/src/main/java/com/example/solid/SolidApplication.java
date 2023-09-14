package com.example.solid;

import com.example.solid.animals.Animal;
import com.example.solid.interfaces.AnimalRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/api/animals")
public class SolidApplication {

    private final AnimalRepository animalRepository;

    public SolidApplication(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(SolidApplication.class, args);
    }

    @GetMapping
    public List<Animal> getCats() {
        return animalRepository.findAll();
    }

    record NewAnimal(String name, String size, String sound) {}

    @PostMapping
    public void addAnimal(@RequestBody NewAnimal request) {
        Animal animal = new Animal();
        animal.setName(request.name());
        animal.setSize(request.size());
        animal.setSound(request.sound());
        animalRepository.save(animal);
    }

    @DeleteMapping(path = "{animalId}")
    public void deleteAnimal(@PathVariable("animalId") Long animalId) {
        animalRepository.deleteById(animalId);
    }

}
