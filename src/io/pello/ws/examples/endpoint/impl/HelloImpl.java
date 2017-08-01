package io.pello.ws.examples.endpoint.impl;

import javax.jws.WebService;
import javax.jws.WebMethod;
import io.pello.ws.examples.endpoint.Hello;

@WebService(endpointInterface = "io.pello.ws.examples.endpoint.Hello")
public class HelloImpl implements Hello {
    private String message = "Hello ";

    public void Hello() {
    	// not called when WS invoked
    }

    @Override
    public String sayHello(String name) {
        return message + name + ", I am a WebService";
    }
}