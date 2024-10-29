package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialDeSerial {
	public static void main(String[] args)  {
		Person person1 = new Person("Avnish",23);
		
			// SERIALIZING...
		try{
			FileOutputStream fos = new FileOutputStream("C:/Users/avnis/OneDrive/Desktop/JAVA/NewOutput.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(person1);
		
			// DE-SERIALIZING...
			FileInputStream fis = new FileInputStream("C:/Users/avnis/OneDrive/Desktop/JAVA/NewInput.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Person other_person = (Person)ois.readObject();
			System.out.println(other_person);
			
			
		}catch(IOException e) {
			e.getMessage();
		} catch (ClassNotFoundException e) {
		
			e.getMessage();
		}finally {
			System.out.println("Done");
		}
		
		
	}
}
