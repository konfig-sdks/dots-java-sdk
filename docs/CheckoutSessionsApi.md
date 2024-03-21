# CheckoutSessionsApi

All URIs are relative to *https://api.dots.dev/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSession**](CheckoutSessionsApi.md#createSession) | **POST** /v2/checkout-sessions | Create a Checkout Session |
| [**getById**](CheckoutSessionsApi.md#getById) | **GET** /v2/checkout-sessions/{checkout_session_id} | Retrieve a Checkout Session |
| [**listAll**](CheckoutSessionsApi.md#listAll) | **GET** /v2/checkout-sessions | List all Checkout Sessions |


<a name="createSession"></a>
# **createSession**
> CheckoutSession createSession().checkoutsessionsCreateSessionRequest(checkoutsessionsCreateSessionRequest).execute();

Create a Checkout Session

Create a checkout session

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CheckoutSessionsApi;
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
    Set<CheckoutsessionsCreateSessionRequestLineItemsInner> lineItems = Arrays.asList();
    URI successUrl = new URI();
    String mode = "payment";
    String customerEmail = "customerEmail_example";
    String clientReferenceId = "clientReferenceId_example";
    URI cancelUrl = new URI();
    UUID userId = UUID.randomUUID(); // Supply a Dots user ID in place of a customer ID
    UUID customerId = UUID.randomUUID();
    Integer expiresIn = 10800;
    Object metadata = null;
    try {
      CheckoutSession result = client
              .checkoutSessions
              .createSession(lineItems, successUrl, mode)
              .customerEmail(customerEmail)
              .clientReferenceId(clientReferenceId)
              .cancelUrl(cancelUrl)
              .userId(userId)
              .customerId(customerId)
              .expiresIn(expiresIn)
              .metadata(metadata)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getStatus());
      System.out.println(result.getPaymentIntentId());
      System.out.println(result.getSuccessUrl());
      System.out.println(result.getCancelUrl());
      System.out.println(result.getCheckoutSessionUrl());
      System.out.println(result.getClientReferenceId());
      System.out.println(result.getExpiry());
      System.out.println(result.getMetadata());
      System.out.println(result.getLineItems());
      System.out.println(result.getCreated());
      System.out.println(result.getUpdated());
      System.out.println(result.getCustomerId());
      System.out.println(result.getCustomerEmail());
      System.out.println(result.getAmountTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutSessionsApi#createSession");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CheckoutSession> response = client
              .checkoutSessions
              .createSession(lineItems, successUrl, mode)
              .customerEmail(customerEmail)
              .clientReferenceId(clientReferenceId)
              .cancelUrl(cancelUrl)
              .userId(userId)
              .customerId(customerId)
              .expiresIn(expiresIn)
              .metadata(metadata)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutSessionsApi#createSession");
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
| **checkoutsessionsCreateSessionRequest** | [**CheckoutsessionsCreateSessionRequest**](CheckoutsessionsCreateSessionRequest.md)|  | [optional] |

### Return type

[**CheckoutSession**](CheckoutSession.md)

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
> CheckoutSession getById(checkoutSessionId).execute();

Retrieve a Checkout Session

Retrieve a checkout session by an ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CheckoutSessionsApi;
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
    String checkoutSessionId = "checkoutSessionId_example"; // ID of the checkout session to retrieve
    try {
      CheckoutSession result = client
              .checkoutSessions
              .getById(checkoutSessionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getStatus());
      System.out.println(result.getPaymentIntentId());
      System.out.println(result.getSuccessUrl());
      System.out.println(result.getCancelUrl());
      System.out.println(result.getCheckoutSessionUrl());
      System.out.println(result.getClientReferenceId());
      System.out.println(result.getExpiry());
      System.out.println(result.getMetadata());
      System.out.println(result.getLineItems());
      System.out.println(result.getCreated());
      System.out.println(result.getUpdated());
      System.out.println(result.getCustomerId());
      System.out.println(result.getCustomerEmail());
      System.out.println(result.getAmountTotal());
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutSessionsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CheckoutSession> response = client
              .checkoutSessions
              .getById(checkoutSessionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutSessionsApi#getById");
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
| **checkoutSessionId** | **String**| ID of the checkout session to retrieve | |

### Return type

[**CheckoutSession**](CheckoutSession.md)

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
> CheckoutsessionsListAllResponse listAll().limit(limit).startingAfter(startingAfter).endingBefore(endingBefore).execute();

List all Checkout Sessions

List all checkout sessions

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CheckoutSessionsApi;
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
      CheckoutsessionsListAllResponse result = client
              .checkoutSessions
              .listAll()
              .limit(limit)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMore());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutSessionsApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CheckoutsessionsListAllResponse> response = client
              .checkoutSessions
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
      System.err.println("Exception when calling CheckoutSessionsApi#listAll");
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

[**CheckoutsessionsListAllResponse**](CheckoutsessionsListAllResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

