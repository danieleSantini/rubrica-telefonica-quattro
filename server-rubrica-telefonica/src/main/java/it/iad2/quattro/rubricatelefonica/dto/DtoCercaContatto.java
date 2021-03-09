
package it.iad2.quattro.rubricatelefonica.dto;

public class DtoCercaContatto {
    private String parametro;

    public DtoCercaContatto() {
    }

    public DtoCercaContatto(String parametro) {
        this.parametro = parametro;
    }

    public String getParametro() {
        return parametro;
    }

    public void setParametro(String parametro) {
        this.parametro = parametro;
    }

    @Override
    public String toString() {
        return "DtoCercaContatto{" + "parametro=" + parametro + '}';
    }
    
    
}
