package Operators;

public class ShiftOperator {
	public static void main(String[] args) {
		int a =10;
		System.out.println(a>>1); //(10 = 0000 1010) in binary. So, 0000 1010 >> 1 → 0000 0101 (binary for 5)
		System.out.println(a<<1); //(10 = 0000 1010) in binary. So, 0000 1010 << 1 → 0001 0100 (binary for 20)
		
		a=10;
		System.out.println(a>>2); //(10 = 0000 1010) in binary. So, 0000 1010 >> 2 → 0000 0010 (binary for 2)
		System.out.println(a<<2); //(10 = 0000 1010) in binary. So, 0000 1010 << 2 → 0010 1000 (binary for 40)
	}
}
