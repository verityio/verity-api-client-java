package io.verity.client.invoker.auth;

import com.sun.jersey.api.client.WebResource;
import io.verity.client.invoker.Pair;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.util.Base64;
import java.util.Map;
import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-09T00:00:32.346+02:00")
public class ApiKeyAuth implements Authentication {
  private final String location;
  private final String paramName;

  private String apiKey;
  private String apiKeyPrefix;
  private PrivateKey privateKey = null;

  public ApiKeyAuth(String location, String paramName) {
    this.location = location;
    this.paramName = paramName;
    this.privateKey = null;
  }

  public String getLocation() {
    return location;
  }

  public String getParamName() {
    return paramName;
  }

  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public void setPrivateKey(PrivateKey privateKey) {
      this.privateKey = privateKey;
  }

  public String getApiKeyPrefix() {
    return apiKeyPrefix;
  }

  public void setApiKeyPrefix(String apiKeyPrefix) {
    this.apiKeyPrefix = apiKeyPrefix;
  }

  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
    String value;
    if (apiKeyPrefix != null) {
      value = apiKeyPrefix + " " + apiKey;
    } else {
      value = apiKey;
    }
    if (location == "query") {
      queryParams.add(new Pair(paramName, value));
    } else if (location == "header") {
      headerParams.put(paramName, value);
    }
  }

    @Override
    public void sign(WebResource.Builder builder, String checksumUri, String checksumAuth, String checksumBody) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(checksumUri.getBytes());
            md.update(checksumAuth.getBytes());
            if(checksumBody != null) {
                md.update(checksumBody.getBytes());
            }

            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initSign(privateKey);

            byte[] mdbytes = md.digest();

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < mdbytes.length; i++) {
                sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
            }

            String checksum = sb.toString();
            signature.update(checksum.getBytes());

            byte[] signed = signature.sign();
            Base64.Encoder encoder = Base64.getEncoder();

            builder.header("X-Request-Signature", encoder.encodeToString(signed));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
