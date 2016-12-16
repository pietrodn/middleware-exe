package sib;

import javax.xml.ws.Endpoint;

public class Publisher {
	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:8967/TimeWS", new TimeWSSIB());
		System.out.println("Get TimeWS WSDL at http://127.0.0.1:8967/TimeWS?wsdl");
	}
}
