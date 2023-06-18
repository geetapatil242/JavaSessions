package javasessions;

public class Color {
	String name;

	public static void main(String[] args) {
		Color c1 = new Color();
		c1.name = "Pink";
		
		Color c2 = new Color();
		c2.name ="Red";
		
		Color c3 = new Color();
		c3.name="Blue";
		
		Color c4 = new Color();
		c4.name = "Green";
		
		
		
		System.out.println(c1.name);
		System.out.println(c2.name);
		System.out.println(c3.name);
		System.out.println(c4.name);
		
		System.out.println("--------c1 = c2--------");
		c1 = c2;
		
		System.out.println(c1.name);
		System.out.println(c2.name);
		System.out.println(c3.name);
		System.out.println(c4.name);
		
		
		System.out.println("--------c2 = c3--------");
		c2 = c3;
		
		System.out.println(c1.name);
		System.out.println(c2.name);
		System.out.println(c3.name);
		System.out.println(c4.name);
		
		System.out.println("--------c3 = c4-------");
		c3= c4;
		
		System.out.println(c1.name);
		System.out.println(c2.name);
		System.out.println(c3.name);
		System.out.println(c4.name);
		
		
		System.out.println("--------c4= c1------");
		c4=c1;
		
		System.out.println(c1.name);
		System.out.println(c2.name);
		System.out.println(c3.name);
		System.out.println(c4.name);
	}

}
