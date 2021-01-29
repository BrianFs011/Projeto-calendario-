package application;

public class UI {
	
	public static void clearScreen() { 
		System.out.println();
		System.out.print("\033[H\033[2J"); 
		System.out.flush();
	}
	
}
