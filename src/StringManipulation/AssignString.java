package StringManipulation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ExceptionHandling.MyException;

public class AssignString {
	// find all the occurances of i --- to fo HW

	// class video assignment, to find 3rd occurrence of 'i'
	// method to find nth occurrence of a character in a string
	public static int findNthOccur(String s, char ch, int N) {
		int occur = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == ch) {
				occur += 1;
			}
			if (occur == N)
				return i;
		}
		if (N != occur) {
			System.out.println(" character does not have this occurance");
		}
		return -1;
	}

	public boolean matchStrings(String s1, String s2) {
		if (s1.equals(s2)) {
			System.out.println("Strings match");
			return true;
		} else {
			System.out.println("Strings don't match");
		}
		return false;
	}

	public String stringRev(String s5) {
		if (s5 == null) {
			System.out.println("null vlaues can not be reversed...plz pass the right value");
			throw new MyException("NULL VALUES");
		}

		if (s5.length() == 1) {
			return s5;
		} else if (s5.length() == 0) {
			System.out.println("plz pass the right nvalue not the blank value");
			// return s5;
			// return "-1";
		}
		String rev = "";
		for (int i = s5.length() - 1; i >= 0; i--) {

			rev = rev + s5.charAt(i);// mui

		}

		return rev;

	}

	public String halfString(String s6) {
		String halfname = "";
		int len = s6.length();
		System.out.println(len);
		int halflen = len / 2;
		System.out.println(halflen);
		for (int i = s6.length() - 1; i >= 0; i--) {
			halfname = halfname + s6.charAt(i);

		}
		return halfname;
	}

	public int stringReturn(String s8) {
		int r = -1;
		if (s8.contains("happy")) {
			System.out.println(" happy is present in the sentence");
			int r1 = s8.indexOf("happy");
			System.out.println("Starting index of happy is:" + r1);
			return r1;
		} else {

			System.out.println(" happy is not in the sentence");

		}
		return -1;
	}

	public static void main(String[] args) {
		String s = "hello This is my java code i am so happy";
		char ch = 'i';
		int N = 3;
		int nthoccur = findNthOccur(s, ch, N);
		System.out.println(N + " " + "Occurance of: " + ch + " is at the index of: " + nthoccur);

		// 1.  Write a program to check two different strings equality.
		AssignString as = new AssignString();
		String s1 = "Welcome";
		String s2 = "WElcome";
		as.matchStrings(s1, s2);
		// 2. Remove all  spaces in a String . 

		//   For example  : “         Hello      Everyone       “ .     Expected result:
		// “HelloEveryone”.
		String sr = s.replace(" ", "");
		System.out.println(sr);

		// 3. Write a program that will  print out the last character and first
		// character of a word.
		String w = "Monkey";
		char firstCh = w.charAt(0);
		System.out.println("First chargcter of String:" + " " + w + " " + "is:" + " " + firstCh);
		System.out.println(w.length());
		char lastCh = w.charAt(w.length() - 1);
		System.out.println("last chargcter of String:" + " " + w + " " + "is:" + " " + lastCh);

		// 4. Write a program to verify a word or a character contained in the sentence.
		// System.out.println(s.contains("happy"));

		// 5.Write a function/ method to reverse your own name.
		String nameRev = as.stringRev("Geeta Patil");
		System.out.println(nameRev);

		// 6. Write a program that gives you the last half of the string............not
		// complete, do later
		String hs = as.halfString("java");
		System.out.println(hs);

		System.out.println("------------------------");
		// 7.Write a program to get the 3rd  “ e “ of the string .
		// For example: “Welcome to Naveen Automation Labs ! “.

		String s11 = "Welcome to Naveen Automation Labs !";
		char ch11 = 'e';
		int N11 = 3;
		int thridoccur = findNthOccur(s11, ch11, N11);
		System.out.println("Third e in the string is at the index:" + " " + thridoccur);
		char letter = s11.charAt(thridoccur);
		System.out.println(letter);

		// 8. Write a method which gives an index of (-1) if string is not available. .
		// it should return integer. if String is present, then it should return the
		// specific index.

		as.stringReturn("i am happy"); // return is not working, do it later.

		// Write a program that breaks a whole string into small strings,
		// and prints out its all values . (Hint: split, loop) .
		String lang = "java is platform independent";
		String sublang[] = lang.split(" ");
		for (String e : sublang) {
			System.out.println(e);
		}
		System.out.println("-----------------");
		// 10. Assume that a string consists of 3 words, print out the middle one. 
		String st = "java selenium automation";
		String subst[] = st.split(" ");
		for (String e : subst) {
			System.out.println(e);

		}
		System.out.println(subst[1]);
		
		//11. get only numeric part from this String:
		String msg = "your transaction id is: 12345 and reference id is 34567";
		String id = msg.substring(24, 30);
		System.out.println(id);
		String id1 = msg.substring(msg.indexOf("is:")+4, msg.indexOf("and"));
		System.out.println(id1);
		String refid = msg.substring(msg.indexOf("is")+1, msg.length()-1);
		System.out.println(refid);
		
		// another way to get numeric values from a string
	    String str = "your transaction id is: 12345 and reference id is 34567";
	    StringBuilder myNumbers = new StringBuilder();
	    for (int i = 0; i < str.length(); i++) {
	        if (Character.isDigit(str.charAt(i))) {
	            myNumbers.append(str.charAt(i));
	            System.out.println(str.charAt(i) + " is a digit.");
	        } else {
	            System.out.println(str.charAt(i) + " not a digit.");
	        }
	    }
	    System.out.println("Your numbers: " + myNumbers.toString());
	   
	    
	    
	    // one more way to get numeric values from a string...this is simple solution
	    String str1="your transaction id is: 12345 and reference id is 34567";

	    Pattern p = Pattern.compile("(\\d+)");
	    Matcher m = p.matcher(str1);
	    while(m.find())
	    {
	        System.out.println(m.group(1));
	    }
// remove all the spaces use  replaceall.("\\s", "")
	
	}

}
