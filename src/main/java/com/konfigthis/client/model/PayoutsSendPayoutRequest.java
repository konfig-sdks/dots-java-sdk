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
import com.konfigthis.client.model.PayoutsSendPayoutRequestDelivery;
import com.konfigthis.client.model.PayoutsSendPayoutRequestPayee;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
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
 * PayoutsSendPayoutRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PayoutsSendPayoutRequest {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private UUID userId;

  public static final String SERIALIZED_NAME_PAYEE = "payee";
  @SerializedName(SERIALIZED_NAME_PAYEE)
  private PayoutsSendPayoutRequestPayee payee;

  public static final String SERIALIZED_NAME_DELIVERY = "delivery";
  @SerializedName(SERIALIZED_NAME_DELIVERY)
  private PayoutsSendPayoutRequestDelivery delivery;

  public static final String SERIALIZED_NAME_FORCE_COLLECT_COMPLIANCE_INFORMATION = "force_collect_compliance_information";
  @SerializedName(SERIALIZED_NAME_FORCE_COLLECT_COMPLIANCE_INFORMATION)
  private Boolean forceCollectComplianceInformation = false;

  /**
   * Gets or Sets additionalSteps
   */
  @JsonAdapter(AdditionalStepsEnum.Adapter.class)
 public enum AdditionalStepsEnum {
    COMPLIANCE("compliance"),
    
    ID_VERIFICATION("id-verification"),
    
    BACKGROUND_CHECK("background-check"),
    
    MANAGE_PAYMENTS("manage-payments"),
    
    MANAGE_PAYOUTS("manage-payouts"),
    
    PAYOUT("payout"),
    
    REDIRECT("redirect");

    private String value;

    AdditionalStepsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AdditionalStepsEnum fromValue(String value) {
      for (AdditionalStepsEnum b : AdditionalStepsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AdditionalStepsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AdditionalStepsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AdditionalStepsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AdditionalStepsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ADDITIONAL_STEPS = "additional_steps";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_STEPS)
  private List<AdditionalStepsEnum> additionalSteps = null;

  public static final String SERIALIZED_NAME_TAX_EXEMPT = "tax_exempt";
  @SerializedName(SERIALIZED_NAME_TAX_EXEMPT)
  private Boolean taxExempt;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata = null;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_KEY = "idempotency_key";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_KEY)
  private Object idempotencyKey = null;

  /**
   * Overrides the setting for which party will pay fees on this payout. This takes precedence over the default for your application.
   */
  @JsonAdapter(PayoutFeePartyEnum.Adapter.class)
 public enum PayoutFeePartyEnum {
    USER("user"),
    
    PLATFORM("platform");

    private UUID value;

    PayoutFeePartyEnum(UUID value) {
      this.value = value;
    }

    public UUID getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PayoutFeePartyEnum fromValue(UUID value) {
      for (PayoutFeePartyEnum b : PayoutFeePartyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PayoutFeePartyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PayoutFeePartyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PayoutFeePartyEnum read(final JsonReader jsonReader) throws IOException {
        UUID value =  jsonReader.nextUUID();
        return PayoutFeePartyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYOUT_FEE_PARTY = "payout_fee_party";
  @SerializedName(SERIALIZED_NAME_PAYOUT_FEE_PARTY)
  private PayoutFeePartyEnum payoutFeeParty;

  public PayoutsSendPayoutRequest() {
  }

  public PayoutsSendPayoutRequest amount(Integer amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount in cents to pay the user.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The amount in cents to pay the user.")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    
    
    
    this.amount = amount;
  }


  public PayoutsSendPayoutRequest userId(UUID userId) {
    
    
    
    
    this.userId = userId;
    return this;
  }

   /**
   * The user&#39;s id. &#x60;user_id&#x60; or &#x60;payee&#x60; is required.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's id. `user_id` or `payee` is required.")

  public UUID getUserId() {
    return userId;
  }


  public void setUserId(UUID userId) {
    
    
    
    this.userId = userId;
  }


  public PayoutsSendPayoutRequest payee(PayoutsSendPayoutRequestPayee payee) {
    
    
    
    
    this.payee = payee;
    return this;
  }

   /**
   * Get payee
   * @return payee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PayoutsSendPayoutRequestPayee getPayee() {
    return payee;
  }


  public void setPayee(PayoutsSendPayoutRequestPayee payee) {
    
    
    
    this.payee = payee;
  }


  public PayoutsSendPayoutRequest delivery(PayoutsSendPayoutRequestDelivery delivery) {
    
    
    
    
    this.delivery = delivery;
    return this;
  }

   /**
   * Get delivery
   * @return delivery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PayoutsSendPayoutRequestDelivery getDelivery() {
    return delivery;
  }


  public void setDelivery(PayoutsSendPayoutRequestDelivery delivery) {
    
    
    
    this.delivery = delivery;
  }


  public PayoutsSendPayoutRequest forceCollectComplianceInformation(Boolean forceCollectComplianceInformation) {
    
    
    
    
    this.forceCollectComplianceInformation = forceCollectComplianceInformation;
    return this;
  }

   /**
   * Collect 1099 or w8-ben information.
   * @return forceCollectComplianceInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Collect 1099 or w8-ben information.")

  public Boolean getForceCollectComplianceInformation() {
    return forceCollectComplianceInformation;
  }


  public void setForceCollectComplianceInformation(Boolean forceCollectComplianceInformation) {
    
    
    
    this.forceCollectComplianceInformation = forceCollectComplianceInformation;
  }


  public PayoutsSendPayoutRequest additionalSteps(List<AdditionalStepsEnum> additionalSteps) {
    
    
    
    
    this.additionalSteps = additionalSteps;
    return this;
  }

  public PayoutsSendPayoutRequest addAdditionalStepsItem(AdditionalStepsEnum additionalStepsItem) {
    if (this.additionalSteps == null) {
      this.additionalSteps = new ArrayList<>();
    }
    this.additionalSteps.add(additionalStepsItem);
    return this;
  }

   /**
   * Array of steps in the flow.
   * @return additionalSteps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of steps in the flow.")

  public List<AdditionalStepsEnum> getAdditionalSteps() {
    return additionalSteps;
  }


  public void setAdditionalSteps(List<AdditionalStepsEnum> additionalSteps) {
    
    
    
    this.additionalSteps = additionalSteps;
  }


  public PayoutsSendPayoutRequest taxExempt(Boolean taxExempt) {
    
    
    
    
    this.taxExempt = taxExempt;
    return this;
  }

   /**
   * Payouts marked as &#x60;tax_exempt&#x60; will not be counted towards the 1099 threshold.
   * @return taxExempt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Payouts marked as `tax_exempt` will not be counted towards the 1099 threshold.")

  public Boolean getTaxExempt() {
    return taxExempt;
  }


  public void setTaxExempt(Boolean taxExempt) {
    
    
    
    this.taxExempt = taxExempt;
  }


  public PayoutsSendPayoutRequest metadata(Object metadata) {
    
    
    
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.")

  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    
    
    
    this.metadata = metadata;
  }


  public PayoutsSendPayoutRequest memo(String memo) {
    
    
    
    
    this.memo = memo;
    return this;
  }

   /**
   * Add a memo to the top of the Payout Link
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Add a memo to the top of the Payout Link")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    
    
    
    this.memo = memo;
  }


  public PayoutsSendPayoutRequest idempotencyKey(Object idempotencyKey) {
    
    
    
    
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * Unique UUID key that prevents duplicate requests from being processed. If a payout link with the idempotency key exists, a new link will not be created and the existing link will be returned instead.
   * @return idempotencyKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique UUID key that prevents duplicate requests from being processed. If a payout link with the idempotency key exists, a new link will not be created and the existing link will be returned instead.")

  public Object getIdempotencyKey() {
    return idempotencyKey;
  }


  public void setIdempotencyKey(Object idempotencyKey) {
    
    
    
    this.idempotencyKey = idempotencyKey;
  }


  public PayoutsSendPayoutRequest payoutFeeParty(PayoutFeePartyEnum payoutFeeParty) {
    
    
    
    
    this.payoutFeeParty = payoutFeeParty;
    return this;
  }

   /**
   * Overrides the setting for which party will pay fees on this payout. This takes precedence over the default for your application.
   * @return payoutFeeParty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Overrides the setting for which party will pay fees on this payout. This takes precedence over the default for your application.")

  public PayoutFeePartyEnum getPayoutFeeParty() {
    return payoutFeeParty;
  }


  public void setPayoutFeeParty(PayoutFeePartyEnum payoutFeeParty) {
    
    
    
    this.payoutFeeParty = payoutFeeParty;
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
   * @return the PayoutsSendPayoutRequest instance itself
   */
  public PayoutsSendPayoutRequest putAdditionalProperty(String key, Object value) {
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
    PayoutsSendPayoutRequest payoutsSendPayoutRequest = (PayoutsSendPayoutRequest) o;
    return Objects.equals(this.amount, payoutsSendPayoutRequest.amount) &&
        Objects.equals(this.userId, payoutsSendPayoutRequest.userId) &&
        Objects.equals(this.payee, payoutsSendPayoutRequest.payee) &&
        Objects.equals(this.delivery, payoutsSendPayoutRequest.delivery) &&
        Objects.equals(this.forceCollectComplianceInformation, payoutsSendPayoutRequest.forceCollectComplianceInformation) &&
        Objects.equals(this.additionalSteps, payoutsSendPayoutRequest.additionalSteps) &&
        Objects.equals(this.taxExempt, payoutsSendPayoutRequest.taxExempt) &&
        Objects.equals(this.metadata, payoutsSendPayoutRequest.metadata) &&
        Objects.equals(this.memo, payoutsSendPayoutRequest.memo) &&
        Objects.equals(this.idempotencyKey, payoutsSendPayoutRequest.idempotencyKey) &&
        Objects.equals(this.payoutFeeParty, payoutsSendPayoutRequest.payoutFeeParty)&&
        Objects.equals(this.additionalProperties, payoutsSendPayoutRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, userId, payee, delivery, forceCollectComplianceInformation, additionalSteps, taxExempt, metadata, memo, idempotencyKey, payoutFeeParty, additionalProperties);
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
    sb.append("class PayoutsSendPayoutRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    payee: ").append(toIndentedString(payee)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
    sb.append("    forceCollectComplianceInformation: ").append(toIndentedString(forceCollectComplianceInformation)).append("\n");
    sb.append("    additionalSteps: ").append(toIndentedString(additionalSteps)).append("\n");
    sb.append("    taxExempt: ").append(toIndentedString(taxExempt)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    payoutFeeParty: ").append(toIndentedString(payoutFeeParty)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("user_id");
    openapiFields.add("payee");
    openapiFields.add("delivery");
    openapiFields.add("force_collect_compliance_information");
    openapiFields.add("additional_steps");
    openapiFields.add("tax_exempt");
    openapiFields.add("metadata");
    openapiFields.add("memo");
    openapiFields.add("idempotency_key");
    openapiFields.add("payout_fee_party");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PayoutsSendPayoutRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PayoutsSendPayoutRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PayoutsSendPayoutRequest is not found in the empty JSON string", PayoutsSendPayoutRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PayoutsSendPayoutRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonNull()) && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
      // validate the optional field `payee`
      if (jsonObj.get("payee") != null && !jsonObj.get("payee").isJsonNull()) {
        PayoutsSendPayoutRequestPayee.validateJsonObject(jsonObj.getAsJsonObject("payee"));
      }
      // validate the optional field `delivery`
      if (jsonObj.get("delivery") != null && !jsonObj.get("delivery").isJsonNull()) {
        PayoutsSendPayoutRequestDelivery.validateJsonObject(jsonObj.getAsJsonObject("delivery"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("additional_steps") != null && !jsonObj.get("additional_steps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `additional_steps` to be an array in the JSON string but got `%s`", jsonObj.get("additional_steps").toString()));
      }
      if ((jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonNull()) && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      if ((jsonObj.get("payout_fee_party") != null && !jsonObj.get("payout_fee_party").isJsonNull()) && !jsonObj.get("payout_fee_party").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payout_fee_party` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payout_fee_party").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PayoutsSendPayoutRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayoutsSendPayoutRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayoutsSendPayoutRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayoutsSendPayoutRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PayoutsSendPayoutRequest>() {
           @Override
           public void write(JsonWriter out, PayoutsSendPayoutRequest value) throws IOException {
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
           public PayoutsSendPayoutRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PayoutsSendPayoutRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PayoutsSendPayoutRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayoutsSendPayoutRequest
  * @throws IOException if the JSON string is invalid with respect to PayoutsSendPayoutRequest
  */
  public static PayoutsSendPayoutRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayoutsSendPayoutRequest.class);
  }

 /**
  * Convert an instance of PayoutsSendPayoutRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
