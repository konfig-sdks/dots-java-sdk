<div align="center">

[![Visit Dots](./header.png)](https://dots.dev)

# [Dots](https://dots.dev)

Scalable and Flexible Payouts Infrastructure

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Dots&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>dots-java-sdk</artifactId>
  <version>1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:dots-java-sdk:1.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/dots-java-sdk-1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api.dots.dev/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AppsApi* | [**addAchAccount**](docs/AppsApi.md#addAchAccount) | **PUT** /v2/apps/{app_id}/ach-account | Add App ACH Account
*AppsApi* | [**createNewApp**](docs/AppsApi.md#createNewApp) | **POST** /v2/apps | Create an App
*AppsApi* | [**depositFunds**](docs/AppsApi.md#depositFunds) | **POST** /v2/apps/{app_id}/deposit | Deposit Funds into App Wallet
*AppsApi* | [**getAchAccount**](docs/AppsApi.md#getAchAccount) | **GET** /v2/apps/{app_id}/ach-account | Get App ACH Account
*AppsApi* | [**getById**](docs/AppsApi.md#getById) | **GET** /v2/apps/{app_id} | Retrieve an App
*AppsApi* | [**getComplianceInfo**](docs/AppsApi.md#getComplianceInfo) | **GET** /v2/apps/{app_id}/compliance | Retrieve an App&#39;s Compliance Information
*AppsApi* | [**listAll**](docs/AppsApi.md#listAll) | **GET** /v2/apps | List all Apps
*AppsApi* | [**updateComplianceInfo**](docs/AppsApi.md#updateComplianceInfo) | **PUT** /v2/apps/{app_id}/compliance | Update an App&#39;s Compliance Information
*AppsApi* | [**withdrawFunds**](docs/AppsApi.md#withdrawFunds) | **POST** /v2/apps/{app_id}/withdraw | Withdraw Funds From App Wallet
*CheckoutSessionsApi* | [**createSession**](docs/CheckoutSessionsApi.md#createSession) | **POST** /v2/checkout-sessions | Create a Checkout Session
*CheckoutSessionsApi* | [**getById**](docs/CheckoutSessionsApi.md#getById) | **GET** /v2/checkout-sessions/{checkout_session_id} | Retrieve a Checkout Session
*CheckoutSessionsApi* | [**listAll**](docs/CheckoutSessionsApi.md#listAll) | **GET** /v2/checkout-sessions | List all Checkout Sessions
*DisputesApi* | [**addEvidenceFile**](docs/DisputesApi.md#addEvidenceFile) | **POST** /v2/disputes/{dispute_id}/evidence | Add Evidence to a Dispute
*DisputesApi* | [**getAll**](docs/DisputesApi.md#getAll) | **GET** /v2/disputes | List all Disputes
*DisputesApi* | [**getById**](docs/DisputesApi.md#getById) | **GET** /v2/disputes/{dispute_id} | Retrieve a Dispute
*DisputesApi* | [**submitDispute**](docs/DisputesApi.md#submitDispute) | **POST** /v2/disputes/{dispute_id}/submit | Submit a Dispute
*FlowsApi* | [**createNewFlow**](docs/FlowsApi.md#createNewFlow) | **POST** /v2/flows | Create a Flow
*FlowsApi* | [**getById**](docs/FlowsApi.md#getById) | **GET** /v2/flows/{flow_id} | Retrieve a Flow
*FlowsApi* | [**listAll**](docs/FlowsApi.md#listAll) | **GET** /v2/flows | List all Flows
*PaymentCustomersApi* | [**createCustomer**](docs/PaymentCustomersApi.md#createCustomer) | **POST** /v2/payment-customers | Create a Payment Customer
*PaymentCustomersApi* | [**getById**](docs/PaymentCustomersApi.md#getById) | **GET** /v2/payment-customers/{payment_customer_id} | Retrieve a Payment Customer
*PaymentCustomersApi* | [**listAll**](docs/PaymentCustomersApi.md#listAll) | **GET** /v2/payment-customers | List all Payment Customers
*PaymentIntentsApi* | [**confirmIntent**](docs/PaymentIntentsApi.md#confirmIntent) | **POST** /v2/payment-intents/{payment_intent_id}/confirm | Confirm a Payment Intent
*PaymentIntentsApi* | [**createIntent**](docs/PaymentIntentsApi.md#createIntent) | **POST** /v2/payment-intents | Create a Payment Intent
*PaymentIntentsApi* | [**getById**](docs/PaymentIntentsApi.md#getById) | **GET** /v2/payment-intents/{payment_intent_id} | Retrieve a Payment Intent
*PaymentIntentsApi* | [**listAll**](docs/PaymentIntentsApi.md#listAll) | **GET** /v2/payment-intents | List all Payment Intents
*PaymentMethodsApi* | [**attachPaymentMethod**](docs/PaymentMethodsApi.md#attachPaymentMethod) | **POST** /v2/payment-methods/{payment_method_id}/attach | Attach a Payment Method to a Payment Customer
*PaymentMethodsApi* | [**detachPaymentMethod**](docs/PaymentMethodsApi.md#detachPaymentMethod) | **POST** /v2/payment-methods/{payment_method_id}/detach | Detach Payment Method from a Payment Customer
*PaymentMethodsApi* | [**getById**](docs/PaymentMethodsApi.md#getById) | **GET** /v2/payment-methods/{payment_method_id} | Retrieve a Payment Method
*PaymentMethodsApi* | [**listAllPaymentCustomer**](docs/PaymentMethodsApi.md#listAllPaymentCustomer) | **GET** /v2/payment-methods | List all Payment Methods for a Payment Customer
*PaymentsApi* | [**createTransaction**](docs/PaymentsApi.md#createTransaction) | **POST** /v2/payments | Create a Payment
*PayoutLinksApi* | [**cancelLink**](docs/PayoutLinksApi.md#cancelLink) | **DELETE** /v2/payout-links/{payout_link_id} | Delete a Payout Link
*PayoutLinksApi* | [**createPayoutLink**](docs/PayoutLinksApi.md#createPayoutLink) | **POST** /v2/payout-links | Create a Payout Link
*PayoutLinksApi* | [**getPayoutLink**](docs/PayoutLinksApi.md#getPayoutLink) | **GET** /v2/payout-links/{payout_link_id} | Retrieve a Payout Link
*PayoutLinksApi* | [**listAll**](docs/PayoutLinksApi.md#listAll) | **GET** /v2/payout-links | List all Payout Links
*PayoutRequestsApi* | [**getAllPayouts**](docs/PayoutRequestsApi.md#getAllPayouts) | **GET** /v2/payout-requests | List all Payout Requests
*PayoutRequestsApi* | [**getPayoutById**](docs/PayoutRequestsApi.md#getPayoutById) | **GET** /v2/payout-requests/{payout_request_id} | Retrieve a Payout Request
*PayoutRequestsApi* | [**submitRequest**](docs/PayoutRequestsApi.md#submitRequest) | **POST** /v2/payout-requests | Create a Payout Request
*PayoutsApi* | [**createPayout**](docs/PayoutsApi.md#createPayout) | **POST** /v2/payouts | Create a Payout
*PayoutsApi* | [**sendPayout**](docs/PayoutsApi.md#sendPayout) | **POST** /v2/payouts/send-payout | Send a Payout
*RefundsApi* | [**createRefund**](docs/RefundsApi.md#createRefund) | **POST** /v2/refunds | Create a Refund
*RefundsApi* | [**getAll**](docs/RefundsApi.md#getAll) | **GET** /v2/refunds | List all Refunds
*RefundsApi* | [**getById**](docs/RefundsApi.md#getById) | **GET** /v2/refunds/{refund_id} | Retrieve a Refund
*TransactionsApi* | [**getById**](docs/TransactionsApi.md#getById) | **GET** /v2/transactions/{transaction_id} | Retrieve a Transaction
*TransactionsApi* | [**listAll**](docs/TransactionsApi.md#listAll) | **GET** /v2/transactions | List all Transactions
*TransferBatchesApi* | [**createBatch**](docs/TransferBatchesApi.md#createBatch) | **POST** /v2/transfer-batches | Create a Transfer Batch
*TransferBatchesApi* | [**getById**](docs/TransferBatchesApi.md#getById) | **GET** /v2/transfer-batches/{transfer_batch_id} | Retrieve a Transfer Batch
*TransferBatchesApi* | [**listAll**](docs/TransferBatchesApi.md#listAll) | **GET** /v2/transfer-batches | List all Transfer Batches
*TransfersApi* | [**createOrganizationTransfer**](docs/TransfersApi.md#createOrganizationTransfer) | **POST** /v2/organization-transfers | Create an Organization Transfer
*TransfersApi* | [**createTransfer**](docs/TransfersApi.md#createTransfer) | **POST** /v2/transfers | Create a Transfer
*TransfersApi* | [**getAll**](docs/TransfersApi.md#getAll) | **GET** /v2/organization-transfers | List all Organization Transfers
*TransfersApi* | [**getById**](docs/TransfersApi.md#getById) | **GET** /v2/transfers/{transfer_id} | Get a Transfer
*TransfersApi* | [**getById_0**](docs/TransfersApi.md#getById_0) | **GET** /v2/organization-transfers/{transfer_id} | Get a Transfer
*TransfersApi* | [**listAll**](docs/TransfersApi.md#listAll) | **GET** /v2/transfers | List all Transfers
*UsersApi* | [**addPayoutMethod**](docs/UsersApi.md#addPayoutMethod) | **PUT** /v2/users/{user_id}/payout-methods | Add a Payout Method
*UsersApi* | [**createNewUser**](docs/UsersApi.md#createNewUser) | **POST** /v2/users | Create a User
*UsersApi* | [**getUserById**](docs/UsersApi.md#getUserById) | **GET** /v2/users/{user_id} | Retrieve a User
*UsersApi* | [**listAllUsers**](docs/UsersApi.md#listAllUsers) | **GET** /v2/users | List all Users
*UsersApi* | [**listPayoutMethods**](docs/UsersApi.md#listPayoutMethods) | **GET** /v2/users/{user_id}/payout-methods | List Payout Methods
*UsersApi* | [**removeUser**](docs/UsersApi.md#removeUser) | **DELETE** /v2/users/{user_id} | Delete a User
*UsersApi* | [**sendVerificationToken**](docs/UsersApi.md#sendVerificationToken) | **POST** /v2/users/{user_id}/send-verification-token | Send a Verification Token
*UsersApi* | [**submitComplianceInfo**](docs/UsersApi.md#submitComplianceInfo) | **PUT** /v2/users/{user_id}/compliance | Submit Compliance Information
*UsersApi* | [**updateUserObject**](docs/UsersApi.md#updateUserObject) | **PATCH** /v2/users/{user_id} | Update a user
*UsersApi* | [**verifyUserToken**](docs/UsersApi.md#verifyUserToken) | **POST** /v2/users/{user_id}/verify | Verify a User


## Documentation for Models

 - [App](docs/App.md)
 - [AppMetrics](docs/AppMetrics.md)
 - [AppsAddAchAccountRequest](docs/AppsAddAchAccountRequest.md)
 - [AppsAddAchAccountResponse](docs/AppsAddAchAccountResponse.md)
 - [AppsCreateNewAppRequest](docs/AppsCreateNewAppRequest.md)
 - [AppsDepositFundsRequest](docs/AppsDepositFundsRequest.md)
 - [AppsGetAchAccountResponse](docs/AppsGetAchAccountResponse.md)
 - [AppsWithdrawFundsRequest](docs/AppsWithdrawFundsRequest.md)
 - [BusinessComplianceInfo](docs/BusinessComplianceInfo.md)
 - [BusinessComplianceInfoCompanyInfo](docs/BusinessComplianceInfoCompanyInfo.md)
 - [BusinessComplianceInfoContactInfo](docs/BusinessComplianceInfoContactInfo.md)
 - [BusinessComplianceInfoDirectorsInner](docs/BusinessComplianceInfoDirectorsInner.md)
 - [BusinessComplianceInfoDirectorsInnerAddress](docs/BusinessComplianceInfoDirectorsInnerAddress.md)
 - [BusinessComplianceInfoFlowOfFunds](docs/BusinessComplianceInfoFlowOfFunds.md)
 - [CheckoutSession](docs/CheckoutSession.md)
 - [CheckoutSessionLineItemsInner](docs/CheckoutSessionLineItemsInner.md)
 - [CheckoutsessionsCreateSessionRequest](docs/CheckoutsessionsCreateSessionRequest.md)
 - [CheckoutsessionsCreateSessionRequestLineItemsInner](docs/CheckoutsessionsCreateSessionRequestLineItemsInner.md)
 - [CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData](docs/CheckoutsessionsCreateSessionRequestLineItemsInnerPriceData.md)
 - [CheckoutsessionsCreateSessionRequestLineItemsInnerPriceDataProductData](docs/CheckoutsessionsCreateSessionRequestLineItemsInnerPriceDataProductData.md)
 - [CheckoutsessionsListAllResponse](docs/CheckoutsessionsListAllResponse.md)
 - [Dispute](docs/Dispute.md)
 - [DisputeFile](docs/DisputeFile.md)
 - [DisputesAddEvidenceFileRequest](docs/DisputesAddEvidenceFileRequest.md)
 - [DisputesGetAllResponse](docs/DisputesGetAllResponse.md)
 - [DisputesSubmitDisputeRequest](docs/DisputesSubmitDisputeRequest.md)
 - [Flow](docs/Flow.md)
 - [FlowsCreateNewFlowRequest](docs/FlowsCreateNewFlowRequest.md)
 - [FlowsListAllResponse](docs/FlowsListAllResponse.md)
 - [PaymentCustomer](docs/PaymentCustomer.md)
 - [PaymentIntent](docs/PaymentIntent.md)
 - [PaymentMethod](docs/PaymentMethod.md)
 - [PaymentcustomersCreateCustomerResponse](docs/PaymentcustomersCreateCustomerResponse.md)
 - [PaymentcustomersListAllResponse](docs/PaymentcustomersListAllResponse.md)
 - [PaymentintentsConfirmIntentRequest](docs/PaymentintentsConfirmIntentRequest.md)
 - [PaymentintentsCreateIntentRequest](docs/PaymentintentsCreateIntentRequest.md)
 - [PaymentintentsCreateIntentRequestTransferData](docs/PaymentintentsCreateIntentRequestTransferData.md)
 - [PaymentmethodsAttachPaymentMethodRequest](docs/PaymentmethodsAttachPaymentMethodRequest.md)
 - [PaymentmethodsDetachPaymentMethodRequest](docs/PaymentmethodsDetachPaymentMethodRequest.md)
 - [PaymentmethodsListAllPaymentCustomerResponse](docs/PaymentmethodsListAllPaymentCustomerResponse.md)
 - [PayoutLink](docs/PayoutLink.md)
 - [PayoutLinkDelivery](docs/PayoutLinkDelivery.md)
 - [PayoutLinkPayee](docs/PayoutLinkPayee.md)
 - [PayoutRequest](docs/PayoutRequest.md)
 - [PayoutRequestPayee](docs/PayoutRequestPayee.md)
 - [PayoutlinksCreatePayoutLinkRequest](docs/PayoutlinksCreatePayoutLinkRequest.md)
 - [PayoutlinksCreatePayoutLinkRequestDelivery](docs/PayoutlinksCreatePayoutLinkRequestDelivery.md)
 - [PayoutlinksCreatePayoutLinkRequestPayee](docs/PayoutlinksCreatePayoutLinkRequestPayee.md)
 - [PayoutlinksListAllResponse](docs/PayoutlinksListAllResponse.md)
 - [PayoutrequestsGetAllPayoutsResponse](docs/PayoutrequestsGetAllPayoutsResponse.md)
 - [PayoutrequestsSubmitRequestRequest](docs/PayoutrequestsSubmitRequestRequest.md)
 - [PayoutsCreatePayoutRequest](docs/PayoutsCreatePayoutRequest.md)
 - [PayoutsSendPayoutRequest](docs/PayoutsSendPayoutRequest.md)
 - [PayoutsSendPayoutRequestDelivery](docs/PayoutsSendPayoutRequestDelivery.md)
 - [PayoutsSendPayoutRequestPayee](docs/PayoutsSendPayoutRequestPayee.md)
 - [Refund](docs/Refund.md)
 - [RefundsCreateRefundRequest](docs/RefundsCreateRefundRequest.md)
 - [RefundsGetAllResponse](docs/RefundsGetAllResponse.md)
 - [Transaction](docs/Transaction.md)
 - [TransactionsListAllResponse](docs/TransactionsListAllResponse.md)
 - [Transfer](docs/Transfer.md)
 - [TransferBatchItem](docs/TransferBatchItem.md)
 - [TransferExternalData](docs/TransferExternalData.md)
 - [TransferbatchesCreateBatchRequest](docs/TransferbatchesCreateBatchRequest.md)
 - [TransferbatchesCreateBatchRequestItemsInner](docs/TransferbatchesCreateBatchRequestItemsInner.md)
 - [TransferbatchesCreateBatchResponse](docs/TransferbatchesCreateBatchResponse.md)
 - [TransferbatchesGetByIdResponse](docs/TransferbatchesGetByIdResponse.md)
 - [TransferbatchesListAllResponse](docs/TransferbatchesListAllResponse.md)
 - [TransferbatchesListAllResponseDataInner](docs/TransferbatchesListAllResponseDataInner.md)
 - [TransfersCreateOrganizationTransferRequest](docs/TransfersCreateOrganizationTransferRequest.md)
 - [TransfersCreateTransferRequest](docs/TransfersCreateTransferRequest.md)
 - [TransfersGetAllResponse](docs/TransfersGetAllResponse.md)
 - [TransfersListAllResponse](docs/TransfersListAllResponse.md)
 - [User](docs/User.md)
 - [UserCompliance](docs/UserCompliance.md)
 - [UsersAddPayoutMethodRequest](docs/UsersAddPayoutMethodRequest.md)
 - [UsersCreateNewUserRequest](docs/UsersCreateNewUserRequest.md)
 - [UsersListAllUsersResponse](docs/UsersListAllUsersResponse.md)
 - [UsersSendVerificationTokenRequest](docs/UsersSendVerificationTokenRequest.md)
 - [UsersSubmitComplianceInfoRequest](docs/UsersSubmitComplianceInfoRequest.md)
 - [UsersSubmitComplianceInfoRequestW8ben](docs/UsersSubmitComplianceInfoRequestW8ben.md)
 - [UsersSubmitComplianceInfoRequestW8benAddress](docs/UsersSubmitComplianceInfoRequestW8benAddress.md)
 - [UsersSubmitComplianceInfoRequestW8benSignature](docs/UsersSubmitComplianceInfoRequestW8benSignature.md)
 - [UsersSubmitComplianceInfoRequestW9](docs/UsersSubmitComplianceInfoRequestW9.md)
 - [UsersSubmitComplianceInfoRequestW9Address](docs/UsersSubmitComplianceInfoRequestW9Address.md)
 - [UsersUpdateUserObjectRequest](docs/UsersUpdateUserObjectRequest.md)
 - [UsersVerifyUserTokenRequest](docs/UsersVerifyUserTokenRequest.md)
 - [Wallet](docs/Wallet.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
