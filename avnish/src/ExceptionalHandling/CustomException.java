package ExceptionalHandling;
import java.util.Scanner;

public class CustomException {
	public static void main(String[] args) throws InvalidAgeException {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int age = sc.nextInt();
		
		if(age<0) {
			throw new InvalidAgeException("xxxxx AGE CAN'T BE LESS THAN ZERO xxxxxx");
			
		}else if(age>120) {
			throw new InvalidAgeException("xxxxxx AGE CAN'T BE MORE THAN 120 xxxxxx ");
		}else {
			System.out.println(">>>>>>> WECOME <<<<<<<<<");
		}
		
	}

}
