package com.groot;
import java.util.Scanner;

public class Swapnum {
public static void main(String str[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the numbers:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int temp;
	temp=a;
	a=b;
	b=temp;
	System.out.println("Swapped numbers are:"+a +b);
}
}
