package com.groot;
import java.util.Scanner;
public class for_loop {
public static void main(String str[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int a=sc.nextInt();
	for(int i=1;i<=10;i++) {
		System.out.println(i*a);
	}
}
}
