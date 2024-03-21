# DisputesApi

All URIs are relative to *https://api.dots.dev/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addEvidenceFile**](DisputesApi.md#addEvidenceFile) | **POST** /v2/disputes/{dispute_id}/evidence | Add Evidence to a Dispute |
| [**getAll**](DisputesApi.md#getAll) | **GET** /v2/disputes | List all Disputes |
| [**getById**](DisputesApi.md#getById) | **GET** /v2/disputes/{dispute_id} | Retrieve a Dispute |
| [**submitDispute**](DisputesApi.md#submitDispute) | **POST** /v2/disputes/{dispute_id}/submit | Submit a Dispute |


<a name="addEvidenceFile"></a>
# **addEvidenceFile**
> addEvidenceFile(disputeId).type(type).content(content).disputesAddEvidenceFileRequest(disputesAddEvidenceFileRequest).execute();

Add Evidence to a Dispute

Add an evidence file to the dispute

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DisputesApi;
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
    String disputeId = "disputeId_example"; // ID of the dispute to add evidence to
    String type = "customer_communications";
    String content = "content_example";
    try {
      client
              .disputes
              .addEvidenceFile(disputeId)
              .type(type)
              .content(content)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DisputesApi#addEvidenceFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .disputes
              .addEvidenceFile(disputeId)
              .type(type)
              .content(content)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DisputesApi#addEvidenceFile");
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
| **disputeId** | **String**| ID of the dispute to add evidence to | |
| **type** | **String**|  | [optional] [enum: customer_communications, refund_policy, cancellation_policy, customer_signature, receipt, service_documentation, duplicate_charge_documentation, shipping_documentation, uncategorized] |
| **content** | **String**|  | [optional] |
| **disputesAddEvidenceFileRequest** | [**DisputesAddEvidenceFileRequest**](DisputesAddEvidenceFileRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="getAll"></a>
# **getAll**
> DisputesGetAllResponse getAll().limit(limit).startingAfter(startingAfter).endingBefore(endingBefore).execute();

List all Disputes

List all disputes

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DisputesApi;
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
      DisputesGetAllResponse result = client
              .disputes
              .getAll()
              .limit(limit)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMore());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling DisputesApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DisputesGetAllResponse> response = client
              .disputes
              .getAll()
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
      System.err.println("Exception when calling DisputesApi#getAll");
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

[**DisputesGetAllResponse**](DisputesGetAllResponse.md)

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
> Dispute getById(disputeId).execute();

Retrieve a Dispute

Retreieve a dispute by its ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DisputesApi;
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
    String disputeId = "disputeId_example"; // ID of the dispute to retrieve
    try {
      Dispute result = client
              .disputes
              .getById(disputeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getPaymentIntentId());
      System.out.println(result.getStatus());
      System.out.println(result.getEvidence());
    } catch (ApiException e) {
      System.err.println("Exception when calling DisputesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Dispute> response = client
              .disputes
              .getById(disputeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DisputesApi#getById");
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
| **disputeId** | **String**| ID of the dispute to retrieve | |

### Return type

[**Dispute**](Dispute.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="submitDispute"></a>
# **submitDispute**
> submitDispute(disputeId).disputesSubmitDisputeRequest(disputesSubmitDisputeRequest).execute();

Submit a Dispute

Submit a dispute

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DisputesApi;
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
    String description = "description_example";
    String disputeId = "disputeId_example"; // ID of the dispute to submit
    try {
      client
              .disputes
              .submitDispute(description, disputeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DisputesApi#submitDispute");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .disputes
              .submitDispute(description, disputeId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DisputesApi#submitDispute");
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
| **disputeId** | **String**| ID of the dispute to submit | |
| **disputesSubmitDisputeRequest** | [**DisputesSubmitDisputeRequest**](DisputesSubmitDisputeRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

