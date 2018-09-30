package libraryProject.author;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.management.loading.PrivateClassLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepo authorRepo;
	
	public List<Author> getAllAuthors(){
		List<Author> author = new ArrayList<>();
		authorRepo.findAll().forEach(author::add);
		return author;
		
	}

	public Optional<Author> getAuthor(int authorId) {
		return authorRepo.findById(authorId);
	}

	public void addTopic(Author author) {
		authorRepo.save(author);
	}

	public void updateAuthor(int authorId, Author author) {
		authorRepo.save(author);
	}
}
