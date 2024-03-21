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
import com.konfigthis.client.model.CheckoutSession;
import com.konfigthis.client.model.CheckoutsessionsCreateSessionRequest;
import com.konfigthis.client.model.CheckoutsessionsCreateSessionRequestLineItemsInner;
import com.konfigthis.client.model.CheckoutsessionsListAllResponse;
import java.net.URI;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CheckoutSessionsApi
 */
@Disabled
public class CheckoutSessionsApiTest {

    private static CheckoutSessionsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new CheckoutSessionsApi(apiClient);
    }

    /**
     * Create a Checkout Session
     *
     * Create a checkout session
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSessionTest() throws ApiException {
        Set<CheckoutsessionsCreateSessionRequestLineItemsInner> lineItems = null;
        URI successUrl = null;
        String mode = null;
        String customerEmail = null;
        String clientReferenceId = null;
        URI cancelUrl = null;
        UUID userId = null;
        UUID customerId = null;
        Integer expiresIn = null;
        Object metadata = null;
        CheckoutSession response = api.createSession(lineItems, successUrl, mode)
                .customerEmail(customerEmail)
                .clientReferenceId(clientReferenceId)
                .cancelUrl(cancelUrl)
                .userId(userId)
                .customerId(customerId)
                .expiresIn(expiresIn)
                .metadata(metadata)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve a Checkout Session
     *
     * Retrieve a checkout session by an ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String checkoutSessionId = null;
        CheckoutSession response = api.getById(checkoutSessionId)
                .execute();
        // TODO: test validations
    }

    /**
     * List all Checkout Sessions
     *
     * List all checkout sessions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllTest() throws ApiException {
        String limit = null;
        String startingAfter = null;
        String endingBefore = null;
        CheckoutsessionsListAllResponse response = api.listAll()
                .limit(limit)
                .startingAfter(startingAfter)
                .endingBefore(endingBefore)
                .execute();
        // TODO: test validations
    }

}