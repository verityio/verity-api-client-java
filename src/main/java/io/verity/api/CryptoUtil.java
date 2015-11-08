package io.verity.api;

import sun.misc.BASE64Decoder;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

/**
 * Created by donald on 11/9/15.
 */
public class CryptoUtil {
    public static PublicKey loadPublicKey(String input) {
        input = input.replaceAll("(-+BEGIN PUBLIC KEY-+\\r?\\n|-+END PUBLIC KEY-+\\r?\\n?)", "");
        input = input.replaceAll("\\s+","");


        Base64.Decoder decoder = Base64.getDecoder();
        byte[] byteKey = decoder.decode(input);
        X509EncodedKeySpec spec = new X509EncodedKeySpec(byteKey);
        try {
            KeyFactory kf = KeyFactory.getInstance("RSA");
            return kf.generatePublic(spec);
        } catch(Exception e) {

        }
        return null;

    }

    public static PrivateKey loadPrivateKey(String input) {
        input = input.replaceAll("(-+BEGIN RSA PRIVATE KEY-+\\r?\\n|-+END RSA PRIVATE KEY-+\\r?\\n?)", "");
        input = input.replaceAll("\\s+","");


        try {
            BASE64Decoder decoder = new BASE64Decoder();
            byte[] byteKey = decoder.decodeBuffer(input);
            PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(byteKey);

            KeyFactory kf = KeyFactory.getInstance("RSA");
            return kf.generatePrivate(spec);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public static PrivateKey loadPrivateKey(File file) {
        try {
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bufin = new BufferedInputStream(fis);
            byte[] buffer = new byte[2048];
            int len;
            while ((len = bufin.read(buffer)) >= 0) {

            }
            ;
            bufin.close();
            String privateKey = new String(buffer);


            return loadPrivateKey(privateKey);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
