

# UsersSubmitComplianceInfoRequestW8ben

W8-BEN form for foreign payees.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Full name of the person. |  |
|**citizenshipCountry** | **String** | The two-letter ISO country code associated with the beneficial owner&#39;s citizenship. |  |
|**dateOfBirth** | **LocalDate** | Date of birth of the user. |  |
|**tin** | **String** | SSN |  |
|**foreignTaxId** | **String** | The tax identification number associated with the beneficial owner&#39;s country of residence. |  [optional] |
|**taxTreatyCountry** | **String** | The two-letter ISO country code of the country for tax treaty purposes. |  [optional] |
|**taxTreatyCitation** | **String** | The article and paragraph of the citation claimed for tax treaty purposes. |  [optional] |
|**taxTreatyRate** | **Double** | The withholding rate claimed for tax treaty purposes. For example, a 15% rate would be represented as 0.15. |  [optional] |
|**taxTreatyIncomeType** | [**TaxTreatyIncomeTypeEnum**](#TaxTreatyIncomeTypeEnum) | The type of income for tax treaty purposes. Valid values are - interest1 (Interest Paid by U.S. Obligors) - dividend6 (Dividends Paid by U.S. Corporations) - dividend7 (Dividends Qualifying for Direct Dividend Rate) - pension15 (Pensions and Annuities) - socialSecurity (Social Security) - equipment10 (Industrial Equipment) - knowhow10 (Know-How/Other Industrial Royalties) - patent10 (Patents) - film11 (Film &amp; TV) - copyright12 (Copyrights) |  [optional] |
|**taxTreatyExplanation** | **String** | An optional explanation for the tax treaty claimed. |  [optional] |
|**address** | [**UsersSubmitComplianceInfoRequestW8benAddress**](UsersSubmitComplianceInfoRequestW8benAddress.md) |  |  |
|**signature** | [**UsersSubmitComplianceInfoRequestW8benSignature**](UsersSubmitComplianceInfoRequestW8benSignature.md) |  |  |



## Enum: TaxTreatyIncomeTypeEnum

| Name | Value |
|---- | -----|
| INTEREST1 | &quot;interest1&quot; |
| DIVIDEND6 | &quot;dividend6&quot; |
| DIVIDEND7 | &quot;dividend7&quot; |
| PENSION15 | &quot;pension15&quot; |
| SOCIALSECURITY | &quot;socialSecurity&quot; |
| EQUIPMENT10 | &quot;equipment10&quot; |
| KNOWHOW10 | &quot;knowhow10&quot; |
| PATENT10 | &quot;patent10&quot; |
| FILM11 | &quot;film11&quot; |
| COPYRIGHT12 | &quot;copyright12&quot; |



