package com.groot;
import java.util.Scanner;

public class Method_prime {
public static void main(String str[]) {
	prim mp=new prim();
	mp.getPrim();
}
}
class prim{
	public void getPrim() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int flag=0;
		if(num==0||num==1) {
			System.out.println("Not prime");
		}else{
			for(int i=2;i<num/2;i++) {
				if(num%i==0) {
					System.out.println("Not prime");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println("PRIME");
			}
		}
	}
}
