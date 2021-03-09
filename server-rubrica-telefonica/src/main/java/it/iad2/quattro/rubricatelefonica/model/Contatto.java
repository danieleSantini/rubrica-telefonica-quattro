package it.iad2.quattro.rubricatelefonica.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author utente
 */
@Entity
public class Contatto implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String nome;
    @Column

    private String Cognome;
    @Column

    private String telefono;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return Cognome;
    }

    public void setCognome(String Cognome) {
        this.Cognome = Cognome;
    }

    @Override
    public String toString() {
        return "Contatto{" + "id=" + id + ", nome=" + nome + ", Cognome=" + Cognome + ", telefono=" + telefono + '}';
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Contatto(String nome, String Cognome, String telefono) {
        this.nome = nome;
        this.Cognome = Cognome;
        this.telefono = telefono;
    }

    public Contatto() {
    }

}
