package Animal_Heirarchy;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Cow cow = new Cow();
		
		cat.MakeSound();
		dog.MakeSound();
		cow.MakeSound();
	}
}
