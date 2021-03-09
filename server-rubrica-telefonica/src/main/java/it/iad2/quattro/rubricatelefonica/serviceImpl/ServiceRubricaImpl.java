package it.iad2.quattro.rubricatelefonica.serviceImpl;

import it.iad2.quattro.rubricatelefonica.dto.DtoRubrica;
import it.iad2.quattro.rubricatelefonica.model.Contatto;
import it.iad2.quattro.rubricatelefonica.repository.RubricaRepository;
import it.iad2.quattro.rubricatelefonica.service.ServiceRubrica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceRubricaImpl implements ServiceRubrica {

    @Autowired
    RubricaRepository rubricaRepository;

    @Override
    public DtoRubrica inserisciContatto(Contatto c) {
    }

    @Override
    public DtoRubrica rimuoviContatto(Contatto c) {
    }

    @Override
    public DtoRubrica aggiornaRubrica() {
    }

    @Override
    public DtoRubrica cercaContatto(String parametro) {
    }

}
