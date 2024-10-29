package Inheritence;

public class Bat implements Animal,Bird {

	public Bat() {
		System.out.println("Im a Bat");;
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		Bird.super.fly();
		System.out.println("Bat is flying");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		Animal.super.eat();
		System.out.println("Bat is eating");
	}
	
	
}
