package cl.ubiobio.springfilm.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.ubiobio.springfilm.Models.Arrienda;
import cl.ubiobio.springfilm.Repositories.ArriendaRepository;

@Service
public class ArriendaService {
    
    @Autowired
    private ArriendaRepository arriendaRepository;

    public List<Arrienda> getAllArriendas() {
        return arriendaRepository.findAll();
    }

    public Arrienda getArriendaById(Integer id) {
        return arriendaRepository.findById(id).get();
    }

    public Arrienda saveArrienda(Arrienda arrienda) {
        return arriendaRepository.save(arrienda);
    }

    public Arrienda updateArrienda(Arrienda arrienda) {
        return arriendaRepository.save(arrienda);
    }

    public void deleteArrienda(Integer id) {
        arriendaRepository.deleteById(id);
    }
}   
