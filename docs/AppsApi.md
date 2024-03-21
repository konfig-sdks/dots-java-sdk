# AppsApi

All URIs are relative to *https://api.dots.dev/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addAchAccount**](AppsApi.md#addAchAccount) | **PUT** /v2/apps/{app_id}/ach-account | Add App ACH Account |
| [**createNewApp**](AppsApi.md#createNewApp) | **POST** /v2/apps | Create an App |
| [**depositFunds**](AppsApi.md#depositFunds) | **POST** /v2/apps/{app_id}/deposit | Deposit Funds into App Wallet |
| [**getAchAccount**](AppsApi.md#getAchAccount) | **GET** /v2/apps/{app_id}/ach-account | Get App ACH Account |
| [**getById**](AppsApi.md#getById) | **GET** /v2/apps/{app_id} | Retrieve an App |
| [**getComplianceInfo**](AppsApi.md#getComplianceInfo) | **GET** /v2/apps/{app_id}/compliance | Retrieve an App&#39;s Compliance Information |
| [**listAll**](AppsApi.md#listAll) | **GET** /v2/apps | List all Apps |
| [**updateComplianceInfo**](AppsApi.md#updateComplianceInfo) | **PUT** /v2/apps/{app_id}/compliance | Update an App&#39;s Compliance Information |
| [**withdrawFunds**](AppsApi.md#withdrawFunds) | **POST** /v2/apps/{app_id}/withdraw | Withdraw Funds From App Wallet |


<a name="addAchAccount"></a>
# **addAchAccount**
> AppsAddAchAccountResponse addAchAccount(appId).appsAddAchAccountRequest(appsAddAchAccountRequest).execute();

Add App ACH Account

Add an ACH account to an app. The account&#39;s owner must match the compliance information submitted.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppsApi;
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
    String accountNumber = "accountNumber_example"; // The bank account number.
    String routingNumber = "routingNumber_example"; // The bank's ABA routing number.
    String accountType = "checking"; // The type of bank account.
    String appId = "appId_example"; // The ID of the app.
    try {
      AppsAddAchAccountResponse result = client
              .apps
              .addAchAccount(accountNumber, routingNumber, accountType, appId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMask());
      System.out.println(result.getName());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#addAchAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AppsAddAchAccountResponse> response = client
              .apps
              .addAchAccount(accountNumber, routingNumber, accountType, appId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#addAchAccount");
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
| **appId** | **String**| The ID of the app. | |
| **appsAddAchAccountRequest** | [**AppsAddAchAccountRequest**](AppsAddAchAccountRequest.md)|  | [optional] |

### Return type

[**AppsAddAchAccountResponse**](AppsAddAchAccountResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="createNewApp"></a>
# **createNewApp**
> App createNewApp().appsCreateNewAppRequest(appsCreateNewAppRequest).execute();

Create an App

Create an app in your organization

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppsApi;
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
    String name = "name_example"; // The name of the application.
    Object metadata = null; // Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    try {
      App result = client
              .apps
              .createNewApp(name)
              .metadata(metadata)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getStatus());
      System.out.println(result.getMetrics());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#createNewApp");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<App> response = client
              .apps
              .createNewApp(name)
              .metadata(metadata)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#createNewApp");
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
| **appsCreateNewAppRequest** | [**AppsCreateNewAppRequest**](AppsCreateNewAppRequest.md)|  | [optional] |

### Return type

[**App**](App.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="depositFunds"></a>
# **depositFunds**
> Transfer depositFunds(appId).appsDepositFundsRequest(appsDepositFundsRequest).execute();

Deposit Funds into App Wallet

Deposit funds into App wallet by endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppsApi;
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
    Integer amount = 56; // The amount to deposit in cents.
    String appId = "appId_example"; // The ID of the App.
    UUID idempotencyKey = UUID.randomUUID(); // Idempotency key in UUID format.
    try {
      Transfer result = client
              .apps
              .depositFunds(amount, appId)
              .idempotencyKey(idempotencyKey)
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
      System.err.println("Exception when calling AppsApi#depositFunds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Transfer> response = client
              .apps
              .depositFunds(amount, appId)
              .idempotencyKey(idempotencyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#depositFunds");
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
| **appId** | **String**| The ID of the App. | |
| **appsDepositFundsRequest** | [**AppsDepositFundsRequest**](AppsDepositFundsRequest.md)|  | [optional] |

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

<a name="getAchAccount"></a>
# **getAchAccount**
> AppsGetAchAccountResponse getAchAccount(appId).execute();

Get App ACH Account

Get the App&#39;s ach account information.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppsApi;
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
    String appId = "appId_example"; // The ID of the app.
    try {
      AppsGetAchAccountResponse result = client
              .apps
              .getAchAccount(appId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMask());
      System.out.println(result.getName());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#getAchAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AppsGetAchAccountResponse> response = client
              .apps
              .getAchAccount(appId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#getAchAccount");
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
| **appId** | **String**| The ID of the app. | |

### Return type

[**AppsGetAchAccountResponse**](AppsGetAchAccountResponse.md)

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
> App getById(appId).execute();

Retrieve an App

Retrieve an app in your organization by its ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppsApi;
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
    UUID appId = UUID.randomUUID(); // ID of the app to retrieve
    try {
      App result = client
              .apps
              .getById(appId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getStatus());
      System.out.println(result.getMetrics());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<App> response = client
              .apps
              .getById(appId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#getById");
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
| **appId** | **UUID**| ID of the app to retrieve | |

### Return type

[**App**](App.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not found |  -  |

<a name="getComplianceInfo"></a>
# **getComplianceInfo**
> BusinessComplianceInfo getComplianceInfo(appId).execute();

Retrieve an App&#39;s Compliance Information

Retrieve the compliance information for an app in your organization

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppsApi;
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
    UUID appId = UUID.randomUUID(); // ID of the app to query or modify
    try {
      BusinessComplianceInfo result = client
              .apps
              .getComplianceInfo(appId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCompanyInfo());
      System.out.println(result.getContactInfo());
      System.out.println(result.getDirectors());
      System.out.println(result.getFlowOfFunds());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#getComplianceInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BusinessComplianceInfo> response = client
              .apps
              .getComplianceInfo(appId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#getComplianceInfo");
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
| **appId** | **UUID**| ID of the app to query or modify | |

### Return type

[**BusinessComplianceInfo**](BusinessComplianceInfo.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not found |  -  |

<a name="listAll"></a>
# **listAll**
> List&lt;App&gt; listAll().limit(limit).startingAfter(startingAfter).endingBefore(endingBefore).execute();

List all Apps

List all apps created by your organization

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppsApi;
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
    Integer limit = 56; // Maximum number of results to retrieve
    UUID startingAfter = UUID.randomUUID(); // ID of first app to retrieve
    UUID endingBefore = UUID.randomUUID(); // ID of last app to retrieve
    try {
      List<App> result = client
              .apps
              .listAll()
              .limit(limit)
              .startingAfter(startingAfter)
              .endingBefore(endingBefore)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<App>> response = client
              .apps
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
      System.err.println("Exception when calling AppsApi#listAll");
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
| **limit** | **Integer**| Maximum number of results to retrieve | [optional] |
| **startingAfter** | **UUID**| ID of first app to retrieve | [optional] |
| **endingBefore** | **UUID**| ID of last app to retrieve | [optional] |

### Return type

[**List&lt;App&gt;**](App.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateComplianceInfo"></a>
# **updateComplianceInfo**
> BusinessComplianceInfo updateComplianceInfo(appId).businessComplianceInfo(businessComplianceInfo).execute();

Update an App&#39;s Compliance Information

Add or update compliance information for an app in your organization

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppsApi;
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
    BusinessComplianceInfoCompanyInfo companyInfo = new BusinessComplianceInfoCompanyInfo();
    BusinessComplianceInfoContactInfo contactInfo = new BusinessComplianceInfoContactInfo();
    List<BusinessComplianceInfoDirectorsInner> directors = Arrays.asList();
    BusinessComplianceInfoFlowOfFunds flowOfFunds = new BusinessComplianceInfoFlowOfFunds();
    UUID appId = UUID.randomUUID(); // ID of the app to query or modify
    try {
      BusinessComplianceInfo result = client
              .apps
              .updateComplianceInfo(companyInfo, contactInfo, directors, flowOfFunds, appId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCompanyInfo());
      System.out.println(result.getContactInfo());
      System.out.println(result.getDirectors());
      System.out.println(result.getFlowOfFunds());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#updateComplianceInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BusinessComplianceInfo> response = client
              .apps
              .updateComplianceInfo(companyInfo, contactInfo, directors, flowOfFunds, appId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#updateComplianceInfo");
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
| **appId** | **UUID**| ID of the app to query or modify | |
| **businessComplianceInfo** | [**BusinessComplianceInfo**](BusinessComplianceInfo.md)|  | [optional] |

### Return type

[**BusinessComplianceInfo**](BusinessComplianceInfo.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not found |  -  |

<a name="withdrawFunds"></a>
# **withdrawFunds**
> Transfer withdrawFunds(appId).appsWithdrawFundsRequest(appsWithdrawFundsRequest).execute();

Withdraw Funds From App Wallet

Withdraw funds from app wallet into app bank account.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AppsApi;
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
    Integer amount = 56; // The amount to deposit in cents.
    String appId = "appId_example"; // The ID of the App.
    UUID idempotencyKey = UUID.randomUUID(); // Idempotency key in UUID format.
    try {
      Transfer result = client
              .apps
              .withdrawFunds(amount, appId)
              .idempotencyKey(idempotencyKey)
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
      System.err.println("Exception when calling AppsApi#withdrawFunds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Transfer> response = client
              .apps
              .withdrawFunds(amount, appId)
              .idempotencyKey(idempotencyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#withdrawFunds");
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
| **appId** | **String**| The ID of the App. | |
| **appsWithdrawFundsRequest** | [**AppsWithdrawFundsRequest**](AppsWithdrawFundsRequest.md)|  | [optional] |

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

