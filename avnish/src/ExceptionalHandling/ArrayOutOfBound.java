package ExceptionalHandling;
import java.util.Scanner;

public class ArrayOutOfBound {
	public static void main(String[] args) {		
		int [] arr = new int [10];
		for (int i =0;i<10;i++ ) {
			arr[i]=0+(int)(Math.random()*10);
		}
		for (int i =0;i<10;i++ ) {
			System.out.print(arr[i]+" ");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter an index: ");
		int index = sc.nextInt();
		
		try {
			System.out.println(arr[index]);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
	}
}
