package com.groot;
import java.util.Scanner;

public class divisibility {
public static void main(String str[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int a=sc.nextInt();
	if(a%5==0) {
		if(a%11==0) {
			System.out.println("Number is divisible");
		}
	}else {
		System.out.println("Number is not divisible");
	}
}
}
