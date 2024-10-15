package com.groot;
import java.util.Scanner;

public class Method3_febonarcii {
public static void main(String str[]) {
	int res=feboo.getFebo();
	System.out.println(res);
}
}
class feboo{
	public static int getFebo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.=");
		int n=sc.nextInt();
		int n1=0,n2=1,n3;
		System.out.println(n1);
		System.out.println(n2);
		n3=n1+n2;
		for(int i=3;i<=n;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
		}	
		return 0;
	}
}