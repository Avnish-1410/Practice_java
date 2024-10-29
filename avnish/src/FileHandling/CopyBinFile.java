package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyBinFile {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path of file to read: ");
		String inputPath = sc.nextLine();
		
		System.out.println("Enter the path of file to write: ");
		String outputPath = sc.nextLine();
		
		try(FileInputStream fis = new FileInputStream(inputPath);
				FileOutputStream fos = new FileOutputStream(outputPath,true)){
			byte [] b = new byte[1024]; 
			
			int byteread;
			while((byteread = fis.read(b)) != -1) {
				fos.write(b,0,byteread);
			}
			System.out.println("File is Copied");
		}finally {
			sc.close();
		}
	}
}
