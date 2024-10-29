package ExceptionalHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedException {
	public static void main(String[] args) throws NegativeNumberException {
		Scanner sc = new Scanner(System.in);
		
		
		try {
			 System.out.println("enter a number : ");
			
			 try{
				 int num = sc.nextInt();
				 if (num<0) {
					 throw new NegativeNumberException("Value Can't be Negative");
				 }
			 }catch(InputMismatchException e) {
					e.printStackTrace();;
			 } 
		}finally{
			System.out.println("Both Cases Handled");
		}
	}
}
