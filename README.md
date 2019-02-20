# swagger-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.NeuespielerApi;

public class NeuespielerApiExample {

    public static void main(String[] args) {
        NeuespielerApi apiInstance = new NeuespielerApi();
        try {
            Spieler result = apiInstance.neuespielerGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NeuespielerApi#neuespielerGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*NeuespielerApi* | [**neuespielerGet**](docs/NeuespielerApi.md#neuespielerGet) | **GET** /neuespieler | Zeigt neu angelegte Spieler
*ScoutApi* | [**loginScout**](docs/ScoutApi.md#loginScout) | **GET** /scout/login | Logs user into the system
*ScoutApi* | [**logoutScout**](docs/ScoutApi.md#logoutScout) | **GET** /scout/logout | Logs out current logged in scout session
*ScoutApi* | [**updateBenachrichtigung**](docs/ScoutApi.md#updateBenachrichtigung) | **PUT** /scout/benachrichtigung/{scoutid} | Update an existing profil
*ScoutApi* | [**updateScout**](docs/ScoutApi.md#updateScout) | **PUT** /scout/profil/{scoutid} | Update an existing profil
*SpielerApi* | [**createSpieler**](docs/SpielerApi.md#createSpieler) | **POST** /spieler | Create spieler
*SpielerApi* | [**deleteSpieler**](docs/SpielerApi.md#deleteSpieler) | **DELETE** /spieler/{spielerid} | Delete spieler by ID
*SpielerApi* | [**getSpielerById**](docs/SpielerApi.md#getSpielerById) | **GET** /spieler/{spielerid} | Find spieler by ID
*SpielerApi* | [**getSpielerBySearchstring**](docs/SpielerApi.md#getSpielerBySearchstring) | **GET** /spieler/Suche/{searchstring} | Find spieler by Searchstring
*SpielerApi* | [**updateSpieler**](docs/SpielerApi.md#updateSpieler) | **PUT** /spieler/{spielerid} | Update an existing spieler


## Documentation for Models

 - [Scout](docs/Scout.md)
 - [Spieler](docs/Spieler.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: api_key
- **Location**: HTTP header

### habicht_auth

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: http://petstore.swagger.io/oauth/dialog
- **Scopes**: 
  - write:scout: modify pets in your account
  - read:scout: read your pets


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

admin@jinou.de

