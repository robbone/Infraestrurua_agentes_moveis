package br.ufu.facom.sd.agents;

import java.util.List;

import br.ufu.facom.sd.agencies.AgencyI;
import br.ufu.facom.sd.services.ServiceI;

public interface AgentI {
	
	public void run();
	public void setLocal(AgencyI agenciaAtual);
	public String getServiceInterest();
	public void setItinerary(List<String> itinerary);
	
}
