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
import io.voucherify.client.model.CustomerWithSummaryLoyaltyReferrals;
import io.voucherify.client.model.Voucher;
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
 * PublicationsCreateResponseBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class PublicationsCreateResponseBody {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * The type of the object represented by the JSON. This object stores information about the &#x60;publication&#x60;.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    PUBLICATION("publication");

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
  private ObjectEnum _object = ObjectEnum.PUBLICATION;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_TRACKING_ID = "tracking_id";
  @SerializedName(SERIALIZED_NAME_TRACKING_ID)
  private String trackingId;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  /**
   * How the publication was originated. It can be your own custom channel or an example value provided here.
   */
  @JsonAdapter(ChannelEnum.Adapter.class)
  public enum ChannelEnum {
    API("API");

    private String value;

    ChannelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChannelEnum fromValue(String value) {
      for (ChannelEnum b : ChannelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<ChannelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChannelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChannelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ChannelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private ChannelEnum channel = ChannelEnum.API;

  public static final String SERIALIZED_NAME_SOURCE_ID = "source_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  /**
   * Status of the publication attempt.
   */
  @JsonAdapter(ResultEnum.Adapter.class)
  public enum ResultEnum {
    SUCCESS("SUCCESS");

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
  private ResultEnum result = ResultEnum.SUCCESS;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private CustomerWithSummaryLoyaltyReferrals customer;

  public static final String SERIALIZED_NAME_VOUCHERS_ID = "vouchers_id";
  @SerializedName(SERIALIZED_NAME_VOUCHERS_ID)
  private List<String> vouchersId;

  public static final String SERIALIZED_NAME_VOUCHER = "voucher";
  @SerializedName(SERIALIZED_NAME_VOUCHER)
  private Voucher voucher;

  public static final String SERIALIZED_NAME_VOUCHERS = "vouchers";
  @SerializedName(SERIALIZED_NAME_VOUCHERS)
  private List<String> vouchers;

  public PublicationsCreateResponseBody() {
  }

  public PublicationsCreateResponseBody id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique publication ID, assigned by Voucherify.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PublicationsCreateResponseBody _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of the object represented by the JSON. This object stores information about the &#x60;publication&#x60;.
   * @return _object
  **/
  @javax.annotation.Nullable
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public PublicationsCreateResponseBody createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp representing the date and time when the publication was created. The value is shown in the ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public PublicationsCreateResponseBody customerId(String customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * Unique customer ID of the customer receiving the publication.
   * @return customerId
  **/
  @javax.annotation.Nullable
  public String getCustomerId() {
    return customerId;
  }


  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public PublicationsCreateResponseBody trackingId(String trackingId) {
    
    this.trackingId = trackingId;
    return this;
  }

   /**
   * Customer&#39;s &#x60;source_id&#x60;.
   * @return trackingId
  **/
  @javax.annotation.Nullable
  public String getTrackingId() {
    return trackingId;
  }


  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }


  public PublicationsCreateResponseBody metadata(Object metadata) {
    
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


  public PublicationsCreateResponseBody channel(ChannelEnum channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * How the publication was originated. It can be your own custom channel or an example value provided here.
   * @return channel
  **/
  @javax.annotation.Nullable
  public ChannelEnum getChannel() {
    return channel;
  }


  public void setChannel(ChannelEnum channel) {
    this.channel = channel;
  }


  public PublicationsCreateResponseBody sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * The merchant’s publication ID if it is different from the Voucherify publication ID. It&#39;s an optional tracking identifier of a publication. It is really useful in case of an integration between multiple systems. It can be a publication ID from a CRM system, database or 3rd-party service. 
   * @return sourceId
  **/
  @javax.annotation.Nullable
  public String getSourceId() {
    return sourceId;
  }


  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public PublicationsCreateResponseBody result(ResultEnum result) {
    
    this.result = result;
    return this;
  }

   /**
   * Status of the publication attempt.
   * @return result
  **/
  @javax.annotation.Nullable
  public ResultEnum getResult() {
    return result;
  }


  public void setResult(ResultEnum result) {
    this.result = result;
  }


  public PublicationsCreateResponseBody customer(CustomerWithSummaryLoyaltyReferrals customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  public CustomerWithSummaryLoyaltyReferrals getCustomer() {
    return customer;
  }


  public void setCustomer(CustomerWithSummaryLoyaltyReferrals customer) {
    this.customer = customer;
  }


  public PublicationsCreateResponseBody vouchersId(List<String> vouchersId) {
    
    this.vouchersId = vouchersId;
    return this;
  }

  public PublicationsCreateResponseBody addVouchersIdItem(String vouchersIdItem) {
    if (this.vouchersId == null) {
      this.vouchersId = new ArrayList<>();
    }
    this.vouchersId.add(vouchersIdItem);
    return this;
  }

   /**
   * Contains the unique internal voucher ID that was assigned by Voucherify.
   * @return vouchersId
  **/
  @javax.annotation.Nullable
  public List<String> getVouchersId() {
    return vouchersId;
  }


  public void setVouchersId(List<String> vouchersId) {
    this.vouchersId = vouchersId;
  }


  public PublicationsCreateResponseBody voucher(Voucher voucher) {
    
    this.voucher = voucher;
    return this;
  }

   /**
   * Get voucher
   * @return voucher
  **/
  @javax.annotation.Nullable
  public Voucher getVoucher() {
    return voucher;
  }


  public void setVoucher(Voucher voucher) {
    this.voucher = voucher;
  }


  public PublicationsCreateResponseBody vouchers(List<String> vouchers) {
    
    this.vouchers = vouchers;
    return this;
  }

  public PublicationsCreateResponseBody addVouchersItem(String vouchersItem) {
    if (this.vouchers == null) {
      this.vouchers = new ArrayList<>();
    }
    this.vouchers.add(vouchersItem);
    return this;
  }

   /**
   * Contains the unique voucher codes that was assigned by Voucherify.
   * @return vouchers
  **/
  @javax.annotation.Nullable
  public List<String> getVouchers() {
    return vouchers;
  }


  public void setVouchers(List<String> vouchers) {
    this.vouchers = vouchers;
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
   * @return the PublicationsCreateResponseBody instance itself
   */
  public PublicationsCreateResponseBody putAdditionalProperty(String key, Object value) {
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
    PublicationsCreateResponseBody publicationsCreateResponseBody = (PublicationsCreateResponseBody) o;
    return Objects.equals(this.id, publicationsCreateResponseBody.id) &&
        Objects.equals(this._object, publicationsCreateResponseBody._object) &&
        Objects.equals(this.createdAt, publicationsCreateResponseBody.createdAt) &&
        Objects.equals(this.customerId, publicationsCreateResponseBody.customerId) &&
        Objects.equals(this.trackingId, publicationsCreateResponseBody.trackingId) &&
        Objects.equals(this.metadata, publicationsCreateResponseBody.metadata) &&
        Objects.equals(this.channel, publicationsCreateResponseBody.channel) &&
        Objects.equals(this.sourceId, publicationsCreateResponseBody.sourceId) &&
        Objects.equals(this.result, publicationsCreateResponseBody.result) &&
        Objects.equals(this.customer, publicationsCreateResponseBody.customer) &&
        Objects.equals(this.vouchersId, publicationsCreateResponseBody.vouchersId) &&
        Objects.equals(this.voucher, publicationsCreateResponseBody.voucher) &&
        Objects.equals(this.vouchers, publicationsCreateResponseBody.vouchers)&&
        Objects.equals(this.additionalProperties, publicationsCreateResponseBody.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, createdAt, customerId, trackingId, metadata, channel, sourceId, result, customer, vouchersId, voucher, vouchers, additionalProperties);
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
    sb.append("class PublicationsCreateResponseBody {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    vouchersId: ").append(toIndentedString(vouchersId)).append("\n");
    sb.append("    voucher: ").append(toIndentedString(voucher)).append("\n");
    sb.append("    vouchers: ").append(toIndentedString(vouchers)).append("\n");
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
    openapiFields.add("customer_id");
    openapiFields.add("tracking_id");
    openapiFields.add("metadata");
    openapiFields.add("channel");
    openapiFields.add("source_id");
    openapiFields.add("result");
    openapiFields.add("customer");
    openapiFields.add("vouchers_id");
    openapiFields.add("voucher");
    openapiFields.add("vouchers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PublicationsCreateResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PublicationsCreateResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PublicationsCreateResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PublicationsCreateResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<PublicationsCreateResponseBody>() {
           @Override
           public void write(JsonWriter out, PublicationsCreateResponseBody value) throws IOException {
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
           public PublicationsCreateResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             PublicationsCreateResponseBody instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PublicationsCreateResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PublicationsCreateResponseBody
  * @throws IOException if the JSON string is invalid with respect to PublicationsCreateResponseBody
  */
  public static PublicationsCreateResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PublicationsCreateResponseBody.class);
  }

 /**
  * Convert an instance of PublicationsCreateResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
