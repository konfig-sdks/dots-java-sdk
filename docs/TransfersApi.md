# TransfersApi

All URIs are relative to *https://api.dots.dev/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOrganizationTransfer**](TransfersApi.md#createOrganizationTransfer) | **POST** /v2/organization-transfers | Create an Organization Transfer |
| [**createTransfer**](TransfersApi.md#createTransfer) | **POST** /v2/transfers | Create a Transfer |
| [**getAll**](TransfersApi.md#getAll) | **GET** /v2/organization-transfers | List all Organization Transfers |
| [**getById**](TransfersApi.md#getById) | **GET** /v2/transfers/{transfer_id} | Get a Transfer |
| [**getById_0**](TransfersApi.md#getById_0) | **GET** /v2/organization-transfers/{transfer_id} | Get a Transfer |
| [**listAll**](TransfersApi.md#listAll) | **GET** /v2/transfers | List all Transfers |


<a name="createOrganizationTransfer"></a>
# **createOrganizationTransfer**
> Transfer createOrganizationTransfer().transfersCreateOrganizationTransferRequest(transfersCreateOrganizationTransferRequest).execute();

Create an Organization Transfer

Create a transfer for the organization&#39;s wallet to an api app.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransfersApi;
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
    Integer amount = 56; // The amount in cents to transfer. Negative amount transfers money from the `app` to the `user`.
    UUID apiAppId = UUID.randomUUID(); // API App ID to transact with.
    UUID idempotencyKey = UUID.randomUUID();
    Object metadata = null; // Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    try {
      Transfer result = client
              .transfers
              .createOrganizationTransfer(amount, apiAppId)
              .idempotencyKey(idempotencyKey)
              .metadata(metadata)
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
      System.err.println("Exception when calling TransfersApi#createOrganizationTransfer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Transfer> response = client
              .transfers
              .createOrganizationTransfer(amount, apiAppId)
              .idempotencyKey(idempotencyKey)
              .metadata(metadata)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransfersApi#createOrganizationTransfer");
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
| **transfersCreateOrganizationTransferRequest** | [**TransfersCreateOrganizationTransferRequest**](TransfersCreateOrganizationTransferRequest.md)|  | [optional] |

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
| **200** | OK |  -  |

<a name="createTransfer"></a>
# **createTransfer**
> Transfer createTransfer().transfersCreateTransferRequest(transfersCreateTransferRequest).execute();

Create a Transfer

Create a transfer.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransfersApi;
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
    Integer amount = 56; // The amount in cents to transfer. Negative amount transfers money from the `app` to the `user`.
    UUID userId = UUID.randomUUID(); // The user's id.
    Object taxExempt = null; // Transfers marked as `tax_exempt` will not be counted towards the 1099 threshold.
    Object idempotencyKey = null; // UUID that will be used to idempotently handle requests. Transfers with existing idempotency keys will be rejected.
    Object metadata = null; // Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    try {
      Transfer result = client
              .transfers
              .createTransfer(amount, userId)
              .taxExempt(taxExempt)
              .idempotencyKey(idempotencyKey)
              .metadata(metadata)
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
      System.err.println("Exception when calling TransfersApi#createTransfer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Transfer> response = client
              .transfers
              .createTransfer(amount, userId)
              .taxExempt(taxExempt)
              .idempotencyKey(idempotencyKey)
              .metadata(metadata)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransfersApi#createTransfer");
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
| **transfersCreateTransferRequest** | [**TransfersCreateTransferRequest**](TransfersCreateTransferRequest.md)|  | [optional] |

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
| **200** | OK |  -  |

<a name="getAll"></a>
# **getAll**
> TransfersGetAllResponse getAll().limit(limit).startingAfter(startingAfter).endingBefore(endingBefore).userId(userId).execute();

List all Organization Transfers

List all transfers to and from an Organization&#39;s wallet.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransfersApi;
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
    UUID userId = UUID.randomUUID(); // Include only results with this user ID attached.
    try {
      TransfersGetAllResponse result = client
              .transfers
              .getAll()
              .limit(limit)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .userId(userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMore());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransfersApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TransfersGetAllResponse> response = client
              .transfers
              .getAll()
              .limit(limit)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .userId(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransfersApi#getAll");
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
| **userId** | **UUID**| Include only results with this user ID attached. | [optional] |

### Return type

[**TransfersGetAllResponse**](TransfersGetAllResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getById"></a>
# **getById**
> Transfer getById(transferId).execute();

Get a Transfer

Get a transfer by its id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransfersApi;
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
    UUID transferId = UUID.randomUUID(); // Id of the transfer to fetch
    try {
      Transfer result = client
              .transfers
              .getById(transferId)
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
      System.err.println("Exception when calling TransfersApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Transfer> response = client
              .transfers
              .getById(transferId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransfersApi#getById");
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
| **transferId** | **UUID**| Id of the transfer to fetch | |

### Return type

[**Transfer**](Transfer.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getById_0"></a>
# **getById_0**
> Transfer getById_0(transferId).execute();

Get a Transfer

Get a transfer by its id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransfersApi;
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
    String transferId = "transferId_example"; // ID of the transfer to retrieve
    try {
      Transfer result = client
              .transfers
              .getById_0(transferId)
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
      System.err.println("Exception when calling TransfersApi#getById_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Transfer> response = client
              .transfers
              .getById_0(transferId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransfersApi#getById_0");
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
| **transferId** | **String**| ID of the transfer to retrieve | |

### Return type

[**Transfer**](Transfer.md)

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
> TransfersListAllResponse listAll().limit(limit).startingAfter(startingAfter).endingBefore(endingBefore).userId(userId).execute();

List all Transfers

List all transfers.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransfersApi;
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
    UUID userId = UUID.randomUUID(); // Include only results with this user ID attached.
    try {
      TransfersListAllResponse result = client
              .transfers
              .listAll()
              .limit(limit)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .userId(userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMore());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransfersApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TransfersListAllResponse> response = client
              .transfers
              .listAll()
              .limit(limit)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .userId(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransfersApi#listAll");
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
| **userId** | **UUID**| Include only results with this user ID attached. | [optional] |

### Return type

[**TransfersListAllResponse**](TransfersListAllResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

