package com.groot.Abstraction;

public class Abstraction2 {
	public static void main(String[] args) {
		RBIbank rbi=SBIfactory.getobj();
		rbi.getRateOfInterest();
	}
}
abstract class RBIbank{
	public abstract void getRateOfInterest();
}
class SBIbank extends RBIbank{
	public void getRateOfInterest() {
		System.out.println("9.8");
	}
}
class SBIfactory{
	public static RBIbank getobj() {
		return new SBIbank();
	}
}