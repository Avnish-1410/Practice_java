package basic;

public class Book {
	private int Bookid;
	private String Bookname;
	private Author Authorname;
	public Book(int bookid, String bookname, Author authorname) {
		
		this.Bookid = bookid;
		this.Bookname = bookname;
		this.Authorname = authorname;
	}
	public int getBookid() {
		return Bookid;
	}
	public String getBookname() {
		return Bookname;
	}
	public Author getAuthorname() {
		return Authorname;
	}
	@Override
	public String toString() {
		return Bookid+","+Bookname+","+Authorname;
	}
	
}
