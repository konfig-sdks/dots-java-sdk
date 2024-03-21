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


import com.konfigthis.client.model.Refund;
import com.konfigthis.client.model.RefundsCreateRefundRequest;
import com.konfigthis.client.model.RefundsGetAllResponse;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class RefundsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public RefundsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public RefundsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call createRefundCall(RefundsCreateRefundRequest refundsCreateRefundRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = refundsCreateRefundRequest;

        // create path and map variables
        String localVarPath = "/v2/refunds";

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
    private okhttp3.Call createRefundValidateBeforeCall(RefundsCreateRefundRequest refundsCreateRefundRequest, final ApiCallback _callback) throws ApiException {
        return createRefundCall(refundsCreateRefundRequest, _callback);

    }


    private ApiResponse<Refund> createRefundWithHttpInfo(RefundsCreateRefundRequest refundsCreateRefundRequest) throws ApiException {
        okhttp3.Call localVarCall = createRefundValidateBeforeCall(refundsCreateRefundRequest, null);
        Type localVarReturnType = new TypeToken<Refund>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createRefundAsync(RefundsCreateRefundRequest refundsCreateRefundRequest, final ApiCallback<Refund> _callback) throws ApiException {

        okhttp3.Call localVarCall = createRefundValidateBeforeCall(refundsCreateRefundRequest, _callback);
        Type localVarReturnType = new TypeToken<Refund>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateRefundRequestBuilder {
        private final Integer amount;
        private final UUID paymentIntentId;
        private String reason;
        private Boolean metadata;

        private CreateRefundRequestBuilder(Integer amount, UUID paymentIntentId) {
            this.amount = amount;
            this.paymentIntentId = paymentIntentId;
        }

        /**
         * Set reason
         * @param reason  (optional)
         * @return CreateRefundRequestBuilder
         */
        public CreateRefundRequestBuilder reason(String reason) {
            this.reason = reason;
            return this;
        }
        
        /**
         * Set metadata
         * @param metadata Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. (optional)
         * @return CreateRefundRequestBuilder
         */
        public CreateRefundRequestBuilder metadata(Boolean metadata) {
            this.metadata = metadata;
            return this;
        }
        
        /**
         * Build call for createRefund
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
            RefundsCreateRefundRequest refundsCreateRefundRequest = buildBodyParams();
            return createRefundCall(refundsCreateRefundRequest, _callback);
        }

        private RefundsCreateRefundRequest buildBodyParams() {
            RefundsCreateRefundRequest refundsCreateRefundRequest = new RefundsCreateRefundRequest();
            refundsCreateRefundRequest.amount(this.amount);
            refundsCreateRefundRequest.paymentIntentId(this.paymentIntentId);
            if (this.reason != null)
            refundsCreateRefundRequest.reason(RefundsCreateRefundRequest.ReasonEnum.fromValue(this.reason));
            refundsCreateRefundRequest.metadata(this.metadata);
            return refundsCreateRefundRequest;
        }

        /**
         * Execute createRefund request
         * @return Refund
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public Refund execute() throws ApiException {
            RefundsCreateRefundRequest refundsCreateRefundRequest = buildBodyParams();
            ApiResponse<Refund> localVarResp = createRefundWithHttpInfo(refundsCreateRefundRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createRefund request with HTTP info returned
         * @return ApiResponse&lt;Refund&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Refund> executeWithHttpInfo() throws ApiException {
            RefundsCreateRefundRequest refundsCreateRefundRequest = buildBodyParams();
            return createRefundWithHttpInfo(refundsCreateRefundRequest);
        }

        /**
         * Execute createRefund request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Refund> _callback) throws ApiException {
            RefundsCreateRefundRequest refundsCreateRefundRequest = buildBodyParams();
            return createRefundAsync(refundsCreateRefundRequest, _callback);
        }
    }

    /**
     * Create a Refund
     * Create a Refund
     * @return CreateRefundRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CreateRefundRequestBuilder createRefund(Integer amount, UUID paymentIntentId) throws IllegalArgumentException {
        if (amount == null) throw new IllegalArgumentException("\"amount\" is required but got null");
        if (paymentIntentId == null) throw new IllegalArgumentException("\"paymentIntentId\" is required but got null");
            

        return new CreateRefundRequestBuilder(amount, paymentIntentId);
    }
    private okhttp3.Call getAllCall(String limit, String startingAfter, String endingBefore, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v2/refunds";

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
    private okhttp3.Call getAllValidateBeforeCall(String limit, String startingAfter, String endingBefore, final ApiCallback _callback) throws ApiException {
        return getAllCall(limit, startingAfter, endingBefore, _callback);

    }


    private ApiResponse<RefundsGetAllResponse> getAllWithHttpInfo(String limit, String startingAfter, String endingBefore) throws ApiException {
        okhttp3.Call localVarCall = getAllValidateBeforeCall(limit, startingAfter, endingBefore, null);
        Type localVarReturnType = new TypeToken<RefundsGetAllResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAllAsync(String limit, String startingAfter, String endingBefore, final ApiCallback<RefundsGetAllResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAllValidateBeforeCall(limit, startingAfter, endingBefore, _callback);
        Type localVarReturnType = new TypeToken<RefundsGetAllResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetAllRequestBuilder {
        private String limit;
        private String startingAfter;
        private String endingBefore;

        private GetAllRequestBuilder() {
        }

        /**
         * Set limit
         * @param limit A limit on the number of objects to be returned, between 1 and 100. (optional)
         * @return GetAllRequestBuilder
         */
        public GetAllRequestBuilder limit(String limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Set startingAfter
         * @param startingAfter A cursor for use in pagination. &#x60;starting_after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with &#x60;aaa&#x60;, your subsequent call can include &#x60;starting_after&#x60;&#x3D;&#x60;aaa&#x60; in order to fetch the next page of the list. (optional)
         * @return GetAllRequestBuilder
         */
        public GetAllRequestBuilder startingAfter(String startingAfter) {
            this.startingAfter = startingAfter;
            return this;
        }
        
        /**
         * Set endingBefore
         * @param endingBefore A cursor for use in pagination. &#x60;ending_before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with &#x60;aaa&#x60;, your subsequent call can include &#x60;ending_before&#x60;&#x3D;&#x60;aaa&#x60; in order to fetch the previous page of the list. (optional)
         * @return GetAllRequestBuilder
         */
        public GetAllRequestBuilder endingBefore(String endingBefore) {
            this.endingBefore = endingBefore;
            return this;
        }
        
        /**
         * Build call for getAll
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
            return getAllCall(limit, startingAfter, endingBefore, _callback);
        }


        /**
         * Execute getAll request
         * @return RefundsGetAllResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public RefundsGetAllResponse execute() throws ApiException {
            ApiResponse<RefundsGetAllResponse> localVarResp = getAllWithHttpInfo(limit, startingAfter, endingBefore);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getAll request with HTTP info returned
         * @return ApiResponse&lt;RefundsGetAllResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<RefundsGetAllResponse> executeWithHttpInfo() throws ApiException {
            return getAllWithHttpInfo(limit, startingAfter, endingBefore);
        }

        /**
         * Execute getAll request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<RefundsGetAllResponse> _callback) throws ApiException {
            return getAllAsync(limit, startingAfter, endingBefore, _callback);
        }
    }

    /**
     * List all Refunds
     * List all refunds
     * @return GetAllRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GetAllRequestBuilder getAll() throws IllegalArgumentException {
        return new GetAllRequestBuilder();
    }
    private okhttp3.Call getByIdCall(String refundId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v2/refunds/{refund_id}"
            .replace("{" + "refund_id" + "}", localVarApiClient.escapeString(refundId.toString()));

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
    private okhttp3.Call getByIdValidateBeforeCall(String refundId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'refundId' is set
        if (refundId == null) {
            throw new ApiException("Missing the required parameter 'refundId' when calling getById(Async)");
        }

        return getByIdCall(refundId, _callback);

    }


    private ApiResponse<Refund> getByIdWithHttpInfo(String refundId) throws ApiException {
        okhttp3.Call localVarCall = getByIdValidateBeforeCall(refundId, null);
        Type localVarReturnType = new TypeToken<Refund>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getByIdAsync(String refundId, final ApiCallback<Refund> _callback) throws ApiException {

        okhttp3.Call localVarCall = getByIdValidateBeforeCall(refundId, _callback);
        Type localVarReturnType = new TypeToken<Refund>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetByIdRequestBuilder {
        private final String refundId;

        private GetByIdRequestBuilder(String refundId) {
            this.refundId = refundId;
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
            return getByIdCall(refundId, _callback);
        }


        /**
         * Execute getById request
         * @return Refund
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public Refund execute() throws ApiException {
            ApiResponse<Refund> localVarResp = getByIdWithHttpInfo(refundId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getById request with HTTP info returned
         * @return ApiResponse&lt;Refund&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Refund> executeWithHttpInfo() throws ApiException {
            return getByIdWithHttpInfo(refundId);
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
        public okhttp3.Call executeAsync(final ApiCallback<Refund> _callback) throws ApiException {
            return getByIdAsync(refundId, _callback);
        }
    }

    /**
     * Retrieve a Refund
     * Retreieve a refund by its ID
     * @param refundId ID of the refund to retrieve (required)
     * @return GetByIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GetByIdRequestBuilder getById(String refundId) throws IllegalArgumentException {
        if (refundId == null) throw new IllegalArgumentException("\"refundId\" is required but got null");
            

        return new GetByIdRequestBuilder(refundId);
    }
}
