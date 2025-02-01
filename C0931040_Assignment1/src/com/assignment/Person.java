package com.assignment;

import java.util.Optional;

public class Person {
    private String name;
    private Integer age;
    private Optional<Dog> dog;  // Optional to handle cases where a person doesn't have a dog

    // Constructor for a person without a dog
    public Person(String name, Integer age) {
        this(name, age, null);
    }

    // Constructor for a person with a dog
    public Person(String name, Integer age, Dog dog) {
        this.name = name;
        this.age = age;
        this.dog = Optional.ofNullable(dog);  // Wrap dog in Optional to handle null safely
    }

    // Getter for person's name
    public String getName() {
        return name;
    }

    // Getter for person's age
    public Integer getAge() {
        return age;
    }

    // Getter for person's dog
    public Optional<Dog> getDog() {
        return dog;
    }

    // Method to check if the person has a dog and if that dog is old (10+ years)
    public boolean hasOldDog() {
        return dog.filter(d -> d.getAge() >= 10).isPresent();  // Uses filter to check dog age without an if statement
    }

    // Method to change dog's name, throws exception if person does not own a dog
    public void changeDogsName(String newName) {
        dog.map(d -> {
            d.setName(newName);  // Set the new name for the dog
            return d;
        }).orElseThrow(() -> new RuntimeException(this.name + " does not own a dog!"));  // Throw exception if no dog
    }
}
