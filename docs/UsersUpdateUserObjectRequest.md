

# UsersUpdateUserObjectRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**defaultPayoutMethod** | [**DefaultPayoutMethodEnum**](#DefaultPayoutMethodEnum) | Configures the user&#39;s default payout method. Must be a payout method already configured by the user. |  [optional] |
|**autoPayoutEnabled** | **Boolean** | Enables auto payout for the user whenever a default payout method is defined |  [optional] |
|**metadata** | **Object** | Arbitrary metadata |  [optional] |



## Enum: DefaultPayoutMethodEnum

| Name | Value |
|---- | -----|
| PAYPAL | &quot;paypal&quot; |
| VENMO | &quot;venmo&quot; |
| CASH_APP | &quot;cash_app&quot; |
| ACH | &quot;ach&quot; |
| INTL_BANK | &quot;intl_bank&quot; |



