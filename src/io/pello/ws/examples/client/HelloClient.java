package io.pello.ws.examples.client;


import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceRef;
import javax.xml.ws.Service;
import io.pello.ws.examples.endpoint.Hello;
//import io.pello.ws.examples.endpoint.impl.*;

public class HelloClient {
    @WebServiceRef(wsdlLocation = 
      "META-INF/wsdl/localhost:7001/ws-examples/HelloService?wsdl")
    private static Hello helloService;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws Exception {
    	String urlWithPackageOfWebservice = "http://endpoint.examples.ws.pello.io/";
    	String nameOfWebserviceImpl = "HelloImplService";
    	
    	URL url = new URL("http://localhost:7001/ws-examples/HelloImplService?wsdl");
    	QName qname = new QName(urlWithPackageOfWebservice, nameOfWebserviceImpl);
    	
        Service service = Service.create(url, qname);

        Hello hello = service.getPort(Hello.class);

        String result = hello.sayHello("Eugene");
        System.out.println(result);
        
    }

}