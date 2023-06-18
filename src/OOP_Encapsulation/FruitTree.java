package OOP_Encapsulation;

public class FruitTree extends Tree {
	public void taste() { // individual
		System.out.println(" FruitTree---taste");
	}

	@Override
	public void branches() { // overridden from tree
		System.out.println(" Tree -----banches");
	}
	@Override
	public void grows() {// overridden from Living
		System.out.println("FruitTree ---grows");
	}
	
	public static void main(String[] args) {
		FruitTree f1= new FruitTree();
		f1.taste(); // individual
		f1.branches(); // overridden
		f1.grows(); // overridden
		f1.color(); //inherited
		f1.size();//inherited

	}

}
