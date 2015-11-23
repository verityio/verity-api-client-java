package io.verity.client.api;

import io.verity.client.invoker.ApiException;
import io.verity.client.invoker.ApiClient;
import io.verity.client.invoker.Configuration;
import io.verity.client.invoker.Pair;
import io.verity.client.invoker.TypeRef;

import io.verity.client.model.*;

import java.util.*;

import io.verity.client.model.PairingResult;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-09T01:49:25.937+02:00")
public class TwoFactorDeviceApi {
  private ApiClient apiClient;

  public TwoFactorDeviceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TwoFactorDeviceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Attempt to pair from device using provided token
   * If the key is correct, this completes pairing of a device and provides a device key and secret key which must be stored on the device in order to authenticate it in future
   * @param pairingToken Pairing token received
   * @return PairingResult
   */
  public PairingResult pair (String pairingToken) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'pairingToken' is set
     if (pairingToken == null) {
        throw new ApiException(400, "Missing the required parameter 'pairingToken' when calling pair");
     }
     
    // create path and map variables
    String path = "/api/public/device/pair".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    if (pairingToken != null)
      formParams.put("pairingToken", pairingToken);
    

    final String[] accepts = {
      "application/json", "application/xml"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "apiKey" };

    

    
    
    TypeRef returnType = new TypeRef<PairingResult>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
