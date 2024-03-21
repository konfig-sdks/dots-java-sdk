

# PayoutlinksCreatePayoutLinkRequestDelivery


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**message** | **String** | Message to send in the sms message that is sent to the payee. |  [optional] |
|**method** | [**MethodEnum**](#MethodEnum) | Delivery method. &#x60;sms&#x60; requires &#x60;payee.country_code&#x60; and &#x60;payee.phone_number&#x60;, &#x60;email&#x60; required &#x60;payee.email&#x60;. &#x60;all&#x60; will deliver to all the methods supplied in the payee object (e.g., &#x60;all&#x60; with empty &#x60;payee&#x60; has the same effect as &#x60;link&#x60;, and &#x60;all&#x60; with &#x60;payee.email&#x60; has the same effect as &#x60;email&#x60;). |  [optional] |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| SMS | &quot;sms&quot; |
| LINK | &quot;link&quot; |
| EMAIL | &quot;email&quot; |
| ALL | &quot;all&quot; |



