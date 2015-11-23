package io.verity.client.api;

import io.verity.client.invoker.ApiException;
import io.verity.client.invoker.ApiClient;
import io.verity.client.invoker.Configuration;
import io.verity.client.invoker.Pair;
import io.verity.client.invoker.TypeRef;

import io.verity.client.model.*;

import java.util.*;

import io.verity.client.model.PairingInformation;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-09T01:49:25.937+02:00")
public class TwoFactorServerApi {
  private ApiClient apiClient;

  public TwoFactorServerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TwoFactorServerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Start pairing a device to your application
   * This will initiate a new pairing request and provide you with a token which will need to be given to the user of the device  to enter to complete the pairing. The deviceId parameter is a unique string so you can reference this device easily. If you provide a duplicate deviceId, this existing deviceId will be overwritten
   * @param key Application key
   * @param deviceId Your ID for this device
   * @return PairingInformation
   */
  public PairingInformation pair (String key, String deviceId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'key' is set
     if (key == null) {
        throw new ApiException(400, "Missing the required parameter 'key' when calling pair");
     }
     
     // verify the required parameter 'deviceId' is set
     if (deviceId == null) {
        throw new ApiException(400, "Missing the required parameter 'deviceId' when calling pair");
     }
     
    // create path and map variables
    String path = "/api/application/pair".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    if (key != null)
      formParams.put("key", key);
    if (deviceId != null)
      formParams.put("deviceId", deviceId);
    

    final String[] accepts = {
      "application/json", "application/xml"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "apiKey" };

    

    
    
    TypeRef returnType = new TypeRef<PairingInformation>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
