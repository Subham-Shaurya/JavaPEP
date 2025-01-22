package dataType;

public class MethodPrecedenceLongDouble {
	public void addition(double a, double b) {
		System.out.println("Inside the double addition");
	}
	public void addition(long a, long b) {
		System.out.println("Inside the long additon");
	}
	public static void main(String[] args) {
		MethodPrecedenceLongDouble obj = new MethodPrecedenceLongDouble();
		obj.addition(10,20);
	}
}
