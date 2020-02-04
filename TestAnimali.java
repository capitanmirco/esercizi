public class TestAnimali
{


	public static void main(String[] args) {
		
		Cane x=new Cane();

		x.setTaglia("media");
		x.setRazza("pastore tedesco");
		System.out.println( "razza inserita -->"+x.getRazza()  );
		System.out.println( "taglia inserita -->"+x.getTaglia()  );
		x.stampaVerso();
	}
}