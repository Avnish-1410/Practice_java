package Appliance_Heiracrchy;

public class WashingMachine extends Appliance {

	@Override
	void turnOn(String brand, double power_consumption) {
		// TODO Auto-generated method stub
		System.out.println("Brand of Waching Machine: "+brand+" Power Consumption: "+power_consumption);
	}

}
