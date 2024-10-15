package com.groot;
import java.util.Scanner;

public class Switch_case {
  public static void main(String str[]) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the Number:");
	  int a=sc.nextInt();
	  switch(a) {
	  case 1:
		  System.out.println("Monday");
		  break;
	  case 2:
		  System.out.println("Tuesday");
		  break;
	  case 3:
		  System.out.println("Wednesday");
		  break;
	  case 4:
		  System.out.println("Thrusday");
		  break;
	  case 5:
		  System.out.println("Friday");
		  break;
	  case 6:
		  System.out.println("Saturday");
		  break;
	  case 7:
		  System.out.println("Sunday");
		  break;
		  default:
			  System.out.println("Entered data does not found ");
	  }
	  
  }
}
