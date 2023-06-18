package ConstructorsConcept;

public class PersonTest {
	String name;
	int age;
	char gender;
	double height;

	public PersonTest(String name, int age, char gender, double height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}

	public static void main(String[] args) {
		PersonTest p1 = new PersonTest("Aditi", 35, 'f', 20.22);
		System.out.println(p1.name + " " + p1.age + " " + p1.gender + " " + p1.height);

	}

}

//Assignment 1:
//
//Create a Java class named "Person" with the following instance variables:
//
//name (String)
//
//age (int)
//
//gender (char)
//
//height (double)
//
//Create a constructor for the Person class that takes in the name, age, gender, and height as parameters and initializes the instance variables.
//
//Create a main method that creates two instances of the Person class using the constructor and prints out their information.
