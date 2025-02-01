package com.assignment.test;

import static org.junit.Assert.*;
import org.junit.Test;
import com.assignment.Person;
import com.assignment.Dog;

public class PersonTest {

    // Test a person without a dog
    @Test
    public void testPersonWithoutDog() {
        Person person = new Person("Alice", 30);
        assertEquals("Alice", person.getName());  // Check person's name
        assertEquals((Integer) 30, person.getAge());  // Check person's age
        assertFalse(person.getDog().isPresent());  // Verify that the person does not have a dog
    }

    // Test a person with a dog
    @Test
    public void testPersonWithDog() {
        Dog dog = new Dog("Buddy", 15);
        Person person = new Person("Bob", 40, dog);
        assertTrue(person.getDog().isPresent());  // Verify that the person has a dog
        assertEquals("Buddy", person.getDog().get().getName());  // Verify dog's name
    }

    // Test if a person has an old dog (age >= 10)
    @Test
    public void testHasOldDog() {
        Dog youngDog = new Dog("Max", 5);
        Dog oldDog = new Dog("Rocky", 12);
        Person personWithYoungDog = new Person("Sam", 35, youngDog);
        Person personWithOldDog = new Person("Tom", 45, oldDog);
        assertFalse(personWithYoungDog.hasOldDog());  // Should be false
        assertTrue(personWithOldDog.hasOldDog());  // Should be true
    }

    // Test changing dog's name successfully
    @Test
    public void testChangeDogsName() {
        Dog dog = new Dog("Buddy", 7);
        Person person = new Person("Charlie", 50, dog);
        person.changeDogsName("Lucky");
        assertEquals("Lucky", dog.getName());  // Check if dog's name was updated
    }

    // Test changing dog's name without owning a dog
    @Test(expected = RuntimeException.class)
    public void testChangeDogsNameWithoutDog() {
        Person person = new Person("Alice", 30);
        person.changeDogsName("Buddy");  // Should throw exception
    }
}
