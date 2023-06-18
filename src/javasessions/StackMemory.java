package javasessions;

public class StackMemory {
		// TODO Auto-generated method stub
		
		//NS -- NS -- Yes (No object)
		//S -- S --> Yes (No Object)
		//NS --> S --> : directly/class name, no object
		//S --> NS  --> need object
		//stack --> LIFO
		//Queue--> FIFO
		//stack --> out of memory: Stack Overflow error
		
		//3 static
		//3 ns
		//static -- static
		//staic -- NS
		//NS - S
		// NS - NS
		
	
	
	
	public static void b1() {
		System.out.println(" b1 method");
		b1();
		StackMemory.b2();
	}

	public static void b2() {
			System.out.println(" b2 method");
			b2();
			
	}
	public static void b3() {
				System.out.println(" b3 method");
		b3();
		StackMemory obj1 = new StackMemory();
		obj1.n1();
	
	}
	
	public void n1() {
		System.out.println(" n1 method");
	}
	
	public void n2() {
		System.out.println(" n2 method");
	}
	public void n3() {
		System.out.println(" n3 method");
		StackMemory.b3();
	}
	
	public static void main(String[] args) {
		StackMemory obj = new StackMemory ();
		//obj.n1();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		

//		public static void t1() {
//			System.out.println("t1 method");
//			t2();
//		}
//
//		public static void t2() {
//			System.out.println("t2 method");
//			t3();
//		}
//
//		public static void t3() {
//			System.out.println("t3 method");
//			StackMemory o2 = new StackMemory();
//			o2.m1();
//
//		}
//
//		public void m1() {
//			System.out.println("m1 method");
//			int i = 10;
//
//			m2();
//		}
//
//		public void m2() {
//			System.out.println("m2 method");
//			int p = 20;
//			m3();
//
//		}
//
//		public void m3() {
//			System.out.println("m3 method");
//			// m1();
//			StackMemory.t1();
//		}
//
//		public static void main(String[] args) {
//
//			StackMemory obj = new StackMemory();
//			obj.m1();
//
//		

	}

//}
