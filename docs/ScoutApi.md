# ScoutApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loginScout**](ScoutApi.md#loginScout) | **GET** /scout/login | Logs user into the system
[**logoutScout**](ScoutApi.md#logoutScout) | **GET** /scout/logout | Logs out current logged in scout session
[**updateBenachrichtigung**](ScoutApi.md#updateBenachrichtigung) | **PUT** /scout/benachrichtigung/{scoutid} | Update an existing profil
[**updateScout**](ScoutApi.md#updateScout) | **PUT** /scout/profil/{scoutid} | Update an existing profil


<a name="loginScout"></a>
# **loginScout**
> String loginScout(email, password)

Logs user into the system



### Example
```java
// Import classes:
//import io.swagger.client.api.ScoutApi;

ScoutApi apiInstance = new ScoutApi();
String email = "email_example"; // String | The scout email for login
String password = "password_example"; // String | The password for login
try {
    String result = apiInstance.loginScout(email, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScoutApi#loginScout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| The scout email for login |
 **password** | **String**| The password for login |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="logoutScout"></a>
# **logoutScout**
> logoutScout()

Logs out current logged in scout session



### Example
```java
// Import classes:
//import io.swagger.client.api.ScoutApi;

ScoutApi apiInstance = new ScoutApi();
try {
    apiInstance.logoutScout();
} catch (ApiException e) {
    System.err.println("Exception when calling ScoutApi#logoutScout");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBenachrichtigung"></a>
# **updateBenachrichtigung**
> updateBenachrichtigung(scoutid, body)

Update an existing profil



### Example
```java
// Import classes:
//import io.swagger.client.api.ScoutApi;

ScoutApi apiInstance = new ScoutApi();
Long scoutid = 789L; // Long | ID of scout that needs to be fetched
Integer body = 56; // Integer | Benachrichtigung a 1 aus 0
try {
    apiInstance.updateBenachrichtigung(scoutid, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ScoutApi#updateBenachrichtigung");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scoutid** | **Long**| ID of scout that needs to be fetched |
 **body** | [**Integer**](Integer.md)| Benachrichtigung a 1 aus 0 |

### Return type

null (empty response body)

### Authorization

[habicht_auth](../README.md#habicht_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateScout"></a>
# **updateScout**
> updateScout(scoutid, body)

Update an existing profil



### Example
```java
// Import classes:
//import io.swagger.client.api.ScoutApi;

ScoutApi apiInstance = new ScoutApi();
Long scoutid = 789L; // Long | ID of scout that needs to be fetched
Scout body = new Scout(); // Scout | Pet object that needs to be added to the store
try {
    apiInstance.updateScout(scoutid, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ScoutApi#updateScout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scoutid** | **Long**| ID of scout that needs to be fetched |
 **body** | [**Scout**](Scout.md)| Pet object that needs to be added to the store |

### Return type

null (empty response body)

### Authorization

[habicht_auth](../README.md#habicht_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

