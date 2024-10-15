package com.groot.Inheritance;

class Emp{
	int salary=1500;
}

class Eng extends Emp{
	int benefit = 1000;
	public int Total() {
		int sum= salary+benefit;
		return sum;
		
	}
}

public class TestDemo {
	public static void main(String[] args) {
		Eng eng = new Eng();
		System.out.println("Salary :" + eng.salary + "\n Benefits :"+eng.benefit);
		System.out.println("Final Salary :"+ eng.Total());
		
	}
}
