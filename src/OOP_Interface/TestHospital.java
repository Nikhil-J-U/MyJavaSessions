package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.orthoServices();
		fh.pediaServices();
		fh.medicalTraining();
		USMedical.billing();
		fh.medInsurance();
		fh.medInsurance();
		fh.covidTest();
		fh.covidGuideLine();
		UNHG.covidGuideLine();
		fh.medicalInfo();
		//top casting
		//child class object can be referred by parent interface ref variable
		
		USMedical us = new FortisHospital();
		us.cardioServices();
		us.medInsurance();
		
		UKMedical uk = new FortisHospital();
		uk.entServices();
		uk.emergencyServices();
		uk.pediaServices();
		
		
		

	}

}
