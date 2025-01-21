package Operators;

public class AssignmentOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println(a+=5); //a = a+5
		System.out.println(a-=5); //a = a-5
		System.out.println(a*=5); //a = a*5
		System.out.println(a/=5); //a = a/5
		System.out.println(a%=5); //a = a%5
		System.out.println();
		
		System.out.println(a+=b); //a = a+b
		System.out.println(b+=a); //b = b+a
		System.out.println(b-=a); //b = b-a
		System.out.println(a-=b); //a = a-b
		System.out.println();
		
		System.out.println(a+=a++); //0
//		System.out.println(b);
		System.out.println(a+=++b); //22 
		System.out.println(a-=++b); //0
		System.out.println(a-=b--); //-22
		System.out.println(a-=++b-a--); //
	}

}
