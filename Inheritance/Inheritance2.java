package com.groot.Inheritance;
public class Inheritance2 {
public static void main(String[] args) {
	Student7 st=new Student7(101,"Ghanist","Mansaover",3000.0f);
	st.printDetails();
}
}
class Person{
	String name;
	int UID;
	String address;
	public Person(int UID,String name,String address) {
		this.UID=UID;
		this.name=name;
		this.address=address;
	}

}
class Student7 extends Person{
	float fee;
	public Student7(int UID,String name,String address,float fee ) {
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