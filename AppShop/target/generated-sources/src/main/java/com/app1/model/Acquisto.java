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
 * Acquisto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T16:15:56.384160700+02:00[Europe/Rome]", comments = "Generator version: 7.8.0")
public class Acquisto {

  private Integer id;

  private Integer idCliente;

  private Integer idCalzatura;

  public Acquisto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Acquisto(Integer id, Integer idCliente, Integer idCalzatura) {
    this.id = id;
    this.idCliente = idCliente;
    this.idCalzatura = idCalzatura;
  }

  public Acquisto id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * ID univoco dell'acquisto
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "ID univoco dell'acquisto", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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

  /**
   * ID del cliente che ha effettuato l'acquisto
   * @return idCliente
   */
  @NotNull 
  @Schema(name = "id_cliente", description = "ID del cliente che ha effettuato l'acquisto", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id_cliente")
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

  /**
   * ID della calzatura acquistata
   * @return idCalzatura
   */
  @NotNull 
  @Schema(name = "id_calzatura", description = "ID della calzatura acquistata", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id_calzatura")
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

