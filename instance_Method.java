package com.groot;
import java.util.Scanner;

public class instance_Method {
public static void main(String str[]) {
	Student4 st=new Student4();
	st.insertData(101,"jai",3000);
	st.printValues();
}
}
class Student4{
	int id; String name; float fee;
	public void insertData(int i,String n,float f) {
		id=i;
		name=n;
		fee=f;
	}
	public void printValues() {
		System.out.println("ID is="+id);
		System.out.println("Name is="+name);
		System.out.println("Fee is="+fee);
	}
}
