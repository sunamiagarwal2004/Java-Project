package com.groot;
import java.util.Scanner;

public class Method2_factorial {
public static void main(String str[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no.:");
	int x=sc.nextInt();
	Fact.getFact(x);
}
}
class Fact{
	public static void getFact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial="+fact);
	}
}
