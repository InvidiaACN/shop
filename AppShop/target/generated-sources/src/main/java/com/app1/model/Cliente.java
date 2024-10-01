package com.app1.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Cliente
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T16:15:56.384160700+02:00[Europe/Rome]", comments = "Generator version: 7.8.0")
public class Cliente {

  private Integer idCliente;

  private String nome;

  public Cliente() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Cliente(Integer idCliente, String nome) {
    this.idCliente = idCliente;
    this.nome = nome;
  }

  public Cliente idCliente(Integer idCliente) {
    this.idCliente = idCliente;
    return this;
  }

  /**
   * ID cliente
   * @return idCliente
   */
  @NotNull 
  @Schema(name = "id_cliente", description = "ID cliente", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id_cliente")
  public Integer getIdCliente() {
    return idCliente;
  }

  public void setIdCliente(Integer idCliente) {
    this.idCliente = idCliente;
  }

  public Cliente nome(String nome) {
    this.nome = nome;
    return this;
  }

  /**
   * Nome del cliente
   * @return nome
   */
  @NotNull 
  @Schema(name = "nome", description = "Nome del cliente", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nome")
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
    return Objects.equals(this.idCliente, cliente.idCliente) &&
        Objects.equals(this.nome, cliente.nome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCliente, nome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cliente {\n");
    sb.append("    idCliente: ").append(toIndentedString(idCliente)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

