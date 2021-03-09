
package it.iad2.quattro.rubricatelefonica.dto;

import it.iad2.quattro.rubricatelefonica.model.Contatto;


public class DtoContatto {
 private Contatto contatto;

    public DtoContatto() {
    }

    public DtoContatto(Contatto contatto) {
        this.contatto = contatto;
    }

    public Contatto getContatto() {
        return contatto;
    }

    public void setContatto(Contatto contatto) {
        this.contatto = contatto;
    }

    @Override
    public String toString() {
        return "DtoContatto{" + "contatto=" + contatto + '}';
    }
 
    
}
