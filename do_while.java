package com.groot;
import java.util.Scanner;

public class do_while {
public static void main(String str[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number:");
	int n=sc.nextInt();
	int i=1;
	do {
		System.out.println(i);
		i++;
	}while(i<=n);
}
}
