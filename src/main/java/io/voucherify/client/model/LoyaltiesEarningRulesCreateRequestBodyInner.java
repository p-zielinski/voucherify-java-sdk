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
import io.voucherify.client.model.DefineFixedAmountOfPoints;
import io.voucherify.client.model.EarningRuleBaseLoyaltyTier;
import io.voucherify.client.model.LoyaltiesEarningRulesCreateCustomEventRequestBody;
import io.voucherify.client.model.LoyaltiesEarningRulesCreateCustomEventRequestBodyCustomEvent;
import io.voucherify.client.model.LoyaltiesEarningRulesCreateCustomEventRequestBodySource;
import io.voucherify.client.model.LoyaltiesEarningRulesCreateEnteredSegmentRequestBody;
import io.voucherify.client.model.LoyaltiesEarningRulesCreateEnteredSegmentRequestBodySegment;
import io.voucherify.client.model.LoyaltiesEarningRulesCreateOrderPaidRequestBody;
import io.voucherify.client.model.LoyaltiesEarningRulesCreateTierChangeRequestBody;
import io.voucherify.client.model.ValidityHours;
import io.voucherify.client.model.ValidityTimeframe;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import io.voucherify.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class LoyaltiesEarningRulesCreateRequestBodyInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(LoyaltiesEarningRulesCreateRequestBodyInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!LoyaltiesEarningRulesCreateRequestBodyInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'LoyaltiesEarningRulesCreateRequestBodyInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<LoyaltiesEarningRulesCreateOrderPaidRequestBody> adapterLoyaltiesEarningRulesCreateOrderPaidRequestBody = gson.getDelegateAdapter(this, TypeToken.get(LoyaltiesEarningRulesCreateOrderPaidRequestBody.class));
            final TypeAdapter<LoyaltiesEarningRulesCreateEnteredSegmentRequestBody> adapterLoyaltiesEarningRulesCreateEnteredSegmentRequestBody = gson.getDelegateAdapter(this, TypeToken.get(LoyaltiesEarningRulesCreateEnteredSegmentRequestBody.class));
            final TypeAdapter<LoyaltiesEarningRulesCreateCustomEventRequestBody> adapterLoyaltiesEarningRulesCreateCustomEventRequestBody = gson.getDelegateAdapter(this, TypeToken.get(LoyaltiesEarningRulesCreateCustomEventRequestBody.class));
            final TypeAdapter<LoyaltiesEarningRulesCreateTierChangeRequestBody> adapterLoyaltiesEarningRulesCreateTierChangeRequestBody = gson.getDelegateAdapter(this, TypeToken.get(LoyaltiesEarningRulesCreateTierChangeRequestBody.class));

            return (TypeAdapter<T>) new TypeAdapter<LoyaltiesEarningRulesCreateRequestBodyInner>() {
                @Override
                public void write(JsonWriter out, LoyaltiesEarningRulesCreateRequestBodyInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `LoyaltiesEarningRulesCreateOrderPaidRequestBody`
                    if (value.getActualInstance() instanceof LoyaltiesEarningRulesCreateOrderPaidRequestBody) {
                      JsonElement element = adapterLoyaltiesEarningRulesCreateOrderPaidRequestBody.toJsonTree((LoyaltiesEarningRulesCreateOrderPaidRequestBody)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `LoyaltiesEarningRulesCreateEnteredSegmentRequestBody`
                    if (value.getActualInstance() instanceof LoyaltiesEarningRulesCreateEnteredSegmentRequestBody) {
                      JsonElement element = adapterLoyaltiesEarningRulesCreateEnteredSegmentRequestBody.toJsonTree((LoyaltiesEarningRulesCreateEnteredSegmentRequestBody)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `LoyaltiesEarningRulesCreateCustomEventRequestBody`
                    if (value.getActualInstance() instanceof LoyaltiesEarningRulesCreateCustomEventRequestBody) {
                      JsonElement element = adapterLoyaltiesEarningRulesCreateCustomEventRequestBody.toJsonTree((LoyaltiesEarningRulesCreateCustomEventRequestBody)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `LoyaltiesEarningRulesCreateTierChangeRequestBody`
                    if (value.getActualInstance() instanceof LoyaltiesEarningRulesCreateTierChangeRequestBody) {
                      JsonElement element = adapterLoyaltiesEarningRulesCreateTierChangeRequestBody.toJsonTree((LoyaltiesEarningRulesCreateTierChangeRequestBody)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: LoyaltiesEarningRulesCreateCustomEventRequestBody, LoyaltiesEarningRulesCreateEnteredSegmentRequestBody, LoyaltiesEarningRulesCreateOrderPaidRequestBody, LoyaltiesEarningRulesCreateTierChangeRequestBody");
                }

                @Override
                public LoyaltiesEarningRulesCreateRequestBodyInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize LoyaltiesEarningRulesCreateOrderPaidRequestBody
                    try {
                      // validate the JSON object to see if any exception is thrown
                      LoyaltiesEarningRulesCreateOrderPaidRequestBody.validateJsonElement(jsonElement);
                      actualAdapter = adapterLoyaltiesEarningRulesCreateOrderPaidRequestBody;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'LoyaltiesEarningRulesCreateOrderPaidRequestBody'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for LoyaltiesEarningRulesCreateOrderPaidRequestBody failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'LoyaltiesEarningRulesCreateOrderPaidRequestBody'", e);
                    }
                    // deserialize LoyaltiesEarningRulesCreateEnteredSegmentRequestBody
                    try {
                      // validate the JSON object to see if any exception is thrown
                      LoyaltiesEarningRulesCreateEnteredSegmentRequestBody.validateJsonElement(jsonElement);
                      actualAdapter = adapterLoyaltiesEarningRulesCreateEnteredSegmentRequestBody;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'LoyaltiesEarningRulesCreateEnteredSegmentRequestBody'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for LoyaltiesEarningRulesCreateEnteredSegmentRequestBody failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'LoyaltiesEarningRulesCreateEnteredSegmentRequestBody'", e);
                    }
                    // deserialize LoyaltiesEarningRulesCreateCustomEventRequestBody
                    try {
                      // validate the JSON object to see if any exception is thrown
                      LoyaltiesEarningRulesCreateCustomEventRequestBody.validateJsonElement(jsonElement);
                      actualAdapter = adapterLoyaltiesEarningRulesCreateCustomEventRequestBody;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'LoyaltiesEarningRulesCreateCustomEventRequestBody'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for LoyaltiesEarningRulesCreateCustomEventRequestBody failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'LoyaltiesEarningRulesCreateCustomEventRequestBody'", e);
                    }
                    // deserialize LoyaltiesEarningRulesCreateTierChangeRequestBody
                    try {
                      // validate the JSON object to see if any exception is thrown
                      LoyaltiesEarningRulesCreateTierChangeRequestBody.validateJsonElement(jsonElement);
                      actualAdapter = adapterLoyaltiesEarningRulesCreateTierChangeRequestBody;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'LoyaltiesEarningRulesCreateTierChangeRequestBody'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for LoyaltiesEarningRulesCreateTierChangeRequestBody failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'LoyaltiesEarningRulesCreateTierChangeRequestBody'", e);
                    }

                    if (match == 1) {
                        LoyaltiesEarningRulesCreateRequestBodyInner ret = new LoyaltiesEarningRulesCreateRequestBodyInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for LoyaltiesEarningRulesCreateRequestBodyInner: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public LoyaltiesEarningRulesCreateRequestBodyInner() {
        super("oneOf", Boolean.FALSE);
    }

    public LoyaltiesEarningRulesCreateRequestBodyInner(LoyaltiesEarningRulesCreateCustomEventRequestBody o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public LoyaltiesEarningRulesCreateRequestBodyInner(LoyaltiesEarningRulesCreateEnteredSegmentRequestBody o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public LoyaltiesEarningRulesCreateRequestBodyInner(LoyaltiesEarningRulesCreateOrderPaidRequestBody o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public LoyaltiesEarningRulesCreateRequestBodyInner(LoyaltiesEarningRulesCreateTierChangeRequestBody o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("LoyaltiesEarningRulesCreateOrderPaidRequestBody", LoyaltiesEarningRulesCreateOrderPaidRequestBody.class);
        schemas.put("LoyaltiesEarningRulesCreateEnteredSegmentRequestBody", LoyaltiesEarningRulesCreateEnteredSegmentRequestBody.class);
        schemas.put("LoyaltiesEarningRulesCreateCustomEventRequestBody", LoyaltiesEarningRulesCreateCustomEventRequestBody.class);
        schemas.put("LoyaltiesEarningRulesCreateTierChangeRequestBody", LoyaltiesEarningRulesCreateTierChangeRequestBody.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return LoyaltiesEarningRulesCreateRequestBodyInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * LoyaltiesEarningRulesCreateCustomEventRequestBody, LoyaltiesEarningRulesCreateEnteredSegmentRequestBody, LoyaltiesEarningRulesCreateOrderPaidRequestBody, LoyaltiesEarningRulesCreateTierChangeRequestBody
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof LoyaltiesEarningRulesCreateOrderPaidRequestBody) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof LoyaltiesEarningRulesCreateEnteredSegmentRequestBody) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof LoyaltiesEarningRulesCreateCustomEventRequestBody) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof LoyaltiesEarningRulesCreateTierChangeRequestBody) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be LoyaltiesEarningRulesCreateCustomEventRequestBody, LoyaltiesEarningRulesCreateEnteredSegmentRequestBody, LoyaltiesEarningRulesCreateOrderPaidRequestBody, LoyaltiesEarningRulesCreateTierChangeRequestBody");
    }

    /**
     * Get the actual instance, which can be the following:
     * LoyaltiesEarningRulesCreateCustomEventRequestBody, LoyaltiesEarningRulesCreateEnteredSegmentRequestBody, LoyaltiesEarningRulesCreateOrderPaidRequestBody, LoyaltiesEarningRulesCreateTierChangeRequestBody
     *
     * @return The actual instance (LoyaltiesEarningRulesCreateCustomEventRequestBody, LoyaltiesEarningRulesCreateEnteredSegmentRequestBody, LoyaltiesEarningRulesCreateOrderPaidRequestBody, LoyaltiesEarningRulesCreateTierChangeRequestBody)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `LoyaltiesEarningRulesCreateOrderPaidRequestBody`. If the actual instance is not `LoyaltiesEarningRulesCreateOrderPaidRequestBody`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LoyaltiesEarningRulesCreateOrderPaidRequestBody`
     * @throws ClassCastException if the instance is not `LoyaltiesEarningRulesCreateOrderPaidRequestBody`
     */
    public LoyaltiesEarningRulesCreateOrderPaidRequestBody getLoyaltiesEarningRulesCreateOrderPaidRequestBody() throws ClassCastException {
        return (LoyaltiesEarningRulesCreateOrderPaidRequestBody)super.getActualInstance();
    }
    /**
     * Get the actual instance of `LoyaltiesEarningRulesCreateEnteredSegmentRequestBody`. If the actual instance is not `LoyaltiesEarningRulesCreateEnteredSegmentRequestBody`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LoyaltiesEarningRulesCreateEnteredSegmentRequestBody`
     * @throws ClassCastException if the instance is not `LoyaltiesEarningRulesCreateEnteredSegmentRequestBody`
     */
    public LoyaltiesEarningRulesCreateEnteredSegmentRequestBody getLoyaltiesEarningRulesCreateEnteredSegmentRequestBody() throws ClassCastException {
        return (LoyaltiesEarningRulesCreateEnteredSegmentRequestBody)super.getActualInstance();
    }
    /**
     * Get the actual instance of `LoyaltiesEarningRulesCreateCustomEventRequestBody`. If the actual instance is not `LoyaltiesEarningRulesCreateCustomEventRequestBody`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LoyaltiesEarningRulesCreateCustomEventRequestBody`
     * @throws ClassCastException if the instance is not `LoyaltiesEarningRulesCreateCustomEventRequestBody`
     */
    public LoyaltiesEarningRulesCreateCustomEventRequestBody getLoyaltiesEarningRulesCreateCustomEventRequestBody() throws ClassCastException {
        return (LoyaltiesEarningRulesCreateCustomEventRequestBody)super.getActualInstance();
    }
    /**
     * Get the actual instance of `LoyaltiesEarningRulesCreateTierChangeRequestBody`. If the actual instance is not `LoyaltiesEarningRulesCreateTierChangeRequestBody`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `LoyaltiesEarningRulesCreateTierChangeRequestBody`
     * @throws ClassCastException if the instance is not `LoyaltiesEarningRulesCreateTierChangeRequestBody`
     */
    public LoyaltiesEarningRulesCreateTierChangeRequestBody getLoyaltiesEarningRulesCreateTierChangeRequestBody() throws ClassCastException {
        return (LoyaltiesEarningRulesCreateTierChangeRequestBody)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LoyaltiesEarningRulesCreateRequestBodyInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with LoyaltiesEarningRulesCreateOrderPaidRequestBody
    try {
      LoyaltiesEarningRulesCreateOrderPaidRequestBody.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for LoyaltiesEarningRulesCreateOrderPaidRequestBody failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with LoyaltiesEarningRulesCreateEnteredSegmentRequestBody
    try {
      LoyaltiesEarningRulesCreateEnteredSegmentRequestBody.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for LoyaltiesEarningRulesCreateEnteredSegmentRequestBody failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with LoyaltiesEarningRulesCreateCustomEventRequestBody
    try {
      LoyaltiesEarningRulesCreateCustomEventRequestBody.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for LoyaltiesEarningRulesCreateCustomEventRequestBody failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with LoyaltiesEarningRulesCreateTierChangeRequestBody
    try {
      LoyaltiesEarningRulesCreateTierChangeRequestBody.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for LoyaltiesEarningRulesCreateTierChangeRequestBody failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for LoyaltiesEarningRulesCreateRequestBodyInner with oneOf schemas: LoyaltiesEarningRulesCreateCustomEventRequestBody, LoyaltiesEarningRulesCreateEnteredSegmentRequestBody, LoyaltiesEarningRulesCreateOrderPaidRequestBody, LoyaltiesEarningRulesCreateTierChangeRequestBody. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of LoyaltiesEarningRulesCreateRequestBodyInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoyaltiesEarningRulesCreateRequestBodyInner
  * @throws IOException if the JSON string is invalid with respect to LoyaltiesEarningRulesCreateRequestBodyInner
  */
  public static LoyaltiesEarningRulesCreateRequestBodyInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoyaltiesEarningRulesCreateRequestBodyInner.class);
  }

 /**
  * Convert an instance of LoyaltiesEarningRulesCreateRequestBodyInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
