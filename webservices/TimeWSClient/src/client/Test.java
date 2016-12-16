package client;

import support.TimeWSSEI;
import support.TimeWSSIBService;

public class Test {
	public static void main(String[] args) {
		TimeWSSIBService service = new TimeWSSIBService();
		TimeWSSEI port = service.getTimeWSSIBPort();
		
		String timeString = port.getTimeAsString();
		System.out.println(timeString);
		
	}
}
