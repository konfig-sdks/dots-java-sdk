

# PaymentintentsCreateIntentRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | An arbitrary string attached to the object. Often useful for displaying to users. |  [optional] |
|**amount** | **Integer** | Amount in cents |  |
|**currency** | [**CurrencyEnum**](#CurrencyEnum) | Currency of the payment. Currently only &#x60;usd&#x60; is supported. |  |
|**confirm** | **Boolean** | Set to &#x60;true&#x60; to attempt to confirm this payment intent immediately. Defaults to &#x60;false&#x60;. |  [optional] |
|**userId** | **UUID** | ID of a Dots &#x60;user&#x60; making this payment. |  [optional] |
|**customerId** | **UUID** | ID of a Dots &#x60;payment_customer&#x60; making this payment. |  [optional] |
|**paymentMethodId** | **UUID** | ID of the payment method to attach to this payment intent. |  [optional] |
|**paymentMethodTypes** | [**List&lt;PaymentMethodTypesEnum&gt;**](#List&lt;PaymentMethodTypesEnum&gt;) | Currently only &#x60;card&#x60; is supported. |  [optional] |
|**setupFutureUsage** | [**SetupFutureUsageEnum**](#SetupFutureUsageEnum) |  |  [optional] |
|**metadata** | **Boolean** | Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. |  [optional] |
|**transferData** | [**PaymentintentsCreateIntentRequestTransferData**](PaymentintentsCreateIntentRequestTransferData.md) |  |  [optional] |
|**applicationFeeAmount** | **Integer** | Amount in cents to transfer to the application&#39;s wallet as a platform fee. |  [optional] |



## Enum: CurrencyEnum

| Name | Value |
|---- | -----|
| USD | &quot;usd&quot; |



## Enum: List&lt;PaymentMethodTypesEnum&gt;

| Name | Value |
|---- | -----|
| CARD | &quot;card&quot; |



## Enum: SetupFutureUsageEnum

| Name | Value |
|---- | -----|
| ON_SESSION | &quot;on_session&quot; |



