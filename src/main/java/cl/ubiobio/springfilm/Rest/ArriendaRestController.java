package cl.ubiobio.springfilm.Rest;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.ubiobio.springfilm.Models.Arrienda;
import cl.ubiobio.springfilm.Services.ArriendaService;

@RestController
@RequestMapping("/arrienda")
public class ArriendaRestController {

    @Autowired
    private ArriendaService arriendoService;

    @GetMapping("/buscar")
    public List<Arrienda> buscar() {
        try {

            return arriendoService.getAllArriendas();

        } catch (NoSuchElementException e) {
            return new ArrayList<Arrienda>();
        }
    }
    
}

