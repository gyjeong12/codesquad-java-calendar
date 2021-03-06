package com.javalec.ex;

public class Calendar {
	
	private final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	private final int[] LEAP_MAX_DAYS = {31,29,31,30,31,30,31,31,30,31,30,31};
	
	public boolean isLeapYear(int year) {
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 
			return true;
		
		return false;
	}
	
	public int getMaxDaysOfMonth(int year, int month) {
		if(isLeapYear(year)) {
			return LEAP_MAX_DAYS[month-1];
		}else {
			return MAX_DAYS[month-1];
		}
	}
	
//
//			<<2017year 3month>>
//		SU MO TU WE TH FR SA
//		---------------------
//				  1	 2	3  4
//		 5	6  7  8  9 10 11
	
	public void printCalendar(int year, int month, int weekday) {
		System.out.printf("    <<%4dyear %3dmonth>>\n",year,month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("----------------------------");
		
		//print blank space
		for(int i=0; i<weekday; i++) {
			System.out.print("   ");
		}
		
		int maxDay = getMaxDaysOfMonth(year, month);
		int count = 7 - weekday;
		int delim = count;
		
		//print first line
		for(int i=1; i <= count; i++) {
			System.out.printf("%3d",i);
		}
		System.out.println();
		
		//print form second line to last
		count++;
		for(int i=count; i <= maxDay; i++) {
			System.out.printf("%3d",i);
			if(i % 7 == delim) {
				System.out.println();
			}
		}
		
		System.out.println();
	}

}
