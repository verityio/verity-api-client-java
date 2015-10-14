package io.verity.client.api;

import io.verity.client.invoker.ApiException;
import io.verity.client.invoker.ApiClient;
import io.verity.client.invoker.Configuration;
import io.verity.client.invoker.Pair;
import io.verity.client.invoker.TypeRef;

import io.verity.client.model.*;

import java.util.*;

import io.verity.client.model.ValidationResult;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-08T12:39:32.615+02:00")
public class ValidateApi {
  private ApiClient apiClient;

  public ValidateApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ValidateApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Validate a document fingerprint
   * 
   * @param fingerprint Fingerprint of the document
   * @return ValidationResult
   */
  public ValidationResult validateFingerprint (String fingerprint) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'fingerprint' is set
     if (fingerprint == null) {
        throw new ApiException(400, "Missing the required parameter 'fingerprint' when calling validateFingerprint");
     }
     
    // create path and map variables
    String path = "/api/validate".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "fingerprint", fingerprint));
    

    

    

    final String[] accepts = {
      "application/json", "application/xml"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "apiKey" };

    

    
    
    TypeRef returnType = new TypeRef<ValidationResult>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
