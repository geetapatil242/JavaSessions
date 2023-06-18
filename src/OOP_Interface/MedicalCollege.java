package OOP_Interface;

public class MedicalCollege extends University implements KeralaGovt, KarnatakaGovt, AndraGovt {
	public void AnatomyDept() {
		System.out.println("MedicalCollege---AnatomyDept");
	}
	
	public void PhysiologyDept() {
		System.out.println("MedicalCollege---PhysiologyDept");
	}

	@Override
	public void TeluguSubject() {
		System.out.println("MC---TeluguSubject");
		
	}

	@Override
	public void kannadaSubject() {
		System.out.println("MC---KannadaSubject");
	}

	@Override
	public void malayamSubject() {
		System.out.println("MC---malayamSubject");
		
	}

	@Override
	public void hindiSubject() {
		System.out.println("MC---hindiSubject");
		
	}

	@Override
	public void physicalEducation() {
		System.out.println("MC---PhysicalEducation");
		
	}

}
