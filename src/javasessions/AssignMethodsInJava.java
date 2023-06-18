package javasessions;

public class AssignMethodsInJava {
	
	public int maths(int a, int b) {

		System.out.println("Substracting the given numbers :");
		int sub = a - b;
		return sub;
	}

	public double product(double x, double y) {
		System.out.println(" Product of:" + " " + x + " " + "and" + y);
		double p = x * y;
		return p;
	}

	public double circumfn(double r) {
		System.out.println("Circumference of the cirle with radius:" + r);
		double c = 2 * Math.PI * r;
		return c;
	}

	public int max(int m, int n, int p) {
		if (m >= n && m >= p) {
			System.out.println(m + " " + " is greater than:" + " " + n + " " + "and" + " " + p);
			return m;
		} else if (n >= m && n >= p) {
			System.out.println(n + " " + " is greater than:" + " " + m + " " + "and" + " " + p);
			return n;
		} else
			System.out.println(p + " " + "is greater than:" + " " + m + " " + "and" + " " + n);
		return p;

	}

	public int min(int d, int k, int y) {
		if (d <= k && d <= y) {
			System.out.println(d + " " + " is smaller than:" + " " + k + " " + "and" + " " + y);
			return d;
		} else if (k <= d && k <= y) {
			System.out.println(k + " " + " is smaller than:" + " " + d + " " + "and" + " " + y);
			return k;
		} else
			System.out.println(y + " " + "is smaller than:" + " " + d + " " + "and" + " " + k);

		return y;

	}

	public boolean oddEven(int i) {
		if (i % 2 == 0) {

			System.out.println("Given num is even, return true:" + i);
			return true;
		} else
			System.out.println("Given num is odd, return false:" + i);
		return false;

	}

	public boolean toVote(int a) {
		if (a >= 18) {
			System.out.println(a + ": is eligible to vote");
			return true;
		} else
			System.out.println(a + ": is not eligible to vote");
		return false;
	}
	
	

	public int result(int m) {
		if (m >= 91 && m <= 100) {
			System.out.println("AA");
		} else if (m >= 81 && m <= 90) {
			System.out.println("AB");
		} else if (m >= 71 && m <= 80) {
			System.out.println("BB");
		} else if (m >= 61 && m <= 70) {
			System.out.println("BC");
		} else if (m >= 51 && m <= 60) {
			System.out.println("CD");
		} else if (m >= 41 && m <= 50) {
			System.out.println("DD");
		} else if (m < 41) {
			System.out.println("Fail");
		}
		return m;
	}

	// method to find factorial of given number
	public int factorial(int n) {
		if (n == 0)
			return 1;

		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		// 1.Write a program to print the addition/subtraction/division/multiplication of two numbers entered by user by defining your own method
		// writing a subtraction method, explore writing all actions in one method

		AssignMethodsInJava obj = new AssignMethodsInJava();

		// calling a method

		int val = obj.maths(6, 2);
		System.out.println(val);

		// 2. Define a method that returns the product of two double numbers entered by
		// user.

		double prod = obj.product(4.0, 2.0);
		System.out.println(prod);

		// 3.Write a program to print the circumference and area of a circle of radius
		// entered by user by defining your own method. 

		double c = obj.circumfn(4.0);
		System.out.println(c);

		//4. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.

		//5. Def﻿ine a program to find out whether a given number is even or odd - return true/false.
		boolean b = obj.oddEven(20);
		System.out.println(b);

		//6. A person is eligible to vote if his/her age is greater than or equal to 18.
		//  Define a method to find out if he/she is eligible to﻿ vote. - return
		// true/false

		boolean v = obj.toVote(1);
		System.out.println(v);

		//7. Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
		//Marks        Grade
		//91-100         AA
		//81-90          AB
		//71-80          BB﻿
		//61-70          BC
		//51-60          CD
		//41-50          DD
		//<=40          Fail	
		
		System.out.println("-------------------------------");
		int r = obj.result(90);
		System.out.println(r);

		//8. Write a program to print the factorial of a number by defining a method named 'Factorial'.
		//Solution is wrong .........Factorial of any number n is represente﻿d by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
		//4! = 1*2*3*4 = 24
		//3! = 3*2*1 = 6
		//2! = 2*1 = 2
		//Also,
		//1! = 1
		//0! = 0 // not getting this assignment
		
		System.out.println("..................");

		int i, fact = 1;
		int number = 4;// It is the number to calculate factorial
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
		//	find factorial of the number given by the user

		int factAns = obj.factorial(4);
		System.out.println(" Factorial of the number given by the user is: " + "  " + factAns);
		
		// not getting Factorial of 0 = 0 assignment

		int maxnum = obj.max(13, 7, 11);
		System.out.println(maxnum);

		int minnum = obj.min(20, 50, 9);
		System.out.println(minnum);
	}

}
