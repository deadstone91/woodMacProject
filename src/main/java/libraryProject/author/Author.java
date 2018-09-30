package libraryProject.author;

public class Author {

	private int authorId;
	private int authorFirstname;
	private int authorSurname;
	
	public Author() {
		
	}
	
	public Author(int authorId, int authorFirstname, int authorSurname) {
		super();
		this.authorId = authorId;
		this.authorFirstname = authorFirstname;
		this.authorSurname = authorSurname;
	}

	
	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public int getAuthorFirstname() {
		return authorFirstname;
	}

	public void setAuthorFirstname(int authorFirstname) {
		this.authorFirstname = authorFirstname;
	}

	public int getAuthorSurname() {
		return authorSurname;
	}

	public void setAuthorSurname(int authorSurname) {
		this.authorSurname = authorSurname;
	}
	
	
	
	
}
