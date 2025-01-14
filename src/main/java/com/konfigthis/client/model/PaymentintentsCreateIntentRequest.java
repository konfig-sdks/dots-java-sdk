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
import com.konfigthis.client.model.PaymentintentsCreateIntentRequestTransferData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
 * PaymentintentsCreateIntentRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PaymentintentsCreateIntentRequest {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  /**
   * Currency of the payment. Currently only &#x60;usd&#x60; is supported.
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

  public static final String SERIALIZED_NAME_CONFIRM = "confirm";
  @SerializedName(SERIALIZED_NAME_CONFIRM)
  private Boolean confirm = false;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private UUID userId;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private UUID customerId;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD_ID = "payment_method_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD_ID)
  private UUID paymentMethodId;

  /**
   * Gets or Sets paymentMethodTypes
   */
  @JsonAdapter(PaymentMethodTypesEnum.Adapter.class)
 public enum PaymentMethodTypesEnum {
    CARD("card");

    private String value;

    PaymentMethodTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentMethodTypesEnum fromValue(String value) {
      for (PaymentMethodTypesEnum b : PaymentMethodTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PaymentMethodTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentMethodTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentMethodTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PaymentMethodTypesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYMENT_METHOD_TYPES = "payment_method_types";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD_TYPES)
  private List<PaymentMethodTypesEnum> paymentMethodTypes = null;

  /**
   * Gets or Sets setupFutureUsage
   */
  @JsonAdapter(SetupFutureUsageEnum.Adapter.class)
 public enum SetupFutureUsageEnum {
    ON_SESSION("on_session");

    private String value;

    SetupFutureUsageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SetupFutureUsageEnum fromValue(String value) {
      for (SetupFutureUsageEnum b : SetupFutureUsageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SetupFutureUsageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SetupFutureUsageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SetupFutureUsageEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SetupFutureUsageEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SETUP_FUTURE_USAGE = "setup_future_usage";
  @SerializedName(SERIALIZED_NAME_SETUP_FUTURE_USAGE)
  private SetupFutureUsageEnum setupFutureUsage;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Boolean metadata;

  public static final String SERIALIZED_NAME_TRANSFER_DATA = "transfer_data";
  @SerializedName(SERIALIZED_NAME_TRANSFER_DATA)
  private PaymentintentsCreateIntentRequestTransferData transferData;

  public static final String SERIALIZED_NAME_APPLICATION_FEE_AMOUNT = "application_fee_amount";
  @SerializedName(SERIALIZED_NAME_APPLICATION_FEE_AMOUNT)
  private Integer applicationFeeAmount;

  public PaymentintentsCreateIntentRequest() {
  }

  public PaymentintentsCreateIntentRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * An arbitrary string attached to the object. Often useful for displaying to users.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An arbitrary string attached to the object. Often useful for displaying to users.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public PaymentintentsCreateIntentRequest amount(Integer amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * Amount in cents
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Amount in cents")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    
    
    
    this.amount = amount;
  }


  public PaymentintentsCreateIntentRequest currency(CurrencyEnum currency) {
    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * Currency of the payment. Currently only &#x60;usd&#x60; is supported.
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Currency of the payment. Currently only `usd` is supported.")

  public CurrencyEnum getCurrency() {
    return currency;
  }


  public void setCurrency(CurrencyEnum currency) {
    
    
    
    this.currency = currency;
  }


  public PaymentintentsCreateIntentRequest confirm(Boolean confirm) {
    
    
    
    
    this.confirm = confirm;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; to attempt to confirm this payment intent immediately. Defaults to &#x60;false&#x60;.
   * @return confirm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Set to `true` to attempt to confirm this payment intent immediately. Defaults to `false`.")

  public Boolean getConfirm() {
    return confirm;
  }


  public void setConfirm(Boolean confirm) {
    
    
    
    this.confirm = confirm;
  }


  public PaymentintentsCreateIntentRequest userId(UUID userId) {
    
    
    
    
    this.userId = userId;
    return this;
  }

   /**
   * ID of a Dots &#x60;user&#x60; making this payment.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of a Dots `user` making this payment.")

  public UUID getUserId() {
    return userId;
  }


  public void setUserId(UUID userId) {
    
    
    
    this.userId = userId;
  }


  public PaymentintentsCreateIntentRequest customerId(UUID customerId) {
    
    
    
    
    this.customerId = customerId;
    return this;
  }

   /**
   * ID of a Dots &#x60;payment_customer&#x60; making this payment.
   * @return customerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of a Dots `payment_customer` making this payment.")

  public UUID getCustomerId() {
    return customerId;
  }


  public void setCustomerId(UUID customerId) {
    
    
    
    this.customerId = customerId;
  }


  public PaymentintentsCreateIntentRequest paymentMethodId(UUID paymentMethodId) {
    
    
    
    
    this.paymentMethodId = paymentMethodId;
    return this;
  }

   /**
   * ID of the payment method to attach to this payment intent.
   * @return paymentMethodId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the payment method to attach to this payment intent.")

  public UUID getPaymentMethodId() {
    return paymentMethodId;
  }


  public void setPaymentMethodId(UUID paymentMethodId) {
    
    
    
    this.paymentMethodId = paymentMethodId;
  }


  public PaymentintentsCreateIntentRequest paymentMethodTypes(List<PaymentMethodTypesEnum> paymentMethodTypes) {
    
    
    
    
    this.paymentMethodTypes = paymentMethodTypes;
    return this;
  }

  public PaymentintentsCreateIntentRequest addPaymentMethodTypesItem(PaymentMethodTypesEnum paymentMethodTypesItem) {
    if (this.paymentMethodTypes == null) {
      this.paymentMethodTypes = new ArrayList<>();
    }
    this.paymentMethodTypes.add(paymentMethodTypesItem);
    return this;
  }

   /**
   * Currently only &#x60;card&#x60; is supported.
   * @return paymentMethodTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Currently only `card` is supported.")

  public List<PaymentMethodTypesEnum> getPaymentMethodTypes() {
    return paymentMethodTypes;
  }


  public void setPaymentMethodTypes(List<PaymentMethodTypesEnum> paymentMethodTypes) {
    
    
    
    this.paymentMethodTypes = paymentMethodTypes;
  }


  public PaymentintentsCreateIntentRequest setupFutureUsage(SetupFutureUsageEnum setupFutureUsage) {
    
    
    
    
    this.setupFutureUsage = setupFutureUsage;
    return this;
  }

   /**
   * Get setupFutureUsage
   * @return setupFutureUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SetupFutureUsageEnum getSetupFutureUsage() {
    return setupFutureUsage;
  }


  public void setSetupFutureUsage(SetupFutureUsageEnum setupFutureUsage) {
    
    
    
    this.setupFutureUsage = setupFutureUsage;
  }


  public PaymentintentsCreateIntentRequest metadata(Boolean metadata) {
    
    
    
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.")

  public Boolean getMetadata() {
    return metadata;
  }


  public void setMetadata(Boolean metadata) {
    
    
    
    this.metadata = metadata;
  }


  public PaymentintentsCreateIntentRequest transferData(PaymentintentsCreateIntentRequestTransferData transferData) {
    
    
    
    
    this.transferData = transferData;
    return this;
  }

   /**
   * Get transferData
   * @return transferData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentintentsCreateIntentRequestTransferData getTransferData() {
    return transferData;
  }


  public void setTransferData(PaymentintentsCreateIntentRequestTransferData transferData) {
    
    
    
    this.transferData = transferData;
  }


  public PaymentintentsCreateIntentRequest applicationFeeAmount(Integer applicationFeeAmount) {
    if (applicationFeeAmount != null && applicationFeeAmount < 0) {
      throw new IllegalArgumentException("Invalid value for applicationFeeAmount. Must be greater than or equal to 0.");
    }
    
    
    
    this.applicationFeeAmount = applicationFeeAmount;
    return this;
  }

   /**
   * Amount in cents to transfer to the application&#39;s wallet as a platform fee.
   * minimum: 0
   * @return applicationFeeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount in cents to transfer to the application's wallet as a platform fee.")

  public Integer getApplicationFeeAmount() {
    return applicationFeeAmount;
  }


  public void setApplicationFeeAmount(Integer applicationFeeAmount) {
    if (applicationFeeAmount != null && applicationFeeAmount < 0) {
      throw new IllegalArgumentException("Invalid value for applicationFeeAmount. Must be greater than or equal to 0.");
    }
    
    
    this.applicationFeeAmount = applicationFeeAmount;
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
   * @return the PaymentintentsCreateIntentRequest instance itself
   */
  public PaymentintentsCreateIntentRequest putAdditionalProperty(String key, Object value) {
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
    PaymentintentsCreateIntentRequest paymentintentsCreateIntentRequest = (PaymentintentsCreateIntentRequest) o;
    return Objects.equals(this.description, paymentintentsCreateIntentRequest.description) &&
        Objects.equals(this.amount, paymentintentsCreateIntentRequest.amount) &&
        Objects.equals(this.currency, paymentintentsCreateIntentRequest.currency) &&
        Objects.equals(this.confirm, paymentintentsCreateIntentRequest.confirm) &&
        Objects.equals(this.userId, paymentintentsCreateIntentRequest.userId) &&
        Objects.equals(this.customerId, paymentintentsCreateIntentRequest.customerId) &&
        Objects.equals(this.paymentMethodId, paymentintentsCreateIntentRequest.paymentMethodId) &&
        Objects.equals(this.paymentMethodTypes, paymentintentsCreateIntentRequest.paymentMethodTypes) &&
        Objects.equals(this.setupFutureUsage, paymentintentsCreateIntentRequest.setupFutureUsage) &&
        Objects.equals(this.metadata, paymentintentsCreateIntentRequest.metadata) &&
        Objects.equals(this.transferData, paymentintentsCreateIntentRequest.transferData) &&
        Objects.equals(this.applicationFeeAmount, paymentintentsCreateIntentRequest.applicationFeeAmount)&&
        Objects.equals(this.additionalProperties, paymentintentsCreateIntentRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, amount, currency, confirm, userId, customerId, paymentMethodId, paymentMethodTypes, setupFutureUsage, metadata, transferData, applicationFeeAmount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentintentsCreateIntentRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    confirm: ").append(toIndentedString(confirm)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    paymentMethodId: ").append(toIndentedString(paymentMethodId)).append("\n");
    sb.append("    paymentMethodTypes: ").append(toIndentedString(paymentMethodTypes)).append("\n");
    sb.append("    setupFutureUsage: ").append(toIndentedString(setupFutureUsage)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    transferData: ").append(toIndentedString(transferData)).append("\n");
    sb.append("    applicationFeeAmount: ").append(toIndentedString(applicationFeeAmount)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("amount");
    openapiFields.add("currency");
    openapiFields.add("confirm");
    openapiFields.add("user_id");
    openapiFields.add("customer_id");
    openapiFields.add("payment_method_id");
    openapiFields.add("payment_method_types");
    openapiFields.add("setup_future_usage");
    openapiFields.add("metadata");
    openapiFields.add("transfer_data");
    openapiFields.add("application_fee_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("currency");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentintentsCreateIntentRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaymentintentsCreateIntentRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentintentsCreateIntentRequest is not found in the empty JSON string", PaymentintentsCreateIntentRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaymentintentsCreateIntentRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonNull()) && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
      if ((jsonObj.get("customer_id") != null && !jsonObj.get("customer_id").isJsonNull()) && !jsonObj.get("customer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_id").toString()));
      }
      if ((jsonObj.get("payment_method_id") != null && !jsonObj.get("payment_method_id").isJsonNull()) && !jsonObj.get("payment_method_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_method_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_method_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("payment_method_types") != null && !jsonObj.get("payment_method_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_method_types` to be an array in the JSON string but got `%s`", jsonObj.get("payment_method_types").toString()));
      }
      if ((jsonObj.get("setup_future_usage") != null && !jsonObj.get("setup_future_usage").isJsonNull()) && !jsonObj.get("setup_future_usage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `setup_future_usage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("setup_future_usage").toString()));
      }
      // validate the optional field `transfer_data`
      if (jsonObj.get("transfer_data") != null && !jsonObj.get("transfer_data").isJsonNull()) {
        PaymentintentsCreateIntentRequestTransferData.validateJsonObject(jsonObj.getAsJsonObject("transfer_data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentintentsCreateIntentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentintentsCreateIntentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentintentsCreateIntentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentintentsCreateIntentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentintentsCreateIntentRequest>() {
           @Override
           public void write(JsonWriter out, PaymentintentsCreateIntentRequest value) throws IOException {
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
           public PaymentintentsCreateIntentRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaymentintentsCreateIntentRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PaymentintentsCreateIntentRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentintentsCreateIntentRequest
  * @throws IOException if the JSON string is invalid with respect to PaymentintentsCreateIntentRequest
  */
  public static PaymentintentsCreateIntentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentintentsCreateIntentRequest.class);
  }

 /**
  * Convert an instance of PaymentintentsCreateIntentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

