package OOP_Encapsulation;

public class Plant extends Living {

	public void color() {
		System.out.println("Plant ---color");

	}

	public void size() {
		System.out.println("Plant ---size");
	}

	@Override
	public void hasLife() {
		System.out.println("Living -- has life");
	}

	public static void main(String[] args) {
		Plant p1 = new Plant(); // create object
		p1.color(); // individual
		p1.hasLife(); // overridden
		p1.size(); // individual

	}

}
