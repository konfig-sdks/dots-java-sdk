# PaymentIntentsApi

All URIs are relative to *https://api.dots.dev/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**confirmIntent**](PaymentIntentsApi.md#confirmIntent) | **POST** /v2/payment-intents/{payment_intent_id}/confirm | Confirm a Payment Intent |
| [**createIntent**](PaymentIntentsApi.md#createIntent) | **POST** /v2/payment-intents | Create a Payment Intent |
| [**getById**](PaymentIntentsApi.md#getById) | **GET** /v2/payment-intents/{payment_intent_id} | Retrieve a Payment Intent |
| [**listAll**](PaymentIntentsApi.md#listAll) | **GET** /v2/payment-intents | List all Payment Intents |


<a name="confirmIntent"></a>
# **confirmIntent**
> PaymentIntent confirmIntent(paymentIntentId).paymentintentsConfirmIntentRequest(paymentintentsConfirmIntentRequest).execute();

Confirm a Payment Intent

Confirm a payment intent that has not been confirmed yet.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentIntentsApi;
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
    String paymentMethodId = "paymentMethodId_example"; // ID of the payment method to confirm the intent with.
    String paymentIntentId = "paymentIntentId_example"; // The ID if the Payment Intent to confirm.
    try {
      PaymentIntent result = client
              .paymentIntents
              .confirmIntent(paymentMethodId, paymentIntentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getAmount());
      System.out.println(result.getCurrency());
      System.out.println(result.getUserId());
      System.out.println(result.getStatus());
      System.out.println(result.getTransferId());
      System.out.println(result.getPaymentMethodId());
      System.out.println(result.getMetadata());
      System.out.println(result.getClientSecret());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentIntentsApi#confirmIntent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentIntent> response = client
              .paymentIntents
              .confirmIntent(paymentMethodId, paymentIntentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentIntentsApi#confirmIntent");
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
| **paymentIntentId** | **String**| The ID if the Payment Intent to confirm. | |
| **paymentintentsConfirmIntentRequest** | [**PaymentintentsConfirmIntentRequest**](PaymentintentsConfirmIntentRequest.md)|  | [optional] |

### Return type

[**PaymentIntent**](PaymentIntent.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createIntent"></a>
# **createIntent**
> PaymentIntent createIntent().paymentintentsCreateIntentRequest(paymentintentsCreateIntentRequest).execute();

Create a Payment Intent

Create a Payment Intent

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentIntentsApi;
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
    Integer amount = 56; // Amount in cents
    String currency = "usd"; // Currency of the payment. Currently only `usd` is supported.
    String description = "description_example"; // An arbitrary string attached to the object. Often useful for displaying to users.
    Boolean confirm = false; // Set to `true` to attempt to confirm this payment intent immediately. Defaults to `false`.
    UUID userId = UUID.randomUUID(); // ID of a Dots `user` making this payment.
    UUID customerId = UUID.randomUUID(); // ID of a Dots `payment_customer` making this payment.
    UUID paymentMethodId = UUID.randomUUID(); // ID of the payment method to attach to this payment intent.
    List<String> paymentMethodTypes = Arrays.asList(); // Currently only `card` is supported.
    String setupFutureUsage = "on_session";
    Boolean metadata = true; // Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    PaymentintentsCreateIntentRequestTransferData transferData = new PaymentintentsCreateIntentRequestTransferData();
    Integer applicationFeeAmount = 56; // Amount in cents to transfer to the application's wallet as a platform fee.
    try {
      PaymentIntent result = client
              .paymentIntents
              .createIntent(amount, currency)
              .description(description)
              .confirm(confirm)
              .userId(userId)
              .customerId(customerId)
              .paymentMethodId(paymentMethodId)
              .paymentMethodTypes(paymentMethodTypes)
              .setupFutureUsage(setupFutureUsage)
              .metadata(metadata)
              .transferData(transferData)
              .applicationFeeAmount(applicationFeeAmount)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getAmount());
      System.out.println(result.getCurrency());
      System.out.println(result.getUserId());
      System.out.println(result.getStatus());
      System.out.println(result.getTransferId());
      System.out.println(result.getPaymentMethodId());
      System.out.println(result.getMetadata());
      System.out.println(result.getClientSecret());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentIntentsApi#createIntent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentIntent> response = client
              .paymentIntents
              .createIntent(amount, currency)
              .description(description)
              .confirm(confirm)
              .userId(userId)
              .customerId(customerId)
              .paymentMethodId(paymentMethodId)
              .paymentMethodTypes(paymentMethodTypes)
              .setupFutureUsage(setupFutureUsage)
              .metadata(metadata)
              .transferData(transferData)
              .applicationFeeAmount(applicationFeeAmount)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentIntentsApi#createIntent");
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
| **paymentintentsCreateIntentRequest** | [**PaymentintentsCreateIntentRequest**](PaymentintentsCreateIntentRequest.md)|  | [optional] |

### Return type

[**PaymentIntent**](PaymentIntent.md)

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
> PaymentIntent getById(paymentIntentId).execute();

Retrieve a Payment Intent

Retrieve a payment intent by its ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentIntentsApi;
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
    String paymentIntentId = "paymentIntentId_example"; // Payment Intent ID
    try {
      PaymentIntent result = client
              .paymentIntents
              .getById(paymentIntentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getAmount());
      System.out.println(result.getCurrency());
      System.out.println(result.getUserId());
      System.out.println(result.getStatus());
      System.out.println(result.getTransferId());
      System.out.println(result.getPaymentMethodId());
      System.out.println(result.getMetadata());
      System.out.println(result.getClientSecret());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentIntentsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentIntent> response = client
              .paymentIntents
              .getById(paymentIntentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentIntentsApi#getById");
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
| **paymentIntentId** | **String**| Payment Intent ID | |

### Return type

[**PaymentIntent**](PaymentIntent.md)

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
> List&lt;PaymentIntent&gt; listAll().execute();

List all Payment Intents

Get all payment intents

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentIntentsApi;
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
      List<PaymentIntent> result = client
              .paymentIntents
              .listAll()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentIntentsApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PaymentIntent>> response = client
              .paymentIntents
              .listAll()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentIntentsApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PaymentIntent&gt;**](PaymentIntent.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

