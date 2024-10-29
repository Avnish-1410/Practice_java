package AnonymousInnerClasses;

public class GreetingAll {
	void generateGreeting() {
		Greeting greet = new Greeting() {

			@Override
			public void sayHello() {
				System.out.println("Hello Everyone");
			}
		};
		greet.sayHello();
	}
	public static void main(String[] args) {
		GreetingAll greetall = new GreetingAll();
		
		greetall.generateGreeting();
	}
}
