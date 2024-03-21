

# PaymentMethod


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  [optional] |
|**id** | **String** | ID of the &#x60;payment-method&#x60;. |  [optional] |
|**platform** | [**PlatformEnum**](#PlatformEnum) |  |  |
|**mask** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**phoneNumber** | **String** |  |  [optional] |
|**cashTag** | **String** |  |  [optional] |
|**country** | **String** |  |  [optional] |
|**currency** | **String** |  |  [optional] |



## Enum: PlatformEnum

| Name | Value |
|---- | -----|
| ACH | &quot;ach&quot; |
| PAYPAL | &quot;paypal&quot; |
| VENMO | &quot;venmo&quot; |
| CASH_APP | &quot;cash_app&quot; |
| INTL_TRANSFER | &quot;intl_transfer&quot; |



