package com.groot;
import java.util.Scanner;
public class ABCs {
	public static void main(String args[]) {
		new Student1();
		Student1 st = new Student1();
        System.out.println("Before initialization");
		System.out.println(st.id);
		System.out.println(st.name);
		System.out.println(st.fee);
		st.id = 101;
		st.name = "jai";
		st.fee = 4000;
		System.out.println("After initialization");
		System.out.println(st.id);
		System.out.println(st.name);
		System.out.println(st.fee);
	}
}

class Student1 {
	int id;
	String name;
	float fee;
}
