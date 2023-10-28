package org.acme.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.RequiredArgsConstructor;
import org.acme.entity.Node;
import org.acme.service.BaseService;
import org.acme.service.NodeService;

@RequiredArgsConstructor
@Path("/nodes")
public class NodeController extends BaseController<Node>{

    @Inject
    NodeService nodeService;

    @Override
    protected BaseService<Node, Integer> getObjService() {
        return nodeService;
    }

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }
}
