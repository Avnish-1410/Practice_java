package Inheritence;

public interface Bird {
	default void fly() {
		System.out.println("Flying....");
	}
}
