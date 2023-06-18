package OOP_Interface;

public class EngCollege extends University implements KeralaGovt, AndraGovt, KarnatakaGovt {
	public void MechanicalDept() {
		System.out.println("EngCollege -- MechanicalDept");
	}
	public void SoftwareDept() {
		System.out.println("EngCollege ---SoftwareDept");
	}
	@Override
	public void kannadaSubject() {
		System.out.println("EC---KannadaSubject");
		
	}
	@Override
	public void TeluguSubject() {
		System.out.println("EC----TeluguSubject");
		
	}
	@Override
	public void malayamSubject() {
		System.out.println("EC---MalayamSubject");
		
	}
	@Override
	public void hindiSubject() {
		System.out.println("EC----HindiSubject");
		
	}
	@Override
	public void physicalEducation() {
		System.out.println("EC---PhysicalEducation");
		
	}

	
	
	
}
