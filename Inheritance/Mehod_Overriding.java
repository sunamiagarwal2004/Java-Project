package com.groot.Inheritance;

public class Mehod_Overriding {
   public static void main(String[] args) {
	Dog3 d=new Dog3();
	d.eat();
}
}
class Animal3{
	public void eat() {
		System.out.println("Aniaml is eating");
	}
}
class Dog3 extends Animal3{
	public void eat() {
		System.out.println("Dog is barking");
	}
}