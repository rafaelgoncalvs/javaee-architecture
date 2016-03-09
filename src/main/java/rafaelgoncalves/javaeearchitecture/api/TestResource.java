package rafaelgoncalves.javaeearchitecture.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("test")
public class TestResource {

    @GET
    public String get() {
    	return "Hello World";
    }

}
