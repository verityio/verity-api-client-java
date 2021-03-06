package io.verity.client.invoker.auth;

import com.sun.jersey.api.client.WebResource;
import io.verity.client.invoker.Pair;

import java.util.Map;
import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-09T00:00:32.346+02:00")
public interface Authentication {
  /** Apply authentication settings to header and query params. */
  void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);

  void sign(WebResource.Builder builder, String checksumUri, String checksumAuth, String checksumBody);
}
