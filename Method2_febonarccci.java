package com.groot;
import java.util.Scanner;

public class Method2_febonarccci {
public static void main(String str[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number=");
	int a=sc.nextInt();
	febona.getFeb(a);
}
}
class febona{
	public static void getFeb(int n) {
		int n1=0,n2=1,n3;
		n3=n1+n2;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=3;i<=n;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
		}
	}
}
