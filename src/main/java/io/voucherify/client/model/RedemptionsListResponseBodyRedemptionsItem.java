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
import io.voucherify.client.model.RedemptionRewardResult;
import io.voucherify.client.model.RedemptionsListResponseBodyRedemptionsItemChannel;
import io.voucherify.client.model.RedemptionsListResponseBodyRedemptionsItemCustomer;
import io.voucherify.client.model.RedemptionsListResponseBodyRedemptionsItemGift;
import io.voucherify.client.model.RedemptionsListResponseBodyRedemptionsItemLoyaltyCard;
import io.voucherify.client.model.RedemptionsListResponseBodyRedemptionsItemOrder;
import io.voucherify.client.model.RedemptionsListResponseBodyRedemptionsItemPromotionTier;
import io.voucherify.client.model.RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions;
import io.voucherify.client.model.RedemptionsListResponseBodyRedemptionsItemVoucher;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * RedemptionsListResponseBodyRedemptionsItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class RedemptionsListResponseBodyRedemptionsItem {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * Gets or Sets _object
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    REDEMPTION("redemption"),
    
    REDEMPTION_ROLLBACK("redemption_rollback");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<ObjectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObjectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ObjectEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ObjectEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private ObjectEnum _object;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_TRACKING_ID = "tracking_id";
  @SerializedName(SERIALIZED_NAME_TRACKING_ID)
  private String trackingId;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_REDEMPTION = "redemption";
  @SerializedName(SERIALIZED_NAME_REDEMPTION)
  private String redemption;

  /**
   * Redemption result.
   */
  @JsonAdapter(ResultEnum.Adapter.class)
  public enum ResultEnum {
    SUCCESS("SUCCESS"),
    
    FAILURE("FAILURE");

    private String value;

    ResultEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResultEnum fromValue(String value) {
      for (ResultEnum b : ResultEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<ResultEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResultEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResultEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ResultEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private ResultEnum result;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    SUCCEEDED("SUCCEEDED"),
    
    FAILED("FAILED"),
    
    ROLLED_BACK("ROLLED_BACK");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_RELATED_REDEMPTIONS = "related_redemptions";
  @SerializedName(SERIALIZED_NAME_RELATED_REDEMPTIONS)
  private RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions relatedRedemptions;

  public static final String SERIALIZED_NAME_FAILURE_CODE = "failure_code";
  @SerializedName(SERIALIZED_NAME_FAILURE_CODE)
  private String failureCode;

  public static final String SERIALIZED_NAME_FAILURE_MESSAGE = "failure_message";
  @SerializedName(SERIALIZED_NAME_FAILURE_MESSAGE)
  private String failureMessage;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private RedemptionsListResponseBodyRedemptionsItemOrder order;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private RedemptionsListResponseBodyRedemptionsItemChannel channel;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private RedemptionsListResponseBodyRedemptionsItemCustomer customer;

  /**
   * Defines the related object.
   */
  @JsonAdapter(RelatedObjectTypeEnum.Adapter.class)
  public enum RelatedObjectTypeEnum {
    VOUCHER("voucher"),
    
    PROMOTION_TIER("promotion_tier"),
    
    REDEMPTION("redemption");

    private String value;

    RelatedObjectTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RelatedObjectTypeEnum fromValue(String value) {
      for (RelatedObjectTypeEnum b : RelatedObjectTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<RelatedObjectTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RelatedObjectTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RelatedObjectTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RelatedObjectTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RELATED_OBJECT_TYPE = "related_object_type";
  @SerializedName(SERIALIZED_NAME_RELATED_OBJECT_TYPE)
  private RelatedObjectTypeEnum relatedObjectType;

  public static final String SERIALIZED_NAME_RELATED_OBJECT_ID = "related_object_id";
  @SerializedName(SERIALIZED_NAME_RELATED_OBJECT_ID)
  private String relatedObjectId;

  public static final String SERIALIZED_NAME_VOUCHER = "voucher";
  @SerializedName(SERIALIZED_NAME_VOUCHER)
  private RedemptionsListResponseBodyRedemptionsItemVoucher voucher;

  public static final String SERIALIZED_NAME_PROMOTION_TIER = "promotion_tier";
  @SerializedName(SERIALIZED_NAME_PROMOTION_TIER)
  private RedemptionsListResponseBodyRedemptionsItemPromotionTier promotionTier;

  public static final String SERIALIZED_NAME_REWARD = "reward";
  @SerializedName(SERIALIZED_NAME_REWARD)
  private RedemptionRewardResult reward;

  public static final String SERIALIZED_NAME_GIFT = "gift";
  @SerializedName(SERIALIZED_NAME_GIFT)
  private RedemptionsListResponseBodyRedemptionsItemGift gift;

  public static final String SERIALIZED_NAME_LOYALTY_CARD = "loyalty_card";
  @SerializedName(SERIALIZED_NAME_LOYALTY_CARD)
  private RedemptionsListResponseBodyRedemptionsItemLoyaltyCard loyaltyCard;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public RedemptionsListResponseBodyRedemptionsItem() {
  }

  public RedemptionsListResponseBodyRedemptionsItem id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public RedemptionsListResponseBodyRedemptionsItem _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nullable
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public RedemptionsListResponseBodyRedemptionsItem date(OffsetDateTime date) {
    
    this.date = date;
    return this;
  }

   /**
   * Timestamp representing the date and time when the object was created. The value is shown in the ISO 8601 format.
   * @return date
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDate() {
    return date;
  }


  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  public RedemptionsListResponseBodyRedemptionsItem customerId(String customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * Unique customer ID of the redeeming customer.
   * @return customerId
  **/
  @javax.annotation.Nullable
  public String getCustomerId() {
    return customerId;
  }


  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public RedemptionsListResponseBodyRedemptionsItem trackingId(String trackingId) {
    
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


  public RedemptionsListResponseBodyRedemptionsItem metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public RedemptionsListResponseBodyRedemptionsItem amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * For gift cards, this is a positive integer in the smallest currency unit (e.g. 100 cents for $1.00) representing the number of redeemed credits. For loyalty cards, this is the number of loyalty points used in the transaction. and For gift cards, this represents the number of the credits restored to the card in the rolledback redemption. The number is a negative integer in the smallest currency unit, e.g. -100 cents for $1.00 added back to the card. For loyalty cards, this represents the number of loyalty points restored to the card in the rolledback redemption. The number is a negative integer.
   * @return amount
  **/
  @javax.annotation.Nullable
  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public RedemptionsListResponseBodyRedemptionsItem redemption(String redemption) {
    
    this.redemption = redemption;
    return this;
  }

   /**
   * Unique redemption ID of the parent redemption.
   * @return redemption
  **/
  @javax.annotation.Nullable
  public String getRedemption() {
    return redemption;
  }


  public void setRedemption(String redemption) {
    this.redemption = redemption;
  }


  public RedemptionsListResponseBodyRedemptionsItem result(ResultEnum result) {
    
    this.result = result;
    return this;
  }

   /**
   * Redemption result.
   * @return result
  **/
  @javax.annotation.Nullable
  public ResultEnum getResult() {
    return result;
  }


  public void setResult(ResultEnum result) {
    this.result = result;
  }


  public RedemptionsListResponseBodyRedemptionsItem status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public RedemptionsListResponseBodyRedemptionsItem relatedRedemptions(RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions relatedRedemptions) {
    
    this.relatedRedemptions = relatedRedemptions;
    return this;
  }

   /**
   * Get relatedRedemptions
   * @return relatedRedemptions
  **/
  @javax.annotation.Nullable
  public RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions getRelatedRedemptions() {
    return relatedRedemptions;
  }


  public void setRelatedRedemptions(RedemptionsListResponseBodyRedemptionsItemRelatedRedemptions relatedRedemptions) {
    this.relatedRedemptions = relatedRedemptions;
  }


  public RedemptionsListResponseBodyRedemptionsItem failureCode(String failureCode) {
    
    this.failureCode = failureCode;
    return this;
  }

   /**
   * If the result is &#x60;FAILURE&#x60;, this parameter will provide a generic reason as to why the redemption failed.
   * @return failureCode
  **/
  @javax.annotation.Nullable
  public String getFailureCode() {
    return failureCode;
  }


  public void setFailureCode(String failureCode) {
    this.failureCode = failureCode;
  }


  public RedemptionsListResponseBodyRedemptionsItem failureMessage(String failureMessage) {
    
    this.failureMessage = failureMessage;
    return this;
  }

   /**
   * If the result is &#x60;FAILURE&#x60;, this parameter will provide a more expanded reason as to why the redemption failed.
   * @return failureMessage
  **/
  @javax.annotation.Nullable
  public String getFailureMessage() {
    return failureMessage;
  }


  public void setFailureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
  }


  public RedemptionsListResponseBodyRedemptionsItem order(RedemptionsListResponseBodyRedemptionsItemOrder order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  public RedemptionsListResponseBodyRedemptionsItemOrder getOrder() {
    return order;
  }


  public void setOrder(RedemptionsListResponseBodyRedemptionsItemOrder order) {
    this.order = order;
  }


  public RedemptionsListResponseBodyRedemptionsItem channel(RedemptionsListResponseBodyRedemptionsItemChannel channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nullable
  public RedemptionsListResponseBodyRedemptionsItemChannel getChannel() {
    return channel;
  }


  public void setChannel(RedemptionsListResponseBodyRedemptionsItemChannel channel) {
    this.channel = channel;
  }


  public RedemptionsListResponseBodyRedemptionsItem customer(RedemptionsListResponseBodyRedemptionsItemCustomer customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  public RedemptionsListResponseBodyRedemptionsItemCustomer getCustomer() {
    return customer;
  }


  public void setCustomer(RedemptionsListResponseBodyRedemptionsItemCustomer customer) {
    this.customer = customer;
  }


  public RedemptionsListResponseBodyRedemptionsItem relatedObjectType(RelatedObjectTypeEnum relatedObjectType) {
    
    this.relatedObjectType = relatedObjectType;
    return this;
  }

   /**
   * Defines the related object.
   * @return relatedObjectType
  **/
  @javax.annotation.Nullable
  public RelatedObjectTypeEnum getRelatedObjectType() {
    return relatedObjectType;
  }


  public void setRelatedObjectType(RelatedObjectTypeEnum relatedObjectType) {
    this.relatedObjectType = relatedObjectType;
  }


  public RedemptionsListResponseBodyRedemptionsItem relatedObjectId(String relatedObjectId) {
    
    this.relatedObjectId = relatedObjectId;
    return this;
  }

   /**
   * Get relatedObjectId
   * @return relatedObjectId
  **/
  @javax.annotation.Nullable
  public String getRelatedObjectId() {
    return relatedObjectId;
  }


  public void setRelatedObjectId(String relatedObjectId) {
    this.relatedObjectId = relatedObjectId;
  }


  public RedemptionsListResponseBodyRedemptionsItem voucher(RedemptionsListResponseBodyRedemptionsItemVoucher voucher) {
    
    this.voucher = voucher;
    return this;
  }

   /**
   * Get voucher
   * @return voucher
  **/
  @javax.annotation.Nullable
  public RedemptionsListResponseBodyRedemptionsItemVoucher getVoucher() {
    return voucher;
  }


  public void setVoucher(RedemptionsListResponseBodyRedemptionsItemVoucher voucher) {
    this.voucher = voucher;
  }


  public RedemptionsListResponseBodyRedemptionsItem promotionTier(RedemptionsListResponseBodyRedemptionsItemPromotionTier promotionTier) {
    
    this.promotionTier = promotionTier;
    return this;
  }

   /**
   * Get promotionTier
   * @return promotionTier
  **/
  @javax.annotation.Nullable
  public RedemptionsListResponseBodyRedemptionsItemPromotionTier getPromotionTier() {
    return promotionTier;
  }


  public void setPromotionTier(RedemptionsListResponseBodyRedemptionsItemPromotionTier promotionTier) {
    this.promotionTier = promotionTier;
  }


  public RedemptionsListResponseBodyRedemptionsItem reward(RedemptionRewardResult reward) {
    
    this.reward = reward;
    return this;
  }

   /**
   * Get reward
   * @return reward
  **/
  @javax.annotation.Nullable
  public RedemptionRewardResult getReward() {
    return reward;
  }


  public void setReward(RedemptionRewardResult reward) {
    this.reward = reward;
  }


  public RedemptionsListResponseBodyRedemptionsItem gift(RedemptionsListResponseBodyRedemptionsItemGift gift) {
    
    this.gift = gift;
    return this;
  }

   /**
   * Get gift
   * @return gift
  **/
  @javax.annotation.Nullable
  public RedemptionsListResponseBodyRedemptionsItemGift getGift() {
    return gift;
  }


  public void setGift(RedemptionsListResponseBodyRedemptionsItemGift gift) {
    this.gift = gift;
  }


  public RedemptionsListResponseBodyRedemptionsItem loyaltyCard(RedemptionsListResponseBodyRedemptionsItemLoyaltyCard loyaltyCard) {
    
    this.loyaltyCard = loyaltyCard;
    return this;
  }

   /**
   * Get loyaltyCard
   * @return loyaltyCard
  **/
  @javax.annotation.Nullable
  public RedemptionsListResponseBodyRedemptionsItemLoyaltyCard getLoyaltyCard() {
    return loyaltyCard;
  }


  public void setLoyaltyCard(RedemptionsListResponseBodyRedemptionsItemLoyaltyCard loyaltyCard) {
    this.loyaltyCard = loyaltyCard;
  }


  public RedemptionsListResponseBodyRedemptionsItem reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * System generated cause for the redemption being invalid in the context of the provided parameters.
   * @return reason
  **/
  @javax.annotation.Nullable
  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
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
   * @return the RedemptionsListResponseBodyRedemptionsItem instance itself
   */
  public RedemptionsListResponseBodyRedemptionsItem putAdditionalProperty(String key, Object value) {
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
    RedemptionsListResponseBodyRedemptionsItem redemptionsListResponseBodyRedemptionsItem = (RedemptionsListResponseBodyRedemptionsItem) o;
    return Objects.equals(this.id, redemptionsListResponseBodyRedemptionsItem.id) &&
        Objects.equals(this._object, redemptionsListResponseBodyRedemptionsItem._object) &&
        Objects.equals(this.date, redemptionsListResponseBodyRedemptionsItem.date) &&
        Objects.equals(this.customerId, redemptionsListResponseBodyRedemptionsItem.customerId) &&
        Objects.equals(this.trackingId, redemptionsListResponseBodyRedemptionsItem.trackingId) &&
        Objects.equals(this.metadata, redemptionsListResponseBodyRedemptionsItem.metadata) &&
        Objects.equals(this.amount, redemptionsListResponseBodyRedemptionsItem.amount) &&
        Objects.equals(this.redemption, redemptionsListResponseBodyRedemptionsItem.redemption) &&
        Objects.equals(this.result, redemptionsListResponseBodyRedemptionsItem.result) &&
        Objects.equals(this.status, redemptionsListResponseBodyRedemptionsItem.status) &&
        Objects.equals(this.relatedRedemptions, redemptionsListResponseBodyRedemptionsItem.relatedRedemptions) &&
        Objects.equals(this.failureCode, redemptionsListResponseBodyRedemptionsItem.failureCode) &&
        Objects.equals(this.failureMessage, redemptionsListResponseBodyRedemptionsItem.failureMessage) &&
        Objects.equals(this.order, redemptionsListResponseBodyRedemptionsItem.order) &&
        Objects.equals(this.channel, redemptionsListResponseBodyRedemptionsItem.channel) &&
        Objects.equals(this.customer, redemptionsListResponseBodyRedemptionsItem.customer) &&
        Objects.equals(this.relatedObjectType, redemptionsListResponseBodyRedemptionsItem.relatedObjectType) &&
        Objects.equals(this.relatedObjectId, redemptionsListResponseBodyRedemptionsItem.relatedObjectId) &&
        Objects.equals(this.voucher, redemptionsListResponseBodyRedemptionsItem.voucher) &&
        Objects.equals(this.promotionTier, redemptionsListResponseBodyRedemptionsItem.promotionTier) &&
        Objects.equals(this.reward, redemptionsListResponseBodyRedemptionsItem.reward) &&
        Objects.equals(this.gift, redemptionsListResponseBodyRedemptionsItem.gift) &&
        Objects.equals(this.loyaltyCard, redemptionsListResponseBodyRedemptionsItem.loyaltyCard) &&
        Objects.equals(this.reason, redemptionsListResponseBodyRedemptionsItem.reason)&&
        Objects.equals(this.additionalProperties, redemptionsListResponseBodyRedemptionsItem.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, date, customerId, trackingId, metadata, amount, redemption, result, status, relatedRedemptions, failureCode, failureMessage, order, channel, customer, relatedObjectType, relatedObjectId, voucher, promotionTier, reward, gift, loyaltyCard, reason, additionalProperties);
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
    sb.append("class RedemptionsListResponseBodyRedemptionsItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    redemption: ").append(toIndentedString(redemption)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    relatedRedemptions: ").append(toIndentedString(relatedRedemptions)).append("\n");
    sb.append("    failureCode: ").append(toIndentedString(failureCode)).append("\n");
    sb.append("    failureMessage: ").append(toIndentedString(failureMessage)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    relatedObjectType: ").append(toIndentedString(relatedObjectType)).append("\n");
    sb.append("    relatedObjectId: ").append(toIndentedString(relatedObjectId)).append("\n");
    sb.append("    voucher: ").append(toIndentedString(voucher)).append("\n");
    sb.append("    promotionTier: ").append(toIndentedString(promotionTier)).append("\n");
    sb.append("    reward: ").append(toIndentedString(reward)).append("\n");
    sb.append("    gift: ").append(toIndentedString(gift)).append("\n");
    sb.append("    loyaltyCard: ").append(toIndentedString(loyaltyCard)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("object");
    openapiFields.add("date");
    openapiFields.add("customer_id");
    openapiFields.add("tracking_id");
    openapiFields.add("metadata");
    openapiFields.add("amount");
    openapiFields.add("redemption");
    openapiFields.add("result");
    openapiFields.add("status");
    openapiFields.add("related_redemptions");
    openapiFields.add("failure_code");
    openapiFields.add("failure_message");
    openapiFields.add("order");
    openapiFields.add("channel");
    openapiFields.add("customer");
    openapiFields.add("related_object_type");
    openapiFields.add("related_object_id");
    openapiFields.add("voucher");
    openapiFields.add("promotion_tier");
    openapiFields.add("reward");
    openapiFields.add("gift");
    openapiFields.add("loyalty_card");
    openapiFields.add("reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RedemptionsListResponseBodyRedemptionsItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RedemptionsListResponseBodyRedemptionsItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RedemptionsListResponseBodyRedemptionsItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RedemptionsListResponseBodyRedemptionsItem.class));

       return (TypeAdapter<T>) new TypeAdapter<RedemptionsListResponseBodyRedemptionsItem>() {
           @Override
           public void write(JsonWriter out, RedemptionsListResponseBodyRedemptionsItem value) throws IOException {
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
           public RedemptionsListResponseBodyRedemptionsItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             RedemptionsListResponseBodyRedemptionsItem instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RedemptionsListResponseBodyRedemptionsItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RedemptionsListResponseBodyRedemptionsItem
  * @throws IOException if the JSON string is invalid with respect to RedemptionsListResponseBodyRedemptionsItem
  */
  public static RedemptionsListResponseBodyRedemptionsItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RedemptionsListResponseBodyRedemptionsItem.class);
  }

 /**
  * Convert an instance of RedemptionsListResponseBodyRedemptionsItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

