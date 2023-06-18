package javasessions;

public class AssignEmployee {
	
	static String ceoname = "Bill";
	static String compaddress = "Menlopark";
	static int hrs= 40;
	String empname;
	String deptname;
	String occupn;
	int age;
	String city;
	boolean local;
	String type;
	
	
	public static void main(String[] args) {
		// Employee class
		//10 variables
		//print default values
		//3 objects
		//2 variables -- static
		
		
		
		AssignEmployee obj1 = new AssignEmployee();
		obj1.empname ="David";
		obj1.deptname = "SW";
		obj1.age = 30;
		obj1.city = "Milipitas";
		obj1.local = true;
		obj1.occupn = "Developer";
		obj1.type = "Contractor";
		System.out.println(AssignEmployee.ceoname);
		System.out.println(AssignEmployee.hrs);
		System.out.println(AssignEmployee.compaddress);
		System.out.println(AssignEmployee.ceoname+" "+obj1.empname+" "+obj1.deptname+" "+obj1.age+" "+obj1.occupn+" "+obj1.city+" "+AssignEmployee.hrs+" "+AssignEmployee.compaddress);
		
		AssignEmployee obj2 = new AssignEmployee();
		obj2.empname ="KJ";
		obj2.deptname = "FW";
		obj2.age = 45;
		obj2.city = "Los Gatos";
		obj2.local = true;
		obj2.occupn = "FWEng";
		obj2.type = "Full time";
		System.out.println(AssignEmployee.ceoname);
		System.out.println(AssignEmployee.hrs);
		System.out.println(AssignEmployee.compaddress);
		System.out.println(AssignEmployee.ceoname+" "+obj2.empname+" "+obj2.deptname+" "+obj2.age+" "+obj2.occupn+" "+obj2.city+" "+AssignEmployee.hrs+" "+AssignEmployee.compaddress);
		
		AssignEmployee obj3 = new AssignEmployee();
		obj3.empname ="PS";
		obj3.deptname = "SW";
		obj3.age = 30;
		obj3.city = "MountainHouse";
		obj3.local = false;
		obj3.occupn = "Developer";
		obj3.type = "Full time";
		System.out.println(AssignEmployee.ceoname);
		System.out.println(AssignEmployee.hrs);
		System.out.println(AssignEmployee.compaddress);
		System.out.println(AssignEmployee.ceoname+" "+obj3.empname+" "+obj3.deptname+" "+obj3.age+" "+obj3.occupn+" "+obj3.city+" "+AssignEmployee.hrs+" "+AssignEmployee.compaddress);
		

	}

}
