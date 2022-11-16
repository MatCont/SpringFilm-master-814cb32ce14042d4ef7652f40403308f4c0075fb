package cl.ubiobio.springfilm.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.ubiobio.springfilm.Models.Pelicula;
import cl.ubiobio.springfilm.Repositories.PeliculaRepository;

@Service
public class PeliculaService {
    
    @Autowired
    private PeliculaRepository peliculaRepository;

    public List<Pelicula> getAllPeliculas() {
        return peliculaRepository.findAll();
    }

    public Pelicula getPeliculaById(Integer id) {
        return peliculaRepository.findById(id).get();
    }

    public Pelicula savePelicula(Pelicula pelicula) {
        return peliculaRepository.save(pelicula);
    }

    public Pelicula updatePelicula(Pelicula pelicula) {
        return peliculaRepository.save(pelicula);
    }

    public void deletePelicula(Integer id) {
        peliculaRepository.deleteById(id);
    }
    
    public String getDescripcionPeliculaByID(Integer id){
        return peliculaRepository.findById(id).get().getSinopsis();
    }
}
