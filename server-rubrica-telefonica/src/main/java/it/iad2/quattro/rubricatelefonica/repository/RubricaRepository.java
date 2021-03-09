
package it.iad2.quattro.rubricatelefonica.repository;

import it.iad2.quattro.rubricatelefonica.model.Contatto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author utente
 */
public interface RubricaRepository extends JpaRepository<Contatto, Long>{
    List<Contatto> findByNomeContainsorCognomeContains(String n, String c);
    
    
}
