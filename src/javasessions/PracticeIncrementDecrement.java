package javasessions;

public class PracticeIncrementDecrement {

	public static void main(String[] args) {
		
		//from javaconceptoftheday website
		//12) What will be the output of the following program?

				        int m=1010, n=1010;
				        // 1010 / 1011 * 1011 / 1010
				        // how is this equal to zero?
				      
				        System.out.println(m++ / ++n * n-- / --m); 
				        
				        

		int x = 001, y=010, z=100;
				         
		int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
		// i = 0 + 10 - 100 - 98 + 12 - (-1) + 12 - (-2)
		// i = 0 + 10 - 100 -98 +12 + 1 + 12 +2 
		
		// x = -2, y = 11, z = 98
				         
		System.out.println("x="+x);
		System.out.println("y="+y);
	    System.out.println("z="+z);
	    System.out.println("i="+i);
				   
	}

}
