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
import io.voucherify.client.model.OrderCalculated;
import io.voucherify.client.model.Session;
import io.voucherify.client.model.StackingRules;
import io.voucherify.client.model.ValidationsRedeemableInapplicable;
import io.voucherify.client.model.ValidationsRedeemableSkipped;
import io.voucherify.client.model.ValidationsValidateResponseBodyRedeemablesItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * Response body schema for POST &#x60;/validations&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ClientValidationsValidateResponseBody {
  public static final String SERIALIZED_NAME_VALID = "valid";
  @SerializedName(SERIALIZED_NAME_VALID)
  private Boolean valid;

  public static final String SERIALIZED_NAME_REDEEMABLES = "redeemables";
  @SerializedName(SERIALIZED_NAME_REDEEMABLES)
  private List<ValidationsValidateResponseBodyRedeemablesItem> redeemables;

  public static final String SERIALIZED_NAME_SKIPPED_REDEEMABLES = "skipped_redeemables";
  @SerializedName(SERIALIZED_NAME_SKIPPED_REDEEMABLES)
  private List<ValidationsRedeemableSkipped> skippedRedeemables;

  public static final String SERIALIZED_NAME_INAPPLICABLE_REDEEMABLES = "inapplicable_redeemables";
  @SerializedName(SERIALIZED_NAME_INAPPLICABLE_REDEEMABLES)
  private List<ValidationsRedeemableInapplicable> inapplicableRedeemables;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private OrderCalculated order;

  public static final String SERIALIZED_NAME_TRACKING_ID = "tracking_id";
  @SerializedName(SERIALIZED_NAME_TRACKING_ID)
  private String trackingId;

  public static final String SERIALIZED_NAME_SESSION = "session";
  @SerializedName(SERIALIZED_NAME_SESSION)
  private Session session;

  public static final String SERIALIZED_NAME_STACKING_RULES = "stacking_rules";
  @SerializedName(SERIALIZED_NAME_STACKING_RULES)
  private StackingRules stackingRules;

  public ClientValidationsValidateResponseBody() {
  }

  public ClientValidationsValidateResponseBody valid(Boolean valid) {
    
    this.valid = valid;
    return this;
  }

   /**
   * The result of the validation. It takes all of the redeemables into account and returns a &#x60;false&#x60; if at least one redeemable is inapplicable. Returns &#x60;true&#x60; if all redeemables are applicable.
   * @return valid
  **/
  @javax.annotation.Nullable
  public Boolean getValid() {
    return valid;
  }


  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  public ClientValidationsValidateResponseBody redeemables(List<ValidationsValidateResponseBodyRedeemablesItem> redeemables) {
    
    this.redeemables = redeemables;
    return this;
  }

  public ClientValidationsValidateResponseBody addRedeemablesItem(ValidationsValidateResponseBodyRedeemablesItem redeemablesItem) {
    if (this.redeemables == null) {
      this.redeemables = new ArrayList<>();
    }
    this.redeemables.add(redeemablesItem);
    return this;
  }

   /**
   * Get redeemables
   * @return redeemables
  **/
  @javax.annotation.Nullable
  public List<ValidationsValidateResponseBodyRedeemablesItem> getRedeemables() {
    return redeemables;
  }


  public void setRedeemables(List<ValidationsValidateResponseBodyRedeemablesItem> redeemables) {
    this.redeemables = redeemables;
  }


  public ClientValidationsValidateResponseBody skippedRedeemables(List<ValidationsRedeemableSkipped> skippedRedeemables) {
    
    this.skippedRedeemables = skippedRedeemables;
    return this;
  }

  public ClientValidationsValidateResponseBody addSkippedRedeemablesItem(ValidationsRedeemableSkipped skippedRedeemablesItem) {
    if (this.skippedRedeemables == null) {
      this.skippedRedeemables = new ArrayList<>();
    }
    this.skippedRedeemables.add(skippedRedeemablesItem);
    return this;
  }

   /**
   * Lists validation results of each skipped redeemable.
   * @return skippedRedeemables
  **/
  @javax.annotation.Nullable
  public List<ValidationsRedeemableSkipped> getSkippedRedeemables() {
    return skippedRedeemables;
  }


  public void setSkippedRedeemables(List<ValidationsRedeemableSkipped> skippedRedeemables) {
    this.skippedRedeemables = skippedRedeemables;
  }


  public ClientValidationsValidateResponseBody inapplicableRedeemables(List<ValidationsRedeemableInapplicable> inapplicableRedeemables) {
    
    this.inapplicableRedeemables = inapplicableRedeemables;
    return this;
  }

  public ClientValidationsValidateResponseBody addInapplicableRedeemablesItem(ValidationsRedeemableInapplicable inapplicableRedeemablesItem) {
    if (this.inapplicableRedeemables == null) {
      this.inapplicableRedeemables = new ArrayList<>();
    }
    this.inapplicableRedeemables.add(inapplicableRedeemablesItem);
    return this;
  }

   /**
   * Lists validation results of each inapplicable redeemable.
   * @return inapplicableRedeemables
  **/
  @javax.annotation.Nullable
  public List<ValidationsRedeemableInapplicable> getInapplicableRedeemables() {
    return inapplicableRedeemables;
  }


  public void setInapplicableRedeemables(List<ValidationsRedeemableInapplicable> inapplicableRedeemables) {
    this.inapplicableRedeemables = inapplicableRedeemables;
  }


  public ClientValidationsValidateResponseBody order(OrderCalculated order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  public OrderCalculated getOrder() {
    return order;
  }


  public void setOrder(OrderCalculated order) {
    this.order = order;
  }


  public ClientValidationsValidateResponseBody trackingId(String trackingId) {
    
    this.trackingId = trackingId;
    return this;
  }

   /**
   * Hashed customer source ID.
   * @return trackingId
  **/
  @javax.annotation.Nullable
  public String getTrackingId() {
    return trackingId;
  }


  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }


  public ClientValidationsValidateResponseBody session(Session session) {
    
    this.session = session;
    return this;
  }

   /**
   * Get session
   * @return session
  **/
  @javax.annotation.Nullable
  public Session getSession() {
    return session;
  }


  public void setSession(Session session) {
    this.session = session;
  }


  public ClientValidationsValidateResponseBody stackingRules(StackingRules stackingRules) {
    
    this.stackingRules = stackingRules;
    return this;
  }

   /**
   * Get stackingRules
   * @return stackingRules
  **/
  @javax.annotation.Nonnull
  public StackingRules getStackingRules() {
    return stackingRules;
  }


  public void setStackingRules(StackingRules stackingRules) {
    this.stackingRules = stackingRules;
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
   * @return the ClientValidationsValidateResponseBody instance itself
   */
  public ClientValidationsValidateResponseBody putAdditionalProperty(String key, Object value) {
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
    ClientValidationsValidateResponseBody clientValidationsValidateResponseBody = (ClientValidationsValidateResponseBody) o;
    return Objects.equals(this.valid, clientValidationsValidateResponseBody.valid) &&
        Objects.equals(this.redeemables, clientValidationsValidateResponseBody.redeemables) &&
        Objects.equals(this.skippedRedeemables, clientValidationsValidateResponseBody.skippedRedeemables) &&
        Objects.equals(this.inapplicableRedeemables, clientValidationsValidateResponseBody.inapplicableRedeemables) &&
        Objects.equals(this.order, clientValidationsValidateResponseBody.order) &&
        Objects.equals(this.trackingId, clientValidationsValidateResponseBody.trackingId) &&
        Objects.equals(this.session, clientValidationsValidateResponseBody.session) &&
        Objects.equals(this.stackingRules, clientValidationsValidateResponseBody.stackingRules)&&
        Objects.equals(this.additionalProperties, clientValidationsValidateResponseBody.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, redeemables, skippedRedeemables, inapplicableRedeemables, order, trackingId, session, stackingRules, additionalProperties);
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
    sb.append("class ClientValidationsValidateResponseBody {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    redeemables: ").append(toIndentedString(redeemables)).append("\n");
    sb.append("    skippedRedeemables: ").append(toIndentedString(skippedRedeemables)).append("\n");
    sb.append("    inapplicableRedeemables: ").append(toIndentedString(inapplicableRedeemables)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    stackingRules: ").append(toIndentedString(stackingRules)).append("\n");
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
    openapiFields.add("valid");
    openapiFields.add("redeemables");
    openapiFields.add("skipped_redeemables");
    openapiFields.add("inapplicable_redeemables");
    openapiFields.add("order");
    openapiFields.add("tracking_id");
    openapiFields.add("session");
    openapiFields.add("stacking_rules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("stacking_rules");
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClientValidationsValidateResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClientValidationsValidateResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClientValidationsValidateResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClientValidationsValidateResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<ClientValidationsValidateResponseBody>() {
           @Override
           public void write(JsonWriter out, ClientValidationsValidateResponseBody value) throws IOException {
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
           public ClientValidationsValidateResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ClientValidationsValidateResponseBody instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ClientValidationsValidateResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClientValidationsValidateResponseBody
  * @throws IOException if the JSON string is invalid with respect to ClientValidationsValidateResponseBody
  */
  public static ClientValidationsValidateResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClientValidationsValidateResponseBody.class);
  }

 /**
  * Convert an instance of ClientValidationsValidateResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

