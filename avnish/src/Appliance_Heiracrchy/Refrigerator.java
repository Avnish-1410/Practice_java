package Appliance_Heiracrchy;

public class Refrigerator extends Appliance {

	@Override
	void turnOn(String brand, double power_consumption) {
		System.out.println("Brand of Refrigerator: "+ brand+" Power Consumption: "+power_consumption);
	}

}
