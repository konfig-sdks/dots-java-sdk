# UsersApi

All URIs are relative to *https://api.dots.dev/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addPayoutMethod**](UsersApi.md#addPayoutMethod) | **PUT** /v2/users/{user_id}/payout-methods | Add a Payout Method |
| [**createNewUser**](UsersApi.md#createNewUser) | **POST** /v2/users | Create a User |
| [**getUserById**](UsersApi.md#getUserById) | **GET** /v2/users/{user_id} | Retrieve a User |
| [**listAllUsers**](UsersApi.md#listAllUsers) | **GET** /v2/users | List all Users |
| [**listPayoutMethods**](UsersApi.md#listPayoutMethods) | **GET** /v2/users/{user_id}/payout-methods | List Payout Methods |
| [**removeUser**](UsersApi.md#removeUser) | **DELETE** /v2/users/{user_id} | Delete a User |
| [**sendVerificationToken**](UsersApi.md#sendVerificationToken) | **POST** /v2/users/{user_id}/send-verification-token | Send a Verification Token |
| [**submitComplianceInfo**](UsersApi.md#submitComplianceInfo) | **PUT** /v2/users/{user_id}/compliance | Submit Compliance Information |
| [**updateUserObject**](UsersApi.md#updateUserObject) | **PATCH** /v2/users/{user_id} | Update a user |
| [**verifyUserToken**](UsersApi.md#verifyUserToken) | **POST** /v2/users/{user_id}/verify | Verify a User |


<a name="addPayoutMethod"></a>
# **addPayoutMethod**
> PaymentMethod addPayoutMethod(userId).usersAddPayoutMethodRequest(usersAddPayoutMethodRequest).execute();

Add a Payout Method

Add a payout method to the user. Payout method can be one of &#x60;paypal&#x60;, &#x60;venmo&#x60;, &#x60;ach&#x60;, or &#x60;cash_app&#x60;. Each method has different required parameters.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String platform = "paypal"; // Payout platform to add.
    UUID userId = UUID.randomUUID(); // Id of the user to fetch
    String routingNumber = "routingNumber_example"; // Bank account or Cash App routing number. Required if `platform` = `ach` or `cash_app`.
    String accountNumber = "accountNumber_example"; // Bank account or Cash App account number. Required if `platform` = `ach` or `cash_app`.
    String accountType = "checking"; // Bank account type. Required if `platform` = `ach`.
    String email = "email_example"; // PayPal email address. Required if `platform` = `paypal`.
    String phoneNumber = "phoneNumber_example"; // Venmo phone number. One of `phone_number` or `handle` is required if `platform` = `venmo`.
    String handle = "handle_example"; // Venmo handle. One of `phone_number` or `handle` is required if `platform` = `venmo`.
    String cashTag = "cashTag_example"; // Cash App Cash Tag. Required if `platform` = `cash_app`.
    try {
      PaymentMethod result = client
              .users
              .addPayoutMethod(platform, userId)
              .routingNumber(routingNumber)
              .accountNumber(accountNumber)
              .accountType(accountType)
              .email(email)
              .phoneNumber(phoneNumber)
              .handle(handle)
              .cashTag(cashTag)
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
      System.err.println("Exception when calling UsersApi#addPayoutMethod");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentMethod> response = client
              .users
              .addPayoutMethod(platform, userId)
              .routingNumber(routingNumber)
              .accountNumber(accountNumber)
              .accountType(accountType)
              .email(email)
              .phoneNumber(phoneNumber)
              .handle(handle)
              .cashTag(cashTag)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#addPayoutMethod");
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
| **userId** | **UUID**| Id of the user to fetch | |
| **usersAddPayoutMethodRequest** | [**UsersAddPayoutMethodRequest**](UsersAddPayoutMethodRequest.md)|  | [optional] |

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

<a name="createNewUser"></a>
# **createNewUser**
> User createNewUser().usersCreateNewUserRequest(usersCreateNewUserRequest).execute();

Create a User

Create a user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String firstName = "firstName_example"; // The user's first name.
    String lastName = "lastName_example"; // The user's last name.
    String email = "email_example"; // The user's email address.
    String countryCode = "countryCode_example"; // The user's phone number country code. e.g. \\\"1\\\"
    String phoneNumber = "phoneNumber_example"; // The user's phone number. e.g. \\\"4157223331\\\".
    String username = "username_example"; // Username to assign the user.
    Object metadata = null; // Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    try {
      User result = client
              .users
              .createNewUser(firstName, lastName, email, countryCode, phoneNumber)
              .username(username)
              .metadata(metadata)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getEmail());
      System.out.println(result.getPhoneNumber());
      System.out.println(result.getWallet());
      System.out.println(result.getCompliance());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#createNewUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .users
              .createNewUser(firstName, lastName, email, countryCode, phoneNumber)
              .username(username)
              .metadata(metadata)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#createNewUser");
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
| **usersCreateNewUserRequest** | [**UsersCreateNewUserRequest**](UsersCreateNewUserRequest.md)|  | [optional] |

### Return type

[**User**](User.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getUserById"></a>
# **getUserById**
> User getUserById(userId).execute();

Retrieve a User

Get a user by their id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    UUID userId = UUID.randomUUID(); // Id of the user to fetch
    try {
      User result = client
              .users
              .getUserById(userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getEmail());
      System.out.println(result.getPhoneNumber());
      System.out.println(result.getWallet());
      System.out.println(result.getCompliance());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .users
              .getUserById(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserById");
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
| **userId** | **UUID**| Id of the user to fetch | |

### Return type

[**User**](User.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listAllUsers"></a>
# **listAllUsers**
> UsersListAllUsersResponse listAllUsers().startingAfter(startingAfter).limit(limit).endingBefore(endingBefore).execute();

List all Users

List all users connected to your application.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    UUID startingAfter = UUID.randomUUID(); // A cursor for use in pagination. `starting_after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `aaa`, your subsequent call can include `starting_after`=`aaa` in order to fetch the next page of the list.
    Integer limit = 56; // A limit on the number of objects to be returned, between 1 and 100.
    UUID endingBefore = UUID.randomUUID(); // A cursor for use in pagination. `ending_before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with `aaa`, your subsequent call can include `ending_before`=`aaa` in order to fetch the previous page of the list.
    try {
      UsersListAllUsersResponse result = client
              .users
              .listAllUsers()
              .startingAfter(startingAfter)
              .limit(limit)
              .endingBefore(endingBefore)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getHasMore());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#listAllUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersListAllUsersResponse> response = client
              .users
              .listAllUsers()
              .startingAfter(startingAfter)
              .limit(limit)
              .endingBefore(endingBefore)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#listAllUsers");
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
| **startingAfter** | **UUID**| A cursor for use in pagination. &#x60;starting_after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with &#x60;aaa&#x60;, your subsequent call can include &#x60;starting_after&#x60;&#x3D;&#x60;aaa&#x60; in order to fetch the next page of the list. | [optional] |
| **limit** | **Integer**| A limit on the number of objects to be returned, between 1 and 100. | [optional] |
| **endingBefore** | **UUID**| A cursor for use in pagination. &#x60;ending_before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with &#x60;aaa&#x60;, your subsequent call can include &#x60;ending_before&#x60;&#x3D;&#x60;aaa&#x60; in order to fetch the previous page of the list. | [optional] |

### Return type

[**UsersListAllUsersResponse**](UsersListAllUsersResponse.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listPayoutMethods"></a>
# **listPayoutMethods**
> List&lt;PaymentMethod&gt; listPayoutMethods(userId).execute();

List Payout Methods

Get a user&#39;s connected payout methods.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    UUID userId = UUID.randomUUID(); // Id of the user to fetch
    try {
      List<PaymentMethod> result = client
              .users
              .listPayoutMethods(userId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#listPayoutMethods");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PaymentMethod>> response = client
              .users
              .listPayoutMethods(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#listPayoutMethods");
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
| **userId** | **UUID**| Id of the user to fetch | |

### Return type

[**List&lt;PaymentMethod&gt;**](PaymentMethod.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="removeUser"></a>
# **removeUser**
> User removeUser(userId).execute();

Delete a User

Delete a user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    UUID userId = UUID.randomUUID(); // Id of the user to fetch
    try {
      User result = client
              .users
              .removeUser(userId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getEmail());
      System.out.println(result.getPhoneNumber());
      System.out.println(result.getWallet());
      System.out.println(result.getCompliance());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#removeUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .users
              .removeUser(userId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#removeUser");
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
| **userId** | **UUID**| Id of the user to fetch | |

### Return type

[**User**](User.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="sendVerificationToken"></a>
# **sendVerificationToken**
> sendVerificationToken(userId).usersSendVerificationTokenRequest(usersSendVerificationTokenRequest).execute();

Send a Verification Token

Send a user a verification token.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String userId = "userId_example"; // Id of the user to fetch
    Boolean useVoice = false; // Defaults to `false` which sends token via SMS. Set `true` to receive via call instead.
    try {
      client
              .users
              .sendVerificationToken(userId)
              .useVoice(useVoice)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#sendVerificationToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .users
              .sendVerificationToken(userId)
              .useVoice(useVoice)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#sendVerificationToken");
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
| **userId** | **String**| Id of the user to fetch | |
| **usersSendVerificationTokenRequest** | [**UsersSendVerificationTokenRequest**](UsersSendVerificationTokenRequest.md)|  | [optional] |

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
| **202** | Accepted |  -  |

<a name="submitComplianceInfo"></a>
# **submitComplianceInfo**
> submitComplianceInfo(userId).usersSubmitComplianceInfoRequest(usersSubmitComplianceInfoRequest).execute();

Submit Compliance Information

Add Compliance information to a user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String userId = "userId_example"; // Id of the user to fetch
    UsersSubmitComplianceInfoRequestW9 w9 = new UsersSubmitComplianceInfoRequestW9();
    UsersSubmitComplianceInfoRequestW8ben w8ben = new UsersSubmitComplianceInfoRequestW8ben();
    try {
      client
              .users
              .submitComplianceInfo(userId)
              .w9(w9)
              .w8ben(w8ben)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#submitComplianceInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .users
              .submitComplianceInfo(userId)
              .w9(w9)
              .w8ben(w8ben)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#submitComplianceInfo");
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
| **userId** | **String**| Id of the user to fetch | |
| **usersSubmitComplianceInfoRequest** | [**UsersSubmitComplianceInfoRequest**](UsersSubmitComplianceInfoRequest.md)|  | [optional] |

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

<a name="updateUserObject"></a>
# **updateUserObject**
> User updateUserObject(userId).usersUpdateUserObjectRequest(usersUpdateUserObjectRequest).execute();

Update a user

Update mutable fields of a user object.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    UUID userId = UUID.randomUUID(); // Id of the user to fetch
    String defaultPayoutMethod = "paypal"; // Configures the user's default payout method. Must be a payout method already configured by the user.
    Boolean autoPayoutEnabled = true; // Enables auto payout for the user whenever a default payout method is defined
    Object metadata = null; // Arbitrary metadata
    try {
      User result = client
              .users
              .updateUserObject(userId)
              .defaultPayoutMethod(defaultPayoutMethod)
              .autoPayoutEnabled(autoPayoutEnabled)
              .metadata(metadata)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getEmail());
      System.out.println(result.getPhoneNumber());
      System.out.println(result.getWallet());
      System.out.println(result.getCompliance());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateUserObject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<User> response = client
              .users
              .updateUserObject(userId)
              .defaultPayoutMethod(defaultPayoutMethod)
              .autoPayoutEnabled(autoPayoutEnabled)
              .metadata(metadata)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateUserObject");
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
| **userId** | **UUID**| Id of the user to fetch | |
| **usersUpdateUserObjectRequest** | [**UsersUpdateUserObjectRequest**](UsersUpdateUserObjectRequest.md)|  | [optional] |

### Return type

[**User**](User.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="verifyUserToken"></a>
# **verifyUserToken**
> verifyUserToken(userId).usersVerifyUserTokenRequest(usersVerifyUserTokenRequest).execute();

Verify a User

Verify a user with a token.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Dots;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String token = "token_example"; // The token sent to the user.
    UUID userId = UUID.randomUUID(); // Id of the user to fetch
    try {
      client
              .users
              .verifyUserToken(token, userId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#verifyUserToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .users
              .verifyUserToken(token, userId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#verifyUserToken");
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
| **userId** | **UUID**| Id of the user to fetch | |
| **usersVerifyUserTokenRequest** | [**UsersVerifyUserTokenRequest**](UsersVerifyUserTokenRequest.md)|  | [optional] |

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
| **400** | Incorrect token |  -  |

