package dataType;

public class MixOfPrecedence {
	public void addition(int a, double b, double c) {
		System.out.println("Inside the additon1");
	}
	public void addition(double a, int b) {
		System.out.println("Inside addition2");
	}
	public static void main(String[] args) {
		MixOfPrecedence obj = new MixOfPrecedence();
		obj.addition(10, 20);
	}
}
