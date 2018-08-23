package us.bridgeses.MapMate.rest;

import us.bridgeses.MapMate.bll.UserBLL;
import us.bridgeses.MapMate.models.Fingerprint;
import us.bridgeses.MapMate.models.PublicKey;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created by tbrid on 8/21/2018.
 */

@Path("/service/user")
public class UserEndpoint {

    UserBLL userBLL;

    @GET
    @Produces("application/json")
    public String getPublicKey(@QueryParam("fingerprint") String fingerprintString) {
        PublicKey publicKey = userBLL.getUserKey(new Fingerprint(fingerprintString));
        return fingerprintString;
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Response createUser() {
        return null;
    }
}
