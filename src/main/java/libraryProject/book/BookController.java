package libraryProject.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;


	@RequestMapping("/authors/{authorId}/books")
	public List<Book> getAllBooks(@PathVariable int authorId){
		return bookService.getAllBooks(authorId);
	}
}