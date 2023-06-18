package javasessions;

public class AssignmentsIfElseAndSwitchCase {

	public static void main(String[] args) {
	//2. Write a Java program to test a number is positive or negative.

		//Test Data

		//Input number: 35 -- positive number

		//Input number: -11 -- negative number

		int a = 6;
		if (a>=0) {
			System.out.println(a+": is a positive number");
		}
		else {
			System.out.println(a+":is a negative number");
		}
		
	// 3. WAP to check number is odd or even using If - Else
		
		int b = 8;
		if (b%2 == 0) {
			System.out.println(b+": is a even number");
		}
		else {
			System.out.println(b+":is a odd number");
		}
	//4. WAP to check given alphabet character is Vowel or Consonant using Switch - Case
		char ch = 'c';
		switch (ch) {
		case 'a':
			System.out.println(ch +": is a vowel");
			break;
		case 'e':
			System.out.println(ch +": is a vowel");
			break;
		case 'i':
			System.out.println(ch +": is a vowel");
			break;
		case 'o':
			System.out.println(ch +": is a vowel");
			break;
		case 'u':
			System.out.println(ch +": is a vowel");
			break;

		default:
			System.out.println(ch +": is a consonant");
			break;
		}
	//5. WAP to run your test cases in a specific environment like: QA, Stage, Dev, UAT, Prod using using Switch - Case
		String env ="cos ";
		switch (env.toLowerCase().trim()) {
		case "qa":
			System.out.println(env +" :this is QA environment");
			break;
		case "staging":
			System.out.println(env +" :this is staging environment");
			break;
		case "dev":
			System.out.println(env +" :this is dev environment");
			break;
		case "uat":
			System.out.println(env +" :this is UAT environment");
			break;
		case "prod":
			System.out.println(env +" :this is prod environment");
			break;

		default:
			System.out.println(env +" : this is not a testing environment");
			break;
		}

	//WAP to book the specific type of car from the Uber app using Switch - Case. 

//Car Type: Mini, Sedan, SUV, Premium

//If user passes wrong car type, print please select the right car type
		String vehicle = " PREmium ";
		switch (vehicle.toLowerCase().trim()) {
		case "mini":
			System.out.println(vehicle +" :is a Mini car");
			break;
		case "sedan":
			System.out.println(vehicle +" :is a Sedan car");
			break;
		case "SUV":
			System.out.println(vehicle +" :is a SUV car");
			break;
		case "premium":
			System.out.println(vehicle +" :is a Premium car");
			break;

		default:
			System.out.println(vehicle + " :please select the right car type");
			break;
		}
		
	//WAP to launch browsers using If-ElseIf and Switch Case.

//Browser: Chrome/Firefox/IE/Safari

//If user passes wrong browser, print please pass the right browser name
		
	String brw = "abc";
	switch (brw.toLowerCase().trim()) {
	case "chrome":
		System.out.println(brw + " :Please launch Chrome browser");
		break;
	case "firefox":
		System.out.println(brw + " :Please launch Firefox browser");
		break;
	case "ie":
		System.out.println(brw + " :Please launch IE browser");
		break;
	case "safari":
		System.out.println(brw + " :Please launch Safari browser");
		break;
	default:
		System.out.println(brw + " : please pass correct browser");
		break;
	}
		
	System.out.println("---------------------------------");	

	// WAP to define the interest rate on the basis of Loan type using Switch Case

//Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan

//For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR Housing Loan
	
	String loanType = "housing loan";
	switch (loanType.toLowerCase().trim()) {
	case "car loan":
		System.out.println(" Eligible car loan");
		break;
	case "housing loan":
		System.out.println(" Housing loan");
		int salary = 3500;	
		if (salary < 35000) {
			System.out.println( " Not eligible for loan");
		}
		break;
	case "Personal loan":
		System.out.println(" personal loan");
		break;
	case "Education loan":
		System.out.println(" Education loan");
		break;

	default:
		System.out.println(" Enter a valid loan type");
		break;
	}
	
	
	
	
		}
		
	}

