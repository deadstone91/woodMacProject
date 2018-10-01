package libraryProject.book;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Book {

	@Id
	private String bookId;
	private String bookName;
	private String bookGenre;
	@ManyToOne
	private int authorId;
	
	public Book() {
		
	}

	public Book(String bookId, String bookName, String bookGenre, int authorId) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookGenre = bookGenre;
		this.authorId = authorId;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	
	
	
}
