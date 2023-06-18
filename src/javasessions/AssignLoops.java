package javasessions;

public class AssignLoops {

	public static void main(String[] args) {
		// print odd numbers using for and if--- from class video
		for ( int i = 1; i<=100; i++) {
			if (i % 2 != 0) {
				System.out.println(i + " : is a odd number");
			}
		}
			
			// 1. WAP to print following output:
//I am Batman﻿
//I am Batman﻿
//I am Batman﻿
//I am Batman
//I am Batman

	for (int t = 1; t<=5; t++) {
		System.out.println(" I am Batman");
	}
	
	int t2 = 1;
	while (t2<=5) {
		System.out.println("I am Batman - while");
		t2++;
	}
		
	//2. WAP to print following output:
		//I am Batman 1
		//I am Batman 2
		//I am Batman 3
		//I am Batman 4
		//I am Batman 5
		//I am Batman 6
		//I am Batman 7
		//I am Batman 8
		//I am Batman 9
	
	for (int a = 1;a<=9; a++) {
		System.out.println("I am Batman "+a);
	}
	int a2 = 1;
	while (a2<=9) {
		System.out.println("I am Batman - while "+a2);
		a2++;
	}
	
	
	// 3. WAP to print 10 to 1 using for, while and do-while loop
	
		int b = 10;
		
		while (b >=1) {
			System.out.println(b);
			b--;
		}
		
	 int b2 = 10;
	 do {
		 System.out.println(b2);
		 b2--;
	 }
	while(b2>=1);
	
	 System.out.println("------------------");
		
	//4. Write a program in Java to print "Hello World" ten times using while loop
	 
	 int s=1;
	 while (s<=10) {
		 System.out.println("Hello World " + s);
		 s++;
	 }
	
	 System.out.println("//////////////////////");
	 
	 //5. Write a program in Java to print all the multiplication of 5 from 1 to 100 using while /for/do-while loop
	 
	 //for (int m=1;m<=100;) {
		// System.out.println(m);
		// m = m*5;
	 
	 for (int e= 1; e<100; e++ ) {
		 if (e%5 ==0) {
			 System.out.println(" multiplication of 5: "+e);
		 }
	 }

		 
	 int num = 1;
	 while (num<100) {
		 if (num%5==0) {
			 System.out.println(" while - multiple of 5: " + num);
		 }
		
		 num++;
	 }
	  int h=1;
	  do {
		 
		  if (h%5 == 0) {
			  System.out.println(" do- while multiples of 5: "+ h );
	  }
		  h++;
	  }
	  while (h < 100);
	   
	 
	System.out.println("................................."); 
	 
	 //6. print all odd and even numbers between 1 to 100
	 
	for (int d=1;d<=100;d++) {
		if (d % 2 != 0) {
			System.out.println(d);
		}
	}
	
	for (int d=1;d<=100;d++) {
		if (d % 2 == 0) {
			System.out.println(d);
		}
	
	}
	
	//7. What will be the output of this program:
	//infinite loop of Hi Java

		//int i = 1;

		//while(i<=1){

		//System.out.println("Hi Java");

		//}
	 
	System.out.println("*****************************************"); 
//8. Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.
// not getting for 0-9 try again

	for (char r = 'a';r<='z';r++ ) {
		int rvalue= (int) r;
		System.out.println("Lower case Alphabets:"+""+ r +"-"+rvalue );
		
	}
	char t1='a';
	while (t1<='z') {
		int t1value = (int)t1;
		System.out.println("while a-z:"+t1+"-"+t1value);
		t1++;
	}
	
	for (char r = 'A';r<='Z';r++ ) {
		int rvalue= (int) r;
		System.out.println("Upper case Alphabets:"+""+ r +"-"+rvalue );
		
	}
	char t3='A';
	while (t3<='Z') {
		int t3value = (int)t3;
		System.out.println("while A-Z:"+t3+"-"+t3value);
		t3++;
	}
	for (int r1 = 0 ;r1<= 9 ;r1++ ) {
		int r1ascii = (int) r1;
		System.out.println("0-9 numbers:"+""+ r1 +"-"+ r1ascii );
		
	}

		
	//9. Print the following series: 

	//1.0 2.0 3.0  ...... 10.0 

	//0 9 18 27 36 …99
	for (double d1=1.0;d1<=10.0;d1++) {
		System.out.println(d1);
	}

	for (int e= 1;e<=100; e++) {
		if (e % 9 == 0) {
			System.out.println(e);
		}
	}
		
	//10.Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.	
		char v= 'a';
		while (v<='z') {
			
			if (v =='a'||v=='e'||v=='i'||v=='o'||v=='u') {
				System.out.println(" This is a vowel:"+v);	
			}
			v++;
		}
		
	// Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".

	 
	 for(int n =1; n<=10;) {
		 System.out.println(n);
		 	if (n % 7 ==0) {
		 		System.out.println("bye");
			 	break;
		 	}
		 	n++;
	 }
	
	 
	
	 
			

	
	
		}
}
		

	


