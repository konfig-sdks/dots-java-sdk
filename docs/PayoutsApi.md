# PayoutsApi

All URIs are relative to *https://api.dots.dev/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPayout**](PayoutsApi.md#createPayout) | **POST** /v2/payouts | Create a Payout |
| [**sendPayout**](PayoutsApi.md#sendPayout) | **POST** /v2/payouts/send-payout | Send a Payout |


<a name="createPayout"></a>
# **createPayout**
> Transfer createPayout().payoutsCreatePayoutRequest(payoutsCreatePayoutRequest).execute();

Create a Payout

Create a payout for an existing user that has a payout method saved to their account.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayoutsApi;
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
    UUID userId = UUID.randomUUID(); // ID of the `user` who you are creating the payout for.
    Integer amount = 56; // Amount in cents to payout the user.
    String platform = "paypal"; // Platform that you are paying out the `user` through,
    String accountId = "accountId_example"; // The bank account ID you are paying to. Required for `ach` and `intl_bank`.
    Boolean fund = true; // Creates a transfer for the amount to the user before creating the payout. The funds are returned if the payout does not succeed.
    UUID idempotencyKey = UUID.randomUUID(); // UUID that will be used to idempotently handle requests. Transfers with existing idempotency keys will be rejected.
    Object metadata = null; // Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    try {
      Transfer result = client
              .payouts
              .createPayout(userId, amount, platform)
              .accountId(accountId)
              .fund(fund)
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
      System.err.println("Exception when calling PayoutsApi#createPayout");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Transfer> response = client
              .payouts
              .createPayout(userId, amount, platform)
              .accountId(accountId)
              .fund(fund)
              .idempotencyKey(idempotencyKey)
              .metadata(metadata)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutsApi#createPayout");
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
| **payoutsCreatePayoutRequest** | [**PayoutsCreatePayoutRequest**](PayoutsCreatePayoutRequest.md)|  | [optional] |

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

<a name="sendPayout"></a>
# **sendPayout**
> PayoutLink sendPayout().payoutsSendPayoutRequest(payoutsSendPayoutRequest).execute();

Send a Payout

Send a payout to a person when you know their phone number or user id. If the user has a Dots acconut, the funds will delivered according to their saved prefernces. Otherwise, they will be sent a Payout Link to onboard and recieve funds.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayoutsApi;
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
    PayoutsSendPayoutRequestDelivery delivery = new PayoutsSendPayoutRequestDelivery();
    Boolean forceCollectComplianceInformation = false; // Collect 1099 or w8-ben information.
    List<String> additionalSteps = Arrays.asList(); // Array of steps in the flow.
    Boolean taxExempt = true; // Payouts marked as `tax_exempt` will not be counted towards the 1099 threshold.
    Object metadata = null; // Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    String memo = "memo_example"; // Add a memo to the top of the Payout Link
    Object idempotencyKey = null; // Unique UUID key that prevents duplicate requests from being processed. If a payout link with the idempotency key exists, a new link will not be created and the existing link will be returned instead.
    UUID payoutFeeParty = UUID.fromString("user"); // Overrides the setting for which party will pay fees on this payout. This takes precedence over the default for your application.
    try {
      PayoutLink result = client
              .payouts
              .sendPayout(amount)
              .userId(userId)
              .payee(payee)
              .delivery(delivery)
              .forceCollectComplianceInformation(forceCollectComplianceInformation)
              .additionalSteps(additionalSteps)
              .taxExempt(taxExempt)
              .metadata(metadata)
              .memo(memo)
              .idempotencyKey(idempotencyKey)
              .payoutFeeParty(payoutFeeParty)
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
      System.err.println("Exception when calling PayoutsApi#sendPayout");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayoutLink> response = client
              .payouts
              .sendPayout(amount)
              .userId(userId)
              .payee(payee)
              .delivery(delivery)
              .forceCollectComplianceInformation(forceCollectComplianceInformation)
              .additionalSteps(additionalSteps)
              .taxExempt(taxExempt)
              .metadata(metadata)
              .memo(memo)
              .idempotencyKey(idempotencyKey)
              .payoutFeeParty(payoutFeeParty)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutsApi#sendPayout");
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
| **payoutsSendPayoutRequest** | [**PayoutsSendPayoutRequest**](PayoutsSendPayoutRequest.md)|  | [optional] |

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
| **201** | Created |  -  |

