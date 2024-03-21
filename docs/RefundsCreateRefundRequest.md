

# RefundsCreateRefundRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Integer** | Amount in cents |  |
|**paymentIntentId** | **UUID** | ID of the &#x60;payment_intent&#x60; you are refunding. |  |
|**reason** | [**ReasonEnum**](#ReasonEnum) |  |  [optional] |
|**metadata** | **Boolean** | Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. |  [optional] |



## Enum: ReasonEnum

| Name | Value |
|---- | -----|
| DUPLICATE | &quot;duplicate&quot; |
| FRAUDULENT | &quot;fraudulent&quot; |
| REQUESTED_BY_CUSTOMER | &quot;requested_by_customer&quot; |
| EXPIRED_UNCAPTURED_CHARGE | &quot;expired_uncaptured_charge&quot; |
| PARTIAL_CAPTURE | &quot;partial_capture&quot; |



