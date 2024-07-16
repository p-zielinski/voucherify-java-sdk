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


package io.voucherify.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.voucherify.client.JSON;

/**
 * PublicationsCreateRequestBodyCustomerAddress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PublicationsCreateRequestBodyCustomerAddress {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_LINE1 = "line_1";
  @SerializedName(SERIALIZED_NAME_LINE1)
  private String line1;

  public static final String SERIALIZED_NAME_LINE2 = "line_2";
  @SerializedName(SERIALIZED_NAME_LINE2)
  private String line2;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public PublicationsCreateRequestBodyCustomerAddress() {
  }

  public PublicationsCreateRequestBodyCustomerAddress city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * City
   * @return city
  **/
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public PublicationsCreateRequestBodyCustomerAddress state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * State
   * @return state
  **/
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public PublicationsCreateRequestBodyCustomerAddress line1(String line1) {
    
    this.line1 = line1;
    return this;
  }

   /**
   * First line of address.
   * @return line1
  **/
  @javax.annotation.Nullable
  public String getLine1() {
    return line1;
  }


  public void setLine1(String line1) {
    this.line1 = line1;
  }


  public PublicationsCreateRequestBodyCustomerAddress line2(String line2) {
    
    this.line2 = line2;
    return this;
  }

   /**
   * Second line of address.
   * @return line2
  **/
  @javax.annotation.Nullable
  public String getLine2() {
    return line2;
  }


  public void setLine2(String line2) {
    this.line2 = line2;
  }


  public PublicationsCreateRequestBodyCustomerAddress country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Country.
   * @return country
  **/
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public PublicationsCreateRequestBodyCustomerAddress postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the PublicationsCreateRequestBodyCustomerAddress instance itself
   */
  public PublicationsCreateRequestBodyCustomerAddress putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicationsCreateRequestBodyCustomerAddress publicationsCreateRequestBodyCustomerAddress = (PublicationsCreateRequestBodyCustomerAddress) o;
    return Objects.equals(this.city, publicationsCreateRequestBodyCustomerAddress.city) &&
        Objects.equals(this.state, publicationsCreateRequestBodyCustomerAddress.state) &&
        Objects.equals(this.line1, publicationsCreateRequestBodyCustomerAddress.line1) &&
        Objects.equals(this.line2, publicationsCreateRequestBodyCustomerAddress.line2) &&
        Objects.equals(this.country, publicationsCreateRequestBodyCustomerAddress.country) &&
        Objects.equals(this.postalCode, publicationsCreateRequestBodyCustomerAddress.postalCode)&&
        Objects.equals(this.additionalProperties, publicationsCreateRequestBodyCustomerAddress.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, state, line1, line2, country, postalCode, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicationsCreateRequestBodyCustomerAddress {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("line_1");
    openapiFields.add("line_2");
    openapiFields.add("country");
    openapiFields.add("postal_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PublicationsCreateRequestBodyCustomerAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PublicationsCreateRequestBodyCustomerAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PublicationsCreateRequestBodyCustomerAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PublicationsCreateRequestBodyCustomerAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<PublicationsCreateRequestBodyCustomerAddress>() {
           @Override
           public void write(JsonWriter out, PublicationsCreateRequestBodyCustomerAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public PublicationsCreateRequestBodyCustomerAddress read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             PublicationsCreateRequestBodyCustomerAddress instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     return null;
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PublicationsCreateRequestBodyCustomerAddress given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PublicationsCreateRequestBodyCustomerAddress
  * @throws IOException if the JSON string is invalid with respect to PublicationsCreateRequestBodyCustomerAddress
  */
  public static PublicationsCreateRequestBodyCustomerAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PublicationsCreateRequestBodyCustomerAddress.class);
  }

 /**
  * Convert an instance of PublicationsCreateRequestBodyCustomerAddress to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

