import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
public class UsoDiLocalDate
{
	public static void main(String[] args) {
		
		//CLASSE LOCAL_LDATE
		LocalDate d=LocalDate.now();
		System.out.println(d);

		System.out.println(d.getDayOfMonth());

		System.out.println("ADESSO MENO 15 MESI"+d.minusMonths (15) );

		System.out.println("ADESSO MENO 8 GIORNI"+d.minusDays(8));

		System.out.println("ADESSO PIU' 8 GIORNI"+d.plusDays(8));



		//LOCAL_DATE_TIME
		LocalDateTime ld=LocalDateTime.now();

		String sdate=ld.format( DateTimeFormatter.ISO_LOCAL_TIME);
		System.out.println(sdate);


		sdate=ld.format( DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(sdate);
		

	}

}