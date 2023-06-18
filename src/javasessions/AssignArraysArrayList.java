package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;

import sun.security.util.ArrayUtil;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class AssignArraysArrayList {

	public static void main(String[] args) {
		//Q1: WAP to delete a specific number from the given array.

		//int p[] = {1,4,5,2,3,22,31, 2}; 

		//--Need to remove 22 from the p[] array.

		//---output should be: [1, 4, 5, 2, 3, 31, 2] 
		
		//int p[] = {1,4,5,2,3,22,31, 2}; 
		//System.out.println(Arrays.toString(p));
		// 22 is at index 5.
		
		
		// Q2: Write a program to create a static Array, having following cricket data:

//name, age, team name, DOB, gender, Strike Rate

//Try to create multiple Object Arrays for different players 

//Try to print all the values of each player on the console
		
		// static array with cricket data
		Object crkdata[] = new Object[6];
		crkdata[0]= "name";
		crkdata[1]= "age";
		crkdata[2]= "dob";
		crkdata[3]= "gender";
		crkdata[4]= "strikerate";
		for (int i =0;i<6;i++) {
			System.out.println(crkdata[i]);
		}
//ArrayList Questions:

//1. Write a Java program to create a new array list,

//--add some colors (string) 

//---and print out the colorslist.

		ArrayList<String> clrs = new ArrayList<String>();
		clrs.add("pink");
		clrs.add("blue");
		clrs.add("yellow");
		clrs.add("purple");
		clrs.add("black");
		System.out.println(clrs);
		System.out.println(clrs.size());
		System.out.println(clrs.get(2));
		
//  2. Write a Java program to retrieve an element at a specified index from a given array list.

//retrieving index 4 color = black from above arraylist
		System.out.println(clrs.get(4));
//3. Write a Java program to update specific array element by given element.

		clrs.set(0,"indigo");
		System.out.println(clrs);
		// add pink at the index 5
		clrs.add(5, "pink");
		System.out.println(clrs);
// 4. Write a Java program to remove the third element from an array list. 
		// remove third element = purple from the above clrs list 
		clrs.remove(3);
		System.out.println(clrs);

//5. Write a Java program to search an element in an array list using for loop. Once we find that element, break the loop
		for (int i =0;i<clrs.size();i++) {
			System.out.println(clrs.get(i));
				if (clrs.get(i).equalsIgnoreCase("yellow")){
					System.out.println("yellow, now break");
					break;
				}
			
		}
		
//6. Reverse this array List:

		ArrayList<String> studentNames = new ArrayList<String>();
		studentNames.add("Varun");
		studentNames.add("Reena");
		studentNames.add("Naveen");
		studentNames.add("Robin");
		studentNames.add("Peter");
		System.out.println(studentNames);
		Collections.reverse(studentNames);
		System.out.println(studentNames);
		
// 7. Write a Java program to extract a portion of an array list.
 // from above list [peter, robin, naveen, reena, varun] extract sublist of [peter, robin, naveen]
			System.out.println("Original list" + studentNames);
			List<String> sub_List = studentNames.subList(0,2);
			System.out.println(sub_List);
			System.out.println(studentNames);
//8. Write a Java program to empty an array list.		
		//studentNames.clear();
		System.out.println(studentNames);

//9. Write a Java program to trim the virtual capacity of an array list the current list size.
		studentNames.trimToSize();
		System.out.println(studentNames);

//10. Write a Java program to print all the elements of an ArrayList using the position of the elements
		System.out.println(clrs+"...original list");
		for (int i = 0; i<clrs.size();i++) {
			System.out.println(clrs.get(i));
		}


		
		
		
	}

}
