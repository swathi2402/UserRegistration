package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	private static boolean validateName(String name) {
		String regex = "([A-Z][a-zA-Z]{2,})";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(name);
		return matcher.matches();
		
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first name: ");
		String firstName = scanner.nextLine();
		if(validateName(firstName))
			System.out.println("Valid first name");
		else
			System.out.println("Invalid first name");
		
		System.out.println("Enter the last name: ");
		String LastName = scanner.nextLine();
		if(validateName(LastName))
			System.out.println("Valid last name");
		else
			System.out.println("Invalid last name");
		scanner.close();		
	}

}
