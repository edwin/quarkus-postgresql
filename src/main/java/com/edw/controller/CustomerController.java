package com.edw.controller;

import com.edw.service.CustomerService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <pre>
 *  com.edw.controller.CustomerController
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 23 Dec 2025 11:38
 */
@Path("/api/v1/customers")
public class CustomerController {

    private Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Inject
    CustomerService customerService;

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll() {
        logger.debug("on findAll() method");
        return Response
                .ok(customerService.findAll())
                .build();
    }

}
