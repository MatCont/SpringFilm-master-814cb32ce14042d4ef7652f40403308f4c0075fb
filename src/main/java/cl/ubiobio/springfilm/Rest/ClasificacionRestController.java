package cl.ubiobio.springfilm.Rest;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.ubiobio.springfilm.Models.Clasificacion;
import cl.ubiobio.springfilm.Services.ClasificacionService;

@RestController
@RequestMapping("/clasificacion")
public class ClasificacionRestController {
    
    @Autowired
    private ClasificacionService clasificacionService;

    @GetMapping("/buscar")
    public List<Clasificacion> buscar() {
        try {

            return clasificacionService.getAllClasificaciones();

        } catch (NoSuchElementException e) {
            return new ArrayList<Clasificacion>();
        }
    }
    
}
