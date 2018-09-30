package libraryProject.author;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorConstructor {

	@Autowired
	private AuthorService authorService;
	
	@RequestMapping("/authors")
	public List<Author> getAllAuthors(){
		return authorService.getAllAuthors();
	}
	
}
