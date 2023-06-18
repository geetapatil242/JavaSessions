package javasessions;

public class StringConcatination {

	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 20;
		
		int j1 = 40;
		int j2 = 30;
		String w1 = "Good";
		String w2 = "morning";
		//System.out.println(w1+j1*j2+(w2+j1));
		System.out.println(w1+(j1+j2)+w1);
		System.out.println(j2+w1+j1);
		System.out.println(w1+j1+j2+j2+j2+w1);
		System.out.println(w1+w2);
		//System.out.println(a+b);//30 
		
		String x = "hello";
		String y = "Selenium";
		
		//System.out.println(x+y);
		//System.out.println(a+x);
		
		//System.out.println(a+b+x+y);//30HelloSelenium
		//System.out.println(x+y+a+b);//HelloSelenium1020
		//System.out.println(x+y+(a+b));//HelloSelenium30
		
		//System.out.println(a+b+x+y+a+b);//30HelloSelenium1020
		//System.out.println(a+b+x+y+(a+b));//30HelloSelenium30
		
		double c = 12.33;
		double d = 23.44;
		
		double d1 = 10.10;
		double d2 = 20.20;
		System.out.println(x+(d1+d2)+y);
				
		
		
		//System.out.println(x+y+c+d);//helloSelenium12.3323.44
		
		//System.out.println(x+y+a+b+c+d);//helloSelenium102012.3323.44
		
		char g = 'm';
		char p = 'n';
		
		String l = "testing";
		String u = "automation";
		
		//System.out.println(l+u);
		//System.out.println(l+u+g+p);
		
		char c1 = 'a';
		char c2 = 'b';
		char c3 = '@';
		System.out.println((byte)'a');
		System.out.println((byte)'b');
		System.out.println((byte)'@');
		System.out.println(c1);
		System.out.println(c3+c1);
		System.out.println(w1+c2+c1+c3);
		

		char t1 = 'a';//97
		char t2 = 'b';//98
		//System.out.println(t1+t2);//97+98 = 195
		
		char t3 = 'z';//122
		//System.out.println(t1+t2+t3);
		
		//System.out.println(t1);
		//System.out.println(t2-t1);
		
		char gender = 'm';
		
		//System.out.println('a'+'b');
		
		//System.out.println("a+b");
		
		//a-z: 97 to 122
		//A-Z: 65 to 90
		//0-9: 48 to 57
		//System.out.println('$'+'a');//36+97
		
		//System.out.println((byte)'a');
		//System.out.println((byte)'$');
		//System.out.println((int)'a');

		int s1 = 100;
		int s2 = 300;
		//System.out.println("the value of s1 is :" + s1);
		//System.out.println("the value of s2 is :" + s2);
		//System.out.println("the sum is: "+ (s1 + s2));
		 int z= 120;
		 int n= -119;
		 //System.out.println(z+(n));
		 
		 int n1 = 300;
		 int n2 = 400;
		 System.out.println(n1+n2); //700
		 System.out.println("sum:"+n1+n2);// sum300400
		 System.out.println("sum:"+(n1+n2));
		 System.out.println(n1+n2+"sum"); // 700sum
		 
		 
	}

}
