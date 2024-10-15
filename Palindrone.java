package com.groot;
import java.util.Scanner;

public class Palindrone {
public static void main(String str[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number :");
	int a=sc.nextInt();
	int rev=0,rem,temp;
	temp=a;
	while(a>0) {
		rem=a%10;
		rev=(rev*10)+rem;
		a=a/10;
	}if(temp==rev) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Number is not palindrome");
		}
	}

}
