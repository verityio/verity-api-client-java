package io.verity.api;

import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

public class Fingerprint {
    public static String generate(File file) {
        FileInputStream fis;
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("SHA-256");
            fis = new FileInputStream(file);

            byte[] dataBytes = new byte[1024];

            int nread = 0;
            while ((nread = fis.read(dataBytes)) != -1) {
                md.update(dataBytes, 0, nread);
            }

            byte[] mdbytes = md.digest();

            //convert the byte to hex format method 1
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < mdbytes.length; i++) {
                sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
            }


            return sb.toString();
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

