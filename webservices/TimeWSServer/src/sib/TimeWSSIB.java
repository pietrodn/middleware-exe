package sib;

import java.util.Date;

import javax.jws.WebService;

import sei.TimeWSSEI;

@WebService(endpointInterface="sei.TimeWSSEI")
public class TimeWSSIB implements TimeWSSEI {

	@Override
	public String getTimeAsString() {
		// TODO Auto-generated method stub
		return new Date().toString();
	}

}
