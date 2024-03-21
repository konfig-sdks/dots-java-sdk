

# PayoutsCreatePayoutRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **UUID** | ID of the &#x60;user&#x60; who you are creating the payout for. |  |
|**amount** | **Integer** | Amount in cents to payout the user. |  |
|**platform** | [**PlatformEnum**](#PlatformEnum) | Platform that you are paying out the &#x60;user&#x60; through, |  |
|**accountId** | **String** | The bank account ID you are paying to. Required for &#x60;ach&#x60; and &#x60;intl_bank&#x60;. |  [optional] |
|**fund** | **Boolean** | Creates a transfer for the amount to the user before creating the payout. The funds are returned if the payout does not succeed. |  [optional] |
|**idempotencyKey** | **UUID** | UUID that will be used to idempotently handle requests. Transfers with existing idempotency keys will be rejected. |  [optional] |
|**metadata** | **Object** | Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. |  [optional] |



## Enum: PlatformEnum

| Name | Value |
|---- | -----|
| PAYPAL | &quot;paypal&quot; |
| VENMO | &quot;venmo&quot; |
| ACH | &quot;ach&quot; |
| BANK_TRANSFER | &quot;bank_transfer&quot; |
| CASH_APP | &quot;cash_app&quot; |
| PAYONEER | &quot;payoneer&quot; |
| AIRTM | &quot;airtm&quot; |
| DEFAULT | &quot;default&quot; |



