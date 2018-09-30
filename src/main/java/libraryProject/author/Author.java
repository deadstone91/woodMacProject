package libraryProject.author;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Author {
	
	@Id
	private int authorId;
	private String authorFirstname;
	private String authorSurname;
	
	public Author() {
		
	}
	
	public Author(int authorId, String authorFirstname, String authorSurname) {
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

	public String getAuthorFirstname() {
		return authorFirstname;
	}

	public void setAuthorFirstname(String authorFirstname) {
		this.authorFirstname = authorFirstname;
	}

	public String getAuthorSurname() {
		return authorSurname;
	}

	public void setAuthorSurname(String authorSurname) {
		this.authorSurname = authorSurname;
	}
	
	
	
	
}
