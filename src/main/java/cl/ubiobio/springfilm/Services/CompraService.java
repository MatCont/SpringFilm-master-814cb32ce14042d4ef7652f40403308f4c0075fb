package cl.ubiobio.springfilm.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.ubiobio.springfilm.Models.Compra;
import cl.ubiobio.springfilm.Repositories.CompraRepository;

@Service
public class CompraService {
    
    @Autowired
    private CompraRepository compraRepository;

    public List<Compra> getAllCompras() {
        return compraRepository.findAll();
    }

    public Optional<Compra> getCompraById(Integer id) {
        Compra compra = compraRepository.findById(id).get();
        if(compra != null) {
            return Optional.of(compra);
        } else {
            return Optional.empty();
        }
    }

    public Compra saveCompra(Compra compra) {
        return compraRepository.save(compra);
    }

    public Compra updateCompra(Compra compra) {
        return compraRepository.save(compra);
    }

    public void deleteCompra(Integer id) {
        compraRepository.deleteById(id);
    }

    public List<Compra> getAllArriendas() {
        return null;
    }
}
