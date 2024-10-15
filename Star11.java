package com.groot;
import java.util.Scanner;

public class Star11 {
public static void main(String str[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no. of rows:");
	int a=sc.nextInt();
	for(int i=1;i<=a-1;i++) {
		for(int k=1;k<=a-i;k++) {
			System.out.print(" ");
		}
		for(int j=1;j<=2*i-1;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
		for(int r=1;r<=a;r++) {
			for(int k=1;k<=r-1;k++) {
				System.out.print(" ");
			}
			for(int j=r;j<=2*a-r;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}

