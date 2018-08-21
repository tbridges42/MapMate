package us.bridgeses.MapMate.dal;

import us.bridgeses.MapMate.models.Fingerprint;
import us.bridgeses.MapMate.models.User;

/**
 * Created by tbrid on 8/21/2018.
 */
public interface UserDAL {
    boolean saveUser(User user);
    boolean getPublicKey(Fingerprint fingerprint);
}
