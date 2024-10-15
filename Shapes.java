package com.groot;
import java.util.Scanner;

public class Shapes {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Length of Square or cube :");
	int a=sc.nextInt();
	System.out.println("Area of square:"+(a*a));
	System.out.println("Perimeter of square:"+(4*a));
	System.out.println("Perimeter of cube"+(12*a));
	System.out.println("TSA of cube:"+(6*a*a));
	System.out.println("volume of cube:"+(a*a*a));
	System.out.println("\n");
	System.out.println("Enter the length of Rectangle or cuboid:");
	int b=sc.nextInt();
	System.out.println("Enter the breadth of rectangle or cuboid:");
	int c=sc.nextInt();
	System.out.println("Enter height of cuboid:");
	int d=sc.nextInt();
	System.out.println("Area of rectangle:"+(b*c));
	System.out.println("Perimeter of rectangle:"+(2*(b+c)));
	System.out.println("Perimeter of cuboid:"+(4*(b+c+d)));
	System.out.println("TSA of cuboid:"+(2*((b*c)+(c*d)+(b*d))));
	System.out.println("Volume of cuboid:"+(b*c*d));
	System.out.println("\n");
	System.out.println("Enter the radius:");
	int r=sc.nextInt();
	System.out.println("Enter the slant height:");
	int l=sc.nextInt();
	System.out.println("TSA of cone"+(3.14*r*(r+l)));
	System.out.println("circumference of circle:"+(2*3.14*r));
	System.out.println("area of circle"+(3.14*r*r));
	System.out.println("TSA of sphere:"+(4*3.14*r*r));
	System.out.println("Volume of sphere"+(4/3*3.14*r*r*r));
	System.out.println("TSA of cylinder"+(2*3.14*r*(l+r)));
	System.out.println("Volume of cylinder"+(3.14*r*r*l));
  }
}
