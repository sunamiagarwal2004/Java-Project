package com.groot;
import java.util.Scanner;

public class Whileloop {
public static void main(String str[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	int i=1;
	while(i<=n) {
		System.out.println(i);
		i++;
	}
}
}
