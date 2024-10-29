package ExceptionalHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ResourceMangement {
    public static void main(String[] args) {
        String filePath = "/C:/Users/avnis/Downloads/bank loan completed 2009-2014.csv/"; // Specify the path to your file

        // Using try-with-resources to automatically close the BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Print each line from the file
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
