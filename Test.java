package com.groot;
import java.util.Scanner;

public class Test {
	public static void main(String str[]) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of a :");
    int a= sc.nextInt();
    System.out.println("Enter the value of b:");
    int b= sc.nextInt();
    int c=a*b;
    System.out.println("Multiplication:"+c);
	}
}
