package com.groot;

import java.util.Scanner;

public class CrtLec2 {
	
	public int Sub(int a, int b) {
		int Sum = a-b;
		return Sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b= sc.nextInt();
		CrtLec2 s=new CrtLec2();
		s.Sub(a, b);
		
	}
}
