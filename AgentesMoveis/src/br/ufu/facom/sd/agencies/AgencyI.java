package br.ufu.facom.sd.agencies;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import br.ufu.facom.sd.agents.Agent;
import br.ufu.facom.sd.services.ServiceI;

public interface AgencyI extends Remote {
	
	public void moveToNewAgency(Agent a) throws RemoteException;
	public String getAgencyName() throws RemoteException;
	public List<String> listServices() throws RemoteException;
	public int sum(int x, int y) throws RemoteException;
	public int bigger(int x, int y) throws RemoteException;

}
