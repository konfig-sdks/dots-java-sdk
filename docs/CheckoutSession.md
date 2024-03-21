

# CheckoutSession


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**paymentIntentId** | **UUID** |  |  [optional] |
|**successUrl** | **URI** |  |  [optional] |
|**cancelUrl** | **URI** |  |  [optional] |
|**checkoutSessionUrl** | **URI** |  |  [optional] |
|**clientReferenceId** | **String** |  |  [optional] |
|**expiry** | **OffsetDateTime** |  |  [optional] |
|**metadata** | **Object** |  |  [optional] |
|**lineItems** | [**List&lt;CheckoutSessionLineItemsInner&gt;**](CheckoutSessionLineItemsInner.md) |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] |
|**updated** | **OffsetDateTime** |  |  [optional] |
|**customerId** | **UUID** | &#x60;payment-customer&#x60; ID |  [optional] |
|**customerEmail** | **String** |  |  [optional] |
|**amountTotal** | **Integer** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| COMPLETE | &quot;complete&quot; |
| EXPIRED | &quot;expired&quot; |



