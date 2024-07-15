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
import io.voucherify.client.model.RedemptionEntryPromotionTierSummaryOrders;
import io.voucherify.client.model.RedemptionEntryPromotionTierSummaryRedemptions;
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
 * RedemptionEntryPromotionTierSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class RedemptionEntryPromotionTierSummary {
  public static final String SERIALIZED_NAME_REDEMPTIONS = "redemptions";
  @SerializedName(SERIALIZED_NAME_REDEMPTIONS)
  private RedemptionEntryPromotionTierSummaryRedemptions redemptions;

  public static final String SERIALIZED_NAME_ORDERS = "orders";
  @SerializedName(SERIALIZED_NAME_ORDERS)
  private RedemptionEntryPromotionTierSummaryOrders orders;

  public RedemptionEntryPromotionTierSummary() {
  }

  public RedemptionEntryPromotionTierSummary redemptions(RedemptionEntryPromotionTierSummaryRedemptions redemptions) {
    
    this.redemptions = redemptions;
    return this;
  }

   /**
   * Get redemptions
   * @return redemptions
  **/
  @javax.annotation.Nullable
  public RedemptionEntryPromotionTierSummaryRedemptions getRedemptions() {
    return redemptions;
  }


  public void setRedemptions(RedemptionEntryPromotionTierSummaryRedemptions redemptions) {
    this.redemptions = redemptions;
  }


  public RedemptionEntryPromotionTierSummary orders(RedemptionEntryPromotionTierSummaryOrders orders) {
    
    this.orders = orders;
    return this;
  }

   /**
   * Get orders
   * @return orders
  **/
  @javax.annotation.Nullable
  public RedemptionEntryPromotionTierSummaryOrders getOrders() {
    return orders;
  }


  public void setOrders(RedemptionEntryPromotionTierSummaryOrders orders) {
    this.orders = orders;
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
   * @return the RedemptionEntryPromotionTierSummary instance itself
   */
  public RedemptionEntryPromotionTierSummary putAdditionalProperty(String key, Object value) {
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
    RedemptionEntryPromotionTierSummary redemptionEntryPromotionTierSummary = (RedemptionEntryPromotionTierSummary) o;
    return Objects.equals(this.redemptions, redemptionEntryPromotionTierSummary.redemptions) &&
        Objects.equals(this.orders, redemptionEntryPromotionTierSummary.orders)&&
        Objects.equals(this.additionalProperties, redemptionEntryPromotionTierSummary.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(redemptions, orders, additionalProperties);
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
    sb.append("class RedemptionEntryPromotionTierSummary {\n");
    sb.append("    redemptions: ").append(toIndentedString(redemptions)).append("\n");
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
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
    openapiFields.add("redemptions");
    openapiFields.add("orders");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RedemptionEntryPromotionTierSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RedemptionEntryPromotionTierSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RedemptionEntryPromotionTierSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RedemptionEntryPromotionTierSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<RedemptionEntryPromotionTierSummary>() {
           @Override
           public void write(JsonWriter out, RedemptionEntryPromotionTierSummary value) throws IOException {
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
           public RedemptionEntryPromotionTierSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             RedemptionEntryPromotionTierSummary instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RedemptionEntryPromotionTierSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RedemptionEntryPromotionTierSummary
  * @throws IOException if the JSON string is invalid with respect to RedemptionEntryPromotionTierSummary
  */
  public static RedemptionEntryPromotionTierSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RedemptionEntryPromotionTierSummary.class);
  }

 /**
  * Convert an instance of RedemptionEntryPromotionTierSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
