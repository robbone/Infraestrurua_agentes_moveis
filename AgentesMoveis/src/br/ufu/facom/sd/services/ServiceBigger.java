package br.ufu.facom.sd.services;

public class ServiceBigger implements ServiceBiggerI {
	public int bigger(int x, int y){
		if(x > y){
			return x;
		}
		else if(x < y){
			return y;
		}
		else{
			return 0;
		}
	}
}
