package ConstructorsConcept;

public class Rectangle {
	double length;
	double width;

	public Rectangle() {

	}

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double calculateArea() {
		double area = length * width;
		return area;

	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		double area1 = r1.calculateArea();
		System.out.println("Area of the Rectangle using Default constructor:"+" "+area1);

		Rectangle r2 = new Rectangle(4.0, 6.0);
		double area2 = r2.calculateArea();
		System.out.println("Area of the Rectangle using parameterized constructor:"+" "+area2);

	}

}

//Assignment 2:
//
//Create a Java class named "Rectangle" with the following instance variables:
//
//length (double)
//
//width (double)
//
//Create a default constructor for the Rectangle class that sets both the length and width to 0.0.
//
//Create a constructor for the Rectangle class that takes in the length and width as parameters and initializes the instance variables.
//
//Create a method in the Rectangle class named "calculateArea" that returns the area of the rectangle (length * width).
//
//Create a main method that creates two instances of the Rectangle class using both constructors, calculates and prints out their respective areas.

