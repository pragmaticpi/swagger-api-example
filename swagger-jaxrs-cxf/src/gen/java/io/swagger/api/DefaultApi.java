package io.swagger.api;

import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Path("/")
@Api(value = "/", description = "")
public interface DefaultApi  {

    @POST
    @Path("/employees")
    
    
    @ApiOperation(value = "", tags={  })
    public InlineResponse2001  employeesPost(@QueryParam("id")Integer id, @QueryParam("name")String name, @QueryParam("location")String location, @QueryParam("team_name")String teamName);

    @GET
    @Path("/getAllEmployees")
    
    
    @ApiOperation(value = "Get all names", tags={  })
    public InlineResponse200  getAllEmployeesGet();
}

