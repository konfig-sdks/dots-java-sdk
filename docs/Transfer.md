

# Transfer


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [optional] |
|**userId** | **UUID** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**amount** | **Double** |  |  [optional] |
|**externalData** | [**TransferExternalData**](TransferExternalData.md) |  |  [optional] |
|**transactions** | [**List&lt;Transaction&gt;**](Transaction.md) |  |  [optional] |
|**metadata** | **Object** | Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;created&quot; |
| PENDING | &quot;pending&quot; |
| FAILED | &quot;failed&quot; |
| COMPLETED | &quot;completed&quot; |
| FLAGGED | &quot;flagged&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| REFILL | &quot;refill&quot; |
| PAYOUT | &quot;payout&quot; |
| BALANCE | &quot;balance&quot; |



