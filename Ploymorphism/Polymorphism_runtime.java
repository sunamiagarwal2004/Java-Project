package com.groot.Ploymorphism;

public class Polymorphism_runtime {
	public static void main(String[] args) {
		Animal4 a=new Dog4();//UPCASTING
		a.eat();
		System.out.println(a.color);
		Dog4 d=(Dog4)a;//Downcasting
		System.out.println(d.breed);
		d.bark();
	}
}
class Animal4{
	String color="White";
	public void eat() {
		System.out.println("Animal is eating");
	}
}
class Dog4 extends Animal4{
	String breed="GS";
	public void bark() {
		System.out.println("Dog is barking");
	}
	public void eat() {            //Method Overriding
		System.out.println("Dog is eating bread");
	}
}