package client;

import java.util.ArrayList;
import java.util.List;

import support.ArrayOfString;
import support.Info;
import support.InfoSoapType;
import support.TFullTeamInfo;
import support.TTeamInfo;

public class TestClient {
	public static void main(String[] args) {
		Info service = new Info();
		InfoSoapType  port = service.getInfoSoap();
		
		// Italy's forwards
		System.out.println("Forwards of Italy:");
		TFullTeamInfo teamInfo = port.fullTeamInfo("Italy");
		ArrayOfString forwards = teamInfo.getSForwards();
		List<String> forwardsList = forwards.getString();
		forwardsList.forEach(x -> System.out.println(x));
		System.out.println("");
		
		// List of all teams
		System.out.println("List of all teams with flags:");
		List<TTeamInfo> teamInfos = port.teams().getTTeamInfo();
		for(TTeamInfo t: teamInfos) {
			System.out.printf("Team %s: flag %s\n", t.getSName(), t.getSCountryFlag());
		}
		System.out.println("");
		
		// Details of players who play for Spain
		System.out.println("Details of players who play for Spain:");
		teamInfo = port.fullTeamInfo("Spain");
		List<String> players = new ArrayList<>();
		players.addAll(teamInfo.getSDefenders().getString());
		players.addAll(teamInfo.getSForwards().getString());
		players.addAll(teamInfo.getSGoalKeepers().getString());
		players.addAll(teamInfo.getSMidFields().getString());
		players.forEach(x -> System.out.println(x));
	}
}
