# TransferBatchesApi

All URIs are relative to *https://api.dots.dev/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBatch**](TransferBatchesApi.md#createBatch) | **POST** /v2/transfer-batches | Create a Transfer Batch |
| [**getById**](TransferBatchesApi.md#getById) | **GET** /v2/transfer-batches/{transfer_batch_id} | Retrieve a Transfer Batch |
| [**listAll**](TransferBatchesApi.md#listAll) | **GET** /v2/transfer-batches | List all Transfer Batches |


<a name="createBatch"></a>
# **createBatch**
> TransferbatchesCreateBatchResponse createBatch().transferbatchesCreateBatchRequest(transferbatchesCreateBatchRequest).execute();

Create a Transfer Batch

Create a transfer batch

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransferBatchesApi;
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
    List<TransferbatchesCreateBatchRequestItemsInner> items = Arrays.asList();
    UUID idempotencyKey = UUID.randomUUID();
    Object metadata = null;
    try {
      TransferbatchesCreateBatchResponse result = client
              .transferBatches
              .createBatch()
              .items(items)
              .idempotencyKey(idempotencyKey)
              .metadata(metadata)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getStatus());
      System.out.println(result.getMetadata());
      System.out.println(result.getItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransferBatchesApi#createBatch");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TransferbatchesCreateBatchResponse> response = client
              .transferBatches
              .createBatch()
              .items(items)
              .idempotencyKey(idempotencyKey)
              .metadata(metadata)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransferBatchesApi#createBatch");
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
| **transferbatchesCreateBatchRequest** | [**TransferbatchesCreateBatchRequest**](TransferbatchesCreateBatchRequest.md)|  | [optional] |

### Return type

[**TransferbatchesCreateBatchResponse**](TransferbatchesCreateBatchResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getById"></a>
# **getById**
> TransferbatchesGetByIdResponse getById(transferBatchId).execute();

Retrieve a Transfer Batch

Get a transfer batch by id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransferBatchesApi;
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
    String transferBatchId = "transferBatchId_example"; // Id of the transfer batch to fetch
    try {
      TransferbatchesGetByIdResponse result = client
              .transferBatches
              .getById(transferBatchId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getStatus());
      System.out.println(result.getMetadata());
      System.out.println(result.getItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransferBatchesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TransferbatchesGetByIdResponse> response = client
              .transferBatches
              .getById(transferBatchId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransferBatchesApi#getById");
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
| **transferBatchId** | **String**| Id of the transfer batch to fetch | |

### Return type

[**TransferbatchesGetByIdResponse**](TransferbatchesGetByIdResponse.md)

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
> TransferbatchesListAllResponse listAll().limit(limit).startingAfter(startingAfter).endingBefore(endingBefore).execute();

List all Transfer Batches

Get a transfer batch

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransferBatchesApi;
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
      TransferbatchesListAllResponse result = client
              .transferBatches
              .listAll()
              .limit(limit)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getHasMore());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransferBatchesApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TransferbatchesListAllResponse> response = client
              .transferBatches
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
      System.err.println("Exception when calling TransferBatchesApi#listAll");
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

[**TransferbatchesListAllResponse**](TransferbatchesListAllResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

