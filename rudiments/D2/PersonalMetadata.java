// Patrick Duane
// The Rudiments of Java
// Day 2: Personal Metatdata - Main
// This program stores data about me in variables, runs a
//      few calculations, and prints the information to the console

import java.io.*;

public class PersonalMetadata {
	public static void main(String[] args){
		System.out.println("Patrick Duane");
		System.out.println("The Rudiments of Java");
		System.out.println("Day 2: Personal Metadata");
		System.out.println("This program stores data about me in variables, runs a\nfew calculations, and prints the information to the console");
		System.out.println();
		
		String firstName = "Patrick";
		char lastInitial = 'D';
		int currentYear = 2017, age = 18;
		int birthYear;
		boolean canDrive = true;
		double heightM = 1.62, heightF;
		
		birthYear = currentYear - age;
		heightF = heightM * 3.28;
		
		System.out.println(firstName + " " + lastInitial + ".");
		System.out.println("Birth Year: " + birthYear);
		System.out.println("Year In Century: " + birthYear % 100);
		System.out.println("Height: " + heightF + "ft");
		System.out.println("Can Drive: " + canDrive);
		
	}
}