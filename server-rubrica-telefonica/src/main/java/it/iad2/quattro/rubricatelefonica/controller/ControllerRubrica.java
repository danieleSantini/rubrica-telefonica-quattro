package it.iad2.quattro.rubricatelefonica.controller;

import it.iad2.quattro.rubricatelefonica.dto.DtoCercaContatto;
import it.iad2.quattro.rubricatelefonica.dto.DtoContatto;
import it.iad2.quattro.rubricatelefonica.dto.DtoRubrica;
import it.iad2.quattro.rubricatelefonica.model.Contatto;
import it.iad2.quattro.rubricatelefonica.service.ServiceRubrica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class ControllerRubrica {

    @Autowired
    ServiceRubrica serviceRubrica;

    @RequestMapping("/inserisci-contatto")
    @ResponseBody
    public DtoRubrica inserisciContatto(@RequestBody DtoContatto dto) {
        return serviceRubrica.inserisciContatto(dto.getContatto());

    }

    @RequestMapping("/rimuovi-contatto")
    @ResponseBody
    DtoRubrica rimuoviContatto(@RequestBody DtoContatto dto){
            return serviceRubrica.rimuoviContatto(dto.getContatto());

    }

    DtoRubrica aggiornaRubrica(){
         return serviceRubrica.aggiornaRubrica();
    }

    DtoRubrica cercaContatto(@RequestBody DtoCercaContatto dto){
        return serviceRubrica.cercaContatto(dto.getParametro());
    }
}
