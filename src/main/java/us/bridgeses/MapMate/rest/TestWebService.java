package us.bridgeses.MapMate.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/service/test")
public class TestWebService {

    @GET
    @Path("/available")
    @Produces(MediaType.TEXT_PLAIN)
    public String available() {
        return "yes";
    }

    @GET
    @Path("/parameter/{input}")
    @Produces(MediaType.TEXT_PLAIN)
    public String parameter(@PathParam("input") String input) {
        return input;
    }
}
