package Test;
import java.util.Scanner;
public class PalindromeExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		
		int temp=0;
		int sum=0;
		
		for(int i=num;i!=0;i/=10) {
			int rem = i%10;
			sum= (sum*10)+rem;
			temp=sum;	
		}
		
		if (temp == num) {
			System.out.println("Its a Palindrome Number");

		} else {
			System.out.println("Its not a Palindrome Number");
		}
	}
}