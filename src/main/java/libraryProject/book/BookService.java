package libraryProject.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
	private BookRepo bookRepo;
	
	public List<Book> getAllBooks(int authorId){
		List<Book> books = new ArrayList<>();
		bookRepo.findByAuthorId(authorId).forEach(books::add);
		return books;
	}

	public Optional<Book> getBook(int bookId) {
		return bookRepo.findById(bookId);
	}

	public void addBook(Book book) {
		bookRepo.save(book);
		
	}

	public void updateBook(Book book) {
		bookRepo.save(book);
		
	}

	public void deleteCourse(int bookId) {
		bookRepo.deleteById(bookId);
		
	}
	
	
	
	
}