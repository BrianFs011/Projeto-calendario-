package entities;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

import application.UI;

public class Calendario {

	private Date primeiroDia = Date.from(Instant.parse("1969-12-28T04:00:00Z"));
	private int ano;
	private int mes;
	
	public Calendario(Date[][] calendar, int ano, int mes) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd"); 
		SimpleDateFormat sdf1 = new SimpleDateFormat("MMM"); 
		Calendar cal = Calendar.getInstance();
				
		cal.setTime(primeiroDia);
		cal.add(Calendar.MONTH, 0);
		primeiroDia = cal.getTime();
		
		//matriz calendario
		for(int i=0; i<calendar.length; i++) {
			for (int j=0; j<7; j++) {	
				calendar[i][j] = primeiroDia;
				
				//add 1 dia
				cal.setTime(primeiroDia);
				cal.add(Calendar.DAY_OF_MONTH, 1);
				primeiroDia = cal.getTime();
			}
		}
		//busca da linha
		this.ano = ano;
		this.mes = mes;
		
		int subAno = ano - 1900;
		int linhaI = 0;
		for(int i=0; i<calendar.length; i++) {
			for (int j=0; j<7; j++) {	
				
				if(calendar[i][j].getMonth() +1 == mes && calendar[i][j].getYear() == subAno) {
					linhaI = i;
					j += 8;
					i += 6000;
				}

			}
		}
		int linhaF = linhaI + 5;
		
		//print
		
			System.out.println();
			System.out.println("----------"+sdf1.format(calendar[linhaI][6])+"/"+ano+"---------");
			System.out.print  ("dom seg ter qua qui sex sab");
			
			for(int i=linhaI; i<=linhaF; i++) {
				System.out.println();
				for (int j=0; j<7; j++) {
					
					//imprimi
					if(calendar[i][j].getMonth() + 1== mes) {
						System.out.print(" "+ sdf.format(calendar[i][j])+" ");														
					}
					else {
						System.out.print("    ");
					}
				}
			}	
		
		
		}
	
	
	public Date getPrimeiroDia() {
		return primeiroDia;
	}



	public int getAno() {
		return ano;
	}



	public int getMes() {
		return mes;
	}



	@Override
	public String toString() {
		return "";
	}
	
}