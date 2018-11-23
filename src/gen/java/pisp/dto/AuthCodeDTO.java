package pisp.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;


@ApiModel(description = "The data object which contains the authorization code generated by the bank")
public class AuthCodeDTO {
  
  
  @NotNull
  private String code = null;
  
  @NotNull
  private String idToken = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("idToken")
  public String getIdToken() {
    return idToken;
  }
  public void setIdToken(String idToken) {
    this.idToken = idToken;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthCodeDTO {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  idToken: ").append(idToken).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
