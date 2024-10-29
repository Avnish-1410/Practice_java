package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyingFile {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String path1="C:/Users/avnis/OneDrive/Desktop/JAVA/FileRW.txt";
		String path2="C:/Users/avnis/OneDrive/Desktop/JAVA/NewOutput.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path1));
				BufferedWriter bw = new BufferedWriter(new FileWriter(path2,true))){
			String line;
			while((line = br.readLine())!= null) {
				bw.write(line);
				bw.newLine();
			}
			
			System.out.println("Done");
		}
	}
}
