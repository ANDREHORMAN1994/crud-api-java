package api.codenation.centralErros.controllers;

import api.codenation.centralErros.models.Level;
import api.codenation.centralErros.models.Origin;
import api.codenation.centralErros.services.OriginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/origin")
public class OriginController {

    @Autowired
    private OriginServiceImpl originService;

    @GetMapping
    public List<Origin> findAll() {
        return originService.findAll();
    }

}
