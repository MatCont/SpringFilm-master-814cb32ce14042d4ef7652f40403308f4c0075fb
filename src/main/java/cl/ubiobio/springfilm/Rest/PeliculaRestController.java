package cl.ubiobio.springfilm.Rest;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.ubiobio.springfilm.Models.Pelicula;
import cl.ubiobio.springfilm.Services.PeliculaService;

@RestController
@RequestMapping("/pelicula")
public class PeliculaRestController {
    
    @Autowired
    private PeliculaService peliculaService;

    @GetMapping("/buscar")
    public List<Pelicula> buscar() {
        try {

            return peliculaService.getAllPeliculas();

        } catch (NoSuchElementException e) {
            return new ArrayList<Pelicula>();
        }
    }
    
}
