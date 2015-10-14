package io.verity.client.api;

import io.verity.client.invoker.ApiException;
import io.verity.client.invoker.ApiClient;
import io.verity.client.invoker.Configuration;
import io.verity.client.invoker.Pair;
import io.verity.client.invoker.TypeRef;

import io.verity.client.model.*;

import java.util.*;

import io.verity.client.model.Identity;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-08T12:39:32.615+02:00")
public class IdentityApi {
  private ApiClient apiClient;

  public IdentityApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IdentityApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * List available identities
   * 
   * @return List<Identity>
   */
  public List<Identity> listIdentities () throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/api/identity".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json", "application/xml"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "apiKey" };

    

    
    
    TypeRef returnType = new TypeRef<List<Identity>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
