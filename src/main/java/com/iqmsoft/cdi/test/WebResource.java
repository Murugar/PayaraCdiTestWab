
package com.iqmsoft.cdi.test;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import com.iqmsoft.cdi.test.model.Message;

import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;


@Named
@Stateless
@Path("resources")
public class WebResource {

    @Inject
    private IndexController indexController;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of WebresourceResource
     */
    public WebResource() {
    }

    /**
     * Retrieves representation of an instance of
     * com.cdi.test.WebresourceResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Message getXml() {
        return new Message().setMesssage(indexController.getGreetings());
    }


}
