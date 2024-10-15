package com.groot;
import java.util.Scanner;

public class Method3_factorial {
public static void main(String str[]) {
	int res=fac.getFact();
	System.out.println("Factorial="+res);
}
}
class fac{
	public static int getFact() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
}