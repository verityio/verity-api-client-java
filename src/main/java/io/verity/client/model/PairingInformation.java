package io.verity.client.model;

import io.verity.client.invoker.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-09T00:00:32.346+02:00")
public class PairingInformation   {
  
  private String token = null;
  private Integer expirySeconds = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("expirySeconds")
  public Integer getExpirySeconds() {
    return expirySeconds;
  }
  public void setExpirySeconds(Integer expirySeconds) {
    this.expirySeconds = expirySeconds;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PairingInformation {\n");
    
    sb.append("    token: ").append(StringUtil.toIndentedString(token)).append("\n");
    sb.append("    expirySeconds: ").append(StringUtil.toIndentedString(expirySeconds)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
