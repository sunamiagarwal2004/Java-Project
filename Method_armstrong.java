package com.groot;
import java.util.Scanner;

public class Method_armstrong {
public static void main(String str[]) {
	arm ma=new arm();
	ma.getArm();
}
}
class arm{
	public void getArm() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.:");
		int a=sc.nextInt();
		int sum=0,temp,rem;
		temp=a;
		while(a>0) {
			rem=a%10;
			sum=sum+(rem*rem*rem);
			a=a/10;
		}
		if(temp==sum) {
			System.out.println("No. is Armstrong");
		}else {
			System.out.println("Not armstrong");
		}
	}
}
