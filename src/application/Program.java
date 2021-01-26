package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import entities.Calendario;

public class Program {

	public static void main(String[]args) throws ParseException {

		String[][] diasDoMes = new String[6][7];
		String[][] diasDaSemana = new String[1][7]; 
				
		Calendario calendario = new Calendario(diasDoMes, diasDaSemana);
		System.out.println(calendario);
		System.out.println();

		//teste
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy"); 
		SimpleDateFormat sdf1 = new SimpleDateFormat("EE"); 
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd"); 

		String[][] teste = new String[6][7];
		
		Date d1 = Date.from(Instant.parse("2020-12-27T04:00:00Z"));
		
		Calendar cal = Calendar.getInstance();		
		
		System.out.print("Digite um mês: ");
		int mes = sc.nextInt() -1;
		
		cal.setTime(d1);
		cal.add(Calendar.MONTH, mes);
		d1 = cal.getTime();

		/*System.out.println("Dia: "+day);
		System.out.println("Mês: "+(month +1));
		System.out.println("Ult: "+lastDayMonth);*/
		
		for(int i=0; i<teste.length; i++) {
			System.out.println();
			for (int j=0; j<7; j++) {

				int day = cal.get(Calendar.DAY_OF_MONTH);
				int month = cal.get(Calendar.MONTH);	
				int lastDayMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
				
				
				if(month == (mes)) {
					if(day <= lastDayMonth) {
						teste[i][j] = sdf2.format(d1);
						day++;
					}
				}
				else {
					teste[i][j] = "--";
				}
					
				//imprimi
				System.out.print(" "+ teste[i][j]);					

				
				//add 1 dia
				cal.setTime(d1);
				cal.add(Calendar.DAY_OF_MONTH, 1);
				d1 = cal.getTime();
			}
		}
		
		
		/*for(int i=0; i<1; i++) {
			System.out.println();
			for (int j=0; j<7; j++) {
				System.out.print(" "+ teste[i][j]);
			}
		}*/
		
		/*for(int i=0; i<teste.length; i++) {
			System.out.println();
			for (int j=0; j<7; j++) {
			}
		}*/
	}
}
