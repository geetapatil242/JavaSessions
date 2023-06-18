package OOP_Inheritance;

public class Fortis extends Hospital {
	@Override
	public void RadiologyDept() {
		System.out.println("Fortis---Radiology");
	}

	@Override
	public void GeneralMedicine() {
		System.out.println("Fortis---general medicine dept");
	}
	
	public void VisionServices() {
		System.out.println("fortis ---Vision serivce");
	}
}

