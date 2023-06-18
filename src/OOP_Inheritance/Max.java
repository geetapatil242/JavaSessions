package OOP_Inheritance;

public class Max extends Hospital {
	@Override
	public void GeneralMedicine() {
		System.out.println("Max---general medicine dept");
	}

	@Override
	public void OPD() {
		System.out.println("Max ---OPD");
	}

	public void VaccineClinic() {
		System.out.println("Max---Vaccine clinic");
	}
}
