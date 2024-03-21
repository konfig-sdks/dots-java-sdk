

# Transaction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] |
|**amount** | **Double** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] |
|**sourceName** | **String** |  |  [optional] |
|**destinationName** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The general category of the transaction |  [optional] |
|**metadata** | **Object** | Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BALANCE | &quot;balance&quot; |
| REFILL | &quot;refill&quot; |
| PAYOUT | &quot;payout&quot; |
| PAYMENT | &quot;payment&quot; |
| FEE | &quot;fee&quot; |
| SURROGATE | &quot;surrogate&quot; |



