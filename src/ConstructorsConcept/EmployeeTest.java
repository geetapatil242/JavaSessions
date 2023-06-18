package ConstructorsConcept;

public class EmployeeTest {
	int id;
	String name;
	double salary;

	public EmployeeTest(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		EmployeeTest e1 = new EmployeeTest(4, "Maneesh", 5000.00);

		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());

		e1.setSalary(e1.getSalary() + (e1.getSalary() / 10));
		System.out.println(e1.getSalary());

	}

}

//Assignment 3:
//
//Create a Java class named "EmployeeTest" with the following instance variables:
//
//id (int)
//
//name (String)
//
//salary (double)
//
//Create a constructor for the Employee class that takes in the id, name, and salary as parameters and initializes the instance variables.
//
//Create getter methods for each of the instance variables.
//
//Create a main method that creates an instance of the EmployeeTest class using the constructor, prints out the employee's information using the getter methods, and gives the employee a 10% raise using the setter method for the salary instance variable.
