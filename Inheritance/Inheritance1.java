package com.groot.Inheritance;

public class Inheritance1 {
public static void main(String[] args) {
	Dog d=new Dog();
	System.out.println(d.color);
	System.out.println(d.breed);
	d.eat();
	d.bark();
}
}
class Animal{
	String color="White";
			public void eat() {
		System.out.println("Animal is eating");
	}
	
		}
class Dog extends Animal{
	String breed="Puff";
	public void bark() {
		System.out.println("Dog is barking");
	}
}