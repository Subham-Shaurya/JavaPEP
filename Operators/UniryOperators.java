package Operators;

public class UniryOperators {

	public static void main(String[] args) {
		int num1 = 290;
		System.out.println("Num1 = "+num1);
		num1 = num1+1;  //Line 9 and Line 10 are same here.
		num1++;
		System.out.println("Num1 = "+num1);
		System.out.println();
		
		//Type of unary operators
		int num2 = 100;
		int num3 = 120;
		System.out.println("Num2 = "+num2);
		//Pre-Increment 
		++num2;
		System.out.println("Num2 = "+num2);
		System.out.println();
		//Post-Increment
		System.out.println("Num3 = "+num3);
		num3++;
		System.out.println("Num3 = "+num3);
		System.out.println();
		//Examples
		int NumVar1 = 102;
		System.out.println(NumVar1++ + ++NumVar1);
		System.out.println(NumVar1++ + NumVar1++);
		System.out.println(++NumVar1 + ++NumVar1);
		System.out.println(++NumVar1 + NumVar1++);
		
		
		//Decrement
		int number = 35;
		System.out.println("Number1: "+number);
		
		//PreDecrement
		System.out.println("Decremented by 1: "+ --number); //decremented by 1
		
		number = 35;//Reset the value of number 
		//PostDecrement
		System.out.println(number--); //Here the printed value is 35, that means the value of number is will be decremented in next instance 
		System.out.println("Decremented by 1: "+number);
		
		System.out.println();
		
		//examples
		number = 18;
		System.out.println(number-- + --number);
		System.out.println(number-- + number--);
		System.out.println(--number + --number);
		System.out.println(--number - number--);
		
		//
	}

}
