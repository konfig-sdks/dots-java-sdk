

# UsersAddPayoutMethodRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**platform** | [**PlatformEnum**](#PlatformEnum) | Payout platform to add. |  |
|**routingNumber** | **String** | Bank account or Cash App routing number. Required if &#x60;platform&#x60; &#x3D; &#x60;ach&#x60; or &#x60;cash_app&#x60;. |  [optional] |
|**accountNumber** | **String** | Bank account or Cash App account number. Required if &#x60;platform&#x60; &#x3D; &#x60;ach&#x60; or &#x60;cash_app&#x60;. |  [optional] |
|**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | Bank account type. Required if &#x60;platform&#x60; &#x3D; &#x60;ach&#x60;. |  [optional] |
|**email** | **String** | PayPal email address. Required if &#x60;platform&#x60; &#x3D; &#x60;paypal&#x60;. |  [optional] |
|**phoneNumber** | **String** | Venmo phone number. One of &#x60;phone_number&#x60; or &#x60;handle&#x60; is required if &#x60;platform&#x60; &#x3D; &#x60;venmo&#x60;. |  [optional] |
|**handle** | **String** | Venmo handle. One of &#x60;phone_number&#x60; or &#x60;handle&#x60; is required if &#x60;platform&#x60; &#x3D; &#x60;venmo&#x60;. |  [optional] |
|**cashTag** | **String** | Cash App Cash Tag. Required if &#x60;platform&#x60; &#x3D; &#x60;cash_app&#x60;. |  [optional] |



## Enum: PlatformEnum

| Name | Value |
|---- | -----|
| PAYPAL | &quot;paypal&quot; |
| VENMO | &quot;venmo&quot; |
| CASH_APP | &quot;cash_app&quot; |
| ACH | &quot;ach&quot; |



## Enum: AccountTypeEnum

| Name | Value |
|---- | -----|
| CHECKING | &quot;checking&quot; |
| SAVINGS | &quot;savings&quot; |



