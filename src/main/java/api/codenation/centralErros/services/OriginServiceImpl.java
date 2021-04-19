package api.codenation.centralErros.services;

import api.codenation.centralErros.models.Origin;
import api.codenation.centralErros.repository.OriginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OriginServiceImpl implements OriginService{

    @Autowired
    private OriginRepository originRepository;

    @Override
    public List<Origin> findAll() {
        return (List<Origin>) originRepository.findAll();
    }
}
