package com.viktarkarahoda.inteticstestproject.jtable;

import org.codehaus.jackson.annotate.JsonProperty;

public class JsonResponse {
  private String message;

  private String result;

  public JsonResponse() {
  }

  public JsonResponse(String result, String message) {
    this.result = result;
    this.message = message;
  }

  @JsonProperty("Message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @JsonProperty("Result")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }
}
