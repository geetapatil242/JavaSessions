package javasessions;

public class AssignArrays {

	public static void main(String[] args) {
		
		
String browsers[] = {"chrome","firefox","IE","Edge","Safari"};
		
		for(int k=0;k < browsers.length;k++)
		{
			System.out.println();
			System.out.println("The browser is"+browsers[k]);
			if(browsers[k].equals("chrome"))
			{
				System.out.println("Browser Belongs to Google");
			}
			else if(browsers[k].equals("firefox"))
			{
				System.out.println("Browser belongs to Mozilla");
				
			}
			else if(browsers[k].equals("IE")||browsers[k].equals("Edge"))
			{
				System.out.println("This is Deprecated");
				System.out.println("Browser belongs to Microsoft");
				
			}
			else if(browsers[k].equals("Edge"))
			{
				System.out.println("Browser belongs to Microsoft");
				
			}
			else
			{
				System.out.println("The browser which comes in Else is"+browsers[k]);
				System.out.println("Browser belongs to Apple");
				
			}
		}
		

	}

}
