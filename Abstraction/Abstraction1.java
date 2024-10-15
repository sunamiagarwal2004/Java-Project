package com.groot.Abstraction;

public class Abstraction1 {
	public static void main(String[] args) {
		A a=myFactory.getObj();
		a.say();
		B b=myFactory.getObj2();
		b.say2();
	}
}
class A{
	public void say() {
	System.out.println("Hello from class A");
		}
	}
class B{
	public void say2() {
		System.out.println("Hello from B");
	}
}
class myFactory{
	public static A getObj() {
		return new A();
	}
	public static B getObj2() {
		return new B();
	}
}