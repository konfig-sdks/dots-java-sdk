# PayoutRequestsApi

All URIs are relative to *https://api.dots.dev/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllPayouts**](PayoutRequestsApi.md#getAllPayouts) | **GET** /v2/payout-requests | List all Payout Requests |
| [**getPayoutById**](PayoutRequestsApi.md#getPayoutById) | **GET** /v2/payout-requests/{payout_request_id} | Retrieve a Payout Request |
| [**submitRequest**](PayoutRequestsApi.md#submitRequest) | **POST** /v2/payout-requests | Create a Payout Request |


<a name="getAllPayouts"></a>
# **getAllPayouts**
> PayoutrequestsGetAllPayoutsResponse getAllPayouts().limit(limit).startingAfter(startingAfter).endingBefore(endingBefore).execute();

List all Payout Requests

List all payout requests.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayoutRequestsApi;
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
    Integer limit = 56; // A limit on the number of objects to be returned, between 1 and 100.
    UUID startingAfter = UUID.randomUUID(); // A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `aaa`, your subsequent call can include `starting_after`=`aaa` in order to fetch the next page of the list.
    UUID endingBefore = UUID.randomUUID(); // A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `aaa`, your subsequent call can include `ending_before`=`aaa` in order to fetch the previous page of the list.
    try {
      PayoutrequestsGetAllPayoutsResponse result = client
              .payoutRequests
              .getAllPayouts()
              .limit(limit)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMore());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutRequestsApi#getAllPayouts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayoutrequestsGetAllPayoutsResponse> response = client
              .payoutRequests
              .getAllPayouts()
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
      System.err.println("Exception when calling PayoutRequestsApi#getAllPayouts");
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
| **limit** | **Integer**| A limit on the number of objects to be returned, between 1 and 100. | [optional] |
| **startingAfter** | **UUID**| A cursor for use in pagination. &#x60;starting_after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with &#x60;aaa&#x60;, your subsequent call can include &#x60;starting_after&#x60;&#x3D;&#x60;aaa&#x60; in order to fetch the next page of the list. | [optional] |
| **endingBefore** | **UUID**| A cursor for use in pagination. &#x60;ending_before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with &#x60;aaa&#x60;, your subsequent call can include &#x60;ending_before&#x60;&#x3D;&#x60;aaa&#x60; in order to fetch the previous page of the list. | [optional] |

### Return type

[**PayoutrequestsGetAllPayoutsResponse**](PayoutrequestsGetAllPayoutsResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getPayoutById"></a>
# **getPayoutById**
> PayoutRequest getPayoutById(payoutRequestId).execute();

Retrieve a Payout Request

Get a payout request by its id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayoutRequestsApi;
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
    String payoutRequestId = "payoutRequestId_example"; // Id of the payout request
    try {
      PayoutRequest result = client
              .payoutRequests
              .getPayoutById(payoutRequestId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCreated());
      System.out.println(result.getAmount());
      System.out.println(result.getStatus());
      System.out.println(result.getPayee());
      System.out.println(result.getPayoutLink());
      System.out.println(result.getUser());
      System.out.println(result.getMetadata());
      System.out.println(result.getMemo());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutRequestsApi#getPayoutById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayoutRequest> response = client
              .payoutRequests
              .getPayoutById(payoutRequestId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutRequestsApi#getPayoutById");
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
| **payoutRequestId** | **String**| Id of the payout request | |

### Return type

[**PayoutRequest**](PayoutRequest.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="submitRequest"></a>
# **submitRequest**
> PayoutRequest submitRequest().payoutrequestsSubmitRequestRequest(payoutrequestsSubmitRequestRequest).execute();

Create a Payout Request

Submit a payout request from a person when you know their phone number or user id. Once the payout request is approved, they will be sent a Payout Link to onboard and recieve funds.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayoutRequestsApi;
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
    Integer amount = 56; // The amount in cents to pay the user.
    UUID userId = UUID.randomUUID(); // The user's id. `user_id` or `payee` is required.
    PayoutsSendPayoutRequestPayee payee = new PayoutsSendPayoutRequestPayee();
    Object metadata = null; // Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    String memo = "memo_example"; // Add a memo to payout request
    try {
      PayoutRequest result = client
              .payoutRequests
              .submitRequest(amount)
              .userId(userId)
              .payee(payee)
              .metadata(metadata)
              .memo(memo)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCreated());
      System.out.println(result.getAmount());
      System.out.println(result.getStatus());
      System.out.println(result.getPayee());
      System.out.println(result.getPayoutLink());
      System.out.println(result.getUser());
      System.out.println(result.getMetadata());
      System.out.println(result.getMemo());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutRequestsApi#submitRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayoutRequest> response = client
              .payoutRequests
              .submitRequest(amount)
              .userId(userId)
              .payee(payee)
              .metadata(metadata)
              .memo(memo)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutRequestsApi#submitRequest");
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
| **payoutrequestsSubmitRequestRequest** | [**PayoutrequestsSubmitRequestRequest**](PayoutrequestsSubmitRequestRequest.md)|  | [optional] |

### Return type

[**PayoutRequest**](PayoutRequest.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

