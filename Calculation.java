package com.groot;
import java.util.Scanner;

public class Calculation {
 public static void main(String str[]) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the value of a:");
 int a= sc.nextInt();
 System.out.println("Enter the value of b:");
 int b= sc.nextInt();
 int c=a+b;
 int d=a-b;
 int e=a*b;
 float f=a/b;
 System.out.println("Addition="+c);
 System.out.println("Substraction="+d);
 System.out.println("Multiplication="+e);
 System.out.println("Division="+f);
    }
}