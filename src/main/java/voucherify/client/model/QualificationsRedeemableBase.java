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
import voucherify.client.model.ApplicableToResultList;
import voucherify.client.model.Category;
import voucherify.client.model.InapplicableToResultList;
import voucherify.client.model.OrderCalculated;
import voucherify.client.model.RedeemableResult;
import voucherify.client.model.ValidationRulesAssignmentsList;

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
 * Data of single redeemable which was properly qualified.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class QualificationsRedeemableBase {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * Object type of the redeemable.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    CAMPAIGN("campaign"),
    
    PROMOTION_TIER("promotion_tier"),
    
    PROMOTION_STACK("promotion_stack"),
    
    VOUCHER("voucher");

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

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private RedeemableResult result;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private OrderCalculated order;

  public static final String SERIALIZED_NAME_VALIDATION_RULE_ID = "validation_rule_id";
  @SerializedName(SERIALIZED_NAME_VALIDATION_RULE_ID)
  private String validationRuleId;

  public static final String SERIALIZED_NAME_APPLICABLE_TO = "applicable_to";
  @SerializedName(SERIALIZED_NAME_APPLICABLE_TO)
  private ApplicableToResultList applicableTo;

  public static final String SERIALIZED_NAME_INAPPLICABLE_TO = "inapplicable_to";
  @SerializedName(SERIALIZED_NAME_INAPPLICABLE_TO)
  private InapplicableToResultList inapplicableTo;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<Category> categories;

  public static final String SERIALIZED_NAME_BANNER = "banner";
  @SerializedName(SERIALIZED_NAME_BANNER)
  private String banner;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CAMPAIGN_NAME = "campaign_name";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_NAME)
  private String campaignName;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId;

  public static final String SERIALIZED_NAME_VALIDATION_RULES_ASSIGNMENTS = "validation_rules_assignments";
  @SerializedName(SERIALIZED_NAME_VALIDATION_RULES_ASSIGNMENTS)
  private ValidationRulesAssignmentsList validationRulesAssignments;

  public QualificationsRedeemableBase() {
  }

  public QualificationsRedeemableBase id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id of the redeemable.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public QualificationsRedeemableBase _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * Object type of the redeemable.
   * @return _object
  **/
  @javax.annotation.Nullable
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public QualificationsRedeemableBase createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the object was created. The value is shown in the ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public QualificationsRedeemableBase result(RedeemableResult result) {
    
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  public RedeemableResult getResult() {
    return result;
  }


  public void setResult(RedeemableResult result) {
    this.result = result;
  }


  public QualificationsRedeemableBase order(OrderCalculated order) {
    
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


  public QualificationsRedeemableBase validationRuleId(String validationRuleId) {
    
    this.validationRuleId = validationRuleId;
    return this;
  }

   /**
   * A unique validation rule identifier assigned by the Voucherify API. The validation rule is verified before points are added to the balance.
   * @return validationRuleId
  **/
  @javax.annotation.Nullable
  public String getValidationRuleId() {
    return validationRuleId;
  }


  public void setValidationRuleId(String validationRuleId) {
    this.validationRuleId = validationRuleId;
  }


  public QualificationsRedeemableBase applicableTo(ApplicableToResultList applicableTo) {
    
    this.applicableTo = applicableTo;
    return this;
  }

   /**
   * Get applicableTo
   * @return applicableTo
  **/
  @javax.annotation.Nullable
  public ApplicableToResultList getApplicableTo() {
    return applicableTo;
  }


  public void setApplicableTo(ApplicableToResultList applicableTo) {
    this.applicableTo = applicableTo;
  }


  public QualificationsRedeemableBase inapplicableTo(InapplicableToResultList inapplicableTo) {
    
    this.inapplicableTo = inapplicableTo;
    return this;
  }

   /**
   * Get inapplicableTo
   * @return inapplicableTo
  **/
  @javax.annotation.Nullable
  public InapplicableToResultList getInapplicableTo() {
    return inapplicableTo;
  }


  public void setInapplicableTo(InapplicableToResultList inapplicableTo) {
    this.inapplicableTo = inapplicableTo;
  }


  public QualificationsRedeemableBase metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * The metadata object stores all custom attributes assigned to the product. A set of key/value pairs that you can attach to a product object. It can be useful for storing additional information about the product in a structured format.
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public QualificationsRedeemableBase categories(List<Category> categories) {
    
    this.categories = categories;
    return this;
  }

  public QualificationsRedeemableBase addCategoriesItem(Category categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * List of category information.
   * @return categories
  **/
  @javax.annotation.Nullable
  public List<Category> getCategories() {
    return categories;
  }


  public void setCategories(List<Category> categories) {
    this.categories = categories;
  }


  public QualificationsRedeemableBase banner(String banner) {
    
    this.banner = banner;
    return this;
  }

   /**
   * Name of the earning rule. This is displayed as a header for the earning rule in the Dashboard.
   * @return banner
  **/
  @javax.annotation.Nullable
  public String getBanner() {
    return banner;
  }


  public void setBanner(String banner) {
    this.banner = banner;
  }


  public QualificationsRedeemableBase name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the redeemable.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public QualificationsRedeemableBase campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * Name of the campaign associated to the redeemable. This field is available only if object is not &#x60;campaign&#x60;
   * @return campaignName
  **/
  @javax.annotation.Nullable
  public String getCampaignName() {
    return campaignName;
  }


  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }


  public QualificationsRedeemableBase campaignId(String campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Id of the campaign associated to the redeemable. This field is available only if object is not &#x60;campaign&#x60;
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public String getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }


  public QualificationsRedeemableBase validationRulesAssignments(ValidationRulesAssignmentsList validationRulesAssignments) {
    
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
   * @return the QualificationsRedeemableBase instance itself
   */
  public QualificationsRedeemableBase putAdditionalProperty(String key, Object value) {
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
    QualificationsRedeemableBase qualificationsRedeemableBase = (QualificationsRedeemableBase) o;
    return Objects.equals(this.id, qualificationsRedeemableBase.id) &&
        Objects.equals(this._object, qualificationsRedeemableBase._object) &&
        Objects.equals(this.createdAt, qualificationsRedeemableBase.createdAt) &&
        Objects.equals(this.result, qualificationsRedeemableBase.result) &&
        Objects.equals(this.order, qualificationsRedeemableBase.order) &&
        Objects.equals(this.validationRuleId, qualificationsRedeemableBase.validationRuleId) &&
        Objects.equals(this.applicableTo, qualificationsRedeemableBase.applicableTo) &&
        Objects.equals(this.inapplicableTo, qualificationsRedeemableBase.inapplicableTo) &&
        Objects.equals(this.metadata, qualificationsRedeemableBase.metadata) &&
        Objects.equals(this.categories, qualificationsRedeemableBase.categories) &&
        Objects.equals(this.banner, qualificationsRedeemableBase.banner) &&
        Objects.equals(this.name, qualificationsRedeemableBase.name) &&
        Objects.equals(this.campaignName, qualificationsRedeemableBase.campaignName) &&
        Objects.equals(this.campaignId, qualificationsRedeemableBase.campaignId) &&
        Objects.equals(this.validationRulesAssignments, qualificationsRedeemableBase.validationRulesAssignments)&&
        Objects.equals(this.additionalProperties, qualificationsRedeemableBase.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, createdAt, result, order, validationRuleId, applicableTo, inapplicableTo, metadata, categories, banner, name, campaignName, campaignId, validationRulesAssignments, additionalProperties);
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
    sb.append("class QualificationsRedeemableBase {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    validationRuleId: ").append(toIndentedString(validationRuleId)).append("\n");
    sb.append("    applicableTo: ").append(toIndentedString(applicableTo)).append("\n");
    sb.append("    inapplicableTo: ").append(toIndentedString(inapplicableTo)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    banner: ").append(toIndentedString(banner)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    validationRulesAssignments: ").append(toIndentedString(validationRulesAssignments)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("result");
    openapiFields.add("order");
    openapiFields.add("validation_rule_id");
    openapiFields.add("applicable_to");
    openapiFields.add("inapplicable_to");
    openapiFields.add("metadata");
    openapiFields.add("categories");
    openapiFields.add("banner");
    openapiFields.add("name");
    openapiFields.add("campaign_name");
    openapiFields.add("campaign_id");
    openapiFields.add("validation_rules_assignments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QualificationsRedeemableBase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QualificationsRedeemableBase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QualificationsRedeemableBase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QualificationsRedeemableBase.class));

       return (TypeAdapter<T>) new TypeAdapter<QualificationsRedeemableBase>() {
           @Override
           public void write(JsonWriter out, QualificationsRedeemableBase value) throws IOException {
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
           public QualificationsRedeemableBase read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             QualificationsRedeemableBase instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of QualificationsRedeemableBase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QualificationsRedeemableBase
  * @throws IOException if the JSON string is invalid with respect to QualificationsRedeemableBase
  */
  public static QualificationsRedeemableBase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QualificationsRedeemableBase.class);
  }

 /**
  * Convert an instance of QualificationsRedeemableBase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

