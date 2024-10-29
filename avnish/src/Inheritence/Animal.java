package Inheritence;

public interface Animal {
	default void eat() {
		System.out.println("eating....");
	}
}
