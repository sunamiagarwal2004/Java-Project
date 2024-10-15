package com.groot.Encapsulation;

public class Encapsulation1 {
       public static void main(String[] args) {
		Student8 st=new Student8();
		st.setId(101);
		st.setName("Ghanist");
		st.setFee(4000f);
		System.out.println(st.getId());
		System.out.println(st.getName());
		System.out.println(st.getFee());
	}
}
class Student8{
	private int id;
	private String name;
	private float fee;
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setFee(float fee) {
		this.fee=fee;
	}
	public float getFee() {
		return fee;
	}
}