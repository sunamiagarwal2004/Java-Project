package com.groot.Encapsulation;

import java.util.Objects;

public class Encapsulation2 {
     public static void main(String[] args) {
		Student9 st=new Student9();
		st.setId(101);
		st.setName("Ghanist");
		st.setFee(4000f);
		System.out.println(st.hashCode());
		System.out.println(Integer.toHexString(st.hashCode()));
		System.out.println(Objects.hash(st));
		System.out.println(st);
	}
}
class Student9{
	private int id;
	private String name;
	private float fee;
public void setId(int id) {
	this.id=id;
}
public void setName(String name) {
	this.name=name;
}
public void setFee(float fee) {
	this.fee=fee;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "This is Student ID="+id+",Name="+name+",Fee="+fee;
}
}