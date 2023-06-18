package OOP_Inheritance;

public class Apollo extends Hospital {
	@Override
	public void OPD() {
		System.out.println("Apollo ---OPD");
	}

	@Override
	public void RadiologyDept() {
		System.out.println("Apollo---Radiology");
	}
	
	public void DentalService() {
		System.out.println("Apollo----Dental service");
	}
}
