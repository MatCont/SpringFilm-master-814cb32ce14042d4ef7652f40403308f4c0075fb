package cl.ubiobio.springfilm.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.ubiobio.springfilm.Models.Compra;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Integer> {
    
}
    

