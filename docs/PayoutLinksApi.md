# PayoutLinksApi

All URIs are relative to *https://api.dots.dev/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelLink**](PayoutLinksApi.md#cancelLink) | **DELETE** /v2/payout-links/{payout_link_id} | Delete a Payout Link |
| [**createPayoutLink**](PayoutLinksApi.md#createPayoutLink) | **POST** /v2/payout-links | Create a Payout Link |
| [**getPayoutLink**](PayoutLinksApi.md#getPayoutLink) | **GET** /v2/payout-links/{payout_link_id} | Retrieve a Payout Link |
| [**listAll**](PayoutLinksApi.md#listAll) | **GET** /v2/payout-links | List all Payout Links |


<a name="cancelLink"></a>
# **cancelLink**
> PayoutLink cancelLink(payoutLinkId).execute();

Delete a Payout Link

Cancel a payout link

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayoutLinksApi;
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
    String payoutLinkId = "payoutLinkId_example"; // Id of the payout link
    try {
      PayoutLink result = client
              .payoutLinks
              .cancelLink(payoutLinkId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCreated());
      System.out.println(result.getLink());
      System.out.println(result.getAmount());
      System.out.println(result.getStatus());
      System.out.println(result.getPayee());
      System.out.println(result.getDelivery());
      System.out.println(result.getTaxExempt());
      System.out.println(result.getClaimedUserId());
      System.out.println(result.getFlowId());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutLinksApi#cancelLink");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayoutLink> response = client
              .payoutLinks
              .cancelLink(payoutLinkId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutLinksApi#cancelLink");
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
| **payoutLinkId** | **String**| Id of the payout link | |

### Return type

[**PayoutLink**](PayoutLink.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createPayoutLink"></a>
# **createPayoutLink**
> PayoutLink createPayoutLink().payoutlinksCreatePayoutLinkRequest(payoutlinksCreatePayoutLinkRequest).execute();

Create a Payout Link

Create a Payout Link.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayoutLinksApi;
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
    Integer amount = 56; // Amount to be paid in cents.
    UUID userId = UUID.randomUUID(); // The user's id.
    PayoutlinksCreatePayoutLinkRequestPayee payee = new PayoutlinksCreatePayoutLinkRequestPayee();
    PayoutlinksCreatePayoutLinkRequestDelivery delivery = new PayoutlinksCreatePayoutLinkRequestDelivery();
    Boolean forceCollectComplianceInformation = false; // Force the collection of 1099 or W-8 information. Defaults to `false`.
    Boolean taxExempt = true; // Payout links marked as `tax_exempt` will not be counted towards the 1099 threshold.
    Object metadata = null; // Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    String memo = "memo_example"; // Add a memo to the top of the Payout Link
    Object idempotencyKey = null; // Unique UUID key that prevents duplicate requests from being processed. If a payout link with the idempotency key exists, a new link will not be created and the existing link will be returned instead.
    UUID payoutFeeParty = UUID.fromString("user"); // Overrides the setting for which party will pay fees on this payout. This takes precedence over the default for your application.
    List<String> additionalSteps = Arrays.asList(); // Array of steps in the flow.
    try {
      PayoutLink result = client
              .payoutLinks
              .createPayoutLink(amount)
              .userId(userId)
              .payee(payee)
              .delivery(delivery)
              .forceCollectComplianceInformation(forceCollectComplianceInformation)
              .taxExempt(taxExempt)
              .metadata(metadata)
              .memo(memo)
              .idempotencyKey(idempotencyKey)
              .payoutFeeParty(payoutFeeParty)
              .additionalSteps(additionalSteps)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCreated());
      System.out.println(result.getLink());
      System.out.println(result.getAmount());
      System.out.println(result.getStatus());
      System.out.println(result.getPayee());
      System.out.println(result.getDelivery());
      System.out.println(result.getTaxExempt());
      System.out.println(result.getClaimedUserId());
      System.out.println(result.getFlowId());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutLinksApi#createPayoutLink");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayoutLink> response = client
              .payoutLinks
              .createPayoutLink(amount)
              .userId(userId)
              .payee(payee)
              .delivery(delivery)
              .forceCollectComplianceInformation(forceCollectComplianceInformation)
              .taxExempt(taxExempt)
              .metadata(metadata)
              .memo(memo)
              .idempotencyKey(idempotencyKey)
              .payoutFeeParty(payoutFeeParty)
              .additionalSteps(additionalSteps)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutLinksApi#createPayoutLink");
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
| **payoutlinksCreatePayoutLinkRequest** | [**PayoutlinksCreatePayoutLinkRequest**](PayoutlinksCreatePayoutLinkRequest.md)|  | [optional] |

### Return type

[**PayoutLink**](PayoutLink.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getPayoutLink"></a>
# **getPayoutLink**
> PayoutLink getPayoutLink(payoutLinkId).execute();

Retrieve a Payout Link

Get a payout link by its id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayoutLinksApi;
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
    String payoutLinkId = "payoutLinkId_example"; // Id of the payout link
    try {
      PayoutLink result = client
              .payoutLinks
              .getPayoutLink(payoutLinkId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCreated());
      System.out.println(result.getLink());
      System.out.println(result.getAmount());
      System.out.println(result.getStatus());
      System.out.println(result.getPayee());
      System.out.println(result.getDelivery());
      System.out.println(result.getTaxExempt());
      System.out.println(result.getClaimedUserId());
      System.out.println(result.getFlowId());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutLinksApi#getPayoutLink");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayoutLink> response = client
              .payoutLinks
              .getPayoutLink(payoutLinkId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutLinksApi#getPayoutLink");
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
| **payoutLinkId** | **String**| Id of the payout link | |

### Return type

[**PayoutLink**](PayoutLink.md)

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
> PayoutlinksListAllResponse listAll().limit(limit).startingAfter(startingAfter).endingBefore(endingBefore).execute();

List all Payout Links

List all created Payout Links.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayoutLinksApi;
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
      PayoutlinksListAllResponse result = client
              .payoutLinks
              .listAll()
              .limit(limit)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .execute();
      System.out.println(result);
      System.out.println(result.getHasMore());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutLinksApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayoutlinksListAllResponse> response = client
              .payoutLinks
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
      System.err.println("Exception when calling PayoutLinksApi#listAll");
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

[**PayoutlinksListAllResponse**](PayoutlinksListAllResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

