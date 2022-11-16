package cl.ubiobio.springfilm.Rest;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.ubiobio.springfilm.Models.Compra;
import cl.ubiobio.springfilm.Services.CompraService;

@RestController
@RequestMapping("/compra")
public class CompraRestController {
    
    @Autowired
    private CompraService compraService;

    @GetMapping("/buscar")
    public ResponseEntity< List<Compra>> buscar() {
        try {

            return new ResponseEntity<List<Compra>>(compraService.getAllCompras(), HttpStatus.OK);

        } catch (NoSuchElementException e) {
            return new ResponseEntity<List<Compra>>(new ArrayList<>(), HttpStatus.NOT_FOUND);
        }
    }

    
}
