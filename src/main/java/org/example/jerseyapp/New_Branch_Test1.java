package org.example.jerseyapp;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;

@Path("/ashok")
public class New_Branch_Test1 {


    //works in BRANCH_TEST_1

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String helloAshok() {

        return "<hr>Ashok says<br> hello";
    }
    //helLO VINOD
}
