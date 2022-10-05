package springboot.spring5webapp.webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import springboot.spring5webapp.webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
