package com.javalec.ex;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		//Input 	: Keyboard
		//Output 	: Screen
		int a, b;
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		System.out.println("Enter two number :");
		s1 = scanner.next();
		s2 = scanner.next();
		
		a=Integer.parseInt(s1);
		b=Integer.parseInt(s2);
	
		System.out.printf("Sum of %d and %d is %d",a,b, a+b);
		scanner.close();
	}

}
