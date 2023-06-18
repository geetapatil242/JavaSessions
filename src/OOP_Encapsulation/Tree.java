package OOP_Encapsulation;

public class Tree extends Plant {
	
	public void branches() { // individual 
		System.out.println(" Tree -----banches");
	}
	@Override // from Plant
	public void size() {
		System.out.println("Tree ---size");
	}
	@Override  //from Living
	public void grows() {
		System.out.println("Tree ---grows");
	}
	
	public static void main(String[] args) {
		
		Tree t1 = new Tree();
		t1.branches(); // individual
		t1.size(); // overridden
		t1.grows(); // overridden
		t1.hasLife(); //inherit from Living
		t1.color(); // inherit from Plant
		
	}

}
