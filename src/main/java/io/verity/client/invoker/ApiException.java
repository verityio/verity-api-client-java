package io.verity.client.invoker;

import java.util.Map;
import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-09T00:00:32.346+02:00")
public class ApiException extends Exception {
  private int code = 0;
  private Map<String, List<String>> responseHeaders = null;
  private String responseBody = null;
  private String message;

  public ApiException() {}

  public ApiException(Throwable throwable) {
    super(throwable);
  }

  public ApiException(String message) {
    super(message);
  }

  public ApiException(String message, Throwable throwable, int code, Map<String, List<String>> responseHeaders, String responseBody) {
    super(message, throwable);
    this.code = code;
    this.responseHeaders = responseHeaders;
    this.responseBody = responseBody;
  }

  public ApiException(String message, int code, Map<String, List<String>> responseHeaders, String responseBody) {
    this(message, (Throwable) null, code, responseHeaders, responseBody);
  }

  public ApiException(String message, Throwable throwable, int code, Map<String, List<String>> responseHeaders) {
    this(message, throwable, code, responseHeaders, null);
  }

  public ApiException(int code, Map<String, List<String>> responseHeaders, String responseBody) {
    this((String) null, (Throwable) null, code, responseHeaders, responseBody);
  }

  public ApiException(int code, String message) {
    super(message);
    this.code = code;
  }

  public ApiException(int code, String message, Map<String, List<String>> responseHeaders, String responseBody) {
    this(code, message);
      if(responseHeaders.containsKey("X-Authorization-Information")) {
          this.message = message+": "+responseHeaders.get("X-Authorization-Information").get(0);
      }
    this.responseHeaders = responseHeaders;
    this.responseBody = responseBody;
  }

  public int getCode() {
    return code;
  }

    public String getMessage() {
        return this.message;
    }

  /**
   * Get the HTTP response headers.
   */
  public Map<String, List<String>> getResponseHeaders() {
    return responseHeaders;
  }

  /**
   * Get the HTTP response body.
   */
  public String getResponseBody() {
    return responseBody;
  }
}
