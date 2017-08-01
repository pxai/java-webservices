package io.pello.ws.examples.endpoint;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public interface Hello {

    @WebMethod
    public String sayHello(String name);
}