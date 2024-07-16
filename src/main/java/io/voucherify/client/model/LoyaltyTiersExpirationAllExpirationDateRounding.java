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
 * Defines the rounding mechanism for tier expiration.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class LoyaltyTiersExpirationAllExpirationDateRounding {
  /**
   * This mechanism describes a custom rounding for the expiration date.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    MONTH("MONTH"),
    
    QUARTER("QUARTER"),
    
    HALF_YEAR("HALF_YEAR"),
    
    YEAR("YEAR"),
    
    CUSTOM("CUSTOM");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  /**
   * This mechanism describes a rounding strategy for the expiration date.
   */
  @JsonAdapter(StrategyEnum.Adapter.class)
  public enum StrategyEnum {
    START("START"),
    
    END("END");

    private String value;

    StrategyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StrategyEnum fromValue(String value) {
      for (StrategyEnum b : StrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<StrategyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StrategyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StrategyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StrategyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STRATEGY = "strategy";
  @SerializedName(SERIALIZED_NAME_STRATEGY)
  private StrategyEnum strategy;

  /**
   * Defines the type of unit of time in which the rounding period is counted.
   */
  @JsonAdapter(UnitEnum.Adapter.class)
  public enum UnitEnum {
    MONTH("MONTH");

    private String value;

    UnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UnitEnum fromValue(String value) {
      for (UnitEnum b : UnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<UnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UnitEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UnitEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private UnitEnum unit = UnitEnum.MONTH;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Integer value;

  public LoyaltyTiersExpirationAllExpirationDateRounding() {
  }

  public LoyaltyTiersExpirationAllExpirationDateRounding type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * This mechanism describes a custom rounding for the expiration date.
   * @return type
  **/
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public LoyaltyTiersExpirationAllExpirationDateRounding strategy(StrategyEnum strategy) {
    
    this.strategy = strategy;
    return this;
  }

   /**
   * This mechanism describes a rounding strategy for the expiration date.
   * @return strategy
  **/
  @javax.annotation.Nullable
  public StrategyEnum getStrategy() {
    return strategy;
  }


  public void setStrategy(StrategyEnum strategy) {
    this.strategy = strategy;
  }


  public LoyaltyTiersExpirationAllExpirationDateRounding unit(UnitEnum unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Defines the type of unit of time in which the rounding period is counted.
   * @return unit
  **/
  @javax.annotation.Nullable
  public UnitEnum getUnit() {
    return unit;
  }


  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }


  public LoyaltyTiersExpirationAllExpirationDateRounding value(Integer value) {
    
    this.value = value;
    return this;
  }

   /**
   * Value for the unit of time that the rounding applies to. Units for this parameter are defined by the &#x60;rounding.unit&#x60; parameter.     - &#x60;0&#x60;: January - &#x60;1&#x60;: February - &#x60;2&#x60;: March - &#x60;3&#x60;: April - &#x60;4&#x60;: May - &#x60;5&#x60;: June - &#x60;6&#x60;: July - &#x60;7&#x60;: August - &#x60;8&#x60;: September - &#x60;9&#x60;: October - &#x60;10&#x60;: November - &#x60;11&#x60;: December
   * @return value
  **/
  @javax.annotation.Nullable
  public Integer getValue() {
    return value;
  }


  public void setValue(Integer value) {
    this.value = value;
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
   * @return the LoyaltyTiersExpirationAllExpirationDateRounding instance itself
   */
  public LoyaltyTiersExpirationAllExpirationDateRounding putAdditionalProperty(String key, Object value) {
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
    LoyaltyTiersExpirationAllExpirationDateRounding loyaltyTiersExpirationAllExpirationDateRounding = (LoyaltyTiersExpirationAllExpirationDateRounding) o;
    return Objects.equals(this.type, loyaltyTiersExpirationAllExpirationDateRounding.type) &&
        Objects.equals(this.strategy, loyaltyTiersExpirationAllExpirationDateRounding.strategy) &&
        Objects.equals(this.unit, loyaltyTiersExpirationAllExpirationDateRounding.unit) &&
        Objects.equals(this.value, loyaltyTiersExpirationAllExpirationDateRounding.value)&&
        Objects.equals(this.additionalProperties, loyaltyTiersExpirationAllExpirationDateRounding.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, strategy, unit, value, additionalProperties);
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
    sb.append("class LoyaltyTiersExpirationAllExpirationDateRounding {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("strategy");
    openapiFields.add("unit");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LoyaltyTiersExpirationAllExpirationDateRounding.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoyaltyTiersExpirationAllExpirationDateRounding' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoyaltyTiersExpirationAllExpirationDateRounding> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoyaltyTiersExpirationAllExpirationDateRounding.class));

       return (TypeAdapter<T>) new TypeAdapter<LoyaltyTiersExpirationAllExpirationDateRounding>() {
           @Override
           public void write(JsonWriter out, LoyaltyTiersExpirationAllExpirationDateRounding value) throws IOException {
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
           public LoyaltyTiersExpirationAllExpirationDateRounding read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             LoyaltyTiersExpirationAllExpirationDateRounding instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LoyaltyTiersExpirationAllExpirationDateRounding given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoyaltyTiersExpirationAllExpirationDateRounding
  * @throws IOException if the JSON string is invalid with respect to LoyaltyTiersExpirationAllExpirationDateRounding
  */
  public static LoyaltyTiersExpirationAllExpirationDateRounding fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoyaltyTiersExpirationAllExpirationDateRounding.class);
  }

 /**
  * Convert an instance of LoyaltyTiersExpirationAllExpirationDateRounding to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

