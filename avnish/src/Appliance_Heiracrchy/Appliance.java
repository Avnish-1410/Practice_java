package Appliance_Heiracrchy;

public abstract class Appliance {
	String brand;
	double power_consumption;
	
	abstract void turnOn(String brand,double power_consumption);
}
