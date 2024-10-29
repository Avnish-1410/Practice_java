package basic;

public class Author {
	private int Authorid;
	private String Authorname;
	private String Nationality;
	public Author(int authorid, String authorname, String nationality) {
		
		this.Authorid = authorid;
		this.Authorname = authorname;
		this.Nationality = nationality;
	}
	public int getAuthorid() {
		return Authorid;
	}
	public String getAuthorname() {
		return Authorname;
	}
	public String getNationality() {
		return Nationality;
	}
	@Override
	public String toString() {
		return Authorid+","+Authorname+","+Nationality;
	}
	
}
