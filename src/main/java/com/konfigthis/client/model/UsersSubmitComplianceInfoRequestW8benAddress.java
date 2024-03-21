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
 * Address of the user or their business.
 */
@ApiModel(description = "Address of the user or their business.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UsersSubmitComplianceInfoRequestW8benAddress {
  public static final String SERIALIZED_NAME_LINE1 = "line_1";
  @SerializedName(SERIALIZED_NAME_LINE1)
  private String line1;

  public static final String SERIALIZED_NAME_LINE2 = "line_2";
  @SerializedName(SERIALIZED_NAME_LINE2)
  private String line2;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_POSTCODE = "postcode";
  @SerializedName(SERIALIZED_NAME_POSTCODE)
  private String postcode;

  public UsersSubmitComplianceInfoRequestW8benAddress() {
  }

  public UsersSubmitComplianceInfoRequestW8benAddress line1(String line1) {
    
    
    
    
    this.line1 = line1;
    return this;
  }

   /**
   * Address line 1.
   * @return line1
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Address line 1.")

  public String getLine1() {
    return line1;
  }


  public void setLine1(String line1) {
    
    
    
    this.line1 = line1;
  }


  public UsersSubmitComplianceInfoRequestW8benAddress line2(String line2) {
    
    
    
    
    this.line2 = line2;
    return this;
  }

   /**
   * Address line 2.
   * @return line2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address line 2.")

  public String getLine2() {
    return line2;
  }


  public void setLine2(String line2) {
    
    
    
    this.line2 = line2;
  }


  public UsersSubmitComplianceInfoRequestW8benAddress city(String city) {
    
    
    
    
    this.city = city;
    return this;
  }

   /**
   * City.
   * @return city
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "City.")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    
    
    
    this.city = city;
  }


  public UsersSubmitComplianceInfoRequestW8benAddress state(String state) {
    
    
    
    
    this.state = state;
    return this;
  }

   /**
   * State.
   * @return state
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "State.")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    
    
    
    this.state = state;
  }


  public UsersSubmitComplianceInfoRequestW8benAddress country(String country) {
    
    
    
    
    this.country = country;
    return this;
  }

   /**
   * Country.
   * @return country
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Country.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    
    
    
    this.country = country;
  }


  public UsersSubmitComplianceInfoRequestW8benAddress postcode(String postcode) {
    
    
    
    
    this.postcode = postcode;
    return this;
  }

   /**
   * Postal code or Zip Code.
   * @return postcode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Postal code or Zip Code.")

  public String getPostcode() {
    return postcode;
  }


  public void setPostcode(String postcode) {
    
    
    
    this.postcode = postcode;
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
   * @return the UsersSubmitComplianceInfoRequestW8benAddress instance itself
   */
  public UsersSubmitComplianceInfoRequestW8benAddress putAdditionalProperty(String key, Object value) {
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
    UsersSubmitComplianceInfoRequestW8benAddress usersSubmitComplianceInfoRequestW8benAddress = (UsersSubmitComplianceInfoRequestW8benAddress) o;
    return Objects.equals(this.line1, usersSubmitComplianceInfoRequestW8benAddress.line1) &&
        Objects.equals(this.line2, usersSubmitComplianceInfoRequestW8benAddress.line2) &&
        Objects.equals(this.city, usersSubmitComplianceInfoRequestW8benAddress.city) &&
        Objects.equals(this.state, usersSubmitComplianceInfoRequestW8benAddress.state) &&
        Objects.equals(this.country, usersSubmitComplianceInfoRequestW8benAddress.country) &&
        Objects.equals(this.postcode, usersSubmitComplianceInfoRequestW8benAddress.postcode)&&
        Objects.equals(this.additionalProperties, usersSubmitComplianceInfoRequestW8benAddress.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(line1, line2, city, state, country, postcode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersSubmitComplianceInfoRequestW8benAddress {\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
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
    openapiFields.add("line_1");
    openapiFields.add("line_2");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("country");
    openapiFields.add("postcode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("line_1");
    openapiRequiredFields.add("city");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("country");
    openapiRequiredFields.add("postcode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UsersSubmitComplianceInfoRequestW8benAddress
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UsersSubmitComplianceInfoRequestW8benAddress.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UsersSubmitComplianceInfoRequestW8benAddress is not found in the empty JSON string", UsersSubmitComplianceInfoRequestW8benAddress.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UsersSubmitComplianceInfoRequestW8benAddress.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("line_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `line_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("line_1").toString()));
      }
      if ((jsonObj.get("line_2") != null && !jsonObj.get("line_2").isJsonNull()) && !jsonObj.get("line_2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `line_2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("line_2").toString()));
      }
      if (!jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if (!jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if (!jsonObj.get("postcode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postcode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postcode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UsersSubmitComplianceInfoRequestW8benAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UsersSubmitComplianceInfoRequestW8benAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UsersSubmitComplianceInfoRequestW8benAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UsersSubmitComplianceInfoRequestW8benAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<UsersSubmitComplianceInfoRequestW8benAddress>() {
           @Override
           public void write(JsonWriter out, UsersSubmitComplianceInfoRequestW8benAddress value) throws IOException {
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
           public UsersSubmitComplianceInfoRequestW8benAddress read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UsersSubmitComplianceInfoRequestW8benAddress instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UsersSubmitComplianceInfoRequestW8benAddress given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UsersSubmitComplianceInfoRequestW8benAddress
  * @throws IOException if the JSON string is invalid with respect to UsersSubmitComplianceInfoRequestW8benAddress
  */
  public static UsersSubmitComplianceInfoRequestW8benAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UsersSubmitComplianceInfoRequestW8benAddress.class);
  }

 /**
  * Convert an instance of UsersSubmitComplianceInfoRequestW8benAddress to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
