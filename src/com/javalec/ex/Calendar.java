package com.javalec.ex;

import java.util.Scanner;

public class Calendar {
	
	private final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month-1];
	}
	
	public void printSampleCalendar() {
		System.out.println("Mon Tue Wed Thur Fri Sat Sun");
		System.out.println("----------------------------");
		System.out.println("1   2   3    4   5   6   7");
		System.out.println("8   9   10   11  12  13  14");
		System.out.println("15  16  17   18  19  20  21");
		System.out.println("22  23  24   25  26  27  28");
	}

	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		
		System.out.println("Enter this repeat number :");
		int maxnum = scanner.nextInt();
		while(true) {
			System.out.println("Enter Month : ");
			int month = scanner.nextInt();
			
			System.out.printf("%d month have %d days \n\n",month, cal.getMaxDaysOfMonth(month));
			
			cal.printSampleCalendar();
			maxnum--;
			if(maxnum==0) {
				break;
			}
		}
		scanner.close();
	}

}
