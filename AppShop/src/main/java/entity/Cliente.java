package entity;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Cliente
 */

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer id_cliente; // ID del cliente

    @NotNull
    @Column(name = "nome")
    @Schema(name = "nome", description = "Nome del cliente", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("nome")
    private String nome; // Nome del cliente

    public Cliente() {
        super();
    }

    /**
     * Constructor with required parameters
     */
    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente idCliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
        return this;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Cliente nome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cliente cliente = (Cliente) o;
        return Objects.equals(this.id_cliente, cliente.id_cliente) &&
               Objects.equals(this.nome, cliente.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_cliente, nome);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Cliente {\n");
        sb.append("    id_cliente: ").append(toIndentedString(id_cliente)).append("\n");
        sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
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
