package it.corso.assicurazione;

import java.util.ArrayList;

public class Archivio {
	
	private ArrayList<Cliente> clienti;
	private ArrayList<Automobile> automobili;
	
	public Archivio() {
		this.clienti = new ArrayList<Cliente>();
		this.automobili = new ArrayList<Automobile>();
	}
	
	public void addCliente(String unNome) {
		this.clienti.add(new Cliente(unNome));
		System.out.println("Cliente registrato.");
	}
	
	public Cliente getCliente(String unNome) {
		for (Cliente c : clienti) {
			if(c.getNominativo().equals(unNome)) {
				return c;
			}
		}
		return null;
	}
	
	public void addAutomobile(int unaTarga, String unNome) {
		Cliente c = getCliente(unNome);
		if(c != null) {
			automobili.add(new Automobile(unaTarga, c));
			System.out.println("Automobile registrata");
		} else {
			System.out.println("Cliente non registrato!!!");
		}
	}
	
	public void removeAutomobile(int unaTarga) {
		for (Automobile automobile : automobili) {
			if(automobile.getNumeroTarga() == unaTarga) {
				automobili.remove(automobile);
				System.out.println("Automobile rimossa!!!");
				break;
			}
		}
	}
	
	public String clienteTarga(int unaTarga) {
		for (Automobile automobile : automobili) {
			if(automobile.getNumeroTarga() == unaTarga) {
				return automobile.getCliente().getNominativo();
			}
		}
		return null;
	}
	
	public ArrayList<Integer> returnTarga(String unNome){
		ArrayList<Integer> targhe = new ArrayList<Integer>();
		for (Automobile a : automobili) {
			if(a.getCliente().getNominativo().equals(unNome)) {
				targhe.add(a.getNumeroTarga());
			}
		}
		return targhe;
	}
	
	public int contaAuto(String unNome) {
		/*int count = 0;
		for (Automobile a : automobili) {
			if(a.getCliente().getNominativo().equals(unNome)) {
				count++;
			}
		}
		System.out.println("Auto associate a un cliente: " + count);*/
		
		ArrayList<Integer> count = returnTarga(unNome);
		System.out.println("Auto associate a un cliente: " + count.size());
		return count.size();
	}
	
	public void removeCliente(String unNome) {
		/*for (Automobile a : automobili) {
			if(a.getCliente().getNominativo().equals(unNome)) {
				automobili.remove(a);
			}
		}
		for (Cliente c : clienti) {
			if(c.getNominativo().equals(unNome)) {
				clienti.remove(c);
			}
		}*/
		
		ArrayList<Integer> targhe = returnTarga(unNome);
		for (Integer targa : targhe) {
			removeAutomobile(targa);
		}
		
		for (Cliente c : clienti) {
			if(c.getNominativo().equals(unNome)) {
				clienti.remove(c);
			}
		}
	}
	
	public Cliente maxAuto() {
		int num = 0;
		Cliente cliente = null;
		for (Cliente c: clienti) {
			int n = contaAuto(c.getNominativo());
			if(n > num) {
				num = n;
				cliente = c; 
			}
		}
		return cliente;
	}

}
