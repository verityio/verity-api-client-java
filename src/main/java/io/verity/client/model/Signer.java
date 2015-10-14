package io.verity.client.model;

import io.verity.client.invoker.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-08T12:39:32.615+02:00")
public class Signer   {
  
  private String identity = null;
  private String dateSigned = null;
  private Integer level = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("identity")
  public String getIdentity() {
    return identity;
  }
  public void setIdentity(String identity) {
    this.identity = identity;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("dateSigned")
  public String getDateSigned() {
    return dateSigned;
  }
  public void setDateSigned(String dateSigned) {
    this.dateSigned = dateSigned;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("level")
  public Integer getLevel() {
    return level;
  }
  public void setLevel(Integer level) {
    this.level = level;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Signer {\n");
    
    sb.append("    identity: ").append(StringUtil.toIndentedString(identity)).append("\n");
    sb.append("    dateSigned: ").append(StringUtil.toIndentedString(dateSigned)).append("\n");
    sb.append("    level: ").append(StringUtil.toIndentedString(level)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
