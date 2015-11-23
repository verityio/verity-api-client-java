package io.verity.client.model;

import io.verity.client.invoker.StringUtil;
import io.verity.client.model.Signer;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-09T00:00:32.346+02:00")
public class ValidationResult   {
  
  private Boolean signed = null;
  private List<Signer> signers = new ArrayList<Signer>();

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("signed")
  public Boolean getSigned() {
    return signed;
  }
  public void setSigned(Boolean signed) {
    this.signed = signed;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("signers")
  public List<Signer> getSigners() {
    return signers;
  }
  public void setSigners(List<Signer> signers) {
    this.signers = signers;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationResult {\n");
    
    sb.append("    signed: ").append(StringUtil.toIndentedString(signed)).append("\n");
    sb.append("    signers: ").append(StringUtil.toIndentedString(signers)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
