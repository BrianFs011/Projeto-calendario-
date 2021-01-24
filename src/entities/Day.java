package entities;

public class Day {

	public Day(String[][] cal) {
		System.out.print(" dom  seg  ter  qua  qui  sex  sab");
		int row = 0;
		for(int i=0; i<5; i++) {
			System.out.println();
			for(int j=0; j<7; j++) {
				if(row < 31) {
					row += 1;
					cal[i][j] = Integer.toString(row);					
				}
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
			}
		}
	}
	
	public String toString() {
		return " ";
	}
}

