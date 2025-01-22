package dataType;

public class ObjectClassOverloading {
	public void addition(double a, double b) {
		System.out.println("Double called");
	}
	public void addition(Object a, Object b) {
		System.out.println("Object Called");
	}
	public static void main(String[] args) {
		ObjectClassOverloading obj = new ObjectClassOverloading();
		obj.addition(10,20); //more precedence because the provided arguments are more specific to double type
		
		
	}
}
