package com.viktarkarahoda.inteticstestproject.jtable;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class JsonListResponse<T> extends JsonResponse {

  private List<T> records;

  private int totalRecordCount;

  public JsonListResponse(String result, List<T> records, int totalRecordCount) {
    setResult(result);
    this.records = records;
    this.totalRecordCount = totalRecordCount;
  }

  public JsonListResponse(String result, String message) {
    super(result, message);
  }

  @JsonProperty("Records")
  public List<T> getRecords() {
    return records;
  }

  public void setRecords(List<T> records) {
    this.records = records;
  }

  @JsonProperty("TotalRecordCount")
  public int getTotalRecordCount() {
    return totalRecordCount;
  }

  public void setTotalRecordCount(int totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
  }

}
