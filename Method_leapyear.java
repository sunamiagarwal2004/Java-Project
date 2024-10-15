package com.groot;
import java.util.Scanner;

public class Method_leapyear {
public static void main(String str[]) {
	leap ml=new leap();
	ml.getLeap();
}
}
class leap{
	public void getLeap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year:");
		int a=sc.nextInt();
		if(a%4==0) {
			System.out.println("Leap year");
		}else if(a%100==0||a%400==0) {
			System.out.println("Leap year");
		}else {
			System.out.println("not a leap year");
		}
	}
}
