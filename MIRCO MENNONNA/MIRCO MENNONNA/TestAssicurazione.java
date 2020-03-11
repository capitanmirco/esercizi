package it.elis.java;

public class TestAssicurazione {
	public static void main(String args[])
	{
	Archivio alianz = new Archivio();
	alianz.addCliente("mario");
	alianz.addCliente("luca");
	alianz.addCliente("stefano");
	alianz.addAutomobile(123456,"mario");
	alianz.addAutomobile(467296,"luca");
	alianz.addAutomobile(524361,"stefano");
	alianz.addAutomobile(856734,"luca");
	alianz.addAutomobile(536899,"mario");
	System.out.println(alianz.returnTarga("mario"));
	System.out.println(alianz.clienteTarga(524361));
	System.out.println(alianz.contaAuto("luca"));
	System.out.println(alianz.maxAuto());
	alianz.removeCliente("stefano");
	System.out.println(alianz.contaAuto("stefano"));
	}
}
