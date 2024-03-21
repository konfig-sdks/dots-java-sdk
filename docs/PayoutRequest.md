

# PayoutRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | ID of the &#x60;payout-request&#x60;. |  [optional] |
|**created** | **OffsetDateTime** | Date that the &#x60;payout-request&#x60; was created. |  [optional] |
|**amount** | **Double** | Amount in cents of the &#x60;payout-request&#x60;. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the &#x60;payout-request&#x60;. |  [optional] |
|**payee** | [**PayoutRequestPayee**](PayoutRequestPayee.md) |  |  [optional] |
|**payoutLink** | [**PayoutLink**](PayoutLink.md) |  |  [optional] |
|**user** | [**User**](User.md) |  |  [optional] |
|**metadata** | **Object** | Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. |  [optional] |
|**memo** | **Object** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;created&quot; |
| APPROVED | &quot;approved&quot; |
| REJECTED | &quot;rejected&quot; |



