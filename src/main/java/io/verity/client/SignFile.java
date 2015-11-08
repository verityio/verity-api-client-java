package io.verity.client;

import io.verity.api.CryptoUtil;
import io.verity.api.Fingerprint;
import io.verity.client.api.SigningApi;
import io.verity.client.invoker.ApiClient;
import io.verity.client.model.SignResult;

import java.io.File;
import java.security.Signature;

/**
 * Created by donald on 11/9/15.
 */
public class SignFile {



    public static void main(String[] args) {
        java.security.Security.addProvider(
                new org.bouncycastle.jce.provider.BouncyCastleProvider()
        );
        System.out.println("Signing "+args[0]+" API token "+args[1]+", private key "+args[2]+" with identity "+args[3]);

        ApiClient apiClient = new ApiClient();
        apiClient.setApiKey(args[1]);
        SigningApi signingApi = new SigningApi(apiClient);




        try {
            apiClient.setPrivateKey(CryptoUtil.loadPrivateKey(new File(args[2])));
            SignResult signResult = signingApi.sign(Fingerprint.generate(new File(args[0])), args[3]);
            if(signResult != null) {
                System.out.println("File signed ! "+signResult.toString());
            }
        } catch(Exception e) {
            e.printStackTrace();
        }


    }
}
