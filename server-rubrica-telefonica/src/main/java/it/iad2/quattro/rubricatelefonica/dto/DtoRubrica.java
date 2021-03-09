
package it.iad2.quattro.rubricatelefonica.dto;

import it.iad2.quattro.rubricatelefonica.model.Contatto;
import java.util.List;


public class DtoRubrica {
  List<Contatto> listaContatti;

    public DtoRubrica() {
    }

    public DtoRubrica(List<Contatto> listaContatti) {
        this.listaContatti = listaContatti;
    }

    public List<Contatto> getListaContatti() {
        return listaContatti;
    }

    public void setListaContatti(List<Contatto> listaContatti) {
        this.listaContatti = listaContatti;
    }

    @Override
    public String toString() {
        return "DtoRubrica{" + "listaContatti=" + listaContatti + '}';
    }
  
}
