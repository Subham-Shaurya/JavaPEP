package dataType;

public class AutoBoxing {

	public static void main(String[] args) {
		int a = 10;
		
		Integer intObj = new Integer(a);
		
		System.out.println(intObj);
		
		Integer intObj2 = a; //AutoBoxing
		System.out.println(intObj2);
	}

}
