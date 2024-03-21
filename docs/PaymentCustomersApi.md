# PaymentCustomersApi

All URIs are relative to *https://api.dots.dev/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomer**](PaymentCustomersApi.md#createCustomer) | **POST** /v2/payment-customers | Create a Payment Customer |
| [**getById**](PaymentCustomersApi.md#getById) | **GET** /v2/payment-customers/{payment_customer_id} | Retrieve a Payment Customer |
| [**listAll**](PaymentCustomersApi.md#listAll) | **GET** /v2/payment-customers | List all Payment Customers |


<a name="createCustomer"></a>
# **createCustomer**
> PaymentcustomersCreateCustomerResponse createCustomer().paymentCustomer(paymentCustomer).execute();

Create a Payment Customer

Create a Payment Customer

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentCustomersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.dots.dev/api";
    
    // Configure HTTP basic authorization: api_key
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    Dots client = new Dots(configuration);
    UUID id = UUID.randomUUID();
    UUID userId = UUID.randomUUID();
    String email = "email_example";
    String countryCode = "countryCode_example";
    String phoneNumber = "phoneNumber_example";
    String firstName = "firstName_example";
    String middleName = "middleName_example";
    String lastName = "lastName_example";
    Object metadata = null;
    OffsetDateTime created = OffsetDateTime.now();
    OffsetDateTime updated = OffsetDateTime.now();
    try {
      PaymentcustomersCreateCustomerResponse result = client
              .paymentCustomers
              .createCustomer()
              .id(id)
              .userId(userId)
              .email(email)
              .countryCode(countryCode)
              .phoneNumber(phoneNumber)
              .firstName(firstName)
              .middleName(middleName)
              .lastName(lastName)
              .metadata(metadata)
              .created(created)
              .updated(updated)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUserId());
      System.out.println(result.getEmail());
      System.out.println(result.getCountryCode());
      System.out.println(result.getPhoneNumber());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentCustomersApi#createCustomer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentcustomersCreateCustomerResponse> response = client
              .paymentCustomers
              .createCustomer()
              .id(id)
              .userId(userId)
              .email(email)
              .countryCode(countryCode)
              .phoneNumber(phoneNumber)
              .firstName(firstName)
              .middleName(middleName)
              .lastName(lastName)
              .metadata(metadata)
              .created(created)
              .updated(updated)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentCustomersApi#createCustomer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **paymentCustomer** | [**PaymentCustomer**](PaymentCustomer.md)|  | [optional] |

### Return type

[**PaymentcustomersCreateCustomerResponse**](PaymentcustomersCreateCustomerResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getById"></a>
# **getById**
> PaymentCustomer getById(paymentCustomerId).execute();

Retrieve a Payment Customer

Get a payment customer by ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentCustomersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.dots.dev/api";
    
    // Configure HTTP basic authorization: api_key
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    Dots client = new Dots(configuration);
    String paymentCustomerId = "paymentCustomerId_example"; // The ID of the payment customer
    try {
      PaymentCustomer result = client
              .paymentCustomers
              .getById(paymentCustomerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUserId());
      System.out.println(result.getEmail());
      System.out.println(result.getCountryCode());
      System.out.println(result.getPhoneNumber());
      System.out.println(result.getFirstName());
      System.out.println(result.getMiddleName());
      System.out.println(result.getLastName());
      System.out.println(result.getMetadata());
      System.out.println(result.getCreated());
      System.out.println(result.getUpdated());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentCustomersApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentCustomer> response = client
              .paymentCustomers
              .getById(paymentCustomerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentCustomersApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **paymentCustomerId** | **String**| The ID of the payment customer | |

### Return type

[**PaymentCustomer**](PaymentCustomer.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listAll"></a>
# **listAll**
> PaymentcustomersListAllResponse listAll().limit(limit).startingAfter(startingAfter).endingBefore(endingBefore).execute();

List all Payment Customers

List all payment customers

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentCustomersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.dots.dev/api";
    
    // Configure HTTP basic authorization: api_key
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    Dots client = new Dots(configuration);
    String limit = "limit_example"; // A limit on the number of objects to be returned, between 1 and 100.
    String startingAfter = "startingAfter_example"; // A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `aaa`, your subsequent call can include `starting_after`=`aaa` in order to fetch the next page of the list.
    String endingBefore = "endingBefore_example"; // A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `aaa`, your subsequent call can include `ending_before`=`aaa` in order to fetch the previous page of the list.
    try {
      PaymentcustomersListAllResponse result = client
              .paymentCustomers
              .listAll()
              .limit(limit)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getHasMore());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentCustomersApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentcustomersListAllResponse> response = client
              .paymentCustomers
              .listAll()
              .limit(limit)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentCustomersApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **String**| A limit on the number of objects to be returned, between 1 and 100. | [optional] |
| **startingAfter** | **String**| A cursor for use in pagination. &#x60;starting_after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with &#x60;aaa&#x60;, your subsequent call can include &#x60;starting_after&#x60;&#x3D;&#x60;aaa&#x60; in order to fetch the next page of the list. | [optional] |
| **endingBefore** | **String**| A cursor for use in pagination. &#x60;ending_before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with &#x60;aaa&#x60;, your subsequent call can include &#x60;ending_before&#x60;&#x3D;&#x60;aaa&#x60; in order to fetch the previous page of the list. | [optional] |

### Return type

[**PaymentcustomersListAllResponse**](PaymentcustomersListAllResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

