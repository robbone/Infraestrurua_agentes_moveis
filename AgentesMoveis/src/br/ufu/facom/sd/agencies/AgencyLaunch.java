package br.ufu.facom.sd.agencies;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.List;

import br.ufu.facom.sd.agents.Agent;
import br.ufu.facom.sd.agents.AgentI;
import br.ufu.facom.sd.services.ServiceI;

public class AgencyLaunch {
	
	public static void main(String[] args){
		
		try{
			String[] agencyList;
			List<String> itinerary = new ArrayList<String>();
			Registry registry = LocateRegistry.getRegistry(1099);
			agencyList = registry.list();
			AgentI agent = new Agent();
			
			for(int i = 0; i < agencyList.length; i++){
				AgencyI agency = (AgencyI) registry.lookup(agencyList[i]);
				
				if (agency.listServices().contains(agent.getServiceInterest())){
					itinerary.add(agencyList[i]);
				}
			}
			agent.setItinerary(itinerary);
			agent.run();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
