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


import com.konfigthis.client.model.PaymentMethod;
import com.konfigthis.client.model.PaymentmethodsAttachPaymentMethodRequest;
import com.konfigthis.client.model.PaymentmethodsDetachPaymentMethodRequest;
import com.konfigthis.client.model.PaymentmethodsListAllPaymentCustomerResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class PaymentMethodsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PaymentMethodsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public PaymentMethodsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call attachPaymentMethodCall(String paymentMethodId, PaymentmethodsAttachPaymentMethodRequest paymentmethodsAttachPaymentMethodRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = paymentmethodsAttachPaymentMethodRequest;

        // create path and map variables
        String localVarPath = "/v2/payment-methods/{payment_method_id}/attach"
            .replace("{" + "payment_method_id" + "}", localVarApiClient.escapeString(paymentMethodId.toString()));

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
    private okhttp3.Call attachPaymentMethodValidateBeforeCall(String paymentMethodId, PaymentmethodsAttachPaymentMethodRequest paymentmethodsAttachPaymentMethodRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'paymentMethodId' is set
        if (paymentMethodId == null) {
            throw new ApiException("Missing the required parameter 'paymentMethodId' when calling attachPaymentMethod(Async)");
        }

        return attachPaymentMethodCall(paymentMethodId, paymentmethodsAttachPaymentMethodRequest, _callback);

    }


    private ApiResponse<PaymentMethod> attachPaymentMethodWithHttpInfo(String paymentMethodId, PaymentmethodsAttachPaymentMethodRequest paymentmethodsAttachPaymentMethodRequest) throws ApiException {
        okhttp3.Call localVarCall = attachPaymentMethodValidateBeforeCall(paymentMethodId, paymentmethodsAttachPaymentMethodRequest, null);
        Type localVarReturnType = new TypeToken<PaymentMethod>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call attachPaymentMethodAsync(String paymentMethodId, PaymentmethodsAttachPaymentMethodRequest paymentmethodsAttachPaymentMethodRequest, final ApiCallback<PaymentMethod> _callback) throws ApiException {

        okhttp3.Call localVarCall = attachPaymentMethodValidateBeforeCall(paymentMethodId, paymentmethodsAttachPaymentMethodRequest, _callback);
        Type localVarReturnType = new TypeToken<PaymentMethod>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class AttachPaymentMethodRequestBuilder {
        private final String customerId;
        private final String paymentMethodId;

        private AttachPaymentMethodRequestBuilder(String customerId, String paymentMethodId) {
            this.customerId = customerId;
            this.paymentMethodId = paymentMethodId;
        }

        /**
         * Build call for attachPaymentMethod
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
            PaymentmethodsAttachPaymentMethodRequest paymentmethodsAttachPaymentMethodRequest = buildBodyParams();
            return attachPaymentMethodCall(paymentMethodId, paymentmethodsAttachPaymentMethodRequest, _callback);
        }

        private PaymentmethodsAttachPaymentMethodRequest buildBodyParams() {
            PaymentmethodsAttachPaymentMethodRequest paymentmethodsAttachPaymentMethodRequest = new PaymentmethodsAttachPaymentMethodRequest();
            paymentmethodsAttachPaymentMethodRequest.customerId(this.customerId);
            return paymentmethodsAttachPaymentMethodRequest;
        }

        /**
         * Execute attachPaymentMethod request
         * @return PaymentMethod
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public PaymentMethod execute() throws ApiException {
            PaymentmethodsAttachPaymentMethodRequest paymentmethodsAttachPaymentMethodRequest = buildBodyParams();
            ApiResponse<PaymentMethod> localVarResp = attachPaymentMethodWithHttpInfo(paymentMethodId, paymentmethodsAttachPaymentMethodRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute attachPaymentMethod request with HTTP info returned
         * @return ApiResponse&lt;PaymentMethod&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PaymentMethod> executeWithHttpInfo() throws ApiException {
            PaymentmethodsAttachPaymentMethodRequest paymentmethodsAttachPaymentMethodRequest = buildBodyParams();
            return attachPaymentMethodWithHttpInfo(paymentMethodId, paymentmethodsAttachPaymentMethodRequest);
        }

        /**
         * Execute attachPaymentMethod request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PaymentMethod> _callback) throws ApiException {
            PaymentmethodsAttachPaymentMethodRequest paymentmethodsAttachPaymentMethodRequest = buildBodyParams();
            return attachPaymentMethodAsync(paymentMethodId, paymentmethodsAttachPaymentMethodRequest, _callback);
        }
    }

    /**
     * Attach a Payment Method to a Payment Customer
     * Attach a payment method to a payment customer for future usage.
     * @param paymentMethodId The ID of the payment method. (required)
     * @return AttachPaymentMethodRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public AttachPaymentMethodRequestBuilder attachPaymentMethod(String customerId, String paymentMethodId) throws IllegalArgumentException {
        if (customerId == null) throw new IllegalArgumentException("\"customerId\" is required but got null");
            

        if (paymentMethodId == null) throw new IllegalArgumentException("\"paymentMethodId\" is required but got null");
            

        return new AttachPaymentMethodRequestBuilder(customerId, paymentMethodId);
    }
    private okhttp3.Call detachPaymentMethodCall(String paymentMethodId, PaymentmethodsDetachPaymentMethodRequest paymentmethodsDetachPaymentMethodRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = paymentmethodsDetachPaymentMethodRequest;

        // create path and map variables
        String localVarPath = "/v2/payment-methods/{payment_method_id}/detach"
            .replace("{" + "payment_method_id" + "}", localVarApiClient.escapeString(paymentMethodId.toString()));

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
    private okhttp3.Call detachPaymentMethodValidateBeforeCall(String paymentMethodId, PaymentmethodsDetachPaymentMethodRequest paymentmethodsDetachPaymentMethodRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'paymentMethodId' is set
        if (paymentMethodId == null) {
            throw new ApiException("Missing the required parameter 'paymentMethodId' when calling detachPaymentMethod(Async)");
        }

        return detachPaymentMethodCall(paymentMethodId, paymentmethodsDetachPaymentMethodRequest, _callback);

    }


    private ApiResponse<PaymentMethod> detachPaymentMethodWithHttpInfo(String paymentMethodId, PaymentmethodsDetachPaymentMethodRequest paymentmethodsDetachPaymentMethodRequest) throws ApiException {
        okhttp3.Call localVarCall = detachPaymentMethodValidateBeforeCall(paymentMethodId, paymentmethodsDetachPaymentMethodRequest, null);
        Type localVarReturnType = new TypeToken<PaymentMethod>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call detachPaymentMethodAsync(String paymentMethodId, PaymentmethodsDetachPaymentMethodRequest paymentmethodsDetachPaymentMethodRequest, final ApiCallback<PaymentMethod> _callback) throws ApiException {

        okhttp3.Call localVarCall = detachPaymentMethodValidateBeforeCall(paymentMethodId, paymentmethodsDetachPaymentMethodRequest, _callback);
        Type localVarReturnType = new TypeToken<PaymentMethod>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class DetachPaymentMethodRequestBuilder {
        private final String paymentMethodId;
        private String customerId;

        private DetachPaymentMethodRequestBuilder(String paymentMethodId) {
            this.paymentMethodId = paymentMethodId;
        }

        /**
         * Set customerId
         * @param customerId ID of the payment customer to detach the payment method from. (optional)
         * @return DetachPaymentMethodRequestBuilder
         */
        public DetachPaymentMethodRequestBuilder customerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        
        /**
         * Build call for detachPaymentMethod
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
            PaymentmethodsDetachPaymentMethodRequest paymentmethodsDetachPaymentMethodRequest = buildBodyParams();
            return detachPaymentMethodCall(paymentMethodId, paymentmethodsDetachPaymentMethodRequest, _callback);
        }

        private PaymentmethodsDetachPaymentMethodRequest buildBodyParams() {
            PaymentmethodsDetachPaymentMethodRequest paymentmethodsDetachPaymentMethodRequest = new PaymentmethodsDetachPaymentMethodRequest();
            paymentmethodsDetachPaymentMethodRequest.customerId(this.customerId);
            return paymentmethodsDetachPaymentMethodRequest;
        }

        /**
         * Execute detachPaymentMethod request
         * @return PaymentMethod
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public PaymentMethod execute() throws ApiException {
            PaymentmethodsDetachPaymentMethodRequest paymentmethodsDetachPaymentMethodRequest = buildBodyParams();
            ApiResponse<PaymentMethod> localVarResp = detachPaymentMethodWithHttpInfo(paymentMethodId, paymentmethodsDetachPaymentMethodRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute detachPaymentMethod request with HTTP info returned
         * @return ApiResponse&lt;PaymentMethod&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PaymentMethod> executeWithHttpInfo() throws ApiException {
            PaymentmethodsDetachPaymentMethodRequest paymentmethodsDetachPaymentMethodRequest = buildBodyParams();
            return detachPaymentMethodWithHttpInfo(paymentMethodId, paymentmethodsDetachPaymentMethodRequest);
        }

        /**
         * Execute detachPaymentMethod request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PaymentMethod> _callback) throws ApiException {
            PaymentmethodsDetachPaymentMethodRequest paymentmethodsDetachPaymentMethodRequest = buildBodyParams();
            return detachPaymentMethodAsync(paymentMethodId, paymentmethodsDetachPaymentMethodRequest, _callback);
        }
    }

    /**
     * Detach Payment Method from a Payment Customer
     * Detach a payment method from a payment customer
     * @param paymentMethodId ID of the payment method. (required)
     * @return DetachPaymentMethodRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public DetachPaymentMethodRequestBuilder detachPaymentMethod(String paymentMethodId) throws IllegalArgumentException {
        if (paymentMethodId == null) throw new IllegalArgumentException("\"paymentMethodId\" is required but got null");
            

        return new DetachPaymentMethodRequestBuilder(paymentMethodId);
    }
    private okhttp3.Call getByIdCall(String paymentMethodId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v2/payment-methods/{payment_method_id}"
            .replace("{" + "payment_method_id" + "}", localVarApiClient.escapeString(paymentMethodId.toString()));

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
    private okhttp3.Call getByIdValidateBeforeCall(String paymentMethodId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'paymentMethodId' is set
        if (paymentMethodId == null) {
            throw new ApiException("Missing the required parameter 'paymentMethodId' when calling getById(Async)");
        }

        return getByIdCall(paymentMethodId, _callback);

    }


    private ApiResponse<PaymentMethod> getByIdWithHttpInfo(String paymentMethodId) throws ApiException {
        okhttp3.Call localVarCall = getByIdValidateBeforeCall(paymentMethodId, null);
        Type localVarReturnType = new TypeToken<PaymentMethod>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getByIdAsync(String paymentMethodId, final ApiCallback<PaymentMethod> _callback) throws ApiException {

        okhttp3.Call localVarCall = getByIdValidateBeforeCall(paymentMethodId, _callback);
        Type localVarReturnType = new TypeToken<PaymentMethod>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetByIdRequestBuilder {
        private final String paymentMethodId;

        private GetByIdRequestBuilder(String paymentMethodId) {
            this.paymentMethodId = paymentMethodId;
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
            return getByIdCall(paymentMethodId, _callback);
        }


        /**
         * Execute getById request
         * @return PaymentMethod
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public PaymentMethod execute() throws ApiException {
            ApiResponse<PaymentMethod> localVarResp = getByIdWithHttpInfo(paymentMethodId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getById request with HTTP info returned
         * @return ApiResponse&lt;PaymentMethod&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PaymentMethod> executeWithHttpInfo() throws ApiException {
            return getByIdWithHttpInfo(paymentMethodId);
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
        public okhttp3.Call executeAsync(final ApiCallback<PaymentMethod> _callback) throws ApiException {
            return getByIdAsync(paymentMethodId, _callback);
        }
    }

    /**
     * Retrieve a Payment Method
     * Get a payment method by its ID.
     * @param paymentMethodId ID of the payment method to get (required)
     * @return GetByIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GetByIdRequestBuilder getById(String paymentMethodId) throws IllegalArgumentException {
        if (paymentMethodId == null) throw new IllegalArgumentException("\"paymentMethodId\" is required but got null");
            

        return new GetByIdRequestBuilder(paymentMethodId);
    }
    private okhttp3.Call listAllPaymentCustomerCall(String customerId, Double limit, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v2/payment-methods";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (customerId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("customer_id", customerId));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
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
    private okhttp3.Call listAllPaymentCustomerValidateBeforeCall(String customerId, Double limit, final ApiCallback _callback) throws ApiException {
        return listAllPaymentCustomerCall(customerId, limit, _callback);

    }


    private ApiResponse<PaymentmethodsListAllPaymentCustomerResponse> listAllPaymentCustomerWithHttpInfo(String customerId, Double limit) throws ApiException {
        okhttp3.Call localVarCall = listAllPaymentCustomerValidateBeforeCall(customerId, limit, null);
        Type localVarReturnType = new TypeToken<PaymentmethodsListAllPaymentCustomerResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAllPaymentCustomerAsync(String customerId, Double limit, final ApiCallback<PaymentmethodsListAllPaymentCustomerResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listAllPaymentCustomerValidateBeforeCall(customerId, limit, _callback);
        Type localVarReturnType = new TypeToken<PaymentmethodsListAllPaymentCustomerResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListAllPaymentCustomerRequestBuilder {
        private String customerId;
        private Double limit;

        private ListAllPaymentCustomerRequestBuilder() {
        }

        /**
         * Set customerId
         * @param customerId Payment Customer ID (optional)
         * @return ListAllPaymentCustomerRequestBuilder
         */
        public ListAllPaymentCustomerRequestBuilder customerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        
        /**
         * Set limit
         * @param limit Number or payment methods to return (optional)
         * @return ListAllPaymentCustomerRequestBuilder
         */
        public ListAllPaymentCustomerRequestBuilder limit(Double limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Build call for listAllPaymentCustomer
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
            return listAllPaymentCustomerCall(customerId, limit, _callback);
        }


        /**
         * Execute listAllPaymentCustomer request
         * @return PaymentmethodsListAllPaymentCustomerResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public PaymentmethodsListAllPaymentCustomerResponse execute() throws ApiException {
            ApiResponse<PaymentmethodsListAllPaymentCustomerResponse> localVarResp = listAllPaymentCustomerWithHttpInfo(customerId, limit);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listAllPaymentCustomer request with HTTP info returned
         * @return ApiResponse&lt;PaymentmethodsListAllPaymentCustomerResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PaymentmethodsListAllPaymentCustomerResponse> executeWithHttpInfo() throws ApiException {
            return listAllPaymentCustomerWithHttpInfo(customerId, limit);
        }

        /**
         * Execute listAllPaymentCustomer request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PaymentmethodsListAllPaymentCustomerResponse> _callback) throws ApiException {
            return listAllPaymentCustomerAsync(customerId, limit, _callback);
        }
    }

    /**
     * List all Payment Methods for a Payment Customer
     * Get the payment methods for a payment customer
     * @return ListAllPaymentCustomerRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ListAllPaymentCustomerRequestBuilder listAllPaymentCustomer() throws IllegalArgumentException {
        return new ListAllPaymentCustomerRequestBuilder();
    }
}