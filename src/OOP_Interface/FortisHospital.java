package OOP_Interface;

public class FortisHospital extends UNHG implements USMedical, UKMedical, IndianMedical {

	@Override
	public void physioServices() {
		System.out.println("FH == physio");
	}

	@Override
	public void cardioServices() {
		System.out.println("FH -- cardio");
	}

	@Override
	public void oncologyServices() {
		 System.out.println("FH -- oncology");
	}
	
	//UK
	@Override
	public void entServices() {
		System.out.println("FH -- entServices");
	}

	@Override
	public void pediaServices() {
		System.out.println("FH -- pediaServices");
	}
	
	//India
	@Override
	public void orthoServices() {
		System.out.println("FH -- orthoServices");
	}
	
	public void medicalTraining() {
		System.out.println("FH -- training");
	}

	@Override
	public void emergencyServices() {
		System.out.println("emergency");
		
		
	}
	
	@Override
	public void medInsurance() {
		System.out.println("FH medinsur");
	}

	@Override
	public void covidTest() {
		System.out.println("FH covid test");
		
	}
	

}
