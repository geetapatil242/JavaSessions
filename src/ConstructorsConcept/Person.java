
// this is not working...........
package ConstructorsConcept;

public class Person {
	String name;
	int age;
	char gender;
	double height;

	public Person(String name, int age, char gender, double height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}

	public void main(String[] args) {
		Person p1 = new Person("Anupam", 35, 'f', 20.22);
		System.out.println(p1.name + " " + p1.age + " " + p1.gender + " " + p1.gender);

	}

}

//Assignment 1:
//
//Create a Java class named "Person" with the following instance variables:
//name (String)
//age (int)
//gender (char)
//height (double)
//Create a constructor for the Person class that takes in the name, age, gender, and height as parameters and initializes the instance variables.
//Create a main method that creates two instances of the Person class using the constructor and prints out their information.

//Questions:
//What is the purpose of a constructor in Java?
//How does a constructor differ from a regular method in Java?
//Can a Java class have multiple constructors? If so, how are they differentiated?
//What happens if a constructor is not defined in a Java class?
//Can a constructor call other methods or constructors within the same class?