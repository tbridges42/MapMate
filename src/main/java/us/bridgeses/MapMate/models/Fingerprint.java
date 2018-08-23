package us.bridgeses.MapMate.models;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by tbrid on 8/21/2018.
 */
public class Fingerprint {

    private final String fingerprintString;

    public Fingerprint(String fingerprintString) {
        this.fingerprintString = fingerprintString;
    }

    public String getFingerprintString() {
        return fingerprintString;
    }
}
