package com.groot;
import java.lang.Math;

public class Randon_number {
public static void main(String str[]) {
	int min=1;
	int max=1000;
	System.out.println("Random number between"+min+"to"+max+":");
	double b=(Math.random()*(max-min+1)+min);
//	0<Math.random()<1; ye formula integer value lene k liye use kiya hai
	System.out.println(b);
	int a=(int)(Math.random()*(max-min+ 1)+min);
	System.out.println(a);
}
}
