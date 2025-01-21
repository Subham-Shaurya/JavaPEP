package Operators;

public class TertiaryOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		int result=(a>b)?10:20;
		System.out.println("Result: "+result);
		
		int c = 30;
		int MultiConditionResult = ((a>b)?(a>c)?a:c:(b>c)?b:c);
		System.out.println("MultiConditionResult: "+ MultiConditionResult);
		

	}

}
