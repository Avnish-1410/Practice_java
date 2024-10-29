package FileHandling;
import java.io.*;

public class CountWordsFile {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:/Users/avnis/LMS/Book.csv");
		FileWriter fw = new FileWriter("C:/Users/avnis/OneDrive/Desktop/JAVA/abc.txt");
		int x;
		int countWords=0;
		int countChar=0;
		int countline=0;
		
		while((x = fr.read()) != -1) {
			System.out.print((char)x);
			fw.write(x);
			countChar++;
			
			if(x == '\n')
				countline++;
			
			if(x ==' '|| x==',')
				countWords++;
			
		}
		
		fr.close();
		fw.close();
		
		System.out.println("\n"+countChar+" "+(countWords+countline));
	}


}


