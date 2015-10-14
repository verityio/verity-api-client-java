# Verity Java Client

This is a client for the Verity API implemented in Java.

## Building

In order to make use of this library simply clone the repository and build with Maven.

```
git clone https://github.com/verityio/verity-api-client-java.git verity-api-client
cd verity-api-client
mvn package
```

## Using this library

Once you have built the library with Maven you will have a number of .jar files in target/ and target/lib/ - include all these libraries in your class path.

You can then make use of the library to sign documents as follows. 

```java
// https://app.verity.io/api/sign
ApiClient apiClient = new ApiClient();
apiClient.setApiKey('YOURAPITOKEN')
SignApi signApi = new SignApi(apiClient);
SignResult signResult = signApi.sign(Fingerprint.generate(file), 'YOURVERITYIDENTITYID');
```

Note: You can retrieve your available identity IDs from the identities API call:

```java
// https://app.verity.io/api/identity
IdentityApi identityApi = new IdentityApi(apiClient);
List<Identity> identityList = identityApi.listIdentities()
```
