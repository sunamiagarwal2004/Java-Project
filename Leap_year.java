package com.groot;
import java.util.Scanner;

public class Leap_year {
public static void main(String str[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the year:");
	int a=sc.nextInt();
	if(a%4==0) {
		System.out.println("Leap Year");
	}else if(a%100==0) {
		if(a%400==0) {
			System.out.println("Leap year");
		}
	}else {
			System.out.println("not a leap year");
	}
	}
}

