package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[]args) {
		
		/*String [][] cal = new String[6][7];
		
		Month month = new Month(new Date());
		System.out.println(month);
		
		Day day = new Day(cal);
		System.out.println(day);*/
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss"); 
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd"); 
		Date inic = Date.from(Instant.parse("2021-01-01T04:00:00Z")); 
	
		
		String[][] calendario = new String[6][7];
		
		System.out.print("dom seg ter qua qui sex sab");		
		int cont = 0;
		for (int i=0; i<calendario.length; i++) {
			System.out.println();
			for(int j=0; j<7; j++) {
				if (cont < 5) {
					calendario[i][j] = " --";
					System.out.print(calendario[i][j] + " ");
					cont ++;
				}
				else if (cont <= 35){
					Calendar cal = Calendar.getInstance();
					cal.setTime(inic); 
					cal.add(Calendar.HOUR_OF_DAY, 4); 
					cal.add(Calendar.HOUR_OF_DAY, -4);
					inic = cal.getTime();
					
					calendario[i][j] = sdf2.format(inic);
					
					System.out.print(" " +calendario[i][j] + " ");					
					
					cal.setTime(inic); 
					cal.add(Calendar.DAY_OF_MONTH, 1);
					inic = cal.getTime();
					cont ++;
				}
				else {
					calendario[i][j] = "--";
					System.out.print(" "+calendario[i][j] + " ");
				}
				
			}
		}
		
	}
}
