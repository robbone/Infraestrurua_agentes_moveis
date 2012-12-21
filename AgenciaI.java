import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface AgenciaI extends Remote{ 
       public void receiveClass(byte[] classBytes, String nome) throws RemoteException, FileNotFoundException, IOException; 
       public void receiveAgent(Agent a) throws RemoteException; 
       public void moveAgentToNewAgency (Agent agent, String novaAgencia) throws RemoteException, NotBoundException, IOException;
       public void publishResult(String result, String nomeDoAgente) throws RemoteException;
       public String getNome()throws RemoteException;
       public void registraAgenteNS(String agente)throws RemoteException;
       public void desconecta ()throws RemoteException;
} 