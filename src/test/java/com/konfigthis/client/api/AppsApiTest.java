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
import com.konfigthis.client.model.App;
import com.konfigthis.client.model.AppsAddAchAccountRequest;
import com.konfigthis.client.model.AppsAddAchAccountResponse;
import com.konfigthis.client.model.AppsCreateNewAppRequest;
import com.konfigthis.client.model.AppsDepositFundsRequest;
import com.konfigthis.client.model.AppsGetAchAccountResponse;
import com.konfigthis.client.model.AppsWithdrawFundsRequest;
import com.konfigthis.client.model.BusinessComplianceInfo;
import com.konfigthis.client.model.BusinessComplianceInfoCompanyInfo;
import com.konfigthis.client.model.BusinessComplianceInfoContactInfo;
import com.konfigthis.client.model.BusinessComplianceInfoDirectorsInner;
import com.konfigthis.client.model.BusinessComplianceInfoFlowOfFunds;
import com.konfigthis.client.model.Transfer;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AppsApi
 */
@Disabled
public class AppsApiTest {

    private static AppsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AppsApi(apiClient);
    }

    /**
     * Add App ACH Account
     *
     * Add an ACH account to an app. The account&#39;s owner must match the compliance information submitted.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addAchAccountTest() throws ApiException {
        String accountNumber = null;
        String routingNumber = null;
        String accountType = null;
        String appId = null;
        AppsAddAchAccountResponse response = api.addAchAccount(accountNumber, routingNumber, accountType, appId)
                .execute();
        // TODO: test validations
    }

    /**
     * Create an App
     *
     * Create an app in your organization
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewAppTest() throws ApiException {
        String name = null;
        Object metadata = null;
        App response = api.createNewApp(name)
                .metadata(metadata)
                .execute();
        // TODO: test validations
    }

    /**
     * Deposit Funds into App Wallet
     *
     * Deposit funds into App wallet by endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void depositFundsTest() throws ApiException {
        Integer amount = null;
        String appId = null;
        UUID idempotencyKey = null;
        Transfer response = api.depositFunds(amount, appId)
                .idempotencyKey(idempotencyKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Get App ACH Account
     *
     * Get the App&#39;s ach account information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAchAccountTest() throws ApiException {
        String appId = null;
        AppsGetAchAccountResponse response = api.getAchAccount(appId)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve an App
     *
     * Retrieve an app in your organization by its ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        UUID appId = null;
        App response = api.getById(appId)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve an App&#39;s Compliance Information
     *
     * Retrieve the compliance information for an app in your organization
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getComplianceInfoTest() throws ApiException {
        UUID appId = null;
        BusinessComplianceInfo response = api.getComplianceInfo(appId)
                .execute();
        // TODO: test validations
    }

    /**
     * List all Apps
     *
     * List all apps created by your organization
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllTest() throws ApiException {
        Integer limit = null;
        UUID startingAfter = null;
        UUID endingBefore = null;
        List<App> response = api.listAll()
                .limit(limit)
                .startingAfter(startingAfter)
                .endingBefore(endingBefore)
                .execute();
        // TODO: test validations
    }

    /**
     * Update an App&#39;s Compliance Information
     *
     * Add or update compliance information for an app in your organization
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateComplianceInfoTest() throws ApiException {
        BusinessComplianceInfoCompanyInfo companyInfo = null;
        BusinessComplianceInfoContactInfo contactInfo = null;
        List<BusinessComplianceInfoDirectorsInner> directors = null;
        BusinessComplianceInfoFlowOfFunds flowOfFunds = null;
        UUID appId = null;
        BusinessComplianceInfo response = api.updateComplianceInfo(companyInfo, contactInfo, directors, flowOfFunds, appId)
                .execute();
        // TODO: test validations
    }

    /**
     * Withdraw Funds From App Wallet
     *
     * Withdraw funds from app wallet into app bank account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void withdrawFundsTest() throws ApiException {
        Integer amount = null;
        String appId = null;
        UUID idempotencyKey = null;
        Transfer response = api.withdrawFunds(amount, appId)
                .idempotencyKey(idempotencyKey)
                .execute();
        // TODO: test validations
    }

}
