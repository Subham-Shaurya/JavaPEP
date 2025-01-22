package dataType;

/*@author Subham Raj
 * 
 */
public class WrapperClass {

	public static void main(String[] args) {
		Integer a = new Integer("5");
		System.out.println(a);
		Byte byteObj = new Byte((byte) 5);
		System.out.println(byteObj);
		
		Short c = new Short("12320");
		System.out.println(c);
		
		Float f = new Float("23.9");
		System.out.println(f);
		
		Double d = new Double("1223.898899");
		System.out.println(d);
		
		Long x = new Long("222222222345");
		System.out.println(x);
		
		Boolean boolObj = new Boolean(true);
		System.out.println(boolObj);
	}
}
