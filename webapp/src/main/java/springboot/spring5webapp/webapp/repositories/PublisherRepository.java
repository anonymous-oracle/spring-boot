package springboot.spring5webapp.webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import springboot.spring5webapp.webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
