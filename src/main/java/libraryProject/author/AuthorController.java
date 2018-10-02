package libraryProject.author;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.TomcatPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

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
	
	@PostMapping("/authors")
	public void addAuthor(@RequestBody Author author){
		authorService.addTopic(author);
	}
	
	@PutMapping("/authors/{authorId}")
	public void updateAuthor(@RequestBody Author author, @PathVariable int authorId){
		authorService.updateAuthor(authorId, author);
	}
	
	@DeleteMapping("authors/{authorId}")
	public void deleteAuthor(@PathVariable int authorId){
		authorService.deleteAuthor(authorId);
	}
}
