package Test;

import java.util.Scanner;

public class ConvertStringtoUpperCaseAndLowerCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		String convertuppercase = str.toUpperCase();
		String convertlowercase = str.toLowerCase();
		System.out.println("After converting to uppercase :" +convertuppercase);
		System.out.println("After converting to Lowercase :" +convertlowercase);

	}

}
