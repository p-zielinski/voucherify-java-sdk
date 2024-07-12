/*
 * Voucherify API
 * Voucherify promotion engine REST API. Please see https://docs.voucherify.io/docs for more details.
 *
 * The version of the OpenAPI document: v2018-08-01
 * Contact: support@voucherify.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package voucherify.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Logical Operator Between Filters. Filter by conditions set on the &#x60;junction&#x60; parameter indicating how the &#x60;conditions&#x60; should be accounted for in the query. An &#x60;AND&#x60; is an all-inclusive logical operator, meaning the &#x60;AND&#x60; operator displays a record if **ALL** the conditions separated by AND are TRUE, while  an &#x60;OR&#x60; operator displays a record if **ANY** of the conditions separated by OR is TRUE.
 */
@JsonAdapter(Junction.Adapter.class)
public enum Junction {
  
  AND("and"),
  
  OR("or");

  private String value;

  Junction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Junction fromValue(String value) {
    for (Junction b : Junction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Junction> {
    @Override
    public void write(final JsonWriter jsonWriter, final Junction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Junction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Junction.fromValue(value);
    }
  }
}

