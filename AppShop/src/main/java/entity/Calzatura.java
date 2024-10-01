package entity;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Calzatura
 */

@Entity
public class Calzatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_calzatura")
    private Integer id; // ID della calzatura

    @NotNull
    @Column(name = "nome")
    @Schema(name = "nome", description = "Nome della calzatura", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("nome")
    private String nome; // Nome della calzatura

    @Column(name = "descrizione")
    @JsonProperty("descrizione")
    private String descrizione; // Descrizione della calzatura

    @NotNull
    @Column(name = "taglia")
    @JsonProperty("taglia")
    private String taglia; // Taglia della calzatura

    public Calzatura() {
        super();
    }

    public Calzatura(String nome, String descrizione, String taglia) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.taglia = taglia;
    }

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getTaglia() {
        return taglia;
    }

    public void setTaglia(String taglia) {
        this.taglia = taglia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calzatura calzatura = (Calzatura) o;
        return Objects.equals(id, calzatura.id) &&
               Objects.equals(nome, calzatura.nome) &&
               Objects.equals(descrizione, calzatura.descrizione) &&
               Objects.equals(taglia, calzatura.taglia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, descrizione, taglia);
    }

    @Override
    public String toString() {
        return "Calzatura{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", taglia='" + taglia + '\'' +
                '}';
    }
}
