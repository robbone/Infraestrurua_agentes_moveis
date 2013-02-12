package br.ufu.facom.sd.agencies;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class StartAgency {
	
	public static void main(String[] args){
		
		try{
			AgencyI agency1 = new Agency1("Agencia 1");
			AgencyI agency2 = new Agency2("Agencia 2");
			AgencyI agency3 = new Agency3("Agencia 3");
			Registry registry = LocateRegistry.createRegistry(1099);
			registry.bind("Agency1", agency1);
			registry.bind("Agency2", agency2);
			registry.bind("Agency3", agency3);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
