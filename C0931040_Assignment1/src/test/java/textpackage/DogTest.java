package test.java.textpackage;

import static org.junit.Assert.*;
import org.junit.Test;

import main.java.mainpackage.Dog;

public class DogTest {

    // Test the Dog constructor
    @Test
    public void testDogConstructor() {
        Dog dog = new Dog("Buddy", 5);
        assertEquals("Buddy", dog.getName());  // Check that the name is set correctly
        assertEquals((Integer) 5, dog.getAge());  // Check that the age is set correctly
    }

    // Test the setters for Dog
    @Test
    public void testSetters() {
        Dog dog = new Dog("Charlie", 10);
        dog.setName("Rocky");
        dog.setAge(12);
        assertEquals("Rocky", dog.getName());  // Check if the name is updated
        assertEquals((Integer) 12, dog.getAge());  // Check if the age is updated
    }
}
