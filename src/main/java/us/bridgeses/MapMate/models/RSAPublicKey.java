package us.bridgeses.MapMate.models;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/**
 * Created by tbrid on 8/21/2018.
 */
public class RSAPublicKey implements PublicKey {
    private java.security.PublicKey key;

    public RSAPublicKey(String encodedString) {
        byte[] bytes = encodedString.getBytes();
        try{
            key = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bytes));
        }
        catch(NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new IllegalArgumentException("Could not decode string", e);
        }
    }

    @Override
    public Fingerprint getFingerprint() {
        return null;
    }
}
