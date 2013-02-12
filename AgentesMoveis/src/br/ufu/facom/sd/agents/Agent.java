package br.ufu.facom.sd.agents;
import java.io.Serializable;
import java.rmi.Naming;
import java.util.ArrayList;
import java.util.List;

import br.ufu.facom.sd.agencies.Agency1;
import br.ufu.facom.sd.agencies.AgencyI;
import br.ufu.facom.sd.services.ServiceI;
import br.ufu.facom.sd.services.ServiceSum;
import br.ufu.facom.sd.services.ServiceSumI;



public class Agent implements AgentI, Runnable, Serializable {

	private List<String> itinerary;
	private int hostIndex;
	private AgencyI agenciaAtual;
	private String serviceInterest;
	private int x = 3;
	private int y = 2;
	private int result;
	
	public Agent(){
		this.hostIndex = 0;
		this.serviceInterest = "ServiceSum";
	}
	
	public void run(){
		try{
			
			if(hostIndex < itinerary.size()){
				this.agenciaAtual = (AgencyI) Naming.lookup(itinerary.get(hostIndex));
				System.out.println("Agent running in " + this.agenciaAtual.getAgencyName());
				this.result = agenciaAtual.sum(this.x, this.y);
				System.out.println("Resultado: " + x + " + " + y + " = " + result);
				hostIndex++;
				agenciaAtual.moveToNewAgency(this);
			}
			else{
				System.out.println("No more Agencies for this Agent");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void setLocal(AgencyI agenciaAtual){
		this.agenciaAtual = agenciaAtual;
	}

	public String getServiceInterest() {
		return serviceInterest;
	}
	
	public void setItinerary(List<String> itinerary){
		this.itinerary = itinerary;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	
	
}
