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
import io.voucherify.client.model.OrderItemCalculatedProduct;
import io.voucherify.client.model.OrderItemCalculatedSku;
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
 * OrderItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OrderItem {
  /**
   * The type of the object represented by JSON. This object stores information about the &#x60;order_item&#x60;.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    ORDER_ITEM("order_item");

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
  private ObjectEnum _object = ObjectEnum.ORDER_ITEM;

  public static final String SERIALIZED_NAME_SKU_ID = "sku_id";
  @SerializedName(SERIALIZED_NAME_SKU_ID)
  private String skuId;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId;

  /**
   * Used along with the source_id property, can be set to either sku or product.
   */
  @JsonAdapter(RelatedObjectEnum.Adapter.class)
  public enum RelatedObjectEnum {
    PRODUCT("product"),
    
    SKU("sku");

    private String value;

    RelatedObjectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RelatedObjectEnum fromValue(String value) {
      for (RelatedObjectEnum b : RelatedObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
        return null;
    }

    public static class Adapter extends TypeAdapter<RelatedObjectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RelatedObjectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RelatedObjectEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RelatedObjectEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RELATED_OBJECT = "related_object";
  @SerializedName(SERIALIZED_NAME_RELATED_OBJECT)
  private RelatedObjectEnum relatedObject;

  public static final String SERIALIZED_NAME_SOURCE_ID = "source_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_DISCOUNT_QUANTITY = "discount_quantity";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_QUANTITY)
  private Integer discountQuantity;

  public static final String SERIALIZED_NAME_INITIAL_QUANTITY = "initial_quantity";
  @SerializedName(SERIALIZED_NAME_INITIAL_QUANTITY)
  private Integer initialQuantity;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_DISCOUNT_AMOUNT = "discount_amount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_AMOUNT)
  private Integer discountAmount;

  public static final String SERIALIZED_NAME_INITIAL_AMOUNT = "initial_amount";
  @SerializedName(SERIALIZED_NAME_INITIAL_AMOUNT)
  private Integer initialAmount;

  public static final String SERIALIZED_NAME_APPLIED_DISCOUNT_AMOUNT = "applied_discount_amount";
  @SerializedName(SERIALIZED_NAME_APPLIED_DISCOUNT_AMOUNT)
  private Integer appliedDiscountAmount;

  public static final String SERIALIZED_NAME_APPLIED_DISCOUNT_QUANTITY = "applied_discount_quantity";
  @SerializedName(SERIALIZED_NAME_APPLIED_DISCOUNT_QUANTITY)
  private Integer appliedDiscountQuantity;

  public static final String SERIALIZED_NAME_APPLIED_QUANTITY = "applied_quantity";
  @SerializedName(SERIALIZED_NAME_APPLIED_QUANTITY)
  private Integer appliedQuantity;

  public static final String SERIALIZED_NAME_APPLIED_QUANTITY_AMOUNT = "applied_quantity_amount";
  @SerializedName(SERIALIZED_NAME_APPLIED_QUANTITY_AMOUNT)
  private Integer appliedQuantityAmount;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Integer price;

  public static final String SERIALIZED_NAME_SUBTOTAL_AMOUNT = "subtotal_amount";
  @SerializedName(SERIALIZED_NAME_SUBTOTAL_AMOUNT)
  private Integer subtotalAmount;

  public static final String SERIALIZED_NAME_PRODUCT = "product";
  @SerializedName(SERIALIZED_NAME_PRODUCT)
  private OrderItemCalculatedProduct product;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private OrderItemCalculatedSku sku;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public OrderItem() {
  }

  public OrderItem _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * The type of the object represented by JSON. This object stores information about the &#x60;order_item&#x60;.
   * @return _object
  **/
  @javax.annotation.Nullable
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public OrderItem skuId(String skuId) {
    
    this.skuId = skuId;
    return this;
  }

   /**
   * Unique identifier of the SKU. It is assigned by Voucherify.
   * @return skuId
  **/
  @javax.annotation.Nullable
  public String getSkuId() {
    return skuId;
  }


  public void setSkuId(String skuId) {
    this.skuId = skuId;
  }


  public OrderItem productId(String productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Unique identifier of the product. It is assigned by Voucherify.
   * @return productId
  **/
  @javax.annotation.Nullable
  public String getProductId() {
    return productId;
  }


  public void setProductId(String productId) {
    this.productId = productId;
  }


  public OrderItem relatedObject(RelatedObjectEnum relatedObject) {
    
    this.relatedObject = relatedObject;
    return this;
  }

   /**
   * Used along with the source_id property, can be set to either sku or product.
   * @return relatedObject
  **/
  @javax.annotation.Nullable
  public RelatedObjectEnum getRelatedObject() {
    return relatedObject;
  }


  public void setRelatedObject(RelatedObjectEnum relatedObject) {
    this.relatedObject = relatedObject;
  }


  public OrderItem sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * The merchant&#39;s product/SKU ID (if it is different from the Voucherify product/SKU ID). It is useful in the integration between multiple systems. It can be an ID from an eCommerce site, a database, or a third-party service.
   * @return sourceId
  **/
  @javax.annotation.Nullable
  public String getSourceId() {
    return sourceId;
  }


  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public OrderItem quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity of the particular item in the cart.
   * @return quantity
  **/
  @javax.annotation.Nullable
  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public OrderItem discountQuantity(Integer discountQuantity) {
    
    this.discountQuantity = discountQuantity;
    return this;
  }

   /**
   * Number of dicounted items.
   * @return discountQuantity
  **/
  @javax.annotation.Nullable
  public Integer getDiscountQuantity() {
    return discountQuantity;
  }


  public void setDiscountQuantity(Integer discountQuantity) {
    this.discountQuantity = discountQuantity;
  }


  public OrderItem initialQuantity(Integer initialQuantity) {
    
    this.initialQuantity = initialQuantity;
    return this;
  }

   /**
   * A positive integer in the smallest unit quantity representing the total amount of the order; this is the sum of the order items&#39; quantity.
   * @return initialQuantity
  **/
  @javax.annotation.Nullable
  public Integer getInitialQuantity() {
    return initialQuantity;
  }


  public void setInitialQuantity(Integer initialQuantity) {
    this.initialQuantity = initialQuantity;
  }


  public OrderItem amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The total amount of the order item (price * quantity).
   * @return amount
  **/
  @javax.annotation.Nullable
  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public OrderItem discountAmount(Integer discountAmount) {
    
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   *  Sum of all order-item-level discounts applied to the order.
   * @return discountAmount
  **/
  @javax.annotation.Nullable
  public Integer getDiscountAmount() {
    return discountAmount;
  }


  public void setDiscountAmount(Integer discountAmount) {
    this.discountAmount = discountAmount;
  }


  public OrderItem initialAmount(Integer initialAmount) {
    
    this.initialAmount = initialAmount;
    return this;
  }

   /**
   * A positive integer in the smallest currency unit (e.g. 100 cents for $1.00) representing the total amount of the order. This is the sum of the order items&#39; amounts.
   * @return initialAmount
  **/
  @javax.annotation.Nullable
  public Integer getInitialAmount() {
    return initialAmount;
  }


  public void setInitialAmount(Integer initialAmount) {
    this.initialAmount = initialAmount;
  }


  public OrderItem appliedDiscountAmount(Integer appliedDiscountAmount) {
    
    this.appliedDiscountAmount = appliedDiscountAmount;
    return this;
  }

   /**
   * Order-level discount amount applied in the transaction.
   * @return appliedDiscountAmount
  **/
  @javax.annotation.Nullable
  public Integer getAppliedDiscountAmount() {
    return appliedDiscountAmount;
  }


  public void setAppliedDiscountAmount(Integer appliedDiscountAmount) {
    this.appliedDiscountAmount = appliedDiscountAmount;
  }


  public OrderItem appliedDiscountQuantity(Integer appliedDiscountQuantity) {
    
    this.appliedDiscountQuantity = appliedDiscountQuantity;
    return this;
  }

   /**
   * Number of the discounted items applied in the transaction.
   * @return appliedDiscountQuantity
  **/
  @javax.annotation.Nullable
  public Integer getAppliedDiscountQuantity() {
    return appliedDiscountQuantity;
  }


  public void setAppliedDiscountQuantity(Integer appliedDiscountQuantity) {
    this.appliedDiscountQuantity = appliedDiscountQuantity;
  }


  public OrderItem appliedQuantity(Integer appliedQuantity) {
    
    this.appliedQuantity = appliedQuantity;
    return this;
  }

   /**
   * Quantity of items changed by the application of a new quantity items. It can be positive when an item is added or negative if an item is replaced.
   * @return appliedQuantity
  **/
  @javax.annotation.Nullable
  public Integer getAppliedQuantity() {
    return appliedQuantity;
  }


  public void setAppliedQuantity(Integer appliedQuantity) {
    this.appliedQuantity = appliedQuantity;
  }


  public OrderItem appliedQuantityAmount(Integer appliedQuantityAmount) {
    
    this.appliedQuantityAmount = appliedQuantityAmount;
    return this;
  }

   /**
   * Amount for the items changed by the application of a new quantity items. It can be positive when an item is added or negative if an item is replaced.
   * @return appliedQuantityAmount
  **/
  @javax.annotation.Nullable
  public Integer getAppliedQuantityAmount() {
    return appliedQuantityAmount;
  }


  public void setAppliedQuantityAmount(Integer appliedQuantityAmount) {
    this.appliedQuantityAmount = appliedQuantityAmount;
  }


  public OrderItem price(Integer price) {
    
    this.price = price;
    return this;
  }

   /**
   * Unit price of an item. Value is multiplied by 100 to precisely represent 2 decimal places. For example &#x60;10000 cents&#x60; for &#x60;$100.00&#x60;.
   * @return price
  **/
  @javax.annotation.Nullable
  public Integer getPrice() {
    return price;
  }


  public void setPrice(Integer price) {
    this.price = price;
  }


  public OrderItem subtotalAmount(Integer subtotalAmount) {
    
    this.subtotalAmount = subtotalAmount;
    return this;
  }

   /**
   * Final order item amount after the applied item-level discount.  If there are no item-level discounts applied, this item is equal to the &#x60;amount&#x60;.    &#x60;subtotal_amount&#x60;&#x3D;&#x60;amount&#x60;-&#x60;discount_amount&#x60;
   * @return subtotalAmount
  **/
  @javax.annotation.Nullable
  public Integer getSubtotalAmount() {
    return subtotalAmount;
  }


  public void setSubtotalAmount(Integer subtotalAmount) {
    this.subtotalAmount = subtotalAmount;
  }


  public OrderItem product(OrderItemCalculatedProduct product) {
    
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @javax.annotation.Nullable
  public OrderItemCalculatedProduct getProduct() {
    return product;
  }


  public void setProduct(OrderItemCalculatedProduct product) {
    this.product = product;
  }


  public OrderItem sku(OrderItemCalculatedSku sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @javax.annotation.Nullable
  public OrderItemCalculatedSku getSku() {
    return sku;
  }


  public void setSku(OrderItemCalculatedSku sku) {
    this.sku = sku;
  }


  public OrderItem metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * A set of custom key/value pairs that you can attach to an order item. It can be useful for storing additional information about the order item in a structured format.
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
   * @return the OrderItem instance itself
   */
  public OrderItem putAdditionalProperty(String key, Object value) {
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
    OrderItem orderItem = (OrderItem) o;
    return Objects.equals(this._object, orderItem._object) &&
        Objects.equals(this.skuId, orderItem.skuId) &&
        Objects.equals(this.productId, orderItem.productId) &&
        Objects.equals(this.relatedObject, orderItem.relatedObject) &&
        Objects.equals(this.sourceId, orderItem.sourceId) &&
        Objects.equals(this.quantity, orderItem.quantity) &&
        Objects.equals(this.discountQuantity, orderItem.discountQuantity) &&
        Objects.equals(this.initialQuantity, orderItem.initialQuantity) &&
        Objects.equals(this.amount, orderItem.amount) &&
        Objects.equals(this.discountAmount, orderItem.discountAmount) &&
        Objects.equals(this.initialAmount, orderItem.initialAmount) &&
        Objects.equals(this.appliedDiscountAmount, orderItem.appliedDiscountAmount) &&
        Objects.equals(this.appliedDiscountQuantity, orderItem.appliedDiscountQuantity) &&
        Objects.equals(this.appliedQuantity, orderItem.appliedQuantity) &&
        Objects.equals(this.appliedQuantityAmount, orderItem.appliedQuantityAmount) &&
        Objects.equals(this.price, orderItem.price) &&
        Objects.equals(this.subtotalAmount, orderItem.subtotalAmount) &&
        Objects.equals(this.product, orderItem.product) &&
        Objects.equals(this.sku, orderItem.sku) &&
        Objects.equals(this.metadata, orderItem.metadata)&&
        Objects.equals(this.additionalProperties, orderItem.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, skuId, productId, relatedObject, sourceId, quantity, discountQuantity, initialQuantity, amount, discountAmount, initialAmount, appliedDiscountAmount, appliedDiscountQuantity, appliedQuantity, appliedQuantityAmount, price, subtotalAmount, product, sku, metadata, additionalProperties);
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
    sb.append("class OrderItem {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    relatedObject: ").append(toIndentedString(relatedObject)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    discountQuantity: ").append(toIndentedString(discountQuantity)).append("\n");
    sb.append("    initialQuantity: ").append(toIndentedString(initialQuantity)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    initialAmount: ").append(toIndentedString(initialAmount)).append("\n");
    sb.append("    appliedDiscountAmount: ").append(toIndentedString(appliedDiscountAmount)).append("\n");
    sb.append("    appliedDiscountQuantity: ").append(toIndentedString(appliedDiscountQuantity)).append("\n");
    sb.append("    appliedQuantity: ").append(toIndentedString(appliedQuantity)).append("\n");
    sb.append("    appliedQuantityAmount: ").append(toIndentedString(appliedQuantityAmount)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    subtotalAmount: ").append(toIndentedString(subtotalAmount)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
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
    openapiFields.add("object");
    openapiFields.add("sku_id");
    openapiFields.add("product_id");
    openapiFields.add("related_object");
    openapiFields.add("source_id");
    openapiFields.add("quantity");
    openapiFields.add("discount_quantity");
    openapiFields.add("initial_quantity");
    openapiFields.add("amount");
    openapiFields.add("discount_amount");
    openapiFields.add("initial_amount");
    openapiFields.add("applied_discount_amount");
    openapiFields.add("applied_discount_quantity");
    openapiFields.add("applied_quantity");
    openapiFields.add("applied_quantity_amount");
    openapiFields.add("price");
    openapiFields.add("subtotal_amount");
    openapiFields.add("product");
    openapiFields.add("sku");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderItem.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderItem>() {
           @Override
           public void write(JsonWriter out, OrderItem value) throws IOException {
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
           public OrderItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             OrderItem instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OrderItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderItem
  * @throws IOException if the JSON string is invalid with respect to OrderItem
  */
  public static OrderItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderItem.class);
  }

 /**
  * Convert an instance of OrderItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

