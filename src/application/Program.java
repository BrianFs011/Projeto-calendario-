package application;

import java.text.ParseException;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Calendario;
import entities.CalendarioException;
import entities.Today;

public class Program {

	public static void main(String[]args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		Date[][] calendar = new Date[5533][7];

		UI.clearScreen();
		//Boas vindas
		System.out.println("Calendario (1970-2075)");
		Today today = new Today(calendar);
		System.out.println(today);
		System.out.print("New Date? (y/n) ");
		char newDate = sc.next().charAt(0);
		UI.clearScreen();
		if(newDate == 'y') {
			char resposta = 0;
			boolean close = true;
			while(close == true) {
				try {
					//ano
					System.out.print("Digite um ano: ");
					int ano = sc.nextInt();
					//exception ano
					while(ano < 1970 || ano > 2075) {
						System.out.print("Por favor digite um ano entre (1970-2075): ");
						ano = sc.nextInt();
					}
					//mes
					System.out.print("Digite um mes: ");
					int mes = sc.nextInt();
					//exception mes
					while(mes < 1 || mes > 12) {
						System.out.print("Por favor digite um mes entre (1-12): ");
						mes = sc.nextInt();
					}
					UI.clearScreen();
					
					Calendario calendario = new Calendario(calendar, ano, mes);
					System.out.println(calendario);
					
					System.out.print("new Date? (y/n) ");
					resposta = sc.next().charAt(0);
					
					while(resposta != 'y' && resposta != 'n') {
						System.out.print("Digite (y/n): ");	
						resposta = sc.next().charAt(0);
					}
					
					if(resposta == 'n') {
						close = false;					
					}
					else if (resposta == 'y') {
						close = true;
					}
					
					UI.clearScreen();
				}
				catch(CalendarioException e) {
					System.out.println("!Fogo no parquinho!");
				}
				catch(InputMismatchException e) {
					System.out.println("Digite numeros inteiros");
					sc.nextLine();
				}	
				catch(IllegalStateException e) {
					System.out.print("Digite numeros inteiros");
				}
				finally {
					if(sc != null) {
					}
				}
			}
		}
		else if (newDate == 'n') {
			System.out.println("Bye");
		}
		else {
			System.out.println("Bye Bye");
		}
		sc.close();					
	}
}