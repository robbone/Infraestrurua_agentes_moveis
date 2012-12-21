public interface AgenciaI extends Remote{ 
       public void receiveClass(byte[] classBytes, String nome); 
       public void receiveAgent(Agent a); 
       public void moveAgentToNewAgency (Agent agent, String novaAgencia);
       public void registraAgenteNS(String agente);
       public void desconecta ();
} 