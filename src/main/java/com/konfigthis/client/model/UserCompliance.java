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
 * UserCompliance
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UserCompliance {
  public static final String SERIALIZED_NAME_TAX_ID_COLLECTED = "tax_id_collected";
  @SerializedName(SERIALIZED_NAME_TAX_ID_COLLECTED)
  private Boolean taxIdCollected;

  public static final String SERIALIZED_NAME_ADDRESS_COLLECTED = "address_collected";
  @SerializedName(SERIALIZED_NAME_ADDRESS_COLLECTED)
  private Boolean addressCollected;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH_COLLECTED = "date_of_birth_collected";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH_COLLECTED)
  private Boolean dateOfBirthCollected;

  public static final String SERIALIZED_NAME_MUST_COLLECT1099 = "must_collect_1099";
  @SerializedName(SERIALIZED_NAME_MUST_COLLECT1099)
  private Boolean mustCollect1099;

  public static final String SERIALIZED_NAME_1099COLLECTED = "1099_collected";
  @SerializedName(SERIALIZED_NAME_1099COLLECTED)
  private Boolean _1099collected;

  public static final String SERIALIZED_NAME_W8_BEN_COLLECTED = "w8_ben_collected";
  @SerializedName(SERIALIZED_NAME_W8_BEN_COLLECTED)
  private Boolean w8BenCollected;

  public static final String SERIALIZED_NAME_FLAGGED = "flagged";
  @SerializedName(SERIALIZED_NAME_FLAGGED)
  private Boolean flagged;

  public static final String SERIALIZED_NAME_ID_VERIFIED = "id_verified";
  @SerializedName(SERIALIZED_NAME_ID_VERIFIED)
  private Boolean idVerified;

  public UserCompliance() {
  }

  public UserCompliance taxIdCollected(Boolean taxIdCollected) {
    
    
    
    
    this.taxIdCollected = taxIdCollected;
    return this;
  }

   /**
   * Get taxIdCollected
   * @return taxIdCollected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTaxIdCollected() {
    return taxIdCollected;
  }


  public void setTaxIdCollected(Boolean taxIdCollected) {
    
    
    
    this.taxIdCollected = taxIdCollected;
  }


  public UserCompliance addressCollected(Boolean addressCollected) {
    
    
    
    
    this.addressCollected = addressCollected;
    return this;
  }

   /**
   * Get addressCollected
   * @return addressCollected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAddressCollected() {
    return addressCollected;
  }


  public void setAddressCollected(Boolean addressCollected) {
    
    
    
    this.addressCollected = addressCollected;
  }


  public UserCompliance dateOfBirthCollected(Boolean dateOfBirthCollected) {
    
    
    
    
    this.dateOfBirthCollected = dateOfBirthCollected;
    return this;
  }

   /**
   * Get dateOfBirthCollected
   * @return dateOfBirthCollected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDateOfBirthCollected() {
    return dateOfBirthCollected;
  }


  public void setDateOfBirthCollected(Boolean dateOfBirthCollected) {
    
    
    
    this.dateOfBirthCollected = dateOfBirthCollected;
  }


  public UserCompliance mustCollect1099(Boolean mustCollect1099) {
    
    
    
    
    this.mustCollect1099 = mustCollect1099;
    return this;
  }

   /**
   * Get mustCollect1099
   * @return mustCollect1099
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMustCollect1099() {
    return mustCollect1099;
  }


  public void setMustCollect1099(Boolean mustCollect1099) {
    
    
    
    this.mustCollect1099 = mustCollect1099;
  }


  public UserCompliance _1099collected(Boolean _1099collected) {
    
    
    
    
    this._1099collected = _1099collected;
    return this;
  }

   /**
   * Get _1099collected
   * @return _1099collected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean get1099collected() {
    return _1099collected;
  }


  public void set1099collected(Boolean _1099collected) {
    
    
    
    this._1099collected = _1099collected;
  }


  public UserCompliance w8BenCollected(Boolean w8BenCollected) {
    
    
    
    
    this.w8BenCollected = w8BenCollected;
    return this;
  }

   /**
   * Get w8BenCollected
   * @return w8BenCollected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getW8BenCollected() {
    return w8BenCollected;
  }


  public void setW8BenCollected(Boolean w8BenCollected) {
    
    
    
    this.w8BenCollected = w8BenCollected;
  }


  public UserCompliance flagged(Boolean flagged) {
    
    
    
    
    this.flagged = flagged;
    return this;
  }

   /**
   * Get flagged
   * @return flagged
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getFlagged() {
    return flagged;
  }


  public void setFlagged(Boolean flagged) {
    
    
    
    this.flagged = flagged;
  }


  public UserCompliance idVerified(Boolean idVerified) {
    
    
    
    
    this.idVerified = idVerified;
    return this;
  }

   /**
   * Get idVerified
   * @return idVerified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIdVerified() {
    return idVerified;
  }


  public void setIdVerified(Boolean idVerified) {
    
    
    
    this.idVerified = idVerified;
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
   * @return the UserCompliance instance itself
   */
  public UserCompliance putAdditionalProperty(String key, Object value) {
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
    UserCompliance userCompliance = (UserCompliance) o;
    return Objects.equals(this.taxIdCollected, userCompliance.taxIdCollected) &&
        Objects.equals(this.addressCollected, userCompliance.addressCollected) &&
        Objects.equals(this.dateOfBirthCollected, userCompliance.dateOfBirthCollected) &&
        Objects.equals(this.mustCollect1099, userCompliance.mustCollect1099) &&
        Objects.equals(this._1099collected, userCompliance._1099collected) &&
        Objects.equals(this.w8BenCollected, userCompliance.w8BenCollected) &&
        Objects.equals(this.flagged, userCompliance.flagged) &&
        Objects.equals(this.idVerified, userCompliance.idVerified)&&
        Objects.equals(this.additionalProperties, userCompliance.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxIdCollected, addressCollected, dateOfBirthCollected, mustCollect1099, _1099collected, w8BenCollected, flagged, idVerified, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCompliance {\n");
    sb.append("    taxIdCollected: ").append(toIndentedString(taxIdCollected)).append("\n");
    sb.append("    addressCollected: ").append(toIndentedString(addressCollected)).append("\n");
    sb.append("    dateOfBirthCollected: ").append(toIndentedString(dateOfBirthCollected)).append("\n");
    sb.append("    mustCollect1099: ").append(toIndentedString(mustCollect1099)).append("\n");
    sb.append("    _1099collected: ").append(toIndentedString(_1099collected)).append("\n");
    sb.append("    w8BenCollected: ").append(toIndentedString(w8BenCollected)).append("\n");
    sb.append("    flagged: ").append(toIndentedString(flagged)).append("\n");
    sb.append("    idVerified: ").append(toIndentedString(idVerified)).append("\n");
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
    openapiFields.add("tax_id_collected");
    openapiFields.add("address_collected");
    openapiFields.add("date_of_birth_collected");
    openapiFields.add("must_collect_1099");
    openapiFields.add("1099_collected");
    openapiFields.add("w8_ben_collected");
    openapiFields.add("flagged");
    openapiFields.add("id_verified");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserCompliance
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UserCompliance.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserCompliance is not found in the empty JSON string", UserCompliance.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserCompliance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserCompliance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserCompliance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserCompliance.class));

       return (TypeAdapter<T>) new TypeAdapter<UserCompliance>() {
           @Override
           public void write(JsonWriter out, UserCompliance value) throws IOException {
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
           public UserCompliance read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UserCompliance instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UserCompliance given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserCompliance
  * @throws IOException if the JSON string is invalid with respect to UserCompliance
  */
  public static UserCompliance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserCompliance.class);
  }

 /**
  * Convert an instance of UserCompliance to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
