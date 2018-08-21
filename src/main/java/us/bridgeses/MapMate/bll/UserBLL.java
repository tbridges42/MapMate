package us.bridgeses.MapMate.bll;

import us.bridgeses.MapMate.models.Fingerprint;
import us.bridgeses.MapMate.models.PublicKey;

/**
 * Created by tbrid on 8/21/2018.
 */
public interface UserBLL {
    Fingerprint addUser(PublicKey key);
    PublicKey getUserKey(Fingerprint fingerprint);
}
