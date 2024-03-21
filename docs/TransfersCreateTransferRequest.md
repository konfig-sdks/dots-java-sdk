

# TransfersCreateTransferRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Integer** | The amount in cents to transfer. Negative amount transfers money from the &#x60;app&#x60; to the &#x60;user&#x60;. |  |
|**userId** | **UUID** | The user&#39;s id. |  |
|**taxExempt** | **Object** | Transfers marked as &#x60;tax_exempt&#x60; will not be counted towards the 1099 threshold. |  [optional] |
|**idempotencyKey** | **Object** | UUID that will be used to idempotently handle requests. Transfers with existing idempotency keys will be rejected. |  [optional] |
|**metadata** | **Object** | Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. |  [optional] |



