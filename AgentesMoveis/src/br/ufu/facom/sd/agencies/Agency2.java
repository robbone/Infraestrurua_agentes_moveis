package br.ufu.facom.sd.agencies;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import br.ufu.facom.sd.agents.Agent;
import br.ufu.facom.sd.services.ServiceBigger;
import br.ufu.facom.sd.services.ServiceBiggerI;
import br.ufu.facom.sd.services.ServiceI;
import br.ufu.facom.sd.services.ServiceSum;
import br.ufu.facom.sd.services.ServiceSumI;

public class Agency2 extends UnicastRemoteObject implements AgencyI{
	private List<String> servicesList = new ArrayList<String>();
	private String agencyName;
	private ServiceSumI serviceSum = new ServiceSum();
	
	public Agency2(String agencyName) throws RemoteException {
		this.agencyName = agencyName;
		this.servicesList.add("ServiceSum");
	}

	public void moveToNewAgency(Agent a) throws RemoteException{
		a.setLocal(this);
		a.run();
	}

	public String getAgencyName() {
		return this.agencyName;
	}
	
	public void addService(String service){
		this.servicesList.add(service);
	}
	
	public List<String> listServices(){
		return this.servicesList;
	}

	@Override
	public int sum(int x, int y) {
		return this.serviceSum.sum(x, y);
	}

	@Override
	public int bigger(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}
}
