package esercizioAssicurzioni;

import java.util.ArrayList;

public class Archivio 
{
	public ArrayList<Cliente> clienti = new ArrayList<Cliente>();
	public ArrayList<Automobile> automobili = new ArrayList<Automobile>();
	
	
	public void addCliente(String nome)
	{
		boolean check = false;
		for(Cliente c : clienti) 
		{
			if(c.getNome().equals(nome))
			{
				check = true;
			}
		}
		if(!check)
		{
			clienti.add(new Cliente(nome));
		}
			
		
	}
	
	public void addAutomobile(String targa, String nome) // che aggiunge una nuova auto all’arraylist automobili
	{
		boolean check = false;
		for(Cliente cl : clienti)
		{
			if(cl.getNome().equals(nome))
			{
				automobili.add(new Automobile(targa, cl));
				check = true;
			}
		}
		
		if(!check)
		{
			Cliente c = new Cliente(nome);
			automobili.add(new Automobile(targa, c));
			clienti.add(c);
		}
	}
	
	public void removeAutomobile(String targa) // che rimuove un automobile dall’arraylist automobili
	{
		for(int i = 0; i < automobili.size(); i++)
		{
			if(automobili.get(i).getTarga().equals(targa))
			{
				automobili.remove(i);
			}
		}
	}
	
	public String clienteTarga(String targa) //   che restituisce il nome del proprietario di una targa. 
	{
		for (Automobile a : automobili)
		{
			if (a.getTarga().equals(targa))
			{
				return a.getCliente().getNome();
			}
		}
		return null;
	}
	
	public ArrayList<String> returnTarga(String nome)//   che restituisce una lista con le targhe delle automobili aventi un dato proprietario. 
	{
		ArrayList<String> al = new ArrayList<String>();
		
		for(Automobile a : automobili)
		{
			if (a.getCliente().getNome().equals(nome))
			{
				al.add(a.getTarga());
			}
		}
		
		return al;
	}
	
	public int contaAuto(String nome) //  che conta quante automobili sono associate a un cliente.
	{
		int i = 0;
		
		for(Automobile a : automobili)
		{
			if(a.getCliente().getNome().equals(nome))
			{
				i++;
			}
		}
		return i;
	}
	
	public void removeCliente(String nome) //  che toglie un cliente dall'arraylist clienti e le sue auto dall'arraylist automobili. 
	{
		for(int i = 0; i < clienti.size(); i++)
		{
			if(clienti.get(i).getNome().equals(nome))
			{
				clienti.remove(i);
				for(int c = 0; c < automobili.size(); c++)
				{
					if(automobili.get(c).getCliente().getNome().equals(nome))
					{
						automobili.remove(c);
					}
				}
				
			}
		}
	}
	
	
	public Cliente maxAuto()   //    che restituisce il cliente con il maggior numero di auto.
	{
		Cliente cl = null;
		int maxAuto = 0;
		
		for(Cliente c : clienti)
		{
			int nAuto = contaAuto(c.getNome());
			
			if(nAuto > maxAuto)
			{
				maxAuto = nAuto;
				cl = c;
			}
		}
		
		return cl;
	}
	

	public void stampaClienti()
	{
		for(Cliente c : clienti)
		{
			System.out.println(c.toString());
		}
	}

	public void stampaAutomobili()
	{
		for(Automobile a : automobili)
		{
			System.out.println(a.toString());
		}
	}
	
	
}
