

# PayoutsSendPayoutRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Integer** | The amount in cents to pay the user. |  |
|**userId** | **UUID** | The user&#39;s id. &#x60;user_id&#x60; or &#x60;payee&#x60; is required. |  [optional] |
|**payee** | [**PayoutsSendPayoutRequestPayee**](PayoutsSendPayoutRequestPayee.md) |  |  [optional] |
|**delivery** | [**PayoutsSendPayoutRequestDelivery**](PayoutsSendPayoutRequestDelivery.md) |  |  [optional] |
|**forceCollectComplianceInformation** | **Boolean** | Collect 1099 or w8-ben information. |  [optional] |
|**additionalSteps** | [**List&lt;AdditionalStepsEnum&gt;**](#List&lt;AdditionalStepsEnum&gt;) | Array of steps in the flow. |  [optional] |
|**taxExempt** | **Boolean** | Payouts marked as &#x60;tax_exempt&#x60; will not be counted towards the 1099 threshold. |  [optional] |
|**metadata** | **Object** | Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. |  [optional] |
|**memo** | **String** | Add a memo to the top of the Payout Link |  [optional] |
|**idempotencyKey** | **Object** | Unique UUID key that prevents duplicate requests from being processed. If a payout link with the idempotency key exists, a new link will not be created and the existing link will be returned instead. |  [optional] |
|**payoutFeeParty** | [**PayoutFeePartyEnum**](#PayoutFeePartyEnum) | Overrides the setting for which party will pay fees on this payout. This takes precedence over the default for your application. |  [optional] |



## Enum: List&lt;AdditionalStepsEnum&gt;

| Name | Value |
|---- | -----|
| COMPLIANCE | &quot;compliance&quot; |
| ID_VERIFICATION | &quot;id-verification&quot; |
| BACKGROUND_CHECK | &quot;background-check&quot; |
| MANAGE_PAYMENTS | &quot;manage-payments&quot; |
| MANAGE_PAYOUTS | &quot;manage-payouts&quot; |
| PAYOUT | &quot;payout&quot; |
| REDIRECT | &quot;redirect&quot; |



## Enum: PayoutFeePartyEnum

| Name | Value |
|---- | -----|
| USER | &quot;user&quot; |
| PLATFORM | &quot;platform&quot; |



