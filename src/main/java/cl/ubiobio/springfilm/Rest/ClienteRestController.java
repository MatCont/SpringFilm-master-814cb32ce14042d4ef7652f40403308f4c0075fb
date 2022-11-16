package cl.ubiobio.springfilm.Rest;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.ubiobio.springfilm.Models.Cliente;
import cl.ubiobio.springfilm.Services.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteRestController {
    
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping("/buscar")
    public List<Cliente> buscar() {
        try {

            return clienteService.getAllClientes();

        } catch (NoSuchElementException e) {
            return new ArrayList<Cliente>();
        }
    }
    
}
