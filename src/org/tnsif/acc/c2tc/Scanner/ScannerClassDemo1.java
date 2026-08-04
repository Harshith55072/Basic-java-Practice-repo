package org.tnsif.acc.c2tc.scannerclass_bufferreader;
//Import the Scanner class
//Create a scanner object
//prompt the user for input
//Read input using scanner method
//Validate
//Close the scanner

import java.util.Scanner;
public class ScannerClassDemo1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		 String name =  scan.nextLine();
		 System.out.println("Enter your age");
		    int age = scan.nextInt();
		 System.out.println("Name of the User: "+name);
		 System.out.println("Age of the User :"+age);
		 scan.close();

	}

}