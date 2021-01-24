package application;

import java.util.ArrayList;
import java.util.List;

import entities.Day;

public class Program {

	public static void main(String[]args) {
		
		String [][] cal = new String[6][7];
		
		Day day = new Day(cal);
		System.out.println(day);
	}
}
