package com.groot.Inheritance;

public class Inheritance4 {
   public static void main(String[] args) {
	BabyDog bd=new BabyDog();
	System.out.println(bd.color);
	System.out.println(bd.breed);
	System.out.println(bd.coat);
	bd.eat();
	bd.eat();
	bd.crying();
}
}
class Animal2{
	String color="White";
	public void eat() {
		System.out.println("Animal is eating");
	}
}
class Dog2 extends Animal2 {
	String breed="Puff";
	public void bark() {
		System.out.println("Animal is barking");
	}
}
class BabyDog extends Dog2{
	String coat="Double";
	public void crying() {
		System.out.println("Baby dog is crying");
	}
}