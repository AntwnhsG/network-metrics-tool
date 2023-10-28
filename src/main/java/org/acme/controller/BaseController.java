package org.acme.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.acme.entity.BaseEntity;
import org.acme.service.BaseService;
import org.jboss.resteasy.reactive.RestResponse;

import java.util.List;

public abstract class BaseController<T extends BaseEntity> {

    protected abstract BaseService<T, Integer> getObjService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public RestResponse<List<T>> findALl(){
        return RestResponse.ResponseBuilder.ok(getObjService().findAll()).build();
    }

    @POST
    public RestResponse<T> create(T obj){
        return RestResponse.ResponseBuilder.create(RestResponse.Status.CREATED, getObjService().create(obj)).build();
    }

    //To do the rest of the CRUD operations
}
