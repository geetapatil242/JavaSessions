package OOP_Interface;

public class TestCollege {
	
	public static void main(String[]args) {
		EngCollege eng = new EngCollege();
		eng.GeneralScience();
		eng.hindiSubject();
		eng.kannadaSubject();
		eng.malayamSubject();
		eng.MechanicalDept();
		eng.physicalEducation();
		eng.SoftwareDept();
		eng.TeluguSubject();
		
		System.out.println("-------------------------");
		
		MedicalCollege med = new MedicalCollege();
		med.AnatomyDept();
		med.GeneralScience();
		med.TeluguSubject();
		med.hindiSubject();
		med.kannadaSubject();
		med.malayamSubject();
		med.physicalEducation();
		med.PhysiologyDept();
		med.TeluguSubject();
	
		System.out.println("-------------------------");
		//top casting
		KarnatakaGovt kg =  new EngCollege();
		kg.hindiSubject();
		kg.kannadaSubject();
		kg.physicalEducation();
		
		System.out.println("-------------------------");
		//top casting
		KeralaGovt kl = new MedicalCollege();
		kl.hindiSubject();
		kl.malayamSubject();
		kl.physicalEducation();
		
		
		
		
	}

}
