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
	
	private static boolean validateEmail(String email) {
		String regex = "([a-zA-Z][a-zA-Z0-9]*)(([+_.-][a-zA-Z0-9]+)?)(@[a-zA-Z0-9]+)([.])([a-z]{2,})(([.][a-z]{2})?)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
		
	}
	
	private static boolean validatePhoneNumber(String email) {
		String regex = "[1-9]{2}[\\s][1-9][0-9]{9}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
		
	}
	
	private static boolean validatePassword(String email) {
		String regex = "(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])(?=.*[!@#$%^&*\\-+=]).{8,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
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
		
		System.out.println("Enter the Email: ");
		String email = scanner.nextLine();
		if(validateEmail(email))
			System.out.println("Valid Email Id");
		else
			System.out.println("Invalid Email Id");
		
		System.out.println("Enter the Phone Number: ");
		String phoneNumber = scanner.nextLine();
		if(validatePhoneNumber(phoneNumber))
			System.out.println("Valid Phone Number");
		else
			System.out.println("Invalid Phone Number");
		
		System.out.println("Enter the password: ");
		String password = scanner.nextLine();
		if(validatePassword(password))
			System.out.println("Valid password");
		else
			System.out.println("Invalid password");
		
		String[] emailsArray = {"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com",
				"abc@gmail.com.co","abc+100@gmail.com","abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",".abc@abc.com","abc()*@gmail.com","abc@%*.com",
				"abc..2002@gmail.com","abc.@gmail.com","abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au"};
		System.out.println("Checking validity of email address");
		for(int index = 0; index < emailsArray.length; index++) {
			if(validateEmail(emailsArray[index]))
				System.out.println(emailsArray[index] + " - is valid");
			else
				System.out.println(emailsArray[index] + "  - is not valid");
		}
		scanner.close();		
	}

}
