public class TestMain
{


	public static void main(String[] args) {
		
		//String[] x={"mario"};
		

		//System.out.println(x[1]);//GENERA UN'ECCEZIONE A RUNTIME

			for (int j=0;j<5 ;j++ ) {
				
				try{

						System.out.println(j);
						Thread.sleep(2000);
				
					}
					catch(InterruptedException e){}
					

			}


	}

}