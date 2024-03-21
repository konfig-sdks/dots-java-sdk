

# PayoutrequestsSubmitRequestRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Integer** | The amount in cents to pay the user. |  |
|**userId** | **UUID** | The user&#39;s id. &#x60;user_id&#x60; or &#x60;payee&#x60; is required. |  [optional] |
|**payee** | [**PayoutsSendPayoutRequestPayee**](PayoutsSendPayoutRequestPayee.md) |  |  [optional] |
|**metadata** | **Object** | Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. |  [optional] |
|**memo** | **String** | Add a memo to payout request |  [optional] |



