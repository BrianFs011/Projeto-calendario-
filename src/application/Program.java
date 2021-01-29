package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[]args) throws ParseException {

		/*String[][] diasDoMes = new String[6][7];
		String[][] diasDaSemana = new String[1][7]; 
				
		Calendario calendario = new Calendario(diasDoMes, diasDaSemana);
		System.out.println(calendario);
		System.out.println();*/

		//teste

		char close = 0;
		while(close != 'n') {
			try {
				Scanner sc = new Scanner(System.in);
				
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy"); 
				SimpleDateFormat sdf1 = new SimpleDateFormat("EE"); 
				SimpleDateFormat sdf2 = new SimpleDateFormat("dd"); 
				SimpleDateFormat sdf3 = new SimpleDateFormat("MM"); 
				SimpleDateFormat sdf4 = new SimpleDateFormat("dd/MMM"); 
				
				Date[][] teste = new Date[53][7];
				
				Date d1 = Date.from(Instant.parse("2020-12-27T04:00:00Z"));
				Calendar cal = Calendar.getInstance();		
				System.out.print("Digite um mes: ");

				int mesPrint = sc.nextInt();
				
				int mes = 0;
				
				cal.setTime(d1);
				cal.add(Calendar.MONTH, mes);
				d1 = cal.getTime();
				
				int year = cal.get(Calendar.YEAR);
				
				for(int i=0; i<teste.length; i++) {
					for (int j=0; j<7; j++) {

						int day = cal.get(Calendar.DAY_OF_MONTH);
						int month = cal.get(Calendar.MONTH);	
						int lastDayMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
						
						
						teste[i][j] = d1;
						
						//add 1 dia
						cal.setTime(d1);
						cal.add(Calendar.DAY_OF_MONTH, 1);
						d1 = cal.getTime();
					}
				}
				
				int linhaInic = 0;
				int linhaFinal = 0;
				String calMes = " ";
				
				if (mesPrint == 1) {
					linhaInic = 0;
					linhaFinal = 5;
					calMes = "jan";
				}
				else if (mesPrint == 2) {
					linhaInic = 5;
					linhaFinal = 9;
					calMes = "fev";
				}
				
				else if (mesPrint == 3) {
					linhaInic = 9;
					linhaFinal = 13;
					calMes = "mar";
				}
				
				else if (mesPrint == 4) {
					linhaInic = 13;
					linhaFinal = 17;
					calMes = "abr";
				}

				else if (mesPrint == 5) {
					linhaInic = 17;
					linhaFinal = 22;
					calMes = "mai";
				}

				else if (mesPrint == 6) {
					linhaInic = 22;
					linhaFinal = 26;
					calMes = "jun";

				}

				else if (mesPrint == 7) {
					linhaInic = 26;
					linhaFinal = 30;
					calMes = "jul";

				}

				else if (mesPrint == 8) {
					linhaInic = 31;
					linhaFinal = 35;
					calMes = "ago";

				}

				else if (mesPrint == 9) {
					linhaInic = 35;
					linhaFinal = 39;
					calMes = "set";

				}

				else if (mesPrint == 10) {
					linhaInic = 39;
					linhaFinal = 44;
					calMes = "out";

				}

				else if (mesPrint == 11) {
					linhaInic = 44;
					linhaFinal = 48;
					calMes = "nov";

				}

				else if (mesPrint == 12) {
					linhaInic = 48;
					linhaFinal = 53;
					calMes = "dez";

				}
				linhaFinal += 1;

				//print
				System.out.println();
				System.out.println("------------"+calMes+"------------");
				System.out.print  ("dom seg ter qua qui sex sab");
				
				for(int i=linhaInic; i<=linhaFinal; i++) {
					System.out.println();
					for (int j=0; j<7; j++) {

						if(teste[i][j].getMonth() + 1== mesPrint) {
							//imprimi
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

			catch(ArrayIndexOutOfBoundsException e){
			System.out.print("");
			}
				
		}
	}
}