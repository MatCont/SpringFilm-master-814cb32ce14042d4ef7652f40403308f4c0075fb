package cl.ubiobio.springfilm.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.ubiobio.springfilm.Models.Clasificacion;

@Repository
public interface ClasificacionRepository extends JpaRepository<Clasificacion, Integer> {
    
}
    

