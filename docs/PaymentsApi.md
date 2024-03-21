# PaymentsApi

All URIs are relative to *https://api.dots.dev/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTransaction**](PaymentsApi.md#createTransaction) | **POST** /v2/payments | Create a Payment |


<a name="createTransaction"></a>
# **createTransaction**
> Transfer createTransaction().body(body).execute();

Create a Payment

Creates a transaction from a user or a payment customer to the app. User the &#x60;/users/{user_id}/payout-methods&#x60; route to get a user&#39;s stored payment methods.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentsApi;
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
    try {
      Transfer result = client
              .payments
              .createTransaction()
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCreated());
      System.out.println(result.getUserId());
      System.out.println(result.getStatus());
      System.out.println(result.getType());
      System.out.println(result.getAmount());
      System.out.println(result.getExternalData());
      System.out.println(result.getTransactions());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#createTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Transfer> response = client
              .payments
              .createTransaction()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#createTransaction");
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
| **body** | **Object**|  | [optional] |

### Return type

[**Transfer**](Transfer.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

