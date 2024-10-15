package com.groot;
import java.util.Scanner;

public class Method4_factorial {
public static void main(String str[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number=");
	int n=sc.nextInt();
	int res=factt.getFact(n);
	System.out.println(res);
}
}
class factt{
	public static int getFact(int n) {
		 int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial="+fact);
		return fact;
	}
}