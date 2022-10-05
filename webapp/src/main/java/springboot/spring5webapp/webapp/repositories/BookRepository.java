package springboot.spring5webapp.webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import springboot.spring5webapp.webapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
