package api.codenation.centralErros.controllers;

import api.codenation.centralErros.models.Event;
import api.codenation.centralErros.services.EventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    private EventServiceImpl eventService;

    /*
    @GetMapping
    public String getAll() {
        return "HELLO WORLD";
    }
    */

    @GetMapping
    public List<Event> findAllEvents(@RequestParam(required = false) String log) {
        if (log != null) return eventService.findAllByLog(log);
        return eventService.findAll();
    }

    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return eventService.save(event);
    }

    @DeleteMapping("/{id}")
    public String deleteEvent(@PathVariable(value = "id") Long id) {
        eventService.delete(id);
        return "Deletado com sucesso";
    }

}
