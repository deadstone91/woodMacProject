package libraryProject.book;

import java.util.ArrayList;
import java.util.List;

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
}