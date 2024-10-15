package com.groot;
import java.util.Scanner;

public class Method_Palindrome {
public static void main(String str[]) {
	pali mp=new pali();
	mp.getPali();
}
}
class pali{
	public void getPali() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int rev=0,rem;
		int temp;
		temp=num;
		while(num>0) {
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		if(temp==rev) {
			System.out.println("Number is Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}
}
