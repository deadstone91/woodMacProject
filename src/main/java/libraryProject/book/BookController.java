package libraryProject.book;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import libraryProject.author.Author;





@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;


	@RequestMapping("/authors/{authorId}/books")
	public List<Book> getAllBooks(@PathVariable int authorId){
		return bookService.getAllBooks(authorId);
	}
	
	@RequestMapping("/authors/{authorId}/book/{bookId}")
	public Optional<Book> getBook(@PathVariable int bookId){
		return bookService.getBook(bookId);
	}
	
	@PostMapping("/authors/{authorId}/book")
	public void addBook(@RequestBody Book book, @PathVariable int authorId){
		book.setAuthor(new Author(authorId,"",""));
		bookService.addBook(book);
	}
	
	@PutMapping("/authors/{authorId}/books/{bookId}")
	public void updateBook(@RequestBody Book book, @PathVariable int authorId,  int bookId){
		book.setAuthor(new Author(authorId,"",""));
		bookService.updateBook(book);
	}
	
	@DeleteMapping("/authors/{authorId}/books/{bookId}")
	public void deleteBook(@PathVariable int bookId){
		bookService.deleteCourse(bookId);
	}
	
}