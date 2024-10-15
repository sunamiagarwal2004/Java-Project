package com.groot;
import java.util.Scanner;

public class Marks {
public static void main(String str[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Marks:");
	int a=sc.nextInt();
	if(a>1&&a<33) {
		System.out.println("Grade:F and FAIL");
	}else if(a>=33 && a<50) {
		System.out.println("Grade:E PASS");
	}else if(a>=50 && a<60) {
		System.out.println("Grade:D PASS");
	}else if(a>=60 && a<70) {
		System.out.println("Grade:C PASS");
	}else if(a>=70 && a<80) {
		System.out.println("Grade:B PASS");
	}else if(a>=80 && a<=100) {
		System.out.println("Grade:A PASS");
	}
}
}
