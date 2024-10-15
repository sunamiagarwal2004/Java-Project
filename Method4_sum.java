package com.groot;
import java.util.Scanner;

public class Method4_sum {
public static void main(String str[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first no.=");
	int a=sc.nextInt();
	System.out.println("Enter the second no.=");
	int b=sc.nextInt();
	int res=summ.getSum(a,b);
	System.out.println(res);
}
}
class summ{
	public static int getSum(int a,int b) {
		return a+b;
	}
}
