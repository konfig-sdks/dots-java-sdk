

# Flow


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | ID of the &#x60;flow&#x60;. |  [optional] |
|**created** | **OffsetDateTime** | Date that the &#x60;flow&#x60; was created. |  [optional] |
|**userId** | **Object** | ID of the &#x60;user&#x60; that has claimed the &#x60;flow&#x60;. |  [optional] |
|**steps** | [**List&lt;StepsEnum&gt;**](#List&lt;StepsEnum&gt;) | Array of steps in the flow. |  [optional] |
|**completedSteps** | [**List&lt;CompletedStepsEnum&gt;**](#List&lt;CompletedStepsEnum&gt;) | Array of steps that have been completed in the flow. |  [optional] |
|**link** | **URI** | URL to access the &#x60;flow&#x60;. Can be embedded in an &#x60;iframe&#x60;. |  [optional] |
|**metadata** | **Object** | Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. |  [optional] |



## Enum: List&lt;StepsEnum&gt;

| Name | Value |
|---- | -----|
| COMPLIANCE | &quot;compliance&quot; |
| ID_VERIFICATION | &quot;id-verification&quot; |
| BACKGROUND_CHECK | &quot;background-check&quot; |
| MANAGE_PAYMENTS | &quot;manage-payments&quot; |
| MANAGE_PAYOUTS | &quot;manage-payouts&quot; |
| PAYOUT | &quot;payout&quot; |
| REDIRECT | &quot;redirect&quot; |



## Enum: List&lt;CompletedStepsEnum&gt;

| Name | Value |
|---- | -----|
| COMPLIANCE | &quot;compliance&quot; |
| ID_VERIFICATION | &quot;id-verification&quot; |
| BACKGROUND_CHECK | &quot;background-check&quot; |
| MANAGE_PAYMENTS | &quot;manage-payments&quot; |
| MANAGE_PAYOUTS | &quot;manage-payouts&quot; |
| PAYOUT | &quot;payout&quot; |
| REDIRECT | &quot;redirect&quot; |



