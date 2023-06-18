package OOP_Inheritance;
//Inheritance Assignment:

//create one Hospital class (parent) - define three method in it.
//create three child classes (Apollo, Fortis, Max) of Hospital class 
//Override two methods from the parent class
//Define individual method of child class
//Create one test hospital class and use child class object, parent class object, top casting and down casting.

public class Hospital {

	public void OPD() {
		System.out.println("Hospital ---OPD");
	}
	
	public void RadiologyDept() {
		System.out.println("Hospital---Radiology");
	}
	
	public void GeneralMedicine() {
		System.out.println("Hospital---general medicine dept");
	}
}
