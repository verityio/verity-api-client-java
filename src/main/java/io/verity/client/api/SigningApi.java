package io.verity.client.api;

import io.verity.client.invoker.ApiException;
import io.verity.client.invoker.ApiClient;
import io.verity.client.invoker.Configuration;
import io.verity.client.invoker.Pair;
import io.verity.client.invoker.TypeRef;

import io.verity.client.model.*;

import java.util.*;

import io.verity.client.model.SignResult;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-09T00:00:32.346+02:00")
public class SigningApi {
  private ApiClient apiClient;

  public SigningApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SigningApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Sign a document
   * 
   * @param fingerprint Fingerprint of the document
   * @param id Identity to sign document with
   * @return SignResult
   */
  public SignResult sign (String fingerprint, String id) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'fingerprint' is set
     if (fingerprint == null) {
        throw new ApiException(400, "Missing the required parameter 'fingerprint' when calling sign");
     }
     
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling sign");
     }
     
    // create path and map variables
    String path = "/api/sign".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    if (fingerprint != null)
      formParams.put("fingerprint", fingerprint);
    if (id != null)
      formParams.put("id", id);
    

    final String[] accepts = {
      "application/json", "application/xml"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "apiKey" };

    

    
    
    TypeRef returnType = new TypeRef<SignResult>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
