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
import java.math.BigDecimal;
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
 * An object containing details of the related SKU.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OrderItemCalculatedSku {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SOURCE_ID = "source_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  public static final String SERIALIZED_NAME_OVERRIDE = "override";
  @SerializedName(SERIALIZED_NAME_OVERRIDE)
  private Boolean override;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public OrderItemCalculatedSku() {
  }

  public OrderItemCalculatedSku id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * A unique identifier that represents the SKU and is assigned by Voucherify.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public OrderItemCalculatedSku sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * The merchant&#39;s SKU ID (if it is different than Voucherify&#39;s SKU ID). It is really useful in case of integration between multiple systems. It can be an ID from an eCommerce site, a database or a 3rd party service.
   * @return sourceId
  **/
  @javax.annotation.Nullable
  public String getSourceId() {
    return sourceId;
  }


  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public OrderItemCalculatedSku override(Boolean override) {
    
    this.override = override;
    return this;
  }

   /**
   * The override set to &#x60;true&#x60; is used to store the product information in the system. If the product does not exist, it will be created with a source_id; if it does exist, the provided values for the name, price, and metadata will replace those already stored in the system.
   * @return override
  **/
  @javax.annotation.Nullable
  public Boolean getOverride() {
    return override;
  }


  public void setOverride(Boolean override) {
    this.override = override;
  }


  public OrderItemCalculatedSku sku(String sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * The SKU name.
   * @return sku
  **/
  @javax.annotation.Nullable
  public String getSku() {
    return sku;
  }


  public void setSku(String sku) {
    this.sku = sku;
  }


  public OrderItemCalculatedSku price(BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * SKU price. A positive integer in the smallest currency unit (e.g. 100 cents for $1.00).
   * @return price
  **/
  @javax.annotation.Nullable
  public BigDecimal getPrice() {
    return price;
  }


  public void setPrice(BigDecimal price) {
    this.price = price;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemCalculatedSku orderItemCalculatedSku = (OrderItemCalculatedSku) o;
    return Objects.equals(this.id, orderItemCalculatedSku.id) &&
        Objects.equals(this.sourceId, orderItemCalculatedSku.sourceId) &&
        Objects.equals(this.override, orderItemCalculatedSku.override) &&
        Objects.equals(this.sku, orderItemCalculatedSku.sku) &&
        Objects.equals(this.price, orderItemCalculatedSku.price);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sourceId, override, sku, price);
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
    sb.append("class OrderItemCalculatedSku {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    override: ").append(toIndentedString(override)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("source_id");
    openapiFields.add("override");
    openapiFields.add("sku");
    openapiFields.add("price");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderItemCalculatedSku.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderItemCalculatedSku' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderItemCalculatedSku> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderItemCalculatedSku.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderItemCalculatedSku>() {
           @Override
           public void write(JsonWriter out, OrderItemCalculatedSku value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderItemCalculatedSku read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderItemCalculatedSku given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderItemCalculatedSku
  * @throws IOException if the JSON string is invalid with respect to OrderItemCalculatedSku
  */
  public static OrderItemCalculatedSku fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderItemCalculatedSku.class);
  }

 /**
  * Convert an instance of OrderItemCalculatedSku to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

