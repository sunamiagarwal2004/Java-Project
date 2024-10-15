package com.groot.Inheritance;
import java.util.Scanner;

public class Inheritance3_UI {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the UID=");
		int u=sc.nextInt();
		System.out.println("Enter the name=");
		String n=sc.next();
		System.out.println("Enter the address=");
		String s=sc.next();
		System.out.println("Enter the fee=");
		float f=sc.nextFloat();
		Student8 st=new Student8(u,n,s,f);
		st.printDetails();
	}
	}
	class Person2{
		String name;
		int UID;
		String address;
		public Person2(int UID,String name,String address) {
			this.UID=UID;
			this.name=name;
			this.address=address;
		}

	}
	class Student8 extends Person2{
		float fee;
		public Student8(int UID,String name,String address,float fee ) {
		super(UID,name,address);
		this.fee=fee;
	}
		public void printDetails() {
				System.out.println(UID);
				System.out.println(name);
				System.out.println(address);
			    System.out.println(fee);
		}
	}