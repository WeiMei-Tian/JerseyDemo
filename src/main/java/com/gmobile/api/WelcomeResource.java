package com.gmobile.api;

import com.sun.jersey.api.view.Viewable;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

/**
 * Created by admin on 2017/3/20.
 */
@Path("/")
public class WelcomeResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/hello")
    public Viewable sayHello() throws IOException {
        return new Viewable("/index.jsp", this);
    }

    @GET
    @Path("/index")
    public String index() {
        return "hello world!!!";
    }

    @POST
    @Path("/login")
    public String login() {
        return "login";
    }

}