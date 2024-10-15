package com.groot;
import java.util.Scanner;

public class Star4 {
public static void main(String str []) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no. of rows:");
	int a=sc.nextInt();
	for(int i=1;i<=a;i++) {
		for(int j=0;j<=a-i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
