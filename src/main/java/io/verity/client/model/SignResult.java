package io.verity.client.model;

import io.verity.client.invoker.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-08T12:39:32.615+02:00")
public class SignResult   {
  
  private String stamp = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("stamp")
  public String getStamp() {
    return stamp;
  }
  public void setStamp(String stamp) {
    this.stamp = stamp;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignResult {\n");
    
    sb.append("    stamp: ").append(StringUtil.toIndentedString(stamp)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
