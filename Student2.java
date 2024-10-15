package com.groot;
import java.util.Scanner;

public class Student2 {
public static void main(String str[]) {
	Student st=new Student();
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter the id");
	st.id=sc.nextInt();
	System.out.println("Enter the name:");
	st.name=sc.next();
	System.out.println("Enter the fee:");
	st.fee=sc.nextFloat();
	System.out.println(st.id);
	System.out.println(st.name);
	System.out.println(st.fee);
}
}

