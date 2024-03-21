

# PayoutLink


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | ID of the &#x60;payout-link&#x60;. |  [optional] |
|**created** | **OffsetDateTime** | Date the &#x60;payout-link&#x60; was created. |  [optional] |
|**link** | **URI** | URL to access the &#x60;payout-link&#x60;. |  [optional] |
|**amount** | **Double** | The amount to pay in cents. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the &#x60;payout-link&#x60;. |  [optional] |
|**payee** | [**PayoutLinkPayee**](PayoutLinkPayee.md) |  |  [optional] |
|**delivery** | [**PayoutLinkDelivery**](PayoutLinkDelivery.md) |  |  [optional] |
|**taxExempt** | **Boolean** | Transfers marked as &#x60;tax_exempt&#x60; will not be counted towards the 1099 threshold. |  [optional] |
|**claimedUserId** | **UUID** | ID of the &#x60;user&#x60; that has claimed the &#x60;payout-link&#x60;. |  [optional] |
|**flowId** | **UUID** | ID of the payout flow UI that is sent to the user. |  [optional] |
|**metadata** | **Object** | Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SENT | &quot;sent&quot; |
| CLAIMED | &quot;claimed&quot; |
| DELIVERY_PENDING | &quot;delivery_pending&quot; |
| DELIVERY_FAILED | &quot;delivery_failed&quot; |
| DELIVERED | &quot;delivered&quot; |
| CANCELED | &quot;canceled&quot; |



