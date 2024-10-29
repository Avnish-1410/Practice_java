package Appliance_Heiracrchy;

public class Microwave extends Appliance {

	@Override
	void turnOn(String brand, double power_consumption) {
		System.out.println("Brand of Microwave: "+brand+" Power Consumption: "+power_consumption);
		
	}

}
