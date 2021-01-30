package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import entities.CalendarioException;

public class Program {

	@SuppressWarnings("deprecation")
	public static void main(String[]args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		char close = 0;
		while(close != 'n') {
			try {
				UI.clearScreen();
				
				SimpleDateFormat sdf2 = new SimpleDateFormat("dd"); 
				
				Date[][] teste = new Date[5509][7];
				
				Date d1 = Date.from(Instant.parse("1969-12-28T04:00:00Z"));
				Calendar cal = Calendar.getInstance();		
				
				System.out.print("Digite um ano: ");
				int anoPrint = sc.nextInt();
				System.out.print("Digite um mes: ");
				int mesPrint = sc.nextInt();
				
				int mes = 0;
				
				cal.setTime(d1);
				cal.add(Calendar.MONTH, mes);
				d1 = cal.getTime();
				
				//matriz calendario
				for(int i=0; i<teste.length; i++) {
					for (int j=0; j<7; j++) {	
						teste[i][j] = d1;
						
						//add 1 dia
						cal.setTime(d1);
						cal.add(Calendar.DAY_OF_MONTH, 1);
						d1 = cal.getTime();
					}
				}
				
				//busca
				int subAnoPrint = anoPrint - 1900;
				int linhaI = 0;
				for(int i=0; i<teste.length; i++) {
					for (int j=0; j<7; j++) {	
						
						if(teste[i][j].getMonth() +1 == mesPrint && teste[i][j].getYear() == subAnoPrint) {
							linhaI = i;
							j += 8;
							i += 6000;
						}

					}
				}
				int linhaF = linhaI + 5;
				
				//print
				System.out.println();
				System.out.println("---------------------------");
				System.out.print  ("dom seg ter qua qui sex sab");
				
				for(int i=linhaI; i<=linhaF; i++) {
					System.out.println();
					for (int j=0; j<7; j++) {

						//imprimi
						if(teste[i][j].getMonth() + 1== mesPrint) {
							System.out.print(" "+ sdf2.format(teste[i][j])+" ");														
						}
						else {
							System.out.print("    ");
						}
					}
				}

				System.out.println();
				System.out.print("Gostaria de um novo mes? ");
				close = sc.next().charAt(0);
				UI.clearScreen();			
			}

			catch(CalendarioException e) {
				System.out.println("!Fogo no parquinho!");
			}
		}
		sc.close();
	}
}
