package io.pello.ws.examples.enpoint;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public class Hello {
    private String message;

    public void Hello() {
    	message = new String("Hi");
    }

    @WebMethod
    public String sayHello(String name) {
        return message + name + ", I am a WebService";
    }
}