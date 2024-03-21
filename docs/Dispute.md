

# Dispute


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**paymentIntentId** | **UUID** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**evidence** | [**List&lt;DisputeFile&gt;**](DisputeFile.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NEEDS_RESPONSE | &quot;needs_response&quot; |
| UNDER_REVIEW | &quot;under_review&quot; |
| CLOSED | &quot;closed&quot; |
| WARNING_NEEDS_RESPONSE | &quot;warning_needs_response&quot; |
| WARNING_UNDER_REVIEW | &quot;warning_under_review&quot; |
| WARNING_CLOSED | &quot;warning_closed&quot; |
| WON | &quot;won&quot; |
| LOST | &quot;lost&quot; |



