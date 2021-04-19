package api.codenation.centralErros.services;

import api.codenation.centralErros.models.Level;
import api.codenation.centralErros.repository.LevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LevelServiceImpl implements LevelService{

    @Autowired
    private LevelRepository levelRepository;

    @Override
    public List<Level> findAll() {
        return (List<Level>) levelRepository.findAll();
    }
}
