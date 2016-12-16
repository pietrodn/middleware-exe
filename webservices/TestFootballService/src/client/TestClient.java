package client;

import java.util.List;

import support.ArrayOfString;
import support.Info;
import support.InfoSoapType;
import support.TFullTeamInfo;

public class TestClient {
	public static void main(String[] args) {
		Info service = new Info();
		InfoSoapType  port = service.getInfoSoap();
		TFullTeamInfo teamInfo = port.fullTeamInfo("Italy");
		ArrayOfString forwards = teamInfo.getSForwards();
		List<String> forwardsList = forwards.getString();
		forwardsList.forEach(x -> System.out.println(x));
	}
}
