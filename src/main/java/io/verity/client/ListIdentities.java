package io.verity.client;

import io.verity.api.CryptoUtil;
import io.verity.api.Fingerprint;
import io.verity.client.api.IdentityApi;
import io.verity.client.api.SigningApi;
import io.verity.client.invoker.ApiClient;
import io.verity.client.model.Identity;

import java.io.File;
import java.util.List;

/**
 * Created by donald on 11/9/15.
 */
public class ListIdentities {
    public static void main(String[] args) {
        java.security.Security.addProvider(
                new org.bouncycastle.jce.provider.BouncyCastleProvider()
        );
        System.out.println("Listing identities API token "+args[0]+", private key "+args[1]);

        ApiClient apiClient = new ApiClient();
        apiClient.setApiKey(args[0]);
        IdentityApi identityApi = new IdentityApi(apiClient);




        try {
            apiClient.setPrivateKey(CryptoUtil.loadPrivateKey(new File(args[1])));
            List<Identity> identityList = identityApi.listIdentities();
            System.out.println("Got identities "+identityList);
        } catch(Exception e) {
            e.printStackTrace();
        }


    }
}
