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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.Flow;
import com.konfigthis.client.model.FlowsCreateNewFlowRequest;
import com.konfigthis.client.model.FlowsListAllResponse;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FlowsApi
 */
@Disabled
public class FlowsApiTest {

    private static FlowsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new FlowsApi(apiClient);
    }

    /**
     * Create a Flow
     *
     * Create a new Flow.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewFlowTest() throws ApiException {
        Set<Object> steps = null;
        UUID userId = null;
        Object metadata = null;
        Flow response = api.createNewFlow(steps)
                .userId(userId)
                .metadata(metadata)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve a Flow
     *
     * Get a Flow by its id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        UUID flowId = null;
        Flow response = api.getById(flowId)
                .execute();
        // TODO: test validations
    }

    /**
     * List all Flows
     *
     * List all Flows.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllTest() throws ApiException {
        Integer limit = null;
        UUID startingAfter = null;
        UUID endingBefore = null;
        FlowsListAllResponse response = api.listAll()
                .limit(limit)
                .startingAfter(startingAfter)
                .endingBefore(endingBefore)
                .execute();
        // TODO: test validations
    }

}
