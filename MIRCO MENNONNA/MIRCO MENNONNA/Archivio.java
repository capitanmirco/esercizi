package it.elis.java;
import java.util.ArrayList;
public class Archivio {
	private ArrayList<Cliente> clienti;
	private ArrayList<Automobile2> automobili;
	public Archivio()
	{
	clienti = new ArrayList<Cliente>();
	automobili = new ArrayList<Automobile2>();
	}
	public int indiceCliente(String nome)
	{
	int risultato=-1;
	for(int i = 0;i<clienti.size();i++)
	{
	if(clienti.get(i).getNome().equalsIgnoreCase(nome))
	risultato=i;
	}
	return risultato;
	}
	public int indiceTarga(int targa)
	{
	int risultato=-1;
	for(int i=0;i<automobili.size();i++)
	{
	if (automobili.get(i).getNumeroTarga() == targa)
	risultato=i;
	}
	return risultato;
	}
	public void addCliente(String nome)
	{
	if(indiceCliente(nome)!= -1)
	return;
	clienti.add(new Cliente(nome));
	}
	public void addAutomobile(int targa, String nome)
	{
	if(indiceTarga(targa)!= -1)
	return;
	addCliente(nome);
	automobili.add(new Automobile2(targa,clienti.get(indiceCliente(nome))));
	}
	public void removeAutomobile(int targa)
	{
	if(indiceTarga(targa)==-1)
	return;
	automobili.remove(indiceTarga(targa));
	}
	public String clienteTarga(int targa)
	{
	if(indiceTarga(targa)== -1)
	return "Targa non presente.";
	else
	return automobili.get(indiceTarga(targa)).getProprietario().getNome();
	}
	public ArrayList<Integer> returnTarga(String unNome)
	{
	ArrayList<Integer> temp = new ArrayList<Integer>();
	if(indiceCliente(unNome)==-1)
	return temp;
	for(int i=0;i<automobili.size();i++)
	{
	if(automobili.get(i).getProprietario().getNome().equals(unNome))
	temp.add(automobili.get(i).getNumeroTarga());
	}
	return temp;
	}
	public int contaAuto(String unNome)
	{
	return returnTarga(unNome).size();
	}
	public void removeCliente(String unNome)
	{
	if(indiceCliente(unNome)== -1)
	return;
	for(int i=automobili.size()-1;i>-1;i--)
	{
	if(automobili.get(i).getProprietario().getNome().equals(unNome))
	automobili.remove(i);
	}
	clienti.remove(indiceCliente(unNome));
	}
	public Cliente maxAuto()
	{
	int indice=-1;
	int max=0;
	for(int i=0;i<clienti.size();i++)
	{
	int proprietario=0;
	proprietario=contaAuto(clienti.get(i).getNome());
	if(proprietario>max)
	{
	max=proprietario;
	indice=i;
	}
	}
	return clienti.get(indice);
	}
}

