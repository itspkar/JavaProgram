package Test;

class ov1{
	public void m1() {
		System.out.println("I am Aman");
	}
}

class ov2 extends ov1{
	public void m1() {
		System.out.println("I am overriden and now I am Aman Kumar");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
	
		ov1 o = new ov1();
		o.m1();
		ov2 o2 = new ov2();
		o2.m1();
		ov1 o3 = new ov2();
		o3.m1();//now implementation changed as parent class object can hold child class reference
		//ov2 o4 = new ov1(); Not possible as child class reference cannot store parent class object but vice versa is possible

	}

}
