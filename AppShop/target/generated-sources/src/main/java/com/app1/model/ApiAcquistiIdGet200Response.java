package com.app1.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ApiAcquistiIdGet200Response
 */

@JsonTypeName("_api_acquisti__id__get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-01T17:11:19.027143200+02:00[Europe/Rome]", comments = "Generator version: 7.8.0")
public class ApiAcquistiIdGet200Response {

  private Integer id;

  private Integer idCliente;

  private Integer idCalzatura;

  private String nomeCalzatura;

  public ApiAcquistiIdGet200Response id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * ID univoco dell'acquisto
   * @return id
   */
  
  @Schema(name = "id", description = "ID univoco dell'acquisto", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ApiAcquistiIdGet200Response idCliente(Integer idCliente) {
    this.idCliente = idCliente;
    return this;
  }

  /**
   * ID del cliente che ha effettuato l'acquisto
   * @return idCliente
   */
  
  @Schema(name = "id_cliente", description = "ID del cliente che ha effettuato l'acquisto", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id_cliente")
  public Integer getIdCliente() {
    return idCliente;
  }

  public void setIdCliente(Integer idCliente) {
    this.idCliente = idCliente;
  }

  public ApiAcquistiIdGet200Response idCalzatura(Integer idCalzatura) {
    this.idCalzatura = idCalzatura;
    return this;
  }

  /**
   * ID della calzatura acquistata
   * @return idCalzatura
   */
  
  @Schema(name = "id_calzatura", description = "ID della calzatura acquistata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id_calzatura")
  public Integer getIdCalzatura() {
    return idCalzatura;
  }

  public void setIdCalzatura(Integer idCalzatura) {
    this.idCalzatura = idCalzatura;
  }

  public ApiAcquistiIdGet200Response nomeCalzatura(String nomeCalzatura) {
    this.nomeCalzatura = nomeCalzatura;
    return this;
  }

  /**
   * Nome della calzatura acquistata
   * @return nomeCalzatura
   */
  
  @Schema(name = "nome_calzatura", example = "Sneaker comode per l'uso quotidiano.", description = "Nome della calzatura acquistata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nome_calzatura")
  public String getNomeCalzatura() {
    return nomeCalzatura;
  }

  public void setNomeCalzatura(String nomeCalzatura) {
    this.nomeCalzatura = nomeCalzatura;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiAcquistiIdGet200Response apiAcquistiIdGet200Response = (ApiAcquistiIdGet200Response) o;
    return Objects.equals(this.id, apiAcquistiIdGet200Response.id) &&
        Objects.equals(this.idCliente, apiAcquistiIdGet200Response.idCliente) &&
        Objects.equals(this.idCalzatura, apiAcquistiIdGet200Response.idCalzatura) &&
        Objects.equals(this.nomeCalzatura, apiAcquistiIdGet200Response.nomeCalzatura);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idCliente, idCalzatura, nomeCalzatura);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiAcquistiIdGet200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idCliente: ").append(toIndentedString(idCliente)).append("\n");
    sb.append("    idCalzatura: ").append(toIndentedString(idCalzatura)).append("\n");
    sb.append("    nomeCalzatura: ").append(toIndentedString(nomeCalzatura)).append("\n");
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

