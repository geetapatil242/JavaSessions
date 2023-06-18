package ConstructorsConcept;

public class Car {
	String make;
	String model;
	int year;
	
	public Car(){
		this.make="Unknown";
		this.model="Unknown";		 
	}

	public Car(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		// ---> year can not take string unknown.
	}


	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println("Make:"+c1.make +" "+"Model:"+" " +c1.model);
		
		Car c2 = new Car("Toyata", "Prius",2010);
		System.out.println(c2.make +" "+ c2.model+" "+ c2.year);

	}

}


//Assignment 4:
//
//Create a Java class named "Car" with the following instance variables:
//
//make (String)
//
//model (String)
//
//year (int)
//
//Create a constructor for the Car class that takes in the make, model, and year as parameters and initializes the instance variables.
//
//Create a default constructor for the Car class that sets the make, model, and year to "Unknown". // ---> year can not take string unknown.
//
//Create a main method that creates three instances of the Car class using both constructors and prints out their information.
