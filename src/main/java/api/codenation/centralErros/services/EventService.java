package api.codenation.centralErros.services;

import api.codenation.centralErros.models.Event;

import java.util.List;

public interface EventService {

    List<Event> findAll();

    List<Event> findAllByLog(String log);

    Event save(Event event);

    void delete(Long id);

}
