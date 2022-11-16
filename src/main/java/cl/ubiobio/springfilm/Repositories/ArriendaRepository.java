package cl.ubiobio.springfilm.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.ubiobio.springfilm.Models.Arrienda;

@Repository
public interface ArriendaRepository extends JpaRepository<Arrienda, Integer> {
    
}
    

