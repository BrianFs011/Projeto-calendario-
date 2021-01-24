package entities;

public class Teste {

	/*private static  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static  SimpleDateFormat sdf2 = new SimpleDateFormat("dd");
	
	private Date[][] calendario = new Date[6][7]; 
	
	public Teste(String[][] cal) {
		
		
		System.out.print(" dom  seg  ter  qua  qui  sex  sab");
		
		Date inic = Date.from(Instant.parse("01/01/2021"));
		
		for (int i = 0; i<5; i++){
			System.out.println();
			for (int j=0; j<7; j++) {
				Calendar cal = Calendar.getInstance();
				cal.setTime(inic);
				calendario[i][j] = sdf.format(cal.getTime());
				cal.add(Calendar.DAY_OF_MONTH, 1);
				inic = cal.getTime();
			}
		}
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	/*public String toString() {
		return " ";
		else {
			String vazia = " -";
			cal[i][j] = vazia;
		}
		if (row < 10) {
			System.out.print("   " + cal[i][j] + (" "));					
		}
		else {
			System.out.print("  " + cal[i][j] + (" "));
		}
	}*/
}