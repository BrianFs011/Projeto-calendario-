package entities;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Calendario {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy"); 
	SimpleDateFormat sdf2 = new SimpleDateFormat("dd"); 
	SimpleDateFormat sdf3 = new SimpleDateFormat("EE"); 
	
	private Date inicDay = Date.from(Instant.parse("2021-01-01T04:00:00Z")); 
	private Date inicSemana = Date.from(Instant.parse("2020-12-27T04:00:00Z")); 
	
	Month month;
	
	public Calendario(String[][] diasDoMes, String[][] diasDaSemana) {
		//dias da semana
		for(int i=0; i<diasDaSemana.length; i++) {
			for (int j=0; j<7; j++) {
				Calendar cal = Calendar.getInstance();
				diasDaSemana[i][j] = sdf3.format(inicSemana);
				System.out.print(diasDaSemana[i][j]+" ");
				cal.setTime(inicSemana);
				cal.add(Calendar.DAY_OF_MONTH, 1);
				inicSemana = cal.getTime();
			}
		}
		
		
		//dias do mês
		int cont = 0;
		for (int i=0; i<diasDoMes.length; i++) {
			System.out.println();
			for(int j=0; j<7; j++) {
				if (cont < 5) {
					diasDoMes[i][j] = " --";
					System.out.print(diasDoMes[i][j] + " ");
					cont ++;
				}
				else if (cont <= 35){
					Calendar cal = Calendar.getInstance();
					cal.setTime(inicDay); 
					cal.add(Calendar.HOUR_OF_DAY, 4); 
					cal.add(Calendar.HOUR_OF_DAY, -4);
					inicDay = cal.getTime();
					
					diasDoMes[i][j] = sdf2.format(inicDay);
					
					System.out.print(" " +diasDoMes[i][j] + " ");					
					
					cal.setTime(inicDay); 
					cal.add(Calendar.DAY_OF_MONTH, 1);
					inicDay = cal.getTime();
					cont ++;
				}
				else {
					diasDoMes[i][j] = "--";
					System.out.print(" "+diasDoMes[i][j] + " ");
				}
				
			}
		}
	}
	
	@Override
	public String toString() {
		return "";
	}
	
}