

# BusinessComplianceInfoCompanyInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dba** | **String** | Company DBA (Doing Business As) |  [optional] |
|**ein** | **String** | Federal Employer Identification Number |  |
|**incorporationDate** | **LocalDate** | Date of incorporation |  |
|**incorporationState** | **String** | State where incorporated |  |
|**incorporationType** | [**IncorporationTypeEnum**](#IncorporationTypeEnum) | The legal classification of the company&#39;s incorporation |  |
|**name** | **String** | Company&#39;s legal name |  |
|**website** | **String** | Company web address |  |



## Enum: IncorporationTypeEnum

| Name | Value |
|---- | -----|
| SOLE_PROPRIETORSHIP | &quot;sole_proprietorship&quot; |
| PARTNERSHIP | &quot;partnership&quot; |
| LLC | &quot;llc&quot; |
| C_CORPORATION | &quot;c_corporation&quot; |
| S_CORPORATION | &quot;s_corporation&quot; |



