
package it.iad2.quattro.rubricatelefonica.service;

import it.iad2.quattro.rubricatelefonica.dto.DtoRubrica;
import it.iad2.quattro.rubricatelefonica.model.Contatto;

/**
 *
 * @author utente
 */
public interface ServiceRubrica {

    DtoRubrica inserisciContatto(Contatto c);

    DtoRubrica rimuoviContatto(Contatto c);

    DtoRubrica reset();

    DtoRubrica aggiornaLista();

    DtoRubrica cercaContatto(String parametro);
  
}
