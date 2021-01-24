package entities;

public class Day {

	//private static final SimpleDateFormat sdf = new SimpleDateFormat("dd");
	
	private String[][] date = new String [6][7];

	public Day(Integer[][] date) {
		int init = 0;
		for(int i=0; i<5; i++) {
			System.out.println();
			for(int j=0; j<7; j++) {
				init += 1;
				date[i][j] = init;
			}
		}
	}
	
	public String[][] toString() {
		return date;
	}
}
