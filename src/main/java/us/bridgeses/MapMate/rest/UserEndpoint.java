package us.bridgeses.MapMate.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created by tbrid on 8/21/2018.
 */

@Path("/service/user")
public class UserEndpoint {

    @GET
    @Produces("application/json")
    public String getPublicKey(@QueryParam("fingerprint") String fingerprintString) {
        return fingerprintString;
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Response createUser() {
        return null;
    }
}
