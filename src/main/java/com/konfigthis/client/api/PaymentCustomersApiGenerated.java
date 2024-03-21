/*
 * dots api
 * Scalable and Flexible Payouts Infrastructure
 *
 * The version of the OpenAPI document: 1.0
 * Contact: info@dots.dev
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.time.OffsetDateTime;
import com.konfigthis.client.model.PaymentCustomer;
import com.konfigthis.client.model.PaymentcustomersCreateCustomerResponse;
import com.konfigthis.client.model.PaymentcustomersListAllResponse;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class PaymentCustomersApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PaymentCustomersApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public PaymentCustomersApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call createCustomerCall(PaymentCustomer paymentCustomer, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = paymentCustomer;

        // create path and map variables
        String localVarPath = "/v2/payment-customers";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createCustomerValidateBeforeCall(PaymentCustomer paymentCustomer, final ApiCallback _callback) throws ApiException {
        return createCustomerCall(paymentCustomer, _callback);

    }


    private ApiResponse<PaymentcustomersCreateCustomerResponse> createCustomerWithHttpInfo(PaymentCustomer paymentCustomer) throws ApiException {
        okhttp3.Call localVarCall = createCustomerValidateBeforeCall(paymentCustomer, null);
        Type localVarReturnType = new TypeToken<PaymentcustomersCreateCustomerResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createCustomerAsync(PaymentCustomer paymentCustomer, final ApiCallback<PaymentcustomersCreateCustomerResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createCustomerValidateBeforeCall(paymentCustomer, _callback);
        Type localVarReturnType = new TypeToken<PaymentcustomersCreateCustomerResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateCustomerRequestBuilder {
        private UUID id;
        private UUID userId;
        private String email;
        private String countryCode;
        private String phoneNumber;
        private String firstName;
        private String middleName;
        private String lastName;
        private Object metadata;
        private OffsetDateTime created;
        private OffsetDateTime updated;

        private CreateCustomerRequestBuilder() {
        }

        /**
         * Set id
         * @param id  (optional)
         * @return CreateCustomerRequestBuilder
         */
        public CreateCustomerRequestBuilder id(UUID id) {
            this.id = id;
            return this;
        }
        
        /**
         * Set userId
         * @param userId  (optional)
         * @return CreateCustomerRequestBuilder
         */
        public CreateCustomerRequestBuilder userId(UUID userId) {
            this.userId = userId;
            return this;
        }
        
        /**
         * Set email
         * @param email  (optional)
         * @return CreateCustomerRequestBuilder
         */
        public CreateCustomerRequestBuilder email(String email) {
            this.email = email;
            return this;
        }
        
        /**
         * Set countryCode
         * @param countryCode  (optional)
         * @return CreateCustomerRequestBuilder
         */
        public CreateCustomerRequestBuilder countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        
        /**
         * Set phoneNumber
         * @param phoneNumber  (optional)
         * @return CreateCustomerRequestBuilder
         */
        public CreateCustomerRequestBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        
        /**
         * Set firstName
         * @param firstName  (optional)
         * @return CreateCustomerRequestBuilder
         */
        public CreateCustomerRequestBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        
        /**
         * Set middleName
         * @param middleName  (optional)
         * @return CreateCustomerRequestBuilder
         */
        public CreateCustomerRequestBuilder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }
        
        /**
         * Set lastName
         * @param lastName  (optional)
         * @return CreateCustomerRequestBuilder
         */
        public CreateCustomerRequestBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        
        /**
         * Set metadata
         * @param metadata  (optional)
         * @return CreateCustomerRequestBuilder
         */
        public CreateCustomerRequestBuilder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }
        
        /**
         * Set created
         * @param created  (optional)
         * @return CreateCustomerRequestBuilder
         */
        public CreateCustomerRequestBuilder created(OffsetDateTime created) {
            this.created = created;
            return this;
        }
        
        /**
         * Set updated
         * @param updated  (optional)
         * @return CreateCustomerRequestBuilder
         */
        public CreateCustomerRequestBuilder updated(OffsetDateTime updated) {
            this.updated = updated;
            return this;
        }
        
        /**
         * Build call for createCustomer
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            PaymentCustomer paymentCustomer = buildBodyParams();
            return createCustomerCall(paymentCustomer, _callback);
        }

        private PaymentCustomer buildBodyParams() {
            PaymentCustomer paymentCustomer = new PaymentCustomer();
            paymentCustomer.id(this.id);
            paymentCustomer.userId(this.userId);
            paymentCustomer.email(this.email);
            paymentCustomer.countryCode(this.countryCode);
            paymentCustomer.phoneNumber(this.phoneNumber);
            paymentCustomer.firstName(this.firstName);
            paymentCustomer.middleName(this.middleName);
            paymentCustomer.lastName(this.lastName);
            paymentCustomer.metadata(this.metadata);
            paymentCustomer.created(this.created);
            paymentCustomer.updated(this.updated);
            return paymentCustomer;
        }

        /**
         * Execute createCustomer request
         * @return PaymentcustomersCreateCustomerResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public PaymentcustomersCreateCustomerResponse execute() throws ApiException {
            PaymentCustomer paymentCustomer = buildBodyParams();
            ApiResponse<PaymentcustomersCreateCustomerResponse> localVarResp = createCustomerWithHttpInfo(paymentCustomer);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createCustomer request with HTTP info returned
         * @return ApiResponse&lt;PaymentcustomersCreateCustomerResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PaymentcustomersCreateCustomerResponse> executeWithHttpInfo() throws ApiException {
            PaymentCustomer paymentCustomer = buildBodyParams();
            return createCustomerWithHttpInfo(paymentCustomer);
        }

        /**
         * Execute createCustomer request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PaymentcustomersCreateCustomerResponse> _callback) throws ApiException {
            PaymentCustomer paymentCustomer = buildBodyParams();
            return createCustomerAsync(paymentCustomer, _callback);
        }
    }

    /**
     * Create a Payment Customer
     * Create a Payment Customer
     * @return CreateCustomerRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CreateCustomerRequestBuilder createCustomer() throws IllegalArgumentException {
        return new CreateCustomerRequestBuilder();
    }
    private okhttp3.Call getByIdCall(String paymentCustomerId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/payment-customers/{payment_customer_id}"
            .replace("{" + "payment_customer_id" + "}", localVarApiClient.escapeString(paymentCustomerId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getByIdValidateBeforeCall(String paymentCustomerId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'paymentCustomerId' is set
        if (paymentCustomerId == null) {
            throw new ApiException("Missing the required parameter 'paymentCustomerId' when calling getById(Async)");
        }

        return getByIdCall(paymentCustomerId, _callback);

    }


    private ApiResponse<PaymentCustomer> getByIdWithHttpInfo(String paymentCustomerId) throws ApiException {
        okhttp3.Call localVarCall = getByIdValidateBeforeCall(paymentCustomerId, null);
        Type localVarReturnType = new TypeToken<PaymentCustomer>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getByIdAsync(String paymentCustomerId, final ApiCallback<PaymentCustomer> _callback) throws ApiException {

        okhttp3.Call localVarCall = getByIdValidateBeforeCall(paymentCustomerId, _callback);
        Type localVarReturnType = new TypeToken<PaymentCustomer>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetByIdRequestBuilder {
        private final String paymentCustomerId;

        private GetByIdRequestBuilder(String paymentCustomerId) {
            this.paymentCustomerId = paymentCustomerId;
        }

        /**
         * Build call for getById
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getByIdCall(paymentCustomerId, _callback);
        }


        /**
         * Execute getById request
         * @return PaymentCustomer
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public PaymentCustomer execute() throws ApiException {
            ApiResponse<PaymentCustomer> localVarResp = getByIdWithHttpInfo(paymentCustomerId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getById request with HTTP info returned
         * @return ApiResponse&lt;PaymentCustomer&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PaymentCustomer> executeWithHttpInfo() throws ApiException {
            return getByIdWithHttpInfo(paymentCustomerId);
        }

        /**
         * Execute getById request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PaymentCustomer> _callback) throws ApiException {
            return getByIdAsync(paymentCustomerId, _callback);
        }
    }

    /**
     * Retrieve a Payment Customer
     * Get a payment customer by ID.
     * @param paymentCustomerId The ID of the payment customer (required)
     * @return GetByIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GetByIdRequestBuilder getById(String paymentCustomerId) throws IllegalArgumentException {
        if (paymentCustomerId == null) throw new IllegalArgumentException("\"paymentCustomerId\" is required but got null");
            

        return new GetByIdRequestBuilder(paymentCustomerId);
    }
    private okhttp3.Call listAllCall(String limit, String startingAfter, String endingBefore, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/payment-customers";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (startingAfter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("starting_after", startingAfter));
        }

        if (endingBefore != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ending_before", endingBefore));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listAllValidateBeforeCall(String limit, String startingAfter, String endingBefore, final ApiCallback _callback) throws ApiException {
        return listAllCall(limit, startingAfter, endingBefore, _callback);

    }


    private ApiResponse<PaymentcustomersListAllResponse> listAllWithHttpInfo(String limit, String startingAfter, String endingBefore) throws ApiException {
        okhttp3.Call localVarCall = listAllValidateBeforeCall(limit, startingAfter, endingBefore, null);
        Type localVarReturnType = new TypeToken<PaymentcustomersListAllResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAllAsync(String limit, String startingAfter, String endingBefore, final ApiCallback<PaymentcustomersListAllResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listAllValidateBeforeCall(limit, startingAfter, endingBefore, _callback);
        Type localVarReturnType = new TypeToken<PaymentcustomersListAllResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListAllRequestBuilder {
        private String limit;
        private String startingAfter;
        private String endingBefore;

        private ListAllRequestBuilder() {
        }

        /**
         * Set limit
         * @param limit A limit on the number of objects to be returned, between 1 and 100. (optional)
         * @return ListAllRequestBuilder
         */
        public ListAllRequestBuilder limit(String limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Set startingAfter
         * @param startingAfter A cursor for use in pagination. &#x60;starting_after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with &#x60;aaa&#x60;, your subsequent call can include &#x60;starting_after&#x60;&#x3D;&#x60;aaa&#x60; in order to fetch the next page of the list. (optional)
         * @return ListAllRequestBuilder
         */
        public ListAllRequestBuilder startingAfter(String startingAfter) {
            this.startingAfter = startingAfter;
            return this;
        }
        
        /**
         * Set endingBefore
         * @param endingBefore A cursor for use in pagination. &#x60;ending_before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with &#x60;aaa&#x60;, your subsequent call can include &#x60;ending_before&#x60;&#x3D;&#x60;aaa&#x60; in order to fetch the previous page of the list. (optional)
         * @return ListAllRequestBuilder
         */
        public ListAllRequestBuilder endingBefore(String endingBefore) {
            this.endingBefore = endingBefore;
            return this;
        }
        
        /**
         * Build call for listAll
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listAllCall(limit, startingAfter, endingBefore, _callback);
        }


        /**
         * Execute listAll request
         * @return PaymentcustomersListAllResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public PaymentcustomersListAllResponse execute() throws ApiException {
            ApiResponse<PaymentcustomersListAllResponse> localVarResp = listAllWithHttpInfo(limit, startingAfter, endingBefore);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listAll request with HTTP info returned
         * @return ApiResponse&lt;PaymentcustomersListAllResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PaymentcustomersListAllResponse> executeWithHttpInfo() throws ApiException {
            return listAllWithHttpInfo(limit, startingAfter, endingBefore);
        }

        /**
         * Execute listAll request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PaymentcustomersListAllResponse> _callback) throws ApiException {
            return listAllAsync(limit, startingAfter, endingBefore, _callback);
        }
    }

    /**
     * List all Payment Customers
     * List all payment customers
     * @return ListAllRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ListAllRequestBuilder listAll() throws IllegalArgumentException {
        return new ListAllRequestBuilder();
    }
}