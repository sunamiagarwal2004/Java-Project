package com.groot;
import java.util.Scanner;

public class Prime_number {
public static void main(String str[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int a=sc.nextInt();
	int temp=0,i;
	if(a==0||a==1) {
		System.out.println("is not a prime number");
	}else {
	for(i=2;i<a/2;i++) {
		if(a%i==0) {
			System.out.println("not a prime number");
			temp=1;
			break;
		}
	}
	if(temp==0) {
		System.out.println("is a prime number");
	}
	}
}
}
