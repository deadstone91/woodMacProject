package libraryProject.book;

import java.util.List;
import libraryProject.author.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Integer> {

	public List<Book> findByAuthorId(int authorId);

}
