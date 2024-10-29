package ExceptionalHandling;
import java.util.Scanner;

public class DivByZero {
	static double div;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter another number: ");
		int num2 = sc.nextInt();
		
		try {
		 div = num1/num2;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println(div);
	}
}
