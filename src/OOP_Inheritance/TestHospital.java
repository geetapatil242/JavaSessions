package OOP_Inheritance;

public class TestHospital {

	public static void main(String[] args) {

		Hospital hp = new Hospital();
		hp.GeneralMedicine();
		hp.OPD();
		hp.RadiologyDept();
		System.out.println("------------");

		Apollo ap = new Apollo();
		ap.OPD();
		ap.DentalService();
		ap.GeneralMedicine();
		ap.RadiologyDept();

		System.out.println("------------");
		Fortis ft = new Fortis();
		ft.GeneralMedicine();
		ft.OPD();
		ft.RadiologyDept();
		ft.VisionServices();

		System.out.println("------------");

		Max mx = new Max();
		mx.GeneralMedicine();
		mx.OPD();
		mx.RadiologyDept();
		mx.VaccineClinic();

		System.out.println("------------");

		Hospital h = new Apollo();
		h.GeneralMedicine();
		h.OPD();
		h.RadiologyDept();

		System.out.println("------------");

		Hospital h2 = new Fortis();
		h2.GeneralMedicine();
		h2.OPD();
		h2.RadiologyDept();
		System.out.println("------------");

		// down casting
		//parent class object can be referred by child class ref variable:
		
		//Apollo ap1 = (Apollo) new Hospital(); // ClassCastException:
	}

}
