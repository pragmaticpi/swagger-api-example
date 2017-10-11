package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

public class DefaultApiServiceImpl implements DefaultApi {
    public InlineResponse2001  employeesPost(Integer id, String name, String location, String teamName) {
        // TODO: Implement...
        
        return null;
    }
    
    public InlineResponse200  getAllEmployeesGet() {
        // TODO: Implement...
        
        return null;
    }
    
}

