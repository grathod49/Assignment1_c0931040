StudentId: c0931040
Student Name: Grishmkumar Rathod

This project implements two classes, Dog and Person, with various functionalities. It also includes unit tests to verify the behavior of these classes and methods.

Classes Implemented:
Dog Class:
Attributes: String name, Integer age
Constructor: public Dog(String name, Integer age)
Person Class:
Attributes: String name, Integer age, Optional<Dog> dog
Constructors:
public Person(String name, Integer age)
public Person(String name, Integer age, Dog dog)
Methods:
public boolean hasOldDog(): Returns true if the person owns a dog that is 10 years or older.
public void changeDogsName(String newName): Changes the dog's name if the person owns a dog, otherwise throws an exception.
Features
hasOldDog():

Checks if the person owns a dog that is 10 years old or older.
Returns true if the condition is met, otherwise false.
changeDogsName(String newName):

Changes the dog's name if the person owns a dog.
Throws a RuntimeException if the person does not own a dog.
Instructions to Run the Code
1. Clone the Repository:
Clone the repository from GitHub using the following command:

git clone https://github.com/grathod49/Assignment1_c0931040

2. Open the Project in Eclipse:
Launch Eclipse IDE.
Go to File > Import > General > Existing Projects into Workspace.
Browse to the folder where you cloned the repository and select the project to import.

3. Run the Main Class:
Open the main class that contains the public static void main(String[] args) method.
Right-click the class file and select Run As > Java Application.

4. Running Unit Tests:
Open the unit test class PersonTest.java in Eclipse.
Right-click the file and select Run As > JUnit Test.
The test results will appear in the JUnit tab.

Unit Tests
The project contains unit tests for the following methods:

Test for Person without a dog
Test for Person with a dog
Test for hasOldDog() method
Test for changeDogsName() method