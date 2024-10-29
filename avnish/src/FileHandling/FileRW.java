package FileHandling;
import java.io.*;

public class FileRW {
	public static void main(String[] args) throws IOException {
		String path ="/C:/Users/avnis/OneDrive/Documents/ordering system management.txt";
		String outpath ="C:/Users/avnis/OneDrive/Desktop/JAVA/FileRW.txt";
		try(BufferedReader br = new BufferedReader(new FileReader(path));
			BufferedWriter bw = new BufferedWriter(new FileWriter(outpath))){
			String line;

			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
				System.out.println(line);
				
			}
		}catch(FileNotFoundException e) {
			System.out.println("File Not Found "+ e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
