package Test;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,input;
		input=8;
		for (i=0; i<input; i++) {
			for(j=input-i; j>1; j--) {
				System.out.print(" ");
			}
			for(j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
