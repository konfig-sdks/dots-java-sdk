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
 * BusinessComplianceInfoContactInfo
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BusinessComplianceInfoContactInfo {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_LINE1 = "line1";
  @SerializedName(SERIALIZED_NAME_LINE1)
  private String line1;

  public static final String SERIALIZED_NAME_LINE2 = "line2";
  @SerializedName(SERIALIZED_NAME_LINE2)
  private String line2;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_ZIP = "zip";
  @SerializedName(SERIALIZED_NAME_ZIP)
  private String zip;

  public BusinessComplianceInfoContactInfo() {
  }

  public BusinessComplianceInfoContactInfo city(String city) {
    
    
    if (city != null && city.length() < 1) {
      throw new IllegalArgumentException("Invalid value for city. Length must be greater than or equal to 1.");
    }
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    
    
    if (city != null && city.length() < 1) {
      throw new IllegalArgumentException("Invalid value for city. Length must be greater than or equal to 1.");
    }
    this.city = city;
  }


  public BusinessComplianceInfoContactInfo country(String country) {
    
    
    if (country != null && country.length() < 2) {
      throw new IllegalArgumentException("Invalid value for country. Length must be greater than or equal to 2.");
    }
    
    this.country = country;
    return this;
  }

   /**
   * Country name or country code
   * @return country
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Country name or country code")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    
    
    if (country != null && country.length() < 2) {
      throw new IllegalArgumentException("Invalid value for country. Length must be greater than or equal to 2.");
    }
    this.country = country;
  }


  public BusinessComplianceInfoContactInfo email(String email) {
    
    
    if (email != null && email.length() < 3) {
      throw new IllegalArgumentException("Invalid value for email. Length must be greater than or equal to 3.");
    }
    
    this.email = email;
    return this;
  }

   /**
   * Primary contact email address. Service emails will be sent to this address.
   * @return email
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Primary contact email address. Service emails will be sent to this address.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    if (email != null && email.length() < 3) {
      throw new IllegalArgumentException("Invalid value for email. Length must be greater than or equal to 3.");
    }
    this.email = email;
  }


  public BusinessComplianceInfoContactInfo line1(String line1) {
    
    
    if (line1 != null && line1.length() < 1) {
      throw new IllegalArgumentException("Invalid value for line1. Length must be greater than or equal to 1.");
    }
    
    this.line1 = line1;
    return this;
  }

   /**
   * Address line 1
   * @return line1
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Address line 1")

  public String getLine1() {
    return line1;
  }


  public void setLine1(String line1) {
    
    
    if (line1 != null && line1.length() < 1) {
      throw new IllegalArgumentException("Invalid value for line1. Length must be greater than or equal to 1.");
    }
    this.line1 = line1;
  }


  public BusinessComplianceInfoContactInfo line2(String line2) {
    
    
    if (line2 != null && line2.length() < 1) {
      throw new IllegalArgumentException("Invalid value for line2. Length must be greater than or equal to 1.");
    }
    
    this.line2 = line2;
    return this;
  }

   /**
   * Address line 2
   * @return line2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address line 2")

  public String getLine2() {
    return line2;
  }


  public void setLine2(String line2) {
    
    
    if (line2 != null && line2.length() < 1) {
      throw new IllegalArgumentException("Invalid value for line2. Length must be greater than or equal to 1.");
    }
    this.line2 = line2;
  }


  public BusinessComplianceInfoContactInfo phoneNumber(String phoneNumber) {
    
    
    if (phoneNumber != null && phoneNumber.length() < 3) {
      throw new IllegalArgumentException("Invalid value for phoneNumber. Length must be greater than or equal to 3.");
    }
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    
    
    if (phoneNumber != null && phoneNumber.length() < 3) {
      throw new IllegalArgumentException("Invalid value for phoneNumber. Length must be greater than or equal to 3.");
    }
    this.phoneNumber = phoneNumber;
  }


  public BusinessComplianceInfoContactInfo state(String state) {
    
    
    if (state != null && state.length() < 2) {
      throw new IllegalArgumentException("Invalid value for state. Length must be greater than or equal to 2.");
    }
    
    this.state = state;
    return this;
  }

   /**
   * State when applicable
   * @return state
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "State when applicable")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    
    
    if (state != null && state.length() < 2) {
      throw new IllegalArgumentException("Invalid value for state. Length must be greater than or equal to 2.");
    }
    this.state = state;
  }


  public BusinessComplianceInfoContactInfo zip(String zip) {
    
    
    if (zip != null && zip.length() < 3) {
      throw new IllegalArgumentException("Invalid value for zip. Length must be greater than or equal to 3.");
    }
    
    this.zip = zip;
    return this;
  }

   /**
   * ZIP or postal code
   * @return zip
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ZIP or postal code")

  public String getZip() {
    return zip;
  }


  public void setZip(String zip) {
    
    
    if (zip != null && zip.length() < 3) {
      throw new IllegalArgumentException("Invalid value for zip. Length must be greater than or equal to 3.");
    }
    this.zip = zip;
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
   * @return the BusinessComplianceInfoContactInfo instance itself
   */
  public BusinessComplianceInfoContactInfo putAdditionalProperty(String key, Object value) {
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
    BusinessComplianceInfoContactInfo businessComplianceInfoContactInfo = (BusinessComplianceInfoContactInfo) o;
    return Objects.equals(this.city, businessComplianceInfoContactInfo.city) &&
        Objects.equals(this.country, businessComplianceInfoContactInfo.country) &&
        Objects.equals(this.email, businessComplianceInfoContactInfo.email) &&
        Objects.equals(this.line1, businessComplianceInfoContactInfo.line1) &&
        Objects.equals(this.line2, businessComplianceInfoContactInfo.line2) &&
        Objects.equals(this.phoneNumber, businessComplianceInfoContactInfo.phoneNumber) &&
        Objects.equals(this.state, businessComplianceInfoContactInfo.state) &&
        Objects.equals(this.zip, businessComplianceInfoContactInfo.zip)&&
        Objects.equals(this.additionalProperties, businessComplianceInfoContactInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, email, line1, line2, phoneNumber, state, zip, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessComplianceInfoContactInfo {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
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
    openapiFields.add("city");
    openapiFields.add("country");
    openapiFields.add("email");
    openapiFields.add("line1");
    openapiFields.add("line2");
    openapiFields.add("phone_number");
    openapiFields.add("state");
    openapiFields.add("zip");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("city");
    openapiRequiredFields.add("country");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("line1");
    openapiRequiredFields.add("phone_number");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("zip");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BusinessComplianceInfoContactInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BusinessComplianceInfoContactInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessComplianceInfoContactInfo is not found in the empty JSON string", BusinessComplianceInfoContactInfo.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BusinessComplianceInfoContactInfo.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if (!jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (!jsonObj.get("line1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `line1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("line1").toString()));
      }
      if ((jsonObj.get("line2") != null && !jsonObj.get("line2").isJsonNull()) && !jsonObj.get("line2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `line2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("line2").toString()));
      }
      if (!jsonObj.get("phone_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone_number").toString()));
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if (!jsonObj.get("zip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zip").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessComplianceInfoContactInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessComplianceInfoContactInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessComplianceInfoContactInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessComplianceInfoContactInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessComplianceInfoContactInfo>() {
           @Override
           public void write(JsonWriter out, BusinessComplianceInfoContactInfo value) throws IOException {
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
           public BusinessComplianceInfoContactInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BusinessComplianceInfoContactInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BusinessComplianceInfoContactInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessComplianceInfoContactInfo
  * @throws IOException if the JSON string is invalid with respect to BusinessComplianceInfoContactInfo
  */
  public static BusinessComplianceInfoContactInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessComplianceInfoContactInfo.class);
  }

 /**
  * Convert an instance of BusinessComplianceInfoContactInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
