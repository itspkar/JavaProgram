package Test;

public class MethodOverLoading {
	
	public static int m1() {
		System.out.println("Hii I am Pratyusha");
		return 0;
		
	}
	
	public static int m1(int num) {
		System.out.println("Hii I am overloaded");
		return 0;
		
	}

	public static void main(String[] args) {
		
		//m1();
		m1(5);

	}

}
