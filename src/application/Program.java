package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

import entities.Calendario;

public class Program {

	public static void main(String[]args) throws ParseException {

		String[][] diasDoMes = new String[6][7];
		String[][] diasDaSemana = new String[1][7]; 
				
		Calendario calendario = new Calendario(diasDoMes, diasDaSemana);
		System.out.println(calendario);
		System.out.println();

		//teste
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy"); 
		SimpleDateFormat sdf1 = new SimpleDateFormat("EE"); 
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM"); 

		String[][] teste = new String[6][7];
		
		Date d1 = Date.from(Instant.parse("2020-12-27T04:00:00Z"));
		
		Calendar cal = Calendar.getInstance();		
		
		for(int i=0; i<teste.length; i++) {
			System.out.println();
			for (int j=0; j<7; j++) {
				teste[i][j] = sdf1.format(d1);
					
				if(teste[i][j] != null) {
			    	System.out.print(" "+ sdf1.format(d1));					
				}
			    else {
			    	System.out.print(" - ");		
			    }
				
				cal.setTime(d1);
				cal.add(Calendar.DAY_OF_MONTH, 1);
				d1 = cal.getTime();
			}
		}
		
		
		
	}
}
