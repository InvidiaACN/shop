package entity;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Acquisto
 */

@Entity
public class Acquisto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id; // ID dell'acquisto

    @NotNull
    @Column(name = "id_cliente")
    @Schema(name = "id_cliente", description = "ID del cliente che ha effettuato l'acquisto", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id_cliente")
    private Integer idCliente; // ID del cliente

    @NotNull
    @Column(name = "id_calzatura")
    @Schema(name = "id_calzatura", description = "ID della calzatura acquistata", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id_calzatura")
    private Integer idCalzatura; // ID della calzatura

    public Acquisto() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Acquisto(Integer idCliente, Integer idCalzatura) {
        this.idCliente = idCliente;
        this.idCalzatura = idCalzatura;
    }

    public Acquisto id(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Acquisto idCliente(Integer idCliente) {
        this.idCliente = idCliente;
        return this;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Acquisto idCalzatura(Integer idCalzatura) {
        this.idCalzatura = idCalzatura;
        return this;
    }

    public Integer getIdCalzatura() {
        return idCalzatura;
    }

    public void setIdCalzatura(Integer idCalzatura) {
        this.idCalzatura = idCalzatura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Acquisto acquisto = (Acquisto) o;
        return Objects.equals(this.id, acquisto.id) &&
               Objects.equals(this.idCliente, acquisto.idCliente) &&
               Objects.equals(this.idCalzatura, acquisto.idCalzatura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idCliente, idCalzatura);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Acquisto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    idCliente: ").append(toIndentedString(idCliente)).append("\n");
        sb.append("    idCalzatura: ").append(toIndentedString(idCalzatura)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
