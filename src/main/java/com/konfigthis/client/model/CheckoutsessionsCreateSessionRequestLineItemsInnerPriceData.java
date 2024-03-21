/*
 * dots api
 * Scalable and Flexible Payouts Infrastructure
 *
 * The version of the OpenAPI document: 1.0
 * Contact: info@dots.dev
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.CheckoutsessionsCreateSessionRequestLineItemsInnerPriceDataProductData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData {
  /**
   * Gets or Sets currency
   */
  @JsonAdapter(CurrencyEnum.Adapter.class)
 public enum CurrencyEnum {
    USD("usd");

    private String value;

    CurrencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CurrencyEnum fromValue(String value) {
      for (CurrencyEnum b : CurrencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CurrencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CurrencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CurrencyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CurrencyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private CurrencyEnum currency;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_PRODUCT_DATA = "product_data";
  @SerializedName(SERIALIZED_NAME_PRODUCT_DATA)
  private CheckoutsessionsCreateSessionRequestLineItemsInnerPriceDataProductData productData;

  public CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData() {
  }

  public CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData currency(CurrencyEnum currency) {
    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CurrencyEnum getCurrency() {
    return currency;
  }


  public void setCurrency(CurrencyEnum currency) {
    
    
    
    this.currency = currency;
  }


  public CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData amount(Integer amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * amount in cents
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "amount in cents")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    
    
    
    this.amount = amount;
  }


  public CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData productData(CheckoutsessionsCreateSessionRequestLineItemsInnerPriceDataProductData productData) {
    
    
    
    
    this.productData = productData;
    return this;
  }

   /**
   * Get productData
   * @return productData
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CheckoutsessionsCreateSessionRequestLineItemsInnerPriceDataProductData getProductData() {
    return productData;
  }


  public void setProductData(CheckoutsessionsCreateSessionRequestLineItemsInnerPriceDataProductData productData) {
    
    
    
    this.productData = productData;
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
   * @return the CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData instance itself
   */
  public CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData putAdditionalProperty(String key, Object value) {
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
    CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData checkoutsessionsCreateSessionRequestLineItemsInnerPriceData = (CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData) o;
    return Objects.equals(this.currency, checkoutsessionsCreateSessionRequestLineItemsInnerPriceData.currency) &&
        Objects.equals(this.amount, checkoutsessionsCreateSessionRequestLineItemsInnerPriceData.amount) &&
        Objects.equals(this.productData, checkoutsessionsCreateSessionRequestLineItemsInnerPriceData.productData)&&
        Objects.equals(this.additionalProperties, checkoutsessionsCreateSessionRequestLineItemsInnerPriceData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, amount, productData, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    productData: ").append(toIndentedString(productData)).append("\n");
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
    openapiFields.add("currency");
    openapiFields.add("amount");
    openapiFields.add("product_data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("product_data");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData is not found in the empty JSON string", CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      // validate the required field `product_data`
      CheckoutsessionsCreateSessionRequestLineItemsInnerPriceDataProductData.validateJsonObject(jsonObj.getAsJsonObject("product_data"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData.class));

       return (TypeAdapter<T>) new TypeAdapter<CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData>() {
           @Override
           public void write(JsonWriter out, CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
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
           public CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData instance = thisAdapter.fromJsonTree(jsonObj);
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
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
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
  * Create an instance of CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData
  * @throws IOException if the JSON string is invalid with respect to CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData
  */
  public static CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData.class);
  }

 /**
  * Convert an instance of CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
