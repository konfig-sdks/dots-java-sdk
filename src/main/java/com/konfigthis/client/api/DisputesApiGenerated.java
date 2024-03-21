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


import com.konfigthis.client.model.Dispute;
import com.konfigthis.client.model.DisputesAddEvidenceFileRequest;
import com.konfigthis.client.model.DisputesGetAllResponse;
import com.konfigthis.client.model.DisputesSubmitDisputeRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class DisputesApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DisputesApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public DisputesApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call addEvidenceFileCall(String disputeId, String type, String content, DisputesAddEvidenceFileRequest disputesAddEvidenceFileRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = disputesAddEvidenceFileRequest;

        // create path and map variables
        String localVarPath = "/v2/disputes/{dispute_id}/evidence"
            .replace("{" + "dispute_id" + "}", localVarApiClient.escapeString(disputeId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (type != null) {
            localVarFormParams.put("type", type);
        }

        if (content != null) {
            localVarFormParams.put("content", content);
        }

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addEvidenceFileValidateBeforeCall(String disputeId, String type, String content, DisputesAddEvidenceFileRequest disputesAddEvidenceFileRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'disputeId' is set
        if (disputeId == null) {
            throw new ApiException("Missing the required parameter 'disputeId' when calling addEvidenceFile(Async)");
        }

        return addEvidenceFileCall(disputeId, type, content, disputesAddEvidenceFileRequest, _callback);

    }


    private ApiResponse<Void> addEvidenceFileWithHttpInfo(String disputeId, String type, String content, DisputesAddEvidenceFileRequest disputesAddEvidenceFileRequest) throws ApiException {
        okhttp3.Call localVarCall = addEvidenceFileValidateBeforeCall(disputeId, type, content, disputesAddEvidenceFileRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call addEvidenceFileAsync(String disputeId, String type, String content, DisputesAddEvidenceFileRequest disputesAddEvidenceFileRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = addEvidenceFileValidateBeforeCall(disputeId, type, content, disputesAddEvidenceFileRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class AddEvidenceFileRequestBuilder {
        private final String disputeId;
        private String type;
        private String content;

        private AddEvidenceFileRequestBuilder(String disputeId) {
            this.disputeId = disputeId;
        }

        /**
         * Set type
         * @param type  (optional)
         * @return AddEvidenceFileRequestBuilder
         */
        public AddEvidenceFileRequestBuilder type(String type) {
            this.type = type;
            return this;
        }
        
        /**
         * Set content
         * @param content  (optional)
         * @return AddEvidenceFileRequestBuilder
         */
        public AddEvidenceFileRequestBuilder content(String content) {
            this.content = content;
            return this;
        }
        
        /**
         * Build call for addEvidenceFile
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            DisputesAddEvidenceFileRequest disputesAddEvidenceFileRequest = buildBodyParams();
            return addEvidenceFileCall(disputeId, type, content, disputesAddEvidenceFileRequest, _callback);
        }

        private DisputesAddEvidenceFileRequest buildBodyParams() {
            DisputesAddEvidenceFileRequest disputesAddEvidenceFileRequest = new DisputesAddEvidenceFileRequest();
            if (this.type != null)
            disputesAddEvidenceFileRequest.type(DisputesAddEvidenceFileRequest.TypeEnum.fromValue(this.type));
            disputesAddEvidenceFileRequest.content(this.content);
            return disputesAddEvidenceFileRequest;
        }

        /**
         * Execute addEvidenceFile request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            DisputesAddEvidenceFileRequest disputesAddEvidenceFileRequest = buildBodyParams();
            addEvidenceFileWithHttpInfo(disputeId, type, content, disputesAddEvidenceFileRequest);
        }

        /**
         * Execute addEvidenceFile request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            DisputesAddEvidenceFileRequest disputesAddEvidenceFileRequest = buildBodyParams();
            return addEvidenceFileWithHttpInfo(disputeId, type, content, disputesAddEvidenceFileRequest);
        }

        /**
         * Execute addEvidenceFile request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            DisputesAddEvidenceFileRequest disputesAddEvidenceFileRequest = buildBodyParams();
            return addEvidenceFileAsync(disputeId, type, content, disputesAddEvidenceFileRequest, _callback);
        }
    }

    /**
     * Add Evidence to a Dispute
     * Add an evidence file to the dispute
     * @param disputeId ID of the dispute to add evidence to (required)
     * @return AddEvidenceFileRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public AddEvidenceFileRequestBuilder addEvidenceFile(String disputeId) throws IllegalArgumentException {
        if (disputeId == null) throw new IllegalArgumentException("\"disputeId\" is required but got null");
            

        return new AddEvidenceFileRequestBuilder(disputeId);
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
        String localVarPath = "/v2/disputes";

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


    private ApiResponse<DisputesGetAllResponse> getAllWithHttpInfo(String limit, String startingAfter, String endingBefore) throws ApiException {
        okhttp3.Call localVarCall = getAllValidateBeforeCall(limit, startingAfter, endingBefore, null);
        Type localVarReturnType = new TypeToken<DisputesGetAllResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAllAsync(String limit, String startingAfter, String endingBefore, final ApiCallback<DisputesGetAllResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAllValidateBeforeCall(limit, startingAfter, endingBefore, _callback);
        Type localVarReturnType = new TypeToken<DisputesGetAllResponse>(){}.getType();
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
         * @return DisputesGetAllResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public DisputesGetAllResponse execute() throws ApiException {
            ApiResponse<DisputesGetAllResponse> localVarResp = getAllWithHttpInfo(limit, startingAfter, endingBefore);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getAll request with HTTP info returned
         * @return ApiResponse&lt;DisputesGetAllResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<DisputesGetAllResponse> executeWithHttpInfo() throws ApiException {
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
        public okhttp3.Call executeAsync(final ApiCallback<DisputesGetAllResponse> _callback) throws ApiException {
            return getAllAsync(limit, startingAfter, endingBefore, _callback);
        }
    }

    /**
     * List all Disputes
     * List all disputes
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
    private okhttp3.Call getByIdCall(String disputeId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v2/disputes/{dispute_id}"
            .replace("{" + "dispute_id" + "}", localVarApiClient.escapeString(disputeId.toString()));

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
    private okhttp3.Call getByIdValidateBeforeCall(String disputeId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'disputeId' is set
        if (disputeId == null) {
            throw new ApiException("Missing the required parameter 'disputeId' when calling getById(Async)");
        }

        return getByIdCall(disputeId, _callback);

    }


    private ApiResponse<Dispute> getByIdWithHttpInfo(String disputeId) throws ApiException {
        okhttp3.Call localVarCall = getByIdValidateBeforeCall(disputeId, null);
        Type localVarReturnType = new TypeToken<Dispute>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getByIdAsync(String disputeId, final ApiCallback<Dispute> _callback) throws ApiException {

        okhttp3.Call localVarCall = getByIdValidateBeforeCall(disputeId, _callback);
        Type localVarReturnType = new TypeToken<Dispute>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetByIdRequestBuilder {
        private final String disputeId;

        private GetByIdRequestBuilder(String disputeId) {
            this.disputeId = disputeId;
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
            return getByIdCall(disputeId, _callback);
        }


        /**
         * Execute getById request
         * @return Dispute
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public Dispute execute() throws ApiException {
            ApiResponse<Dispute> localVarResp = getByIdWithHttpInfo(disputeId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getById request with HTTP info returned
         * @return ApiResponse&lt;Dispute&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Dispute> executeWithHttpInfo() throws ApiException {
            return getByIdWithHttpInfo(disputeId);
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
        public okhttp3.Call executeAsync(final ApiCallback<Dispute> _callback) throws ApiException {
            return getByIdAsync(disputeId, _callback);
        }
    }

    /**
     * Retrieve a Dispute
     * Retreieve a dispute by its ID
     * @param disputeId ID of the dispute to retrieve (required)
     * @return GetByIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GetByIdRequestBuilder getById(String disputeId) throws IllegalArgumentException {
        if (disputeId == null) throw new IllegalArgumentException("\"disputeId\" is required but got null");
            

        return new GetByIdRequestBuilder(disputeId);
    }
    private okhttp3.Call submitDisputeCall(String disputeId, DisputesSubmitDisputeRequest disputesSubmitDisputeRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = disputesSubmitDisputeRequest;

        // create path and map variables
        String localVarPath = "/v2/disputes/{dispute_id}/submit"
            .replace("{" + "dispute_id" + "}", localVarApiClient.escapeString(disputeId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
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
    private okhttp3.Call submitDisputeValidateBeforeCall(String disputeId, DisputesSubmitDisputeRequest disputesSubmitDisputeRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'disputeId' is set
        if (disputeId == null) {
            throw new ApiException("Missing the required parameter 'disputeId' when calling submitDispute(Async)");
        }

        return submitDisputeCall(disputeId, disputesSubmitDisputeRequest, _callback);

    }


    private ApiResponse<Void> submitDisputeWithHttpInfo(String disputeId, DisputesSubmitDisputeRequest disputesSubmitDisputeRequest) throws ApiException {
        okhttp3.Call localVarCall = submitDisputeValidateBeforeCall(disputeId, disputesSubmitDisputeRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call submitDisputeAsync(String disputeId, DisputesSubmitDisputeRequest disputesSubmitDisputeRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = submitDisputeValidateBeforeCall(disputeId, disputesSubmitDisputeRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class SubmitDisputeRequestBuilder {
        private final String description;
        private final String disputeId;

        private SubmitDisputeRequestBuilder(String description, String disputeId) {
            this.description = description;
            this.disputeId = disputeId;
        }

        /**
         * Build call for submitDispute
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
            DisputesSubmitDisputeRequest disputesSubmitDisputeRequest = buildBodyParams();
            return submitDisputeCall(disputeId, disputesSubmitDisputeRequest, _callback);
        }

        private DisputesSubmitDisputeRequest buildBodyParams() {
            DisputesSubmitDisputeRequest disputesSubmitDisputeRequest = new DisputesSubmitDisputeRequest();
            disputesSubmitDisputeRequest.description(this.description);
            return disputesSubmitDisputeRequest;
        }

        /**
         * Execute submitDispute request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            DisputesSubmitDisputeRequest disputesSubmitDisputeRequest = buildBodyParams();
            submitDisputeWithHttpInfo(disputeId, disputesSubmitDisputeRequest);
        }

        /**
         * Execute submitDispute request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            DisputesSubmitDisputeRequest disputesSubmitDisputeRequest = buildBodyParams();
            return submitDisputeWithHttpInfo(disputeId, disputesSubmitDisputeRequest);
        }

        /**
         * Execute submitDispute request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            DisputesSubmitDisputeRequest disputesSubmitDisputeRequest = buildBodyParams();
            return submitDisputeAsync(disputeId, disputesSubmitDisputeRequest, _callback);
        }
    }

    /**
     * Submit a Dispute
     * Submit a dispute
     * @param disputeId ID of the dispute to submit (required)
     * @return SubmitDisputeRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public SubmitDisputeRequestBuilder submitDispute(String description, String disputeId) throws IllegalArgumentException {
        if (description == null) throw new IllegalArgumentException("\"description\" is required but got null");
            

        if (disputeId == null) throw new IllegalArgumentException("\"disputeId\" is required but got null");
            

        return new SubmitDisputeRequestBuilder(description, disputeId);
    }
}
