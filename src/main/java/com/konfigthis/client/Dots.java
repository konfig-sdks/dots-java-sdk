package com.konfigthis.client;

import com.konfigthis.client.api.AppsApi;
import com.konfigthis.client.api.CheckoutSessionsApi;
import com.konfigthis.client.api.DisputesApi;
import com.konfigthis.client.api.FlowsApi;
import com.konfigthis.client.api.PaymentCustomersApi;
import com.konfigthis.client.api.PaymentIntentsApi;
import com.konfigthis.client.api.PaymentMethodsApi;
import com.konfigthis.client.api.PaymentsApi;
import com.konfigthis.client.api.PayoutLinksApi;
import com.konfigthis.client.api.PayoutRequestsApi;
import com.konfigthis.client.api.PayoutsApi;
import com.konfigthis.client.api.RefundsApi;
import com.konfigthis.client.api.TransactionsApi;
import com.konfigthis.client.api.TransferBatchesApi;
import com.konfigthis.client.api.TransfersApi;
import com.konfigthis.client.api.UsersApi;

public class Dots {
    private ApiClient apiClient;
    public final AppsApi apps;
    public final CheckoutSessionsApi checkoutSessions;
    public final DisputesApi disputes;
    public final FlowsApi flows;
    public final PaymentCustomersApi paymentCustomers;
    public final PaymentIntentsApi paymentIntents;
    public final PaymentMethodsApi paymentMethods;
    public final PaymentsApi payments;
    public final PayoutLinksApi payoutLinks;
    public final PayoutRequestsApi payoutRequests;
    public final PayoutsApi payouts;
    public final RefundsApi refunds;
    public final TransactionsApi transactions;
    public final TransferBatchesApi transferBatches;
    public final TransfersApi transfers;
    public final UsersApi users;

    public Dots() {
        this(null);
    }

    public Dots(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.apps = new AppsApi(this.apiClient);
        this.checkoutSessions = new CheckoutSessionsApi(this.apiClient);
        this.disputes = new DisputesApi(this.apiClient);
        this.flows = new FlowsApi(this.apiClient);
        this.paymentCustomers = new PaymentCustomersApi(this.apiClient);
        this.paymentIntents = new PaymentIntentsApi(this.apiClient);
        this.paymentMethods = new PaymentMethodsApi(this.apiClient);
        this.payments = new PaymentsApi(this.apiClient);
        this.payoutLinks = new PayoutLinksApi(this.apiClient);
        this.payoutRequests = new PayoutRequestsApi(this.apiClient);
        this.payouts = new PayoutsApi(this.apiClient);
        this.refunds = new RefundsApi(this.apiClient);
        this.transactions = new TransactionsApi(this.apiClient);
        this.transferBatches = new TransferBatchesApi(this.apiClient);
        this.transfers = new TransfersApi(this.apiClient);
        this.users = new UsersApi(this.apiClient);
    }

}
