

# CheckoutsessionsCreateSessionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lineItems** | [**Set&lt;CheckoutsessionsCreateSessionRequestLineItemsInner&gt;**](CheckoutsessionsCreateSessionRequestLineItemsInner.md) |  |  |
|**customerEmail** | **String** |  |  [optional] |
|**clientReferenceId** | **String** |  |  [optional] |
|**successUrl** | **URI** |  |  |
|**cancelUrl** | **URI** |  |  [optional] |
|**mode** | [**ModeEnum**](#ModeEnum) |  |  |
|**userId** | **UUID** | Supply a Dots user ID in place of a customer ID |  [optional] |
|**customerId** | **UUID** |  |  [optional] |
|**expiresIn** | **Integer** |  |  [optional] |
|**metadata** | **Object** |  |  [optional] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| PAYMENT | &quot;payment&quot; |



