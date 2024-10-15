package com.groot;
import java.util.Scanner;

public class instance2_Method {
public static void main(String str[]) {
	Scanner sc=new Scanner(System.in);
	Student5 st=new Student5();
	System.out.println("Enter the id=");
	int i=sc.nextInt();
	System.out.println("Enter thr name=");
	String s=sc.next();
	System.out.println("Enter the fee=");
	float f=sc.nextFloat();
	st.insertData(i,s,f);
	st.printValues();
}
} 
class Student5{
	int id; String name; float fee;
	public void insertData(int id,String name, float fee) {
		this.id=id;
		this.name=name;
		this.fee=fee;
	}
	public void printValues() {
		System.out.println("Enter the id="+id);
		System.out.println("Enter the name="+name);
		System.out.println("Enter the fee"+fee);
	}
}
