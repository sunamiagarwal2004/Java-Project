package com.groot;
import java.util.Scanner;

public class Armstrong_number {
public static void main(String str[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number:");
	int num=sc.nextInt();
	int rem,sum=0,temp;
	temp=num;
	while(num>0) {
		rem=num%10;
		sum=sum+(rem*rem*rem);
		num=num/10;
	}
    if(temp==sum) {
    	System.out.println("number is armstrong");
    }else {
    	System.out.println("Not armstrong");
    }
}
}
