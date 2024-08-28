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
import io.voucherify.client.model.ValidationRuleBaseApplicableTo;
import io.voucherify.client.model.ValidationRuleBaseError;
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
 * Response body schema for **PUT** &#x60;v1/validation-rules/{validationRuleId}&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class ValidationRulesUpdateResponseBody {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private Object rules;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private ValidationRuleBaseError error;

  public static final String SERIALIZED_NAME_APPLICABLE_TO = "applicable_to";
  @SerializedName(SERIALIZED_NAME_APPLICABLE_TO)
  private ValidationRuleBaseApplicableTo applicableTo;

  /**
   * Type of validation rule.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    EXPRESSION("expression"),
    
    BASIC("basic"),
    
    ADVANCED("advanced"),
    
    COMPLEX("complex");

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
  private TypeEnum type = TypeEnum.EXPRESSION;

  /**
   * Validation rule context type.    | **Context Type** | **Definition** | |:---|:---| | earning_rule.order.paid |  | | earning_rule.custom_event |  | | earning_rule.customer.segment.entered |  | | campaign.discount_coupons |  | | campaign.discount_coupons.discount.apply_to_order |  | | campaign.discount_coupons.discount.apply_to_items |  | | campaign.discount_coupons.discount.apply_to_items_proportionally |  | | campaign.discount_coupons.discount.apply_to_items_proportionally_by_quantity |  | | campaign.discount_coupons.discount.fixed.apply_to_items |  | | campaign.gift_vouchers |  | | campaign.gift_vouchers.gift.apply_to_order |  | | campaign.gift_vouchers.gift.apply_to_items |  | | campaign.referral_program |  | | campaign.referral_program.discount.apply_to_order |  | | campaign.referral_program.discount.apply_to_items |  | | campaign.referral_program.discount.apply_to_items_proportionally |  | | campaign.referral_program.discount.apply_to_items_proportionally_by_quantity |  | | campaign.referral_program.discount.fixed.apply_to_items |  | | campaign.promotion |  | | campaign.promotion.discount.apply_to_order |  | | campaign.promotion.discount.apply_to_items |  | | campaign.promotion.discount.apply_to_items_proportionally |  | | campaign.promotion.discount.apply_to_items_proportionally_by_quantity |  | | campaign.promotion.discount.fixed.apply_to_items |  | | campaign.loyalty_program |  | | campaign.lucky_draw |  | | voucher.discount_voucher |  | | voucher.discount_voucher.discount.apply_to_order |  | | voucher.discount_voucher.discount.apply_to_items |  | | voucher.discount_voucher.discount.apply_to_items_proportionally |  | | voucher.discount_voucher.discount.apply_to_items_proportionally_by_quantity |  | | voucher.discount_voucher.discount.fixed.apply_to_items |  | | voucher.gift_voucher |  | | voucher.gift_voucher.gift.apply_to_order |  | | voucher.gift_voucher.gift.apply_to_items |  | | voucher.loyalty_card |  | | voucher.lucky_draw_code |  | | distribution.custom_event |  | | reward_assignment.pay_with_points |  | | global |  |
   */
  @JsonAdapter(ContextTypeEnum.Adapter.class)
  public enum ContextTypeEnum {
    EARNING_RULE_ORDER_PAID("earning_rule.order.paid"),
    
    EARNING_RULE_CUSTOM_EVENT("earning_rule.custom_event"),
    
    EARNING_RULE_CUSTOMER_SEGMENT_ENTERED("earning_rule.customer.segment.entered"),
    
    EARNING_RULE_CUSTOMER_TIER_JOINED("earning_rule.customer.tier.joined"),
    
    EARNING_RULE_CUSTOMER_TIER_LEFT("earning_rule.customer.tier.left"),
    
    EARNING_RULE_CUSTOMER_TIER_UPGRADED("earning_rule.customer.tier.upgraded"),
    
    EARNING_RULE_CUSTOMER_TIER_DOWNGRADED("earning_rule.customer.tier.downgraded"),
    
    EARNING_RULE_CUSTOMER_TIER_PROLONGED("earning_rule.customer.tier.prolonged"),
    
    CAMPAIGN_DISCOUNT_COUPONS("campaign.discount_coupons"),
    
    CAMPAIGN_DISCOUNT_COUPONS_DISCOUNT_APPLY_TO_ORDER("campaign.discount_coupons.discount.apply_to_order"),
    
    CAMPAIGN_DISCOUNT_COUPONS_DISCOUNT_APPLY_TO_ITEMS("campaign.discount_coupons.discount.apply_to_items"),
    
    CAMPAIGN_DISCOUNT_COUPONS_DISCOUNT_APPLY_TO_ITEMS_PROPORTIONALLY("campaign.discount_coupons.discount.apply_to_items_proportionally"),
    
    CAMPAIGN_DISCOUNT_COUPONS_DISCOUNT_APPLY_TO_ITEMS_PROPORTIONALLY_BY_QUANTITY("campaign.discount_coupons.discount.apply_to_items_proportionally_by_quantity"),
    
    CAMPAIGN_DISCOUNT_COUPONS_DISCOUNT_APPLY_TO_ITEMS_BY_QUANTITY("campaign.discount_coupons.discount.apply_to_items_by_quantity"),
    
    CAMPAIGN_DISCOUNT_COUPONS_DISCOUNT_FIXED_APPLY_TO_ITEMS("campaign.discount_coupons.discount.fixed.apply_to_items"),
    
    CAMPAIGN_DISCOUNT_COUPONS_DISCOUNT_PERCENT_APPLY_TO_ITEMS("campaign.discount_coupons.discount.percent.apply_to_items"),
    
    CAMPAIGN_GIFT_VOUCHERS("campaign.gift_vouchers"),
    
    CAMPAIGN_GIFT_VOUCHERS_GIFT_APPLY_TO_ORDER("campaign.gift_vouchers.gift.apply_to_order"),
    
    CAMPAIGN_GIFT_VOUCHERS_GIFT_APPLY_TO_ITEMS("campaign.gift_vouchers.gift.apply_to_items"),
    
    CAMPAIGN_REFERRAL_PROGRAM("campaign.referral_program"),
    
    CAMPAIGN_REFERRAL_PROGRAM_DISCOUNT_APPLY_TO_ORDER("campaign.referral_program.discount.apply_to_order"),
    
    CAMPAIGN_REFERRAL_PROGRAM_DISCOUNT_APPLY_TO_ITEMS("campaign.referral_program.discount.apply_to_items"),
    
    CAMPAIGN_REFERRAL_PROGRAM_DISCOUNT_APPLY_TO_ITEMS_PROPORTIONALLY("campaign.referral_program.discount.apply_to_items_proportionally"),
    
    CAMPAIGN_REFERRAL_PROGRAM_DISCOUNT_APPLY_TO_ITEMS_PROPORTIONALLY_BY_QUANTITY("campaign.referral_program.discount.apply_to_items_proportionally_by_quantity"),
    
    CAMPAIGN_REFERRAL_PROGRAM_DISCOUNT_APPLY_TO_ITEMS_BY_QUANTITY("campaign.referral_program.discount.apply_to_items_by_quantity"),
    
    CAMPAIGN_REFERRAL_PROGRAM_DISCOUNT_FIXED_APPLY_TO_ITEMS("campaign.referral_program.discount.fixed.apply_to_items"),
    
    CAMPAIGN_REFERRAL_PROGRAM_DISCOUNT_PERCENT_APPLY_TO_ITEMS("campaign.referral_program.discount.percent.apply_to_items"),
    
    CAMPAIGN_PROMOTION("campaign.promotion"),
    
    CAMPAIGN_PROMOTION_DISCOUNT_APPLY_TO_ORDER("campaign.promotion.discount.apply_to_order"),
    
    CAMPAIGN_PROMOTION_DISCOUNT_APPLY_TO_ITEMS("campaign.promotion.discount.apply_to_items"),
    
    CAMPAIGN_PROMOTION_DISCOUNT_APPLY_TO_ITEMS_PROPORTIONALLY("campaign.promotion.discount.apply_to_items_proportionally"),
    
    CAMPAIGN_PROMOTION_DISCOUNT_APPLY_TO_ITEMS_PROPORTIONALLY_BY_QUANTITY("campaign.promotion.discount.apply_to_items_proportionally_by_quantity"),
    
    CAMPAIGN_PROMOTION_DISCOUNT_APPLY_TO_ITEMS_BY_QUANTITY("campaign.promotion.discount.apply_to_items_by_quantity"),
    
    CAMPAIGN_PROMOTION_DISCOUNT_FIXED_APPLY_TO_ITEMS("campaign.promotion.discount.fixed.apply_to_items"),
    
    CAMPAIGN_PROMOTION_DISCOUNT_PERCENT_APPLY_TO_ITEMS("campaign.promotion.discount.percent.apply_to_items"),
    
    CAMPAIGN_LOYALTY_PROGRAM("campaign.loyalty_program"),
    
    CAMPAIGN_LUCKY_DRAW("campaign.lucky_draw"),
    
    VOUCHER_DISCOUNT_VOUCHER("voucher.discount_voucher"),
    
    VOUCHER_DISCOUNT_VOUCHER_DISCOUNT_APPLY_TO_ORDER("voucher.discount_voucher.discount.apply_to_order"),
    
    VOUCHER_DISCOUNT_VOUCHER_DISCOUNT_APPLY_TO_ITEMS("voucher.discount_voucher.discount.apply_to_items"),
    
    VOUCHER_DISCOUNT_VOUCHER_DISCOUNT_APPLY_TO_ITEMS_PROPORTIONALLY("voucher.discount_voucher.discount.apply_to_items_proportionally"),
    
    VOUCHER_DISCOUNT_VOUCHER_DISCOUNT_APPLY_TO_ITEMS_PROPORTIONALLY_BY_QUANTITY("voucher.discount_voucher.discount.apply_to_items_proportionally_by_quantity"),
    
    VOUCHER_DISCOUNT_VOUCHER_DISCOUNT_APPLY_TO_ITEMS_BY_QUANTITY("voucher.discount_voucher.discount.apply_to_items_by_quantity"),
    
    VOUCHER_DISCOUNT_VOUCHER_DISCOUNT_FIXED_APPLY_TO_ITEMS("voucher.discount_voucher.discount.fixed.apply_to_items"),
    
    VOUCHER_DISCOUNT_VOUCHER_DISCOUNT_PERCENT_APPLY_TO_ITEMS("voucher.discount_voucher.discount.percent.apply_to_items"),
    
    VOUCHER_GIFT_VOUCHER("voucher.gift_voucher"),
    
    VOUCHER_GIFT_VOUCHER_GIFT_APPLY_TO_ORDER("voucher.gift_voucher.gift.apply_to_order"),
    
    VOUCHER_GIFT_VOUCHER_GIFT_APPLY_TO_ITEMS("voucher.gift_voucher.gift.apply_to_items"),
    
    VOUCHER_LOYALTY_CARD("voucher.loyalty_card"),
    
    VOUCHER_LUCKY_DRAW_CODE("voucher.lucky_draw_code"),
    
    DISTRIBUTION_CUSTOM_EVENT("distribution.custom_event"),
    
    DISTRIBUTION_ORDER_PAID("distribution.order.paid"),
    
    DISTRIBUTION_ORDER_CREATED("distribution.order.created"),
    
    DISTRIBUTION_ORDER_CANCELED("distribution.order.canceled"),
    
    DISTRIBUTION_ORDER_UPDATED("distribution.order.updated"),
    
    REWARD_ASSIGNMENT_PAY_WITH_POINTS("reward_assignment.pay_with_points"),
    
    GLOBAL("global");

    private String value;

    ContextTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ContextTypeEnum fromValue(String value) {
      for (ContextTypeEnum b : ContextTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<ContextTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContextTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ContextTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ContextTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONTEXT_TYPE = "context_type";
  @SerializedName(SERIALIZED_NAME_CONTEXT_TYPE)
  private ContextTypeEnum contextType = ContextTypeEnum.GLOBAL;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_ASSIGNMENTS_COUNT = "assignments_count";
  @SerializedName(SERIALIZED_NAME_ASSIGNMENTS_COUNT)
  private Integer assignmentsCount;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "validation_rules";

  public ValidationRulesUpdateResponseBody() {
  }

  public ValidationRulesUpdateResponseBody name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Custom, unique name for set of validation rules.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ValidationRulesUpdateResponseBody rules(Object rules) {
    
    this.rules = rules;
    return this;
  }

   /**
   * Contains all the rule definitions for the validation rule. It is a set of key value pairs representing the rules and logic between the rules. The keys are numbered consecutively beginning from &#x60;1&#x60;. The values are objects containing the rule conditions.
   * @return rules
  **/
  @javax.annotation.Nonnull
  public Object getRules() {
    return rules;
  }


  public void setRules(Object rules) {
    this.rules = rules;
  }


  public ValidationRulesUpdateResponseBody error(ValidationRuleBaseError error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  public ValidationRuleBaseError getError() {
    return error;
  }


  public void setError(ValidationRuleBaseError error) {
    this.error = error;
  }


  public ValidationRulesUpdateResponseBody applicableTo(ValidationRuleBaseApplicableTo applicableTo) {
    
    this.applicableTo = applicableTo;
    return this;
  }

   /**
   * Get applicableTo
   * @return applicableTo
  **/
  @javax.annotation.Nullable
  public ValidationRuleBaseApplicableTo getApplicableTo() {
    return applicableTo;
  }


  public void setApplicableTo(ValidationRuleBaseApplicableTo applicableTo) {
    this.applicableTo = applicableTo;
  }


  public ValidationRulesUpdateResponseBody type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of validation rule.
   * @return type
  **/
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public ValidationRulesUpdateResponseBody contextType(ContextTypeEnum contextType) {
    
    this.contextType = contextType;
    return this;
  }

   /**
   * Validation rule context type.    | **Context Type** | **Definition** | |:---|:---| | earning_rule.order.paid |  | | earning_rule.custom_event |  | | earning_rule.customer.segment.entered |  | | campaign.discount_coupons |  | | campaign.discount_coupons.discount.apply_to_order |  | | campaign.discount_coupons.discount.apply_to_items |  | | campaign.discount_coupons.discount.apply_to_items_proportionally |  | | campaign.discount_coupons.discount.apply_to_items_proportionally_by_quantity |  | | campaign.discount_coupons.discount.fixed.apply_to_items |  | | campaign.gift_vouchers |  | | campaign.gift_vouchers.gift.apply_to_order |  | | campaign.gift_vouchers.gift.apply_to_items |  | | campaign.referral_program |  | | campaign.referral_program.discount.apply_to_order |  | | campaign.referral_program.discount.apply_to_items |  | | campaign.referral_program.discount.apply_to_items_proportionally |  | | campaign.referral_program.discount.apply_to_items_proportionally_by_quantity |  | | campaign.referral_program.discount.fixed.apply_to_items |  | | campaign.promotion |  | | campaign.promotion.discount.apply_to_order |  | | campaign.promotion.discount.apply_to_items |  | | campaign.promotion.discount.apply_to_items_proportionally |  | | campaign.promotion.discount.apply_to_items_proportionally_by_quantity |  | | campaign.promotion.discount.fixed.apply_to_items |  | | campaign.loyalty_program |  | | campaign.lucky_draw |  | | voucher.discount_voucher |  | | voucher.discount_voucher.discount.apply_to_order |  | | voucher.discount_voucher.discount.apply_to_items |  | | voucher.discount_voucher.discount.apply_to_items_proportionally |  | | voucher.discount_voucher.discount.apply_to_items_proportionally_by_quantity |  | | voucher.discount_voucher.discount.fixed.apply_to_items |  | | voucher.gift_voucher |  | | voucher.gift_voucher.gift.apply_to_order |  | | voucher.gift_voucher.gift.apply_to_items |  | | voucher.loyalty_card |  | | voucher.lucky_draw_code |  | | distribution.custom_event |  | | reward_assignment.pay_with_points |  | | global |  |
   * @return contextType
  **/
  @javax.annotation.Nullable
  public ContextTypeEnum getContextType() {
    return contextType;
  }


  public void setContextType(ContextTypeEnum contextType) {
    this.contextType = contextType;
  }


  public ValidationRulesUpdateResponseBody id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique validation rule ID.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ValidationRulesUpdateResponseBody createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the validation rule was created. The value is shown in the ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ValidationRulesUpdateResponseBody updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the validation rule was updated. The value is shown in the ISO 8601 format.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public ValidationRulesUpdateResponseBody assignmentsCount(Integer assignmentsCount) {
    
    this.assignmentsCount = assignmentsCount;
    return this;
  }

   /**
   * The number of instances the validation rule has been assigned to different types of redeemables.
   * @return assignmentsCount
  **/
  @javax.annotation.Nullable
  public Integer getAssignmentsCount() {
    return assignmentsCount;
  }


  public void setAssignmentsCount(Integer assignmentsCount) {
    this.assignmentsCount = assignmentsCount;
  }


  public ValidationRulesUpdateResponseBody _object(String _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of the object represented by JSON. This object stores information about the validation rule.
   * @return _object
  **/
  @javax.annotation.Nullable
  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    this._object = _object;
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
   * @return the ValidationRulesUpdateResponseBody instance itself
   */
  public ValidationRulesUpdateResponseBody putAdditionalProperty(String key, Object value) {
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
    ValidationRulesUpdateResponseBody validationRulesUpdateResponseBody = (ValidationRulesUpdateResponseBody) o;
    return Objects.equals(this.name, validationRulesUpdateResponseBody.name) &&
        Objects.equals(this.rules, validationRulesUpdateResponseBody.rules) &&
        Objects.equals(this.error, validationRulesUpdateResponseBody.error) &&
        Objects.equals(this.applicableTo, validationRulesUpdateResponseBody.applicableTo) &&
        Objects.equals(this.type, validationRulesUpdateResponseBody.type) &&
        Objects.equals(this.contextType, validationRulesUpdateResponseBody.contextType) &&
        Objects.equals(this.id, validationRulesUpdateResponseBody.id) &&
        Objects.equals(this.createdAt, validationRulesUpdateResponseBody.createdAt) &&
        Objects.equals(this.updatedAt, validationRulesUpdateResponseBody.updatedAt) &&
        Objects.equals(this.assignmentsCount, validationRulesUpdateResponseBody.assignmentsCount) &&
        Objects.equals(this._object, validationRulesUpdateResponseBody._object)&&
        Objects.equals(this.additionalProperties, validationRulesUpdateResponseBody.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, rules, error, applicableTo, type, contextType, id, createdAt, updatedAt, assignmentsCount, _object, additionalProperties);
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
    sb.append("class ValidationRulesUpdateResponseBody {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    applicableTo: ").append(toIndentedString(applicableTo)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    contextType: ").append(toIndentedString(contextType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    assignmentsCount: ").append(toIndentedString(assignmentsCount)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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
    openapiFields.add("rules");
    openapiFields.add("error");
    openapiFields.add("applicable_to");
    openapiFields.add("type");
    openapiFields.add("context_type");
    openapiFields.add("id");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("assignments_count");
    openapiFields.add("object");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("rules");
    openapiRequiredFields.add("applicable_to");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("context_type");
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ValidationRulesUpdateResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ValidationRulesUpdateResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ValidationRulesUpdateResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ValidationRulesUpdateResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<ValidationRulesUpdateResponseBody>() {
           @Override
           public void write(JsonWriter out, ValidationRulesUpdateResponseBody value) throws IOException {
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
           public ValidationRulesUpdateResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ValidationRulesUpdateResponseBody instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ValidationRulesUpdateResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ValidationRulesUpdateResponseBody
  * @throws IOException if the JSON string is invalid with respect to ValidationRulesUpdateResponseBody
  */
  public static ValidationRulesUpdateResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValidationRulesUpdateResponseBody.class);
  }

 /**
  * Convert an instance of ValidationRulesUpdateResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

