package com.groot;
import java.util.Scanner;

public class Method3_primenum {
public static void main(String str[]) {
	int res=pri.getprim();
	System.out.println(res);
}
}
class pri{
	public static int getprim() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number=");
		int n=sc.nextInt();
		int flag=0;
		if(n==0||n==1) {
			System.out.println("not prime");
		}else {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println("Not prime");
				flag=1;
				break;
			}
		}
		}
		if(flag==0) {
			System.out.println("PRIME");
		}
		return getprim();
}
}

