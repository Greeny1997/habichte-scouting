# SpielerApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSpieler**](SpielerApi.md#createSpieler) | **POST** /spieler | Create spieler
[**deleteSpieler**](SpielerApi.md#deleteSpieler) | **DELETE** /spieler/{spielerid} | Delete spieler by ID
[**getSpielerById**](SpielerApi.md#getSpielerById) | **GET** /spieler/{spielerid} | Find spieler by ID
[**getSpielerBySearchstring**](SpielerApi.md#getSpielerBySearchstring) | **GET** /spieler/Suche/{searchstring} | Find spieler by Searchstring
[**updateSpieler**](SpielerApi.md#updateSpieler) | **PUT** /spieler/{spielerid} | Update an existing spieler


<a name="createSpieler"></a>
# **createSpieler**
> List&lt;Spieler&gt; createSpieler(body)

Create spieler



### Example
```java
// Import classes:
//import io.swagger.client.api.SpielerApi;

SpielerApi apiInstance = new SpielerApi();
Spieler body = new Spieler(); // Spieler | 
try {
    List<Spieler> result = apiInstance.createSpieler(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpielerApi#createSpieler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Spieler**](Spieler.md)|  |

### Return type

[**List&lt;Spieler&gt;**](Spieler.md)

### Authorization

[habicht_auth](../README.md#habicht_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSpieler"></a>
# **deleteSpieler**
> deleteSpieler(spielerid)

Delete spieler by ID

For valid response try integer IDs with positive integer value.         Negative or non-integer values will generate API errors

### Example
```java
// Import classes:
//import io.swagger.client.api.SpielerApi;

SpielerApi apiInstance = new SpielerApi();
Long spielerid = 789L; // Long | ID of the spieler that needs to be deleted
try {
    apiInstance.deleteSpieler(spielerid);
} catch (ApiException e) {
    System.err.println("Exception when calling SpielerApi#deleteSpieler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spielerid** | **Long**| ID of the spieler that needs to be deleted |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSpielerById"></a>
# **getSpielerById**
> Spieler getSpielerById(spielerid)

Find spieler by ID

For valid response try integer IDs with value &gt;&#x3D; 1 and &lt;&#x3D; 10.         Other values will generated exceptions

### Example
```java
// Import classes:
//import io.swagger.client.api.SpielerApi;

SpielerApi apiInstance = new SpielerApi();
Long spielerid = 789L; // Long | ID of spieler that needs to be fetched
try {
    Spieler result = apiInstance.getSpielerById(spielerid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpielerApi#getSpielerById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spielerid** | **Long**| ID of spieler that needs to be fetched |

### Return type

[**Spieler**](Spieler.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSpielerBySearchstring"></a>
# **getSpielerBySearchstring**
> List&lt;Spieler&gt; getSpielerBySearchstring(searchstring)

Find spieler by Searchstring

### Example
```java
// Import classes:
//import io.swagger.client.api.SpielerApi;

SpielerApi apiInstance = new SpielerApi();
String searchstring = "searchstring_example"; // String | ID of spieler that needs to be fetched
try {
    List<Spieler> result = apiInstance.getSpielerBySearchstring(searchstring);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpielerApi#getSpielerBySearchstring");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchstring** | **String**| ID of spieler that needs to be fetched |

### Return type

[**List&lt;Spieler&gt;**](Spieler.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSpieler"></a>
# **updateSpieler**
> updateSpieler(spielerid, body)

Update an existing spieler



### Example
```java
// Import classes:
//import io.swagger.client.api.SpielerApi;

SpielerApi apiInstance = new SpielerApi();
Long spielerid = 789L; // Long | ID of scout that needs to be fetched
Spieler body = new Spieler(); // Spieler | 
try {
    apiInstance.updateSpieler(spielerid, body);
} catch (ApiException e) {
    System.err.println("Exception when calling SpielerApi#updateSpieler");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spielerid** | **Long**| ID of scout that needs to be fetched |
 **body** | [**Spieler**](Spieler.md)|  |

### Return type

null (empty response body)

### Authorization

[habicht_auth](../README.md#habicht_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

