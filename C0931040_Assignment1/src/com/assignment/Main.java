package com.assignment;

public class Main {
    public static void main(String[] args) {
        // Create a person without a dog
        Person person = new Person("Grishm", 25);

        try {
            // Try to change the dog's name, will throw exception because there's no dog
            person.changeDogsName("Bull");
        } catch (RuntimeException e) {
            // Catch the exception and output the message
            System.out.println(e.getMessage());
        }
        
        // Create a person with a dog
        Dog dog = new Dog("Hulk", 10);
        Person newPerson = new Person("Jigar", 26, dog);
        
        System.out.println(newPerson.getName() + " has " + (newPerson.hasOldDog() ? "old" : "young") + " dog");
        
        System.out.println("Old name: " + dog.getName());
        
        // Try to change the dog's name
        newPerson.changeDogsName("Bull");
        
        System.out.println("New name: " + dog.getName());
    }
}
