package libraryProject.author;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.TomcatPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping("/authors/{authorId}")
	public Optional<Author> getAuthor(@PathVariable int authorId){
		return authorService.getAuthor(authorId);
	}
	
}