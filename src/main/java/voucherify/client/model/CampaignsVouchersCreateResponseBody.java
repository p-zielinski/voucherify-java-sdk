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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import voucherify.client.model.CampaignsVouchersCreateCombinedResponseBodyGift;
import voucherify.client.model.CampaignsVouchersCreateCombinedResponseBodyLoyaltyCard;
import voucherify.client.model.CampaignsVouchersCreateCombinedResponseBodyPublish;
import voucherify.client.model.CampaignsVouchersCreateCombinedResponseBodyRedemption;
import voucherify.client.model.Category;
import voucherify.client.model.Discount;
import voucherify.client.model.ValidationRulesAssignmentsList;
import voucherify.client.model.ValidityHours;
import voucherify.client.model.ValidityTimeframe;
import voucherify.client.model.VoucherAssets;

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

import voucherify.client.JSON;

/**
 * Response body schema for **POST** &#x60;/campaigns/{campaignId}/vouchers/{code}&#x60; and **POST** &#x60;/campaigns/{campaignId}/vouchers&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CampaignsVouchersCreateResponseBody {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_CAMPAIGN = "campaign";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN)
  private String campaign;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<Category> categories;

  /**
   * Defines the type of the voucher. 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    GIFT_VOUCHER("GIFT_VOUCHER"),
    
    DISCOUNT_VOUCHER("DISCOUNT_VOUCHER"),
    
    LOYALTY_CARD("LOYALTY_CARD");

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

  public static final String SERIALIZED_NAME_DISCOUNT = "discount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT)
  private Discount discount;

  public static final String SERIALIZED_NAME_GIFT = "gift";
  @SerializedName(SERIALIZED_NAME_GIFT)
  private CampaignsVouchersCreateCombinedResponseBodyGift gift;

  public static final String SERIALIZED_NAME_LOYALTY_CARD = "loyalty_card";
  @SerializedName(SERIALIZED_NAME_LOYALTY_CARD)
  private CampaignsVouchersCreateCombinedResponseBodyLoyaltyCard loyaltyCard;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private OffsetDateTime expirationDate;

  public static final String SERIALIZED_NAME_VALIDITY_TIMEFRAME = "validity_timeframe";
  @SerializedName(SERIALIZED_NAME_VALIDITY_TIMEFRAME)
  private ValidityTimeframe validityTimeframe;

  /**
   * Gets or Sets validityDayOfWeek
   */
  @JsonAdapter(ValidityDayOfWeekEnum.Adapter.class)
  public enum ValidityDayOfWeekEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5),
    
    NUMBER_6(6);

    private Integer value;

    ValidityDayOfWeekEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ValidityDayOfWeekEnum fromValue(Integer value) {
      for (ValidityDayOfWeekEnum b : ValidityDayOfWeekEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<ValidityDayOfWeekEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ValidityDayOfWeekEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ValidityDayOfWeekEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return ValidityDayOfWeekEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VALIDITY_DAY_OF_WEEK = "validity_day_of_week";
  @SerializedName(SERIALIZED_NAME_VALIDITY_DAY_OF_WEEK)
  private List<ValidityDayOfWeekEnum> validityDayOfWeek;

  public static final String SERIALIZED_NAME_VALIDITY_HOURS = "validity_hours";
  @SerializedName(SERIALIZED_NAME_VALIDITY_HOURS)
  private ValidityHours validityHours;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFO = "additional_info";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFO)
  private String additionalInfo;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_ASSETS = "assets";
  @SerializedName(SERIALIZED_NAME_ASSETS)
  private VoucherAssets assets;

  public static final String SERIALIZED_NAME_IS_REFERRAL_CODE = "is_referral_code";
  @SerializedName(SERIALIZED_NAME_IS_REFERRAL_CODE)
  private Boolean isReferralCode;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_HOLDER_ID = "holder_id";
  @SerializedName(SERIALIZED_NAME_HOLDER_ID)
  private String holderId;

  public static final String SERIALIZED_NAME_REFERRER_ID = "referrer_id";
  @SerializedName(SERIALIZED_NAME_REFERRER_ID)
  private String referrerId;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "voucher";

  public static final String SERIALIZED_NAME_VALIDATION_RULES_ASSIGNMENTS = "validation_rules_assignments";
  @SerializedName(SERIALIZED_NAME_VALIDATION_RULES_ASSIGNMENTS)
  private ValidationRulesAssignmentsList validationRulesAssignments;

  public static final String SERIALIZED_NAME_PUBLISH = "publish";
  @SerializedName(SERIALIZED_NAME_PUBLISH)
  private CampaignsVouchersCreateCombinedResponseBodyPublish publish;

  public static final String SERIALIZED_NAME_REDEMPTION = "redemption";
  @SerializedName(SERIALIZED_NAME_REDEMPTION)
  private CampaignsVouchersCreateCombinedResponseBodyRedemption redemption;

  public CampaignsVouchersCreateResponseBody() {
  }

  public CampaignsVouchersCreateResponseBody id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Assigned by the Voucherify API, identifies the voucher.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CampaignsVouchersCreateResponseBody code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * A code that identifies a voucher. Pattern can use all letters of the English alphabet, Arabic numerals, and special characters.
   * @return code
  **/
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public CampaignsVouchersCreateResponseBody campaign(String campaign) {
    
    this.campaign = campaign;
    return this;
  }

   /**
   * A unique campaign name, identifies the voucher&#39;s parent campaign.
   * @return campaign
  **/
  @javax.annotation.Nullable
  public String getCampaign() {
    return campaign;
  }


  public void setCampaign(String campaign) {
    this.campaign = campaign;
  }


  public CampaignsVouchersCreateResponseBody campaignId(String campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Assigned by the Voucherify API, identifies the voucher&#39;s parent campaign.
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public String getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }


  public CampaignsVouchersCreateResponseBody category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Tag defining the category that this voucher belongs to. Useful when listing vouchers using the List Vouchers endpoint.
   * @return category
  **/
  @javax.annotation.Nullable
  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public CampaignsVouchersCreateResponseBody categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Unique category ID assigned by Voucherify.
   * @return categoryId
  **/
  @javax.annotation.Nullable
  public String getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public CampaignsVouchersCreateResponseBody categories(List<Category> categories) {
    
    this.categories = categories;
    return this;
  }

  public CampaignsVouchersCreateResponseBody addCategoriesItem(Category categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Contains details about the category.
   * @return categories
  **/
  @javax.annotation.Nullable
  public List<Category> getCategories() {
    return categories;
  }


  public void setCategories(List<Category> categories) {
    this.categories = categories;
  }


  public CampaignsVouchersCreateResponseBody type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Defines the type of the voucher. 
   * @return type
  **/
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CampaignsVouchersCreateResponseBody discount(Discount discount) {
    
    this.discount = discount;
    return this;
  }

   /**
   * Get discount
   * @return discount
  **/
  @javax.annotation.Nullable
  public Discount getDiscount() {
    return discount;
  }


  public void setDiscount(Discount discount) {
    this.discount = discount;
  }


  public CampaignsVouchersCreateResponseBody gift(CampaignsVouchersCreateCombinedResponseBodyGift gift) {
    
    this.gift = gift;
    return this;
  }

   /**
   * Get gift
   * @return gift
  **/
  @javax.annotation.Nullable
  public CampaignsVouchersCreateCombinedResponseBodyGift getGift() {
    return gift;
  }


  public void setGift(CampaignsVouchersCreateCombinedResponseBodyGift gift) {
    this.gift = gift;
  }


  public CampaignsVouchersCreateResponseBody loyaltyCard(CampaignsVouchersCreateCombinedResponseBodyLoyaltyCard loyaltyCard) {
    
    this.loyaltyCard = loyaltyCard;
    return this;
  }

   /**
   * Get loyaltyCard
   * @return loyaltyCard
  **/
  @javax.annotation.Nullable
  public CampaignsVouchersCreateCombinedResponseBodyLoyaltyCard getLoyaltyCard() {
    return loyaltyCard;
  }


  public void setLoyaltyCard(CampaignsVouchersCreateCombinedResponseBodyLoyaltyCard loyaltyCard) {
    this.loyaltyCard = loyaltyCard;
  }


  public CampaignsVouchersCreateResponseBody startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Activation timestamp defines when the code starts to be active in ISO 8601 format. Voucher is *inactive before* this date. 
   * @return startDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public CampaignsVouchersCreateResponseBody expirationDate(OffsetDateTime expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Expiration timestamp defines when the code expires in ISO 8601 format.  Voucher is *inactive after* this date.
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }


  public CampaignsVouchersCreateResponseBody validityTimeframe(ValidityTimeframe validityTimeframe) {
    
    this.validityTimeframe = validityTimeframe;
    return this;
  }

   /**
   * Get validityTimeframe
   * @return validityTimeframe
  **/
  @javax.annotation.Nullable
  public ValidityTimeframe getValidityTimeframe() {
    return validityTimeframe;
  }


  public void setValidityTimeframe(ValidityTimeframe validityTimeframe) {
    this.validityTimeframe = validityTimeframe;
  }


  public CampaignsVouchersCreateResponseBody validityDayOfWeek(List<ValidityDayOfWeekEnum> validityDayOfWeek) {
    
    this.validityDayOfWeek = validityDayOfWeek;
    return this;
  }

  public CampaignsVouchersCreateResponseBody addValidityDayOfWeekItem(ValidityDayOfWeekEnum validityDayOfWeekItem) {
    if (this.validityDayOfWeek == null) {
      this.validityDayOfWeek = new ArrayList<>();
    }
    this.validityDayOfWeek.add(validityDayOfWeekItem);
    return this;
  }

   /**
   * Integer array corresponding to the particular days of the week in which the voucher is valid.  - &#x60;0&#x60; Sunday - &#x60;1&#x60; Monday - &#x60;2&#x60; Tuesday - &#x60;3&#x60; Wednesday - &#x60;4&#x60; Thursday - &#x60;5&#x60; Friday - &#x60;6&#x60; Saturday
   * @return validityDayOfWeek
  **/
  @javax.annotation.Nullable
  public List<ValidityDayOfWeekEnum> getValidityDayOfWeek() {
    return validityDayOfWeek;
  }


  public void setValidityDayOfWeek(List<ValidityDayOfWeekEnum> validityDayOfWeek) {
    this.validityDayOfWeek = validityDayOfWeek;
  }


  public CampaignsVouchersCreateResponseBody validityHours(ValidityHours validityHours) {
    
    this.validityHours = validityHours;
    return this;
  }

   /**
   * Get validityHours
   * @return validityHours
  **/
  @javax.annotation.Nullable
  public ValidityHours getValidityHours() {
    return validityHours;
  }


  public void setValidityHours(ValidityHours validityHours) {
    this.validityHours = validityHours;
  }


  public CampaignsVouchersCreateResponseBody active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * A flag to toggle the voucher on or off. You can disable a voucher even though it&#39;s within the active period defined by the &#x60;start_date&#x60; and &#x60;expiration_date&#x60;.    - &#x60;true&#x60; indicates an *active* voucher - &#x60;false&#x60; indicates an *inactive* voucher
   * @return active
  **/
  @javax.annotation.Nullable
  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public CampaignsVouchersCreateResponseBody additionalInfo(String additionalInfo) {
    
    this.additionalInfo = additionalInfo;
    return this;
  }

   /**
   * An optional field to keep any extra textual information about the code such as a code description and details.
   * @return additionalInfo
  **/
  @javax.annotation.Nullable
  public String getAdditionalInfo() {
    return additionalInfo;
  }


  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  public CampaignsVouchersCreateResponseBody metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * The metadata object stores all custom attributes assigned to the code. A set of key/value pairs that you can attach to a voucher object. It can be useful for storing additional information about the voucher in a structured format.
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public CampaignsVouchersCreateResponseBody assets(VoucherAssets assets) {
    
    this.assets = assets;
    return this;
  }

   /**
   * Get assets
   * @return assets
  **/
  @javax.annotation.Nullable
  public VoucherAssets getAssets() {
    return assets;
  }


  public void setAssets(VoucherAssets assets) {
    this.assets = assets;
  }


  public CampaignsVouchersCreateResponseBody isReferralCode(Boolean isReferralCode) {
    
    this.isReferralCode = isReferralCode;
    return this;
  }

   /**
   * Flag indicating whether this voucher is a referral code; &#x60;true&#x60; for campaign type &#x60;REFERRAL_PROGRAM&#x60;.
   * @return isReferralCode
  **/
  @javax.annotation.Nullable
  public Boolean getIsReferralCode() {
    return isReferralCode;
  }


  public void setIsReferralCode(Boolean isReferralCode) {
    this.isReferralCode = isReferralCode;
  }


  public CampaignsVouchersCreateResponseBody createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the voucher was created. The value is shown in the ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public CampaignsVouchersCreateResponseBody updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the voucher was last updated in ISO 8601 format.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public CampaignsVouchersCreateResponseBody holderId(String holderId) {
    
    this.holderId = holderId;
    return this;
  }

   /**
   * Unique identifier of the customer who owns the voucher.
   * @return holderId
  **/
  @javax.annotation.Nullable
  public String getHolderId() {
    return holderId;
  }


  public void setHolderId(String holderId) {
    this.holderId = holderId;
  }


  public CampaignsVouchersCreateResponseBody referrerId(String referrerId) {
    
    this.referrerId = referrerId;
    return this;
  }

   /**
   * Unique identifier of the referring person.
   * @return referrerId
  **/
  @javax.annotation.Nullable
  public String getReferrerId() {
    return referrerId;
  }


  public void setReferrerId(String referrerId) {
    this.referrerId = referrerId;
  }


  public CampaignsVouchersCreateResponseBody _object(String _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of the object represented by JSON. Default is &#x60;voucher&#x60;.
   * @return _object
  **/
  @javax.annotation.Nullable
  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    this._object = _object;
  }


  public CampaignsVouchersCreateResponseBody validationRulesAssignments(ValidationRulesAssignmentsList validationRulesAssignments) {
    
    this.validationRulesAssignments = validationRulesAssignments;
    return this;
  }

   /**
   * Get validationRulesAssignments
   * @return validationRulesAssignments
  **/
  @javax.annotation.Nullable
  public ValidationRulesAssignmentsList getValidationRulesAssignments() {
    return validationRulesAssignments;
  }


  public void setValidationRulesAssignments(ValidationRulesAssignmentsList validationRulesAssignments) {
    this.validationRulesAssignments = validationRulesAssignments;
  }


  public CampaignsVouchersCreateResponseBody publish(CampaignsVouchersCreateCombinedResponseBodyPublish publish) {
    
    this.publish = publish;
    return this;
  }

   /**
   * Get publish
   * @return publish
  **/
  @javax.annotation.Nullable
  public CampaignsVouchersCreateCombinedResponseBodyPublish getPublish() {
    return publish;
  }


  public void setPublish(CampaignsVouchersCreateCombinedResponseBodyPublish publish) {
    this.publish = publish;
  }


  public CampaignsVouchersCreateResponseBody redemption(CampaignsVouchersCreateCombinedResponseBodyRedemption redemption) {
    
    this.redemption = redemption;
    return this;
  }

   /**
   * Get redemption
   * @return redemption
  **/
  @javax.annotation.Nullable
  public CampaignsVouchersCreateCombinedResponseBodyRedemption getRedemption() {
    return redemption;
  }


  public void setRedemption(CampaignsVouchersCreateCombinedResponseBodyRedemption redemption) {
    this.redemption = redemption;
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
   * @return the CampaignsVouchersCreateResponseBody instance itself
   */
  public CampaignsVouchersCreateResponseBody putAdditionalProperty(String key, Object value) {
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
    CampaignsVouchersCreateResponseBody campaignsVouchersCreateResponseBody = (CampaignsVouchersCreateResponseBody) o;
    return Objects.equals(this.id, campaignsVouchersCreateResponseBody.id) &&
        Objects.equals(this.code, campaignsVouchersCreateResponseBody.code) &&
        Objects.equals(this.campaign, campaignsVouchersCreateResponseBody.campaign) &&
        Objects.equals(this.campaignId, campaignsVouchersCreateResponseBody.campaignId) &&
        Objects.equals(this.category, campaignsVouchersCreateResponseBody.category) &&
        Objects.equals(this.categoryId, campaignsVouchersCreateResponseBody.categoryId) &&
        Objects.equals(this.categories, campaignsVouchersCreateResponseBody.categories) &&
        Objects.equals(this.type, campaignsVouchersCreateResponseBody.type) &&
        Objects.equals(this.discount, campaignsVouchersCreateResponseBody.discount) &&
        Objects.equals(this.gift, campaignsVouchersCreateResponseBody.gift) &&
        Objects.equals(this.loyaltyCard, campaignsVouchersCreateResponseBody.loyaltyCard) &&
        Objects.equals(this.startDate, campaignsVouchersCreateResponseBody.startDate) &&
        Objects.equals(this.expirationDate, campaignsVouchersCreateResponseBody.expirationDate) &&
        Objects.equals(this.validityTimeframe, campaignsVouchersCreateResponseBody.validityTimeframe) &&
        Objects.equals(this.validityDayOfWeek, campaignsVouchersCreateResponseBody.validityDayOfWeek) &&
        Objects.equals(this.validityHours, campaignsVouchersCreateResponseBody.validityHours) &&
        Objects.equals(this.active, campaignsVouchersCreateResponseBody.active) &&
        Objects.equals(this.additionalInfo, campaignsVouchersCreateResponseBody.additionalInfo) &&
        Objects.equals(this.metadata, campaignsVouchersCreateResponseBody.metadata) &&
        Objects.equals(this.assets, campaignsVouchersCreateResponseBody.assets) &&
        Objects.equals(this.isReferralCode, campaignsVouchersCreateResponseBody.isReferralCode) &&
        Objects.equals(this.createdAt, campaignsVouchersCreateResponseBody.createdAt) &&
        Objects.equals(this.updatedAt, campaignsVouchersCreateResponseBody.updatedAt) &&
        Objects.equals(this.holderId, campaignsVouchersCreateResponseBody.holderId) &&
        Objects.equals(this.referrerId, campaignsVouchersCreateResponseBody.referrerId) &&
        Objects.equals(this._object, campaignsVouchersCreateResponseBody._object) &&
        Objects.equals(this.validationRulesAssignments, campaignsVouchersCreateResponseBody.validationRulesAssignments) &&
        Objects.equals(this.publish, campaignsVouchersCreateResponseBody.publish) &&
        Objects.equals(this.redemption, campaignsVouchersCreateResponseBody.redemption)&&
        Objects.equals(this.additionalProperties, campaignsVouchersCreateResponseBody.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, campaign, campaignId, category, categoryId, categories, type, discount, gift, loyaltyCard, startDate, expirationDate, validityTimeframe, validityDayOfWeek, validityHours, active, additionalInfo, metadata, assets, isReferralCode, createdAt, updatedAt, holderId, referrerId, _object, validationRulesAssignments, publish, redemption, additionalProperties);
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
    sb.append("class CampaignsVouchersCreateResponseBody {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    gift: ").append(toIndentedString(gift)).append("\n");
    sb.append("    loyaltyCard: ").append(toIndentedString(loyaltyCard)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    validityTimeframe: ").append(toIndentedString(validityTimeframe)).append("\n");
    sb.append("    validityDayOfWeek: ").append(toIndentedString(validityDayOfWeek)).append("\n");
    sb.append("    validityHours: ").append(toIndentedString(validityHours)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    isReferralCode: ").append(toIndentedString(isReferralCode)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    holderId: ").append(toIndentedString(holderId)).append("\n");
    sb.append("    referrerId: ").append(toIndentedString(referrerId)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    validationRulesAssignments: ").append(toIndentedString(validationRulesAssignments)).append("\n");
    sb.append("    publish: ").append(toIndentedString(publish)).append("\n");
    sb.append("    redemption: ").append(toIndentedString(redemption)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("campaign");
    openapiFields.add("campaign_id");
    openapiFields.add("category");
    openapiFields.add("category_id");
    openapiFields.add("categories");
    openapiFields.add("type");
    openapiFields.add("discount");
    openapiFields.add("gift");
    openapiFields.add("loyalty_card");
    openapiFields.add("start_date");
    openapiFields.add("expiration_date");
    openapiFields.add("validity_timeframe");
    openapiFields.add("validity_day_of_week");
    openapiFields.add("validity_hours");
    openapiFields.add("active");
    openapiFields.add("additional_info");
    openapiFields.add("metadata");
    openapiFields.add("assets");
    openapiFields.add("is_referral_code");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("holder_id");
    openapiFields.add("referrer_id");
    openapiFields.add("object");
    openapiFields.add("validation_rules_assignments");
    openapiFields.add("publish");
    openapiFields.add("redemption");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CampaignsVouchersCreateResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CampaignsVouchersCreateResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CampaignsVouchersCreateResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CampaignsVouchersCreateResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<CampaignsVouchersCreateResponseBody>() {
           @Override
           public void write(JsonWriter out, CampaignsVouchersCreateResponseBody value) throws IOException {
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
           public CampaignsVouchersCreateResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CampaignsVouchersCreateResponseBody instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CampaignsVouchersCreateResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CampaignsVouchersCreateResponseBody
  * @throws IOException if the JSON string is invalid with respect to CampaignsVouchersCreateResponseBody
  */
  public static CampaignsVouchersCreateResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CampaignsVouchersCreateResponseBody.class);
  }

 /**
  * Convert an instance of CampaignsVouchersCreateResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

