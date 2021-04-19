package api.codenation.centralErros.controllers;

import api.codenation.centralErros.models.Level;
import api.codenation.centralErros.services.LevelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/level")
public class LevelController {

    @Autowired
    private LevelServiceImpl levelService;

    @GetMapping
    public List<Level> findAll() {
        return levelService.findAll();
    }

}
