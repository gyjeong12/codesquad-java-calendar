package com.javalec.ex;

import java.util.Scanner;

public class Prompt {
	
	/*
	 * @param weekday
	 * @return 0~6 (0 : Sunday, 6 : Saturday)
	 */
	public int parseDay(String week) {
		if(week.equals("su")) return 0;
		else if(week.equals("mo")) return 1;
		else if(week.equals("tu")) return 2;
		else if(week.equals("we")) return 3;
		else if(week.equals("th")) return 4;
		else if(week.equals("fr")) return 5;
		else if(week.equals("sa")) return 6;
		return 0;
	}

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 1;
		int year = 2017;
		int weekday=0;
		while (true) {
			System.out.print("Enter Year : ");
			System.out.println("YEAR> ");
			year = scanner.nextInt();
			System.out.print("Enter Month : ");
			System.out.println("MONTH> ");
			month = scanner.nextInt();
			System.out.println("Enter first weekday");
			String str_weekday = scanner.next();
			weekday = parseDay(str_weekday);
			if (month == -1) {
				break;
			} else if (month > 12) {
				continue;
			}
			cal.printCalendar(year,  month, weekday);
		}
		
		System.out.println("Bye~~");
		scanner.close();
	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
