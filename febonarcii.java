package com.groot;
import java.util.Scanner;

public class febonarcii {
public static void main(String str[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	int a=0,b=1;
	int c=a+b;
	System.out.println(a);
	System.out.println(b);
	for(int i=3;i<=n;++i) {
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
	}
	
}
}
