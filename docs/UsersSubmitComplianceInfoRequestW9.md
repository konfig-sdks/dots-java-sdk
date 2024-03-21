

# UsersSubmitComplianceInfoRequestW9

W-9 equivalent for users based in the United States.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) | Type of entity filling out the W-9, &#x60;business&#x60; or &#x60;individual&#x60;. |  |
|**businessName** | **String** | Legal bussiness name. Required if &#x60;entity_type&#x60; is &#x60;business&#x60;. |  [optional] |
|**firstName** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**dateOfBirth** | **LocalDate** | Required if &#x60;entity_type&#x60; is &#x60;individual&#x60;. |  |
|**tin** | **String** | SSN if &#x60;entity_type&#x60; is &#x60;individual&#x60;. EIN if &#x60;entity_type&#x60; is &#x60;business&#x60;. |  |
|**address** | [**UsersSubmitComplianceInfoRequestW9Address**](UsersSubmitComplianceInfoRequestW9Address.md) |  |  |



## Enum: EntityTypeEnum

| Name | Value |
|---- | -----|
| INDIVIDUAL | &quot;individual&quot; |
| BUSINESS | &quot;business&quot; |



