package com.viktarkarahoda.inteticstestproject.jtable;

import org.codehaus.jackson.annotate.JsonProperty;

public class JsonEntityResponse<T> extends JsonResponse {

  private T entity;

  public JsonEntityResponse() {
  }

  public JsonEntityResponse(String result) {
    setResult(result);
  }

  public JsonEntityResponse(String result, T entity) {
    setResult(result);
    this.entity = entity;
  }

  public JsonEntityResponse(String result, String message) {
    super(result, message);
  }

  @JsonProperty("Record")
  public T getEntity() {
    return entity;
  }

  public void setRecords(T entity) {
    this.entity = entity;
  }
}
