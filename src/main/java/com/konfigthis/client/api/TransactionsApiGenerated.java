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


import com.konfigthis.client.model.Transaction;
import com.konfigthis.client.model.TransactionsListAllResponse;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class TransactionsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TransactionsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public TransactionsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getByIdCall(String transactionId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v2/transactions/{transaction_id}"
            .replace("{" + "transaction_id" + "}", localVarApiClient.escapeString(transactionId.toString()));

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
    private okhttp3.Call getByIdValidateBeforeCall(String transactionId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new ApiException("Missing the required parameter 'transactionId' when calling getById(Async)");
        }

        return getByIdCall(transactionId, _callback);

    }


    private ApiResponse<Transaction> getByIdWithHttpInfo(String transactionId) throws ApiException {
        okhttp3.Call localVarCall = getByIdValidateBeforeCall(transactionId, null);
        Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getByIdAsync(String transactionId, final ApiCallback<Transaction> _callback) throws ApiException {

        okhttp3.Call localVarCall = getByIdValidateBeforeCall(transactionId, _callback);
        Type localVarReturnType = new TypeToken<Transaction>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetByIdRequestBuilder {
        private final String transactionId;

        private GetByIdRequestBuilder(String transactionId) {
            this.transactionId = transactionId;
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
            return getByIdCall(transactionId, _callback);
        }


        /**
         * Execute getById request
         * @return Transaction
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public Transaction execute() throws ApiException {
            ApiResponse<Transaction> localVarResp = getByIdWithHttpInfo(transactionId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getById request with HTTP info returned
         * @return ApiResponse&lt;Transaction&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Transaction> executeWithHttpInfo() throws ApiException {
            return getByIdWithHttpInfo(transactionId);
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
        public okhttp3.Call executeAsync(final ApiCallback<Transaction> _callback) throws ApiException {
            return getByIdAsync(transactionId, _callback);
        }
    }

    /**
     * Retrieve a Transaction
     * Get a transaction by its id.
     * @param transactionId Id of the transaction (required)
     * @return GetByIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GetByIdRequestBuilder getById(String transactionId) throws IllegalArgumentException {
        if (transactionId == null) throw new IllegalArgumentException("\"transactionId\" is required but got null");
            

        return new GetByIdRequestBuilder(transactionId);
    }
    private okhttp3.Call listAllCall(Integer limit, UUID startingAfter, UUID endingBefore, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v2/transactions";

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
    private okhttp3.Call listAllValidateBeforeCall(Integer limit, UUID startingAfter, UUID endingBefore, final ApiCallback _callback) throws ApiException {
        return listAllCall(limit, startingAfter, endingBefore, _callback);

    }


    private ApiResponse<TransactionsListAllResponse> listAllWithHttpInfo(Integer limit, UUID startingAfter, UUID endingBefore) throws ApiException {
        okhttp3.Call localVarCall = listAllValidateBeforeCall(limit, startingAfter, endingBefore, null);
        Type localVarReturnType = new TypeToken<TransactionsListAllResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAllAsync(Integer limit, UUID startingAfter, UUID endingBefore, final ApiCallback<TransactionsListAllResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listAllValidateBeforeCall(limit, startingAfter, endingBefore, _callback);
        Type localVarReturnType = new TypeToken<TransactionsListAllResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListAllRequestBuilder {
        private Integer limit;
        private UUID startingAfter;
        private UUID endingBefore;

        private ListAllRequestBuilder() {
        }

        /**
         * Set limit
         * @param limit A limit on the number of objects to be returned, between 1 and 100. (optional)
         * @return ListAllRequestBuilder
         */
        public ListAllRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Set startingAfter
         * @param startingAfter A cursor for use in pagination. &#x60;starting_after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with &#x60;aaa&#x60;, your subsequent call can include &#x60;starting_after&#x60;&#x3D;&#x60;aaa&#x60; in order to fetch the next page of the list. (optional)
         * @return ListAllRequestBuilder
         */
        public ListAllRequestBuilder startingAfter(UUID startingAfter) {
            this.startingAfter = startingAfter;
            return this;
        }
        
        /**
         * Set endingBefore
         * @param endingBefore A cursor for use in pagination. &#x60;ending_before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with &#x60;aaa&#x60;, your subsequent call can include &#x60;ending_before&#x60;&#x3D;&#x60;aaa&#x60; in order to fetch the previous page of the list. (optional)
         * @return ListAllRequestBuilder
         */
        public ListAllRequestBuilder endingBefore(UUID endingBefore) {
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
         * @return TransactionsListAllResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public TransactionsListAllResponse execute() throws ApiException {
            ApiResponse<TransactionsListAllResponse> localVarResp = listAllWithHttpInfo(limit, startingAfter, endingBefore);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listAll request with HTTP info returned
         * @return ApiResponse&lt;TransactionsListAllResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<TransactionsListAllResponse> executeWithHttpInfo() throws ApiException {
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
        public okhttp3.Call executeAsync(final ApiCallback<TransactionsListAllResponse> _callback) throws ApiException {
            return listAllAsync(limit, startingAfter, endingBefore, _callback);
        }
    }

    /**
     * List all Transactions
     * List all transactions.
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
