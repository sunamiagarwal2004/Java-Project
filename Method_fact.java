package com.groot;
import java.util.Scanner;
public class Method_fact{
     public static void main(String str[]) {
    	 facto mf=new facto();
    	 mf.getFact();
     }
}
class facto {
public void getFact() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no. :");
	int n=sc.nextInt();
	int fact=1;
	for(int i=1;i<=n;i++) {
		fact=fact*i;
	}System.out.println("Factorial="+fact);
}
}
