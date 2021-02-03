package entities;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Today {
	//Color
		public static final String ANSI_RESET = "\u001B[0m";
		public static final String ANSI_BLACK = "\u001B[30m";
		public static final String ANSI_RED = "\u001B[31m";
		public static final String ANSI_GREEN = "\u001B[32m";
		public static final String ANSI_YELLOW = "\u001B[33m";
		public static final String ANSI_BLUE = "\u001B[34m";
		public static final String ANSI_PURPLE = "\u001B[35m";
		public static final String ANSI_CYAN = "\u001B[36m";
		public static final String ANSI_WHITE = "\u001B[37m";

		public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
		public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
		public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
		public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
		public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
		public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
		public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
		public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
		
		//inicial date
		private Date primeiroDia = Date.from(Instant.parse("1969-12-28T04:00:00Z"));
		private Date today = new Date(); 
		private SimpleDateFormat sdf = new SimpleDateFormat("dd"); 
		private SimpleDateFormat sdf1 = new SimpleDateFormat("MMM"); 
		
		public Today(Date[][] calendar) {
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
			int linhaI = 0;
			for(int i=0; i<calendar.length; i++) {
				for (int j=0; j<7; j++) {	
					
					if(calendar[i][j].getMonth() == today.getMonth() && calendar[i][j].getYear() == today.getYear()) {
						linhaI = i;
						j += 8;
						i += 6000;
					}

				}
			}
			int linhaF = linhaI + 5;
			
			//print
			
				System.out.println();
				System.out.println("----------"+sdf1.format(calendar[linhaI][6])+"/"+(today.getYear()+1900)+"---------");
				System.out.print  ("dom seg ter qua qui sex sab");
				
				for(int i=linhaI; i<=linhaF; i++) {
					System.out.println();
					for (int j=0; j<7; j++) {				
						//imprimi
						
						cal.setTime(today);
						today = cal.getTime();
						
						if(calendar[i][j].getMonth() == today.getMonth()) {
							if(calendar[i][j].getDate() == today.getDate() && calendar[i][j].getMonth() == today.getMonth() && calendar[i][j].getYear() == today.getYear()) {							
								System.out.print(" "+ANSI_BLUE_BACKGROUND+ sdf.format(calendar[i][j])+ANSI_RESET+" ");
							}
							else {
								System.out.print(" "+ sdf.format(calendar[i][j])+" ");																												
							}
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

		@Override
		public String toString() {
			return "";
		}
}
