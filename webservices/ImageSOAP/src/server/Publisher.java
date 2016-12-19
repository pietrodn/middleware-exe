package server;

import javax.xml.ws.Endpoint;

public class Publisher {

	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:8989/ImageSOAP/", new ImageSOAPSIB());
		System.out.println("Find the WDSL at http://127.0.0.1:8989/ImageSOAP/?wsdl");
	}

}
