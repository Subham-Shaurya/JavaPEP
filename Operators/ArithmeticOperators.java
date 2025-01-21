package Operators;

/*
 * @author Subham Raj
 * @Description  It's a java file for arithmetic operators
 */
public class ArithmeticOperators {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int sum = num1+num2;
		
		//Addition
		System.out.println("Addition: "+sum);
		//Subtraction
		System.out.println("Substraction: "+ (num2-num1));
		//Multplication
		System.out.println("Multiplication: "+ num1*num2);
		//Division
		System.out.println("Division: "+ num2/num1);
		//Modulo
		System.out.println("Modulo: "+ num1%num2);
	}

}
