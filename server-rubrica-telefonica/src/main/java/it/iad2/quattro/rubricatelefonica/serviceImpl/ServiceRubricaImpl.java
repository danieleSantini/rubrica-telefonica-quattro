package it.iad2.quattro.rubricatelefonica.serviceImpl;

import it.iad2.quattro.rubricatelefonica.dto.DtoRubrica;
import it.iad2.quattro.rubricatelefonica.model.Contatto;
import it.iad2.quattro.rubricatelefonica.repository.RubricaRepository;
import it.iad2.quattro.rubricatelefonica.service.ServiceRubrica;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceRubricaImpl implements ServiceRubrica {

    @Autowired
    RubricaRepository rubricaRepository;

    @Override
    public DtoRubrica inserisciContatto(Contatto c) {
        DtoRubrica dto = new DtoRubrica();
        List<Contatto> listaContatti = rubricaRepository.findAll();
        if (listaContatti == null) {
            dto.setListaContatti(new ArrayList<>());
        } else {
            dto.setListaContatti(listaContatti);
        }
        return dto;
    }

    @Override
    public DtoRubrica rimuoviContatto(Contatto c) {
        //rimuoviamo il contatto 
        rubricaRepository.delete(c);
        return aggiornaRubrica();
    }

    @Override
    public DtoRubrica aggiornaRubrica() {
        //creiamo un dto di tipo Rubrica
        DtoRubrica dto = new DtoRubrica();
        //Creiamo una nuova lista di contatto,e chiediamo al Repository di darceli tutti
        List<Contatto> listaContatti = rubricaRepository.findAll();
        if (listaContatti == null) {
            dto.setListaContatti(new ArrayList<>());
        } else {
            dto.setListaContatti(listaContatti);
        }
        return dto;

    }

    @Override
    public DtoRubrica cercaContatto(String parametro) {
        List<Contatto> contattiSelezionati = rubricaRepository.findByNomeContainsorCognomeContains(parametro, parametro);
        return new DtoRubrica(contattiSelezionati);
    }

}
