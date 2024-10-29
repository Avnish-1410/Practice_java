package FileHandling;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;



public class AppendingFile {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Path at where you want to Append: ");
		String path = sc.nextLine();
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
			
			while(true) {
				System.out.println("Enter the content you want to append and enter exit to quit:");
				String line = sc.nextLine();
				
				if(line.equalsIgnoreCase("exit")) {
					System.out.println("Exit Succesfull");
					break;
				}
				
				bw.write(line);
				bw.newLine();
				System.out.println("Appended Successfully");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
