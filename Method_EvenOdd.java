package com.groot;
import java.util.Scanner;

public class Method_EvenOdd {
public static void main(String str[]) {
	evod me=new evod();
	me.getEvod();
}
}
class evod{
	public void getEvod() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("odd");
		}
	}
}
