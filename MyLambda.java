import java.util.*;
public class MyLambda
{



	public static void main(String[] args) {

		String[] nomi = {"Mario","Giorgio","Ciccio","Alice","Ciccio"};
 		List<String> mylist = new ArrayList(Arrays.asList(nomi));

 		

    	//mylist.removeIf(    (String s)->{ return s.contains("Ciccio");}        ) ;


 		Predicate<String> p=(String s)->{ return s.contains("Ciccio");};


 		mylist.removeIf(p);



 		mylist.removeIf( new Predicate<String>()
 		{

 			public boolean test(String c)
 			{
 					return c.contains("Ciccio");

 			}
 		}



 			);

    	System.out.println(mylist);


    	mylist.forEach( new Consumer<String>()
    	{

    		public void accept(String g)
    		{
    				System.out.println(g);
    		}

    	}



    		);
		
    	mylist.forEach( g -> System.out.println(g)  );

	}
}