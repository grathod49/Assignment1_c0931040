package com.assignment;

public class Dog {
    private String name;
    private Integer age;

    // Constructor to initialize the dog with a name and age
    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // Getter for dog's name
    public String getName() {
        return name;
    }

    // Setter for dog's name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for dog's age
    public Integer getAge() {
        return age;
    }

    // Setter for dog's age
    public void setAge(Integer age) {
        this.age = age;
    }
}
