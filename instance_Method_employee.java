package com.groot;
import java.util.Scanner;

public class instance_Method_employee {
public static void main(String str[]) {
	Scanner sc=new Scanner(System.in);
	Employee ep=new Employee();
	System.out.println("Enter the ID=");
	int I=sc.nextInt();
	System.out.println("Enter thE name=");
	String N=sc.next();
	System.out.println("Enter the salary=");
	float F=sc.nextFloat();
	ep.insertData(I,N,F);
	ep.printValues();
}
}
class Employee{
	int id; String name; float salary;
	public void insertData(int i,String n,float s) {
		id=i;
		name=n;
		salary=s;
	}
	public void printValues() {
		System.out.println("ID is="+id);
		System.out.println("Name is="+name);
		System.out.println("Salary is="+salary);
	}
}
