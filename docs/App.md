

# App


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**name** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | App verification status. Some Dots use cases require newly created apps to pass KYB review. |  [optional] |
|**metrics** | [**AppMetrics**](AppMetrics.md) |  |  |
|**metadata** | **Object** | Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;created&quot; |
| IN_REVIEW | &quot;in_review&quot; |
| APPROVED | &quot;approved&quot; |



