package com.groot;
import java.util.Scanner;

public class Method_addition {
public static void main(String str[]) {
	add ma=new add();
	ma.getAdd();
  }
} 
class add{
	public void getAdd() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		System.out.println("Enter the number:");
        int b=sc.nextInt();
        System.out.println("Addition:"+(a+b));
	}
}
