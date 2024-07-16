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
import io.voucherify.client.model.SimpleVoucher;
import io.voucherify.client.model.VoucherTransactionDetailsBalance;
import io.voucherify.client.model.VoucherTransactionDetailsCustomEvent;
import io.voucherify.client.model.VoucherTransactionDetailsEarningRule;
import io.voucherify.client.model.VoucherTransactionDetailsEvent;
import io.voucherify.client.model.VoucherTransactionDetailsEventSchema;
import io.voucherify.client.model.VoucherTransactionDetailsLoyaltyTier;
import io.voucherify.client.model.VoucherTransactionDetailsOrder;
import io.voucherify.client.model.VoucherTransactionDetailsRedemption;
import io.voucherify.client.model.VoucherTransactionDetailsReward;
import io.voucherify.client.model.VoucherTransactionDetailsRollback;
import io.voucherify.client.model.VoucherTransactionDetailsSegment;
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
 * Contains the detailed information about the transaction.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class VoucherTransactionDetails {
  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private VoucherTransactionDetailsBalance balance;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private VoucherTransactionDetailsOrder order;

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private VoucherTransactionDetailsEvent event;

  public static final String SERIALIZED_NAME_EARNING_RULE = "earning_rule";
  @SerializedName(SERIALIZED_NAME_EARNING_RULE)
  private VoucherTransactionDetailsEarningRule earningRule;

  public static final String SERIALIZED_NAME_SEGMENT = "segment";
  @SerializedName(SERIALIZED_NAME_SEGMENT)
  private VoucherTransactionDetailsSegment segment;

  public static final String SERIALIZED_NAME_LOYALTY_TIER = "loyalty_tier";
  @SerializedName(SERIALIZED_NAME_LOYALTY_TIER)
  private VoucherTransactionDetailsLoyaltyTier loyaltyTier;

  public static final String SERIALIZED_NAME_REDEMPTION = "redemption";
  @SerializedName(SERIALIZED_NAME_REDEMPTION)
  private VoucherTransactionDetailsRedemption redemption;

  public static final String SERIALIZED_NAME_ROLLBACK = "rollback";
  @SerializedName(SERIALIZED_NAME_ROLLBACK)
  private VoucherTransactionDetailsRollback rollback;

  public static final String SERIALIZED_NAME_CUSTOM_EVENT = "custom_event";
  @SerializedName(SERIALIZED_NAME_CUSTOM_EVENT)
  private VoucherTransactionDetailsCustomEvent customEvent;

  public static final String SERIALIZED_NAME_EVENT_SCHEMA = "event_schema";
  @SerializedName(SERIALIZED_NAME_EVENT_SCHEMA)
  private VoucherTransactionDetailsEventSchema eventSchema;

  public static final String SERIALIZED_NAME_REWARD = "reward";
  @SerializedName(SERIALIZED_NAME_REWARD)
  private VoucherTransactionDetailsReward reward;

  public static final String SERIALIZED_NAME_SOURCE_VOUCHER = "source_voucher";
  @SerializedName(SERIALIZED_NAME_SOURCE_VOUCHER)
  private SimpleVoucher sourceVoucher;

  public static final String SERIALIZED_NAME_DESTINATION_VOUCHER = "destination_voucher";
  @SerializedName(SERIALIZED_NAME_DESTINATION_VOUCHER)
  private SimpleVoucher destinationVoucher;

  public VoucherTransactionDetails() {
  }

  public VoucherTransactionDetails balance(VoucherTransactionDetailsBalance balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @javax.annotation.Nullable
  public VoucherTransactionDetailsBalance getBalance() {
    return balance;
  }


  public void setBalance(VoucherTransactionDetailsBalance balance) {
    this.balance = balance;
  }


  public VoucherTransactionDetails order(VoucherTransactionDetailsOrder order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  public VoucherTransactionDetailsOrder getOrder() {
    return order;
  }


  public void setOrder(VoucherTransactionDetailsOrder order) {
    this.order = order;
  }


  public VoucherTransactionDetails event(VoucherTransactionDetailsEvent event) {
    
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @javax.annotation.Nullable
  public VoucherTransactionDetailsEvent getEvent() {
    return event;
  }


  public void setEvent(VoucherTransactionDetailsEvent event) {
    this.event = event;
  }


  public VoucherTransactionDetails earningRule(VoucherTransactionDetailsEarningRule earningRule) {
    
    this.earningRule = earningRule;
    return this;
  }

   /**
   * Get earningRule
   * @return earningRule
  **/
  @javax.annotation.Nullable
  public VoucherTransactionDetailsEarningRule getEarningRule() {
    return earningRule;
  }


  public void setEarningRule(VoucherTransactionDetailsEarningRule earningRule) {
    this.earningRule = earningRule;
  }


  public VoucherTransactionDetails segment(VoucherTransactionDetailsSegment segment) {
    
    this.segment = segment;
    return this;
  }

   /**
   * Get segment
   * @return segment
  **/
  @javax.annotation.Nullable
  public VoucherTransactionDetailsSegment getSegment() {
    return segment;
  }


  public void setSegment(VoucherTransactionDetailsSegment segment) {
    this.segment = segment;
  }


  public VoucherTransactionDetails loyaltyTier(VoucherTransactionDetailsLoyaltyTier loyaltyTier) {
    
    this.loyaltyTier = loyaltyTier;
    return this;
  }

   /**
   * Get loyaltyTier
   * @return loyaltyTier
  **/
  @javax.annotation.Nullable
  public VoucherTransactionDetailsLoyaltyTier getLoyaltyTier() {
    return loyaltyTier;
  }


  public void setLoyaltyTier(VoucherTransactionDetailsLoyaltyTier loyaltyTier) {
    this.loyaltyTier = loyaltyTier;
  }


  public VoucherTransactionDetails redemption(VoucherTransactionDetailsRedemption redemption) {
    
    this.redemption = redemption;
    return this;
  }

   /**
   * Get redemption
   * @return redemption
  **/
  @javax.annotation.Nullable
  public VoucherTransactionDetailsRedemption getRedemption() {
    return redemption;
  }


  public void setRedemption(VoucherTransactionDetailsRedemption redemption) {
    this.redemption = redemption;
  }


  public VoucherTransactionDetails rollback(VoucherTransactionDetailsRollback rollback) {
    
    this.rollback = rollback;
    return this;
  }

   /**
   * Get rollback
   * @return rollback
  **/
  @javax.annotation.Nullable
  public VoucherTransactionDetailsRollback getRollback() {
    return rollback;
  }


  public void setRollback(VoucherTransactionDetailsRollback rollback) {
    this.rollback = rollback;
  }


  public VoucherTransactionDetails customEvent(VoucherTransactionDetailsCustomEvent customEvent) {
    
    this.customEvent = customEvent;
    return this;
  }

   /**
   * Get customEvent
   * @return customEvent
  **/
  @javax.annotation.Nullable
  public VoucherTransactionDetailsCustomEvent getCustomEvent() {
    return customEvent;
  }


  public void setCustomEvent(VoucherTransactionDetailsCustomEvent customEvent) {
    this.customEvent = customEvent;
  }


  public VoucherTransactionDetails eventSchema(VoucherTransactionDetailsEventSchema eventSchema) {
    
    this.eventSchema = eventSchema;
    return this;
  }

   /**
   * Get eventSchema
   * @return eventSchema
  **/
  @javax.annotation.Nullable
  public VoucherTransactionDetailsEventSchema getEventSchema() {
    return eventSchema;
  }


  public void setEventSchema(VoucherTransactionDetailsEventSchema eventSchema) {
    this.eventSchema = eventSchema;
  }


  public VoucherTransactionDetails reward(VoucherTransactionDetailsReward reward) {
    
    this.reward = reward;
    return this;
  }

   /**
   * Get reward
   * @return reward
  **/
  @javax.annotation.Nullable
  public VoucherTransactionDetailsReward getReward() {
    return reward;
  }


  public void setReward(VoucherTransactionDetailsReward reward) {
    this.reward = reward;
  }


  public VoucherTransactionDetails sourceVoucher(SimpleVoucher sourceVoucher) {
    
    this.sourceVoucher = sourceVoucher;
    return this;
  }

   /**
   * Get sourceVoucher
   * @return sourceVoucher
  **/
  @javax.annotation.Nullable
  public SimpleVoucher getSourceVoucher() {
    return sourceVoucher;
  }


  public void setSourceVoucher(SimpleVoucher sourceVoucher) {
    this.sourceVoucher = sourceVoucher;
  }


  public VoucherTransactionDetails destinationVoucher(SimpleVoucher destinationVoucher) {
    
    this.destinationVoucher = destinationVoucher;
    return this;
  }

   /**
   * Get destinationVoucher
   * @return destinationVoucher
  **/
  @javax.annotation.Nullable
  public SimpleVoucher getDestinationVoucher() {
    return destinationVoucher;
  }


  public void setDestinationVoucher(SimpleVoucher destinationVoucher) {
    this.destinationVoucher = destinationVoucher;
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
   * @return the VoucherTransactionDetails instance itself
   */
  public VoucherTransactionDetails putAdditionalProperty(String key, Object value) {
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
    VoucherTransactionDetails voucherTransactionDetails = (VoucherTransactionDetails) o;
    return Objects.equals(this.balance, voucherTransactionDetails.balance) &&
        Objects.equals(this.order, voucherTransactionDetails.order) &&
        Objects.equals(this.event, voucherTransactionDetails.event) &&
        Objects.equals(this.earningRule, voucherTransactionDetails.earningRule) &&
        Objects.equals(this.segment, voucherTransactionDetails.segment) &&
        Objects.equals(this.loyaltyTier, voucherTransactionDetails.loyaltyTier) &&
        Objects.equals(this.redemption, voucherTransactionDetails.redemption) &&
        Objects.equals(this.rollback, voucherTransactionDetails.rollback) &&
        Objects.equals(this.customEvent, voucherTransactionDetails.customEvent) &&
        Objects.equals(this.eventSchema, voucherTransactionDetails.eventSchema) &&
        Objects.equals(this.reward, voucherTransactionDetails.reward) &&
        Objects.equals(this.sourceVoucher, voucherTransactionDetails.sourceVoucher) &&
        Objects.equals(this.destinationVoucher, voucherTransactionDetails.destinationVoucher)&&
        Objects.equals(this.additionalProperties, voucherTransactionDetails.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, order, event, earningRule, segment, loyaltyTier, redemption, rollback, customEvent, eventSchema, reward, sourceVoucher, destinationVoucher, additionalProperties);
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
    sb.append("class VoucherTransactionDetails {\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    earningRule: ").append(toIndentedString(earningRule)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    loyaltyTier: ").append(toIndentedString(loyaltyTier)).append("\n");
    sb.append("    redemption: ").append(toIndentedString(redemption)).append("\n");
    sb.append("    rollback: ").append(toIndentedString(rollback)).append("\n");
    sb.append("    customEvent: ").append(toIndentedString(customEvent)).append("\n");
    sb.append("    eventSchema: ").append(toIndentedString(eventSchema)).append("\n");
    sb.append("    reward: ").append(toIndentedString(reward)).append("\n");
    sb.append("    sourceVoucher: ").append(toIndentedString(sourceVoucher)).append("\n");
    sb.append("    destinationVoucher: ").append(toIndentedString(destinationVoucher)).append("\n");
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
    openapiFields.add("balance");
    openapiFields.add("order");
    openapiFields.add("event");
    openapiFields.add("earning_rule");
    openapiFields.add("segment");
    openapiFields.add("loyalty_tier");
    openapiFields.add("redemption");
    openapiFields.add("rollback");
    openapiFields.add("custom_event");
    openapiFields.add("event_schema");
    openapiFields.add("reward");
    openapiFields.add("source_voucher");
    openapiFields.add("destination_voucher");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherTransactionDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherTransactionDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherTransactionDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherTransactionDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherTransactionDetails>() {
           @Override
           public void write(JsonWriter out, VoucherTransactionDetails value) throws IOException {
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
           public VoucherTransactionDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             VoucherTransactionDetails instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VoucherTransactionDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherTransactionDetails
  * @throws IOException if the JSON string is invalid with respect to VoucherTransactionDetails
  */
  public static VoucherTransactionDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherTransactionDetails.class);
  }

 /**
  * Convert an instance of VoucherTransactionDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

