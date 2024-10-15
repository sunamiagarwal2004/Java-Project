package com.groot;
import java.util.Scanner;

public class Voting {
	public static void main(String str[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Age:");
	int a=sc.nextInt();
	if(a>=18) {
		System.out.println("Eligible for Voting");
	}else {
		System.out.println("Not valid for voting");
	}
	}
}
