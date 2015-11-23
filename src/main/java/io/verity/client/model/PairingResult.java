package io.verity.client.model;

import io.verity.client.invoker.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-09T00:00:32.346+02:00")
public class PairingResult   {
  
  private String deviceToken = null;
  private String deviceSecret = null;
  private Boolean success = null;
  private String errorMessage = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("deviceToken")
  public String getDeviceToken() {
    return deviceToken;
  }
  public void setDeviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("deviceSecret")
  public String getDeviceSecret() {
    return deviceSecret;
  }
  public void setDeviceSecret(String deviceSecret) {
    this.deviceSecret = deviceSecret;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PairingResult {\n");
    
    sb.append("    deviceToken: ").append(StringUtil.toIndentedString(deviceToken)).append("\n");
    sb.append("    deviceSecret: ").append(StringUtil.toIndentedString(deviceSecret)).append("\n");
    sb.append("    success: ").append(StringUtil.toIndentedString(success)).append("\n");
    sb.append("    errorMessage: ").append(StringUtil.toIndentedString(errorMessage)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
