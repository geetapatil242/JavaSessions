package javasessions;

import java.util.ArrayList;
import java.util.Collections;

public class AssignArrayList {

	public static void main(String[] args) {
		//   1. Write a Java program to create a new array list, //  add some colors "string" // and print out the colorslist.

		ArrayList <String> colors =new ArrayList<String>();
		colors.add("pink");
		colors.add("white");
		colors.add("yellow");
		colors.add("blue");
		colors.add("red");
		
		System.out.println(colors);
		for(String e : colors) {
			System.out.println(e);
		}
		for (int i =0; i<colors.size();i++) {
			System.out.println(colors.get(i));
			if(colors.get(i)=="white") {
				System.out.println("fav color");
			}
			
		}
		
//   2. Write a Java program to retrieve an element at a specified index from a given array list.
		// get yellow from above arraylist
		System.out.println(colors.get(2));
//  3. Write a Java program to update specific array element by given element.
		// update pink color with purple in above arreaylist
		colors.set(0,"purple");
		System.out.println(colors);
		
// 4. Write a Java program to remove the third element from an array list. 
		
// 5. Write a Java program to search an element in an array list using for loop. Once we find that element, break the loop.	
		
		// break at blue
		
		for (String e: colors) {
			System.out.println(e);
			if (e == "blue") {
				System.out.println("this is blue, break now");
				break;
			}
		}
		
// 6. Reverse this array List:

		ArrayList<String> studentNames = new ArrayList<String>();

studentNames.add("Varun");
studentNames.add("Reena");
studentNames.add("Naveen");

studentNames.add("Robin");

studentNames.add("Peter");

System.out.println(studentNames);
Collections.reverse(studentNames);
System.out.println(studentNames);

	for(int i =studentNames.size()-1;i>=0; i--) {
		System.out.println(studentNames.get(i));
}
		
		

	}

}
