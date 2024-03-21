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


import com.konfigthis.client.model.TransferbatchesCreateBatchRequest;
import com.konfigthis.client.model.TransferbatchesCreateBatchRequestItemsInner;
import com.konfigthis.client.model.TransferbatchesCreateBatchResponse;
import com.konfigthis.client.model.TransferbatchesGetByIdResponse;
import com.konfigthis.client.model.TransferbatchesListAllResponse;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class TransferBatchesApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TransferBatchesApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public TransferBatchesApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call createBatchCall(TransferbatchesCreateBatchRequest transferbatchesCreateBatchRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = transferbatchesCreateBatchRequest;

        // create path and map variables
        String localVarPath = "/v2/transfer-batches";

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
            "application/json",
            "application/xml"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createBatchValidateBeforeCall(TransferbatchesCreateBatchRequest transferbatchesCreateBatchRequest, final ApiCallback _callback) throws ApiException {
        return createBatchCall(transferbatchesCreateBatchRequest, _callback);

    }


    private ApiResponse<TransferbatchesCreateBatchResponse> createBatchWithHttpInfo(TransferbatchesCreateBatchRequest transferbatchesCreateBatchRequest) throws ApiException {
        okhttp3.Call localVarCall = createBatchValidateBeforeCall(transferbatchesCreateBatchRequest, null);
        Type localVarReturnType = new TypeToken<TransferbatchesCreateBatchResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createBatchAsync(TransferbatchesCreateBatchRequest transferbatchesCreateBatchRequest, final ApiCallback<TransferbatchesCreateBatchResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createBatchValidateBeforeCall(transferbatchesCreateBatchRequest, _callback);
        Type localVarReturnType = new TypeToken<TransferbatchesCreateBatchResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateBatchRequestBuilder {
        private List<TransferbatchesCreateBatchRequestItemsInner> items;
        private UUID idempotencyKey;
        private Object metadata;

        private CreateBatchRequestBuilder() {
        }

        /**
         * Set items
         * @param items  (optional)
         * @return CreateBatchRequestBuilder
         */
        public CreateBatchRequestBuilder items(List<TransferbatchesCreateBatchRequestItemsInner> items) {
            this.items = items;
            return this;
        }
        
        /**
         * Set idempotencyKey
         * @param idempotencyKey  (optional)
         * @return CreateBatchRequestBuilder
         */
        public CreateBatchRequestBuilder idempotencyKey(UUID idempotencyKey) {
            this.idempotencyKey = idempotencyKey;
            return this;
        }
        
        /**
         * Set metadata
         * @param metadata  (optional)
         * @return CreateBatchRequestBuilder
         */
        public CreateBatchRequestBuilder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }
        
        /**
         * Build call for createBatch
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
            TransferbatchesCreateBatchRequest transferbatchesCreateBatchRequest = buildBodyParams();
            return createBatchCall(transferbatchesCreateBatchRequest, _callback);
        }

        private TransferbatchesCreateBatchRequest buildBodyParams() {
            TransferbatchesCreateBatchRequest transferbatchesCreateBatchRequest = new TransferbatchesCreateBatchRequest();
            transferbatchesCreateBatchRequest.items(this.items);
            transferbatchesCreateBatchRequest.idempotencyKey(this.idempotencyKey);
            transferbatchesCreateBatchRequest.metadata(this.metadata);
            return transferbatchesCreateBatchRequest;
        }

        /**
         * Execute createBatch request
         * @return TransferbatchesCreateBatchResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public TransferbatchesCreateBatchResponse execute() throws ApiException {
            TransferbatchesCreateBatchRequest transferbatchesCreateBatchRequest = buildBodyParams();
            ApiResponse<TransferbatchesCreateBatchResponse> localVarResp = createBatchWithHttpInfo(transferbatchesCreateBatchRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createBatch request with HTTP info returned
         * @return ApiResponse&lt;TransferbatchesCreateBatchResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<TransferbatchesCreateBatchResponse> executeWithHttpInfo() throws ApiException {
            TransferbatchesCreateBatchRequest transferbatchesCreateBatchRequest = buildBodyParams();
            return createBatchWithHttpInfo(transferbatchesCreateBatchRequest);
        }

        /**
         * Execute createBatch request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<TransferbatchesCreateBatchResponse> _callback) throws ApiException {
            TransferbatchesCreateBatchRequest transferbatchesCreateBatchRequest = buildBodyParams();
            return createBatchAsync(transferbatchesCreateBatchRequest, _callback);
        }
    }

    /**
     * Create a Transfer Batch
     * Create a transfer batch
     * @return CreateBatchRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CreateBatchRequestBuilder createBatch() throws IllegalArgumentException {
        return new CreateBatchRequestBuilder();
    }
    private okhttp3.Call getByIdCall(String transferBatchId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v2/transfer-batches/{transfer_batch_id}"
            .replace("{" + "transfer_batch_id" + "}", localVarApiClient.escapeString(transferBatchId.toString()));

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
    private okhttp3.Call getByIdValidateBeforeCall(String transferBatchId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'transferBatchId' is set
        if (transferBatchId == null) {
            throw new ApiException("Missing the required parameter 'transferBatchId' when calling getById(Async)");
        }

        return getByIdCall(transferBatchId, _callback);

    }


    private ApiResponse<TransferbatchesGetByIdResponse> getByIdWithHttpInfo(String transferBatchId) throws ApiException {
        okhttp3.Call localVarCall = getByIdValidateBeforeCall(transferBatchId, null);
        Type localVarReturnType = new TypeToken<TransferbatchesGetByIdResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getByIdAsync(String transferBatchId, final ApiCallback<TransferbatchesGetByIdResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getByIdValidateBeforeCall(transferBatchId, _callback);
        Type localVarReturnType = new TypeToken<TransferbatchesGetByIdResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetByIdRequestBuilder {
        private final String transferBatchId;

        private GetByIdRequestBuilder(String transferBatchId) {
            this.transferBatchId = transferBatchId;
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
            return getByIdCall(transferBatchId, _callback);
        }


        /**
         * Execute getById request
         * @return TransferbatchesGetByIdResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public TransferbatchesGetByIdResponse execute() throws ApiException {
            ApiResponse<TransferbatchesGetByIdResponse> localVarResp = getByIdWithHttpInfo(transferBatchId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getById request with HTTP info returned
         * @return ApiResponse&lt;TransferbatchesGetByIdResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<TransferbatchesGetByIdResponse> executeWithHttpInfo() throws ApiException {
            return getByIdWithHttpInfo(transferBatchId);
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
        public okhttp3.Call executeAsync(final ApiCallback<TransferbatchesGetByIdResponse> _callback) throws ApiException {
            return getByIdAsync(transferBatchId, _callback);
        }
    }

    /**
     * Retrieve a Transfer Batch
     * Get a transfer batch by id
     * @param transferBatchId Id of the transfer batch to fetch (required)
     * @return GetByIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GetByIdRequestBuilder getById(String transferBatchId) throws IllegalArgumentException {
        if (transferBatchId == null) throw new IllegalArgumentException("\"transferBatchId\" is required but got null");
            

        return new GetByIdRequestBuilder(transferBatchId);
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
        String localVarPath = "/v2/transfer-batches";

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


    private ApiResponse<TransferbatchesListAllResponse> listAllWithHttpInfo(String limit, String startingAfter, String endingBefore) throws ApiException {
        okhttp3.Call localVarCall = listAllValidateBeforeCall(limit, startingAfter, endingBefore, null);
        Type localVarReturnType = new TypeToken<TransferbatchesListAllResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAllAsync(String limit, String startingAfter, String endingBefore, final ApiCallback<TransferbatchesListAllResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listAllValidateBeforeCall(limit, startingAfter, endingBefore, _callback);
        Type localVarReturnType = new TypeToken<TransferbatchesListAllResponse>(){}.getType();
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
         * @return TransferbatchesListAllResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public TransferbatchesListAllResponse execute() throws ApiException {
            ApiResponse<TransferbatchesListAllResponse> localVarResp = listAllWithHttpInfo(limit, startingAfter, endingBefore);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listAll request with HTTP info returned
         * @return ApiResponse&lt;TransferbatchesListAllResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<TransferbatchesListAllResponse> executeWithHttpInfo() throws ApiException {
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
        public okhttp3.Call executeAsync(final ApiCallback<TransferbatchesListAllResponse> _callback) throws ApiException {
            return listAllAsync(limit, startingAfter, endingBefore, _callback);
        }
    }

    /**
     * List all Transfer Batches
     * Get a transfer batch
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