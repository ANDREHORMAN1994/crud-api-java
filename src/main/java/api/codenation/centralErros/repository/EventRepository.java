package api.codenation.centralErros.repository;

import api.codenation.centralErros.models.Event;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventRepository extends CrudRepository<Event, Long> {

    List<Event> findAllByLog(String log);

}
