package basic;

public class Libaray {
    private String name;
    private Book firstBook;
    private Book secondBook;

    public Libaray(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addFirstBook(Book book) {
        this.firstBook = book;
    }

    public void addSecondBook(Book book) {
        this.secondBook = book;
    }

    public void displayBooks() {
        System.out.println("Books in " + name + ":");
        if (firstBook != null) {
            System.out.println(firstBook);
        }
        if (secondBook != null) {
            System.out.println(secondBook);
        }
    }
}
