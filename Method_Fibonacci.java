package com.groot;
import java.util.Scanner;

public class Method_Fibonacci {
public static void main(String str[]) {
	fib mf=new fib();
	mf.getFib();
}
}
class fib{
	public void getFib() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c=a+b;
		System.out.println(a);
		System.out.println(b);
		for(int i=3;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	
	}	
}
