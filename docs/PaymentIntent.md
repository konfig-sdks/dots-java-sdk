

# PaymentIntent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**amount** | **Integer** | Amount in cents |  |
|**currency** | [**CurrencyEnum**](#CurrencyEnum) |  |  |
|**userId** | **UUID** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**transferId** | **UUID** |  |  [optional] |
|**paymentMethodId** | **UUID** |  |  [optional] |
|**metadata** | **Object** | Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. |  [optional] |
|**clientSecret** | **String** | Only availble on payment intent creation. |  [optional] |



## Enum: CurrencyEnum

| Name | Value |
|---- | -----|
| USD | &quot;usd&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| INITIALIZED | &quot;initialized&quot; |
| CREATED | &quot;created&quot; |
| REQUIRES_PAYMENT_METHOD | &quot;requires_payment_method&quot; |
| REQUIRES_CONFIRMATION | &quot;requires_confirmation&quot; |
| REQUIRES_ACTION | &quot;requires_action&quot; |
| PROCESSING | &quot;processing&quot; |
| SUCCEEDED | &quot;succeeded&quot; |
| REQUIRES_CAPTURE | &quot;requires_capture&quot; |
| CANCELED | &quot;canceled&quot; |
| FAILED | &quot;failed&quot; |



