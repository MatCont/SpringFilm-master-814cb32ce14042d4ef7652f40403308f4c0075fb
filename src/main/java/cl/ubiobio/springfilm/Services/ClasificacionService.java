package cl.ubiobio.springfilm.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.ubiobio.springfilm.Models.Clasificacion;
import cl.ubiobio.springfilm.Repositories.ClasificacionRepository;

@Service
public class ClasificacionService {

    @Autowired
    private ClasificacionRepository clasificacionRepository;

    public List<Clasificacion> getAllClasificaciones() {
        
        return clasificacionRepository.findAll();
    }

    public Clasificacion getClasificacionById(Integer id) {
        return clasificacionRepository.findById(id).get();
    }

    public Clasificacion saveClasificacion(Clasificacion clasificacion) {
        return clasificacionRepository.save(clasificacion);
    }

    public Clasificacion updateClasificacion(Clasificacion clasificacion) {
        return clasificacionRepository.save(clasificacion);
    }

    public void deleteClasificacion(Integer id) {
        clasificacionRepository.deleteById(id);
    }


    
}
