package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	private static boolean userRegistration(String firstName) {
		String regex = "([A-Z][a-zA-Z]{2,})";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
		
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first name: ");
		String firstName = scanner.nextLine();
		if(userRegistration(firstName))
			System.out.println("Valid name");
		else
			System.out.println("Invalid name");
		scanner.close();		
	}

}
