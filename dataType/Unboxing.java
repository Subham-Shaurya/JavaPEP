package dataType;

public class Unboxing {

	public static void main(String[] args) {
		Integer intObj = new Integer(10);
		
		int a = intObj.intValue();
		System.out.println("Value of a: "+a);
		
		//Unboxing
		int b = intObj;
		System.out.println("Unboxed data: "+b);
		
		
		Boolean boolObj = new Boolean(false);
		
		boolean flag = boolObj.booleanValue();
		System.out.println(flag);
		
		//Unboxing
		boolean flagUnbox = boolObj;
		System.out.println(flagUnbox);
		
		
		double doublePrimitive = 20.50;
//		Double doubleObj = new Double(46.56);
//		System.out.println("Without autoboxing "+doubleObj);
		Double doubleObj = doublePrimitive; //Autoboxing
		
		System.out.println(doubleObj);
		
		//Unboxing
		Double doubleObj2 = new Double(46.30);
		
		System.out.println();

	}

}
