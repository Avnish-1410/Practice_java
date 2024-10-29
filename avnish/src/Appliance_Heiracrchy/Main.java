package Appliance_Heiracrchy;

public class Main {

	public static void main(String[] args) {
		Microwave mw = new Microwave();
		Refrigerator r = new Refrigerator();
		WashingMachine wm = new WashingMachine();
		
		mw.turnOn("LG", 30.5);
		r.turnOn("Samsung", 51.2);
		wm.turnOn("Whirlpool", 16.2);
	}

}
