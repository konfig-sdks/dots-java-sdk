# PaymentMethodsApi

All URIs are relative to *https://api.dots.dev/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**attachPaymentMethod**](PaymentMethodsApi.md#attachPaymentMethod) | **POST** /v2/payment-methods/{payment_method_id}/attach | Attach a Payment Method to a Payment Customer |
| [**detachPaymentMethod**](PaymentMethodsApi.md#detachPaymentMethod) | **POST** /v2/payment-methods/{payment_method_id}/detach | Detach Payment Method from a Payment Customer |
| [**getById**](PaymentMethodsApi.md#getById) | **GET** /v2/payment-methods/{payment_method_id} | Retrieve a Payment Method |
| [**listAllPaymentCustomer**](PaymentMethodsApi.md#listAllPaymentCustomer) | **GET** /v2/payment-methods | List all Payment Methods for a Payment Customer |


<a name="attachPaymentMethod"></a>
# **attachPaymentMethod**
> PaymentMethod attachPaymentMethod(paymentMethodId).paymentmethodsAttachPaymentMethodRequest(paymentmethodsAttachPaymentMethodRequest).execute();

Attach a Payment Method to a Payment Customer

Attach a payment method to a payment customer for future usage.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentMethodsApi;
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
    String customerId = "customerId_example"; // ID of the payment customer
    String paymentMethodId = "paymentMethodId_example"; // The ID of the payment method.
    try {
      PaymentMethod result = client
              .paymentMethods
              .attachPaymentMethod(customerId, paymentMethodId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getPlatform());
      System.out.println(result.getMask());
      System.out.println(result.getEmail());
      System.out.println(result.getPhoneNumber());
      System.out.println(result.getCashTag());
      System.out.println(result.getCountry());
      System.out.println(result.getCurrency());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentMethodsApi#attachPaymentMethod");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentMethod> response = client
              .paymentMethods
              .attachPaymentMethod(customerId, paymentMethodId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentMethodsApi#attachPaymentMethod");
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
| **paymentMethodId** | **String**| The ID of the payment method. | |
| **paymentmethodsAttachPaymentMethodRequest** | [**PaymentmethodsAttachPaymentMethodRequest**](PaymentmethodsAttachPaymentMethodRequest.md)|  | [optional] |

### Return type

[**PaymentMethod**](PaymentMethod.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="detachPaymentMethod"></a>
# **detachPaymentMethod**
> PaymentMethod detachPaymentMethod(paymentMethodId).paymentmethodsDetachPaymentMethodRequest(paymentmethodsDetachPaymentMethodRequest).execute();

Detach Payment Method from a Payment Customer

Detach a payment method from a payment customer

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentMethodsApi;
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
    String paymentMethodId = "paymentMethodId_example"; // ID of the payment method.
    String customerId = "customerId_example"; // ID of the payment customer to detach the payment method from.
    try {
      PaymentMethod result = client
              .paymentMethods
              .detachPaymentMethod(paymentMethodId)
              .customerId(customerId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getPlatform());
      System.out.println(result.getMask());
      System.out.println(result.getEmail());
      System.out.println(result.getPhoneNumber());
      System.out.println(result.getCashTag());
      System.out.println(result.getCountry());
      System.out.println(result.getCurrency());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentMethodsApi#detachPaymentMethod");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentMethod> response = client
              .paymentMethods
              .detachPaymentMethod(paymentMethodId)
              .customerId(customerId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentMethodsApi#detachPaymentMethod");
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
| **paymentMethodId** | **String**| ID of the payment method. | |
| **paymentmethodsDetachPaymentMethodRequest** | [**PaymentmethodsDetachPaymentMethodRequest**](PaymentmethodsDetachPaymentMethodRequest.md)|  | [optional] |

### Return type

[**PaymentMethod**](PaymentMethod.md)

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
> PaymentMethod getById(paymentMethodId).execute();

Retrieve a Payment Method

Get a payment method by its ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentMethodsApi;
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
    String paymentMethodId = "paymentMethodId_example"; // ID of the payment method to get
    try {
      PaymentMethod result = client
              .paymentMethods
              .getById(paymentMethodId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getPlatform());
      System.out.println(result.getMask());
      System.out.println(result.getEmail());
      System.out.println(result.getPhoneNumber());
      System.out.println(result.getCashTag());
      System.out.println(result.getCountry());
      System.out.println(result.getCurrency());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentMethodsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentMethod> response = client
              .paymentMethods
              .getById(paymentMethodId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentMethodsApi#getById");
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
| **paymentMethodId** | **String**| ID of the payment method to get | |

### Return type

[**PaymentMethod**](PaymentMethod.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listAllPaymentCustomer"></a>
# **listAllPaymentCustomer**
> PaymentmethodsListAllPaymentCustomerResponse listAllPaymentCustomer().customerId(customerId).limit(limit).execute();

List all Payment Methods for a Payment Customer

Get the payment methods for a payment customer

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentMethodsApi;
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
    String customerId = "customerId_example"; // Payment Customer ID
    Double limit = 3.4D; // Number or payment methods to return
    try {
      PaymentmethodsListAllPaymentCustomerResponse result = client
              .paymentMethods
              .listAllPaymentCustomer()
              .customerId(customerId)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getHasMore());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentMethodsApi#listAllPaymentCustomer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentmethodsListAllPaymentCustomerResponse> response = client
              .paymentMethods
              .listAllPaymentCustomer()
              .customerId(customerId)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentMethodsApi#listAllPaymentCustomer");
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
| **customerId** | **String**| Payment Customer ID | [optional] |
| **limit** | **Double**| Number or payment methods to return | [optional] |

### Return type

[**PaymentmethodsListAllPaymentCustomerResponse**](PaymentmethodsListAllPaymentCustomerResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

