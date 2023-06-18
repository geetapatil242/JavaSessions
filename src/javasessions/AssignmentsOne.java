package javasessions;

public class AssignmentsOne {

	public static void main(String[] args) {
		//Assignment 1
		System.out.println("Hello");
		System.out.println("Geeta");
		
		//Assignment 2
		int a = 74;
		int b = 36;
		System.out.println(a+b);
		
		//Assignment 3 ----- TO DO
		int x = 50;
		int y = 3;
		//System.out.println();
		
		//Assignment 4
		// test data ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
		
		float n1 = 25.5f;
		float n2 = 3.5f;
		float n3 = 40.5f;
		float n4 = 4.5f;
		
		
		
		double d1 = (n1*n2-n2*n2);
		double d2 = (n3-n4);
		System.out.println(d1/d2);
		
		//Assignment 5
		char z = 't';
		System.out.println("Hello Selenium"+z);
		
		//Assignment 6
		int t1 = 100;
		int t2 = 200;
		int t3 = 3400;
		System.out.println("Your total amout is."+(t1+t2+t3));
		
		//Assignment 7
		char c = 'h';
		System.out.println((float)'h');
		//System.out.println('h'+0.0); // this code also gives correct ASCII value of h.
		
		// Assignment 8
		char c1 = 'd';
		int i= (3+'d');
		char ch = (char)i;
		System.out.println(3+'d');
		System.out.println(i);
		System.out.println(ch);
		
		//Assignment 9
		float r1 = 3.9f;
		double r2 = (r1*r1);
		System.out.println(r2);
		System.out.println(r1*r1);
	
		
		
//Incremental / Decremental Operators;

		// Assignment 1 
		//Ans 24
		int i1 = 11;
		
		i1 = i1++ + ++i1;
		
		System.out.println(i1);
		//Ans 24
		
		// Assignment 2 
		int a1=11;
		int b1=22;

		
		int c3 = a1 + b1 + a1++ + b1++ + ++a1 + ++b1;
		//c= 103
		System.out.println(c3);
		
		System.out.println("a1="+a1); // 11
		System.out.println("b1="+b1); // 22
		System.out.println("c3="+c3); // 103
		
		
		// Assignment 3
		//Ans = 0
		int i8=0;
	//i8 = 0 - 0 + 1 -1 = 0
		System.out.println(i8);
		
		//Assignment 4
		// not written correctly, Ans , error can not convert boolean to int.
		
		
		boolean k = true;


	     // k++;

		System.out.println(k);
		
		//Assignment 5 
		
		int f=1, j=2, p=3;

		

		int m = f-- - j-- - p--;

		// m = 1 - 2 - 3 = -4

		System.out.println("i="+f);

		System.out.println("j="+j);

		System.out.println("k="+p);
		System.out.println("m="+m);
		
		// Assignment 6 
		//Ans = 0
		int a4 = 1, b4 = 2;
		// 1 - 2 + 2 - 1 = 0
		System.out.println(--b4 - ++a4 + ++b4 - --a4);
		
		// Assignment 7
		
		int i9=19, j9=29, k9;


		k9 = i9-- - i9++ + --j9 - ++j9 + --i9 - j9-- + ++i9 - j9++;

		// 19-19+28-29+18-28+20-29

		System.out.println("i9="+i9);

		System.out.println("j9="+j9);

		System.out.println("k9="+k9);
		
		//Assignment 8
		//why this gives error???
		//Ans Invalid argument to operation ++/--
		//Answer : Because, ++ or — can’t be nested [ –(i++) ].
		int i5 = 11;

		//int j5 = --(i5++);
		
		
		//Assignment 9
		//Ans -1*-1*-1*-1 = 1
		int m1 = 0, n = 0;
		int p1 = --m1 * --n * n-- * m1--;
		System.out.println(p1);
		System.out.println(m1);
		System.out.println(n);
	
		// Assignment 10 
		//Ans = 5
		int a2=1;

		a2 = a2++ + ++a2 * --a2 - a2--;
		
		// a2 = 1 + 3 * 2 - 2 
		// a2 = 1+6-2 = 5

		System.out.println("ansa2 is:"+a2);
		
		// Assignment 11 -- what is outcome of this???
		// it gives invalid argument
		//Ans = 11
		
		//int a11 = 11++;
		//System.out.println(a11);
		
		
		// Assignment 12
		// Ans = 65, ASCII value of A = 65
		
		int ph = 'A';
		
		System.out.println(ph);

		System.out.println(ph++);


		// Assignment 13
		//Ans 66
		// it gives B, AscII value of B is 66
		
        char ch1 = 'A';
        System.out.println(++ch1);
        
        char ch2 = 'B';
       System.out.println(++ch2);
        
        
        //Assignment 
       // Ans 5.0
       double d = 1.5, D = 2.5;
       // 1.5 + 3.5 = 5.0
       System.out.println(d++ + ++D);
		
		// Concatenation assignments
		System.out.println("Merit"+"Campus");
		System.out.println("Java"+"School");
		System.out.println("Hello"+"World");
		System.out.println("Good"+"Bye");
		
		//Assignment
		//ans * prints as it is with string concatenation
		String s1 = "Java";
		String s2 = "Professional";
		System.out.println(s1+" * "+s2);
		
		//Assignment
		// ans The output is:13
		System.out.print("The output is : ");
		System.out.println("1" + "3");
		
	

		
		
		
	
	}

}
