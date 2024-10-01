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
 * Calzatura
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T16:15:56.384160700+02:00[Europe/Rome]", comments = "Generator version: 7.8.0")
public class Calzatura {

  private Integer id;

  private String nome;

  private String descrizione;

  private String taglia;

  public Calzatura() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Calzatura(Integer id, String nome, String descrizione, String taglia) {
    this.id = id;
    this.nome = nome;
    this.descrizione = descrizione;
    this.taglia = taglia;
  }

  public Calzatura id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * ID univoco della calzatura
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "ID univoco della calzatura", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Calzatura nome(String nome) {
    this.nome = nome;
    return this;
  }

  /**
   * Nome della calzatura
   * @return nome
   */
  @NotNull 
  @Schema(name = "nome", description = "Nome della calzatura", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nome")
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Calzatura descrizione(String descrizione) {
    this.descrizione = descrizione;
    return this;
  }

  /**
   * Descrizione della calzatura
   * @return descrizione
   */
  @NotNull 
  @Schema(name = "descrizione", example = "Sneaker comode per l'uso quotidiano.", description = "Descrizione della calzatura", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("descrizione")
  public String getDescrizione() {
    return descrizione;
  }

  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  public Calzatura taglia(String taglia) {
    this.taglia = taglia;
    return this;
  }

  /**
   * Taglia della calzatura
   * @return taglia
   */
  @NotNull 
  @Schema(name = "taglia", example = "42", description = "Taglia della calzatura", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("taglia")
  public String getTaglia() {
    return taglia;
  }

  public void setTaglia(String taglia) {
    this.taglia = taglia;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Calzatura calzatura = (Calzatura) o;
    return Objects.equals(this.id, calzatura.id) &&
        Objects.equals(this.nome, calzatura.nome) &&
        Objects.equals(this.descrizione, calzatura.descrizione) &&
        Objects.equals(this.taglia, calzatura.taglia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, descrizione, taglia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Calzatura {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    taglia: ").append(toIndentedString(taglia)).append("\n");
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

