package basic;

public class LibMain {

	public static void main(String[] args) {
		Author author1 = new Author(1001,"George Orwell", "British");
        Author author2 = new Author(7327,"J.K. Rowling", "British");

        // Create books
        Book book1 = new Book(7800051,"1984", author1);
        Book book2 = new Book(6901111,"Harry Potter and the Philosopher's Stone", author2);

        // Create a library and add books
        Libaray library = new Libaray("City Library");
        library.addFirstBook(book1);
        library.addSecondBook(book2);

        // Display the books in the library
        library.displayBooks();

	}

}
