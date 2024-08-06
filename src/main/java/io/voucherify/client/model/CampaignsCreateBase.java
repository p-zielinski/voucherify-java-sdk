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
import io.voucherify.client.model.ValidityHours;
import io.voucherify.client.model.ValidityTimeframe;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Base body schema for creating a campaign using **POST** &#x60;/campaigns&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class CampaignsCreateBase {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * Defines whether the campaign can be updated with new vouchers after campaign creation.      - &#x60;AUTO_UPDATE&#x60;: By choosing the auto update option you will create a campaign that can be enhanced by new vouchers after the time of creation (e.g. by publish vouchers method).     -  &#x60;STATIC&#x60;: vouchers need to be manually published.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    AUTO_UPDATE("AUTO_UPDATE"),
    
    STATIC("STATIC");

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

  public static final String SERIALIZED_NAME_JOIN_ONCE = "join_once";
  @SerializedName(SERIALIZED_NAME_JOIN_ONCE)
  private Boolean joinOnce;

  public static final String SERIALIZED_NAME_AUTO_JOIN = "auto_join";
  @SerializedName(SERIALIZED_NAME_AUTO_JOIN)
  private Boolean autoJoin;

  public static final String SERIALIZED_NAME_USE_VOUCHER_METADATA_SCHEMA = "use_voucher_metadata_schema";
  @SerializedName(SERIALIZED_NAME_USE_VOUCHER_METADATA_SCHEMA)
  private Boolean useVoucherMetadataSchema;

  public static final String SERIALIZED_NAME_VOUCHERS_COUNT = "vouchers_count";
  @SerializedName(SERIALIZED_NAME_VOUCHERS_COUNT)
  private Integer vouchersCount;

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

  public static final String SERIALIZED_NAME_ACTIVITY_DURATION_AFTER_PUBLISHING = "activity_duration_after_publishing";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_DURATION_AFTER_PUBLISHING)
  private String activityDurationAfterPublishing;

  public static final String SERIALIZED_NAME_VALIDATION_RULES = "validation_rules";
  @SerializedName(SERIALIZED_NAME_VALIDATION_RULES)
  private List<String> validationRules;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public CampaignsCreateBase() {
  }

  public CampaignsCreateBase name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Campaign name.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CampaignsCreateBase description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * An optional field to keep any extra textual information about the campaign such as a campaign description and details.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CampaignsCreateBase type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Defines whether the campaign can be updated with new vouchers after campaign creation.      - &#x60;AUTO_UPDATE&#x60;: By choosing the auto update option you will create a campaign that can be enhanced by new vouchers after the time of creation (e.g. by publish vouchers method).     -  &#x60;STATIC&#x60;: vouchers need to be manually published.
   * @return type
  **/
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CampaignsCreateBase joinOnce(Boolean joinOnce) {
    
    this.joinOnce = joinOnce;
    return this;
  }

   /**
   * If this value is set to &#x60;true&#x60;, customers will be able to join the campaign only once.
   * @return joinOnce
  **/
  @javax.annotation.Nullable
  public Boolean getJoinOnce() {
    return joinOnce;
  }


  public void setJoinOnce(Boolean joinOnce) {
    this.joinOnce = joinOnce;
  }


  public CampaignsCreateBase autoJoin(Boolean autoJoin) {
    
    this.autoJoin = autoJoin;
    return this;
  }

   /**
   * Indicates whether customers will be able to auto-join a loyalty campaign if any earning rule is fulfilled.
   * @return autoJoin
  **/
  @javax.annotation.Nullable
  public Boolean getAutoJoin() {
    return autoJoin;
  }


  public void setAutoJoin(Boolean autoJoin) {
    this.autoJoin = autoJoin;
  }


  public CampaignsCreateBase useVoucherMetadataSchema(Boolean useVoucherMetadataSchema) {
    
    this.useVoucherMetadataSchema = useVoucherMetadataSchema;
    return this;
  }

   /**
   * Flag indicating whether the campaign is to use the voucher&#39;s metadata schema instead of the campaign metadata schema.
   * @return useVoucherMetadataSchema
  **/
  @javax.annotation.Nullable
  public Boolean getUseVoucherMetadataSchema() {
    return useVoucherMetadataSchema;
  }


  public void setUseVoucherMetadataSchema(Boolean useVoucherMetadataSchema) {
    this.useVoucherMetadataSchema = useVoucherMetadataSchema;
  }


  public CampaignsCreateBase vouchersCount(Integer vouchersCount) {
    
    this.vouchersCount = vouchersCount;
    return this;
  }

   /**
   * Total number of unique vouchers in campaign (size of campaign).
   * @return vouchersCount
  **/
  @javax.annotation.Nullable
  public Integer getVouchersCount() {
    return vouchersCount;
  }


  public void setVouchersCount(Integer vouchersCount) {
    this.vouchersCount = vouchersCount;
  }


  public CampaignsCreateBase startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Activation timestamp defines when the campaign starts to be active in ISO 8601 format. Campaign is *inactive before* this date. 
   * @return startDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public CampaignsCreateBase expirationDate(OffsetDateTime expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Expiration timestamp defines when the campaign expires in ISO 8601 format.  Campaign is *inactive after* this date.
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }


  public CampaignsCreateBase validityTimeframe(ValidityTimeframe validityTimeframe) {
    
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


  public CampaignsCreateBase validityDayOfWeek(List<ValidityDayOfWeekEnum> validityDayOfWeek) {
    
    this.validityDayOfWeek = validityDayOfWeek;
    return this;
  }

  public CampaignsCreateBase addValidityDayOfWeekItem(ValidityDayOfWeekEnum validityDayOfWeekItem) {
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


  public CampaignsCreateBase validityHours(ValidityHours validityHours) {
    
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


  public CampaignsCreateBase activityDurationAfterPublishing(String activityDurationAfterPublishing) {
    
    this.activityDurationAfterPublishing = activityDurationAfterPublishing;
    return this;
  }

   /**
   * Defines the amount of time the campaign will be active in ISO 8601 format after publishing. For example, a campaign with a &#x60;duration&#x60; of &#x60;P24D&#x60; will be valid for a duration of 24 days.
   * @return activityDurationAfterPublishing
  **/
  @javax.annotation.Nullable
  public String getActivityDurationAfterPublishing() {
    return activityDurationAfterPublishing;
  }


  public void setActivityDurationAfterPublishing(String activityDurationAfterPublishing) {
    this.activityDurationAfterPublishing = activityDurationAfterPublishing;
  }


  public CampaignsCreateBase validationRules(List<String> validationRules) {
    
    this.validationRules = validationRules;
    return this;
  }

  public CampaignsCreateBase addValidationRulesItem(String validationRulesItem) {
    if (this.validationRules == null) {
      this.validationRules = new ArrayList<>();
    }
    this.validationRules.add(validationRulesItem);
    return this;
  }

   /**
   * Array containing the ID of the validation rule associated with the promotion tier.
   * @return validationRules
  **/
  @javax.annotation.Nullable
  public List<String> getValidationRules() {
    return validationRules;
  }


  public void setValidationRules(List<String> validationRules) {
    this.validationRules = validationRules;
  }


  public CampaignsCreateBase categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Unique category ID that this campaign belongs to. Either pass this parameter OR the &#x60;category&#x60;.
   * @return categoryId
  **/
  @javax.annotation.Nullable
  public String getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public CampaignsCreateBase category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * The category assigned to the campaign. Either pass this parameter OR the &#x60;category_id&#x60;.
   * @return category
  **/
  @javax.annotation.Nullable
  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public CampaignsCreateBase metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * The metadata object stores all custom attributes assigned to the campaign. A set of key/value pairs that you can attach to a campaign object. It can be useful for storing additional information about the campaign in a structured format.
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
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
   * @return the CampaignsCreateBase instance itself
   */
  public CampaignsCreateBase putAdditionalProperty(String key, Object value) {
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
    CampaignsCreateBase campaignsCreateBase = (CampaignsCreateBase) o;
    return Objects.equals(this.name, campaignsCreateBase.name) &&
        Objects.equals(this.description, campaignsCreateBase.description) &&
        Objects.equals(this.type, campaignsCreateBase.type) &&
        Objects.equals(this.joinOnce, campaignsCreateBase.joinOnce) &&
        Objects.equals(this.autoJoin, campaignsCreateBase.autoJoin) &&
        Objects.equals(this.useVoucherMetadataSchema, campaignsCreateBase.useVoucherMetadataSchema) &&
        Objects.equals(this.vouchersCount, campaignsCreateBase.vouchersCount) &&
        Objects.equals(this.startDate, campaignsCreateBase.startDate) &&
        Objects.equals(this.expirationDate, campaignsCreateBase.expirationDate) &&
        Objects.equals(this.validityTimeframe, campaignsCreateBase.validityTimeframe) &&
        Objects.equals(this.validityDayOfWeek, campaignsCreateBase.validityDayOfWeek) &&
        Objects.equals(this.validityHours, campaignsCreateBase.validityHours) &&
        Objects.equals(this.activityDurationAfterPublishing, campaignsCreateBase.activityDurationAfterPublishing) &&
        Objects.equals(this.validationRules, campaignsCreateBase.validationRules) &&
        Objects.equals(this.categoryId, campaignsCreateBase.categoryId) &&
        Objects.equals(this.category, campaignsCreateBase.category) &&
        Objects.equals(this.metadata, campaignsCreateBase.metadata)&&
        Objects.equals(this.additionalProperties, campaignsCreateBase.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, type, joinOnce, autoJoin, useVoucherMetadataSchema, vouchersCount, startDate, expirationDate, validityTimeframe, validityDayOfWeek, validityHours, activityDurationAfterPublishing, validationRules, categoryId, category, metadata, additionalProperties);
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
    sb.append("class CampaignsCreateBase {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    joinOnce: ").append(toIndentedString(joinOnce)).append("\n");
    sb.append("    autoJoin: ").append(toIndentedString(autoJoin)).append("\n");
    sb.append("    useVoucherMetadataSchema: ").append(toIndentedString(useVoucherMetadataSchema)).append("\n");
    sb.append("    vouchersCount: ").append(toIndentedString(vouchersCount)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    validityTimeframe: ").append(toIndentedString(validityTimeframe)).append("\n");
    sb.append("    validityDayOfWeek: ").append(toIndentedString(validityDayOfWeek)).append("\n");
    sb.append("    validityHours: ").append(toIndentedString(validityHours)).append("\n");
    sb.append("    activityDurationAfterPublishing: ").append(toIndentedString(activityDurationAfterPublishing)).append("\n");
    sb.append("    validationRules: ").append(toIndentedString(validationRules)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("type");
    openapiFields.add("join_once");
    openapiFields.add("auto_join");
    openapiFields.add("use_voucher_metadata_schema");
    openapiFields.add("vouchers_count");
    openapiFields.add("start_date");
    openapiFields.add("expiration_date");
    openapiFields.add("validity_timeframe");
    openapiFields.add("validity_day_of_week");
    openapiFields.add("validity_hours");
    openapiFields.add("activity_duration_after_publishing");
    openapiFields.add("validation_rules");
    openapiFields.add("category_id");
    openapiFields.add("category");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CampaignsCreateBase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CampaignsCreateBase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CampaignsCreateBase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CampaignsCreateBase.class));

       return (TypeAdapter<T>) new TypeAdapter<CampaignsCreateBase>() {
           @Override
           public void write(JsonWriter out, CampaignsCreateBase value) throws IOException {
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
           public CampaignsCreateBase read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CampaignsCreateBase instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CampaignsCreateBase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CampaignsCreateBase
  * @throws IOException if the JSON string is invalid with respect to CampaignsCreateBase
  */
  public static CampaignsCreateBase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CampaignsCreateBase.class);
  }

 /**
  * Convert an instance of CampaignsCreateBase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

