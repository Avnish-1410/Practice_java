package basic;

//public class Main {
//
//	public static void main(String[] args) {
//		Address address = new Address(50,"Hyderabad","Telagana");
//		address.display();
//		
//		Person p1 = new Person("Archi-Avnish-Verma",address);
//		p1.display();
//	}
//
//}

public class Main {
    public static void main(String[] args) {
        // Create an Address object
        Address address = new Address("123 Main St", "Springfield", "IL");

        // Create a Person object with the Address
        Person person = new Person("John Doe", address);
        
        // Create a Student object
        Student student = new Student("Alice Smith", 20, 3.8);

        // Output details
        System.out.println(person);
        System.out.println(student);
        
        // Update Address
        address.setStreet("456 Elm St");
        System.out.println("Updated Address: " + person.getAddress());
        
        // Update Student details
        student.setGpa(3.9);
        System.out.println("Updated Student: " + student);
    }
}
