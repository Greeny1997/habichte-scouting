# NeuespielerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**neuespielerGet**](NeuespielerApi.md#neuespielerGet) | **GET** /neuespieler | Zeigt neu angelegte Spieler


<a name="neuespielerGet"></a>
# **neuespielerGet**
> Spieler neuespielerGet()

Zeigt neu angelegte Spieler



### Example
```java
// Import classes:
//import io.swagger.client.api.NeuespielerApi;

NeuespielerApi apiInstance = new NeuespielerApi();
try {
    Spieler result = apiInstance.neuespielerGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NeuespielerApi#neuespielerGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Spieler**](Spieler.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

