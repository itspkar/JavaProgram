package Test;

import java.util.Scanner;

public class ReversingNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to reverse");
		int num = sc.nextInt();
		
		int rev = 0;
		for(int i = num;i!=0;i/=10) {
			int rem = i%10;
			rev =(rev*10)+rem;
		}
		System.out.println(rev);
	
	}
}
