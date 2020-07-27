package _01_Bit_Shifting;

import _00_Binary_Conversion.DecimalToBinary;

public class BitShifter {
	public static void main(String[] args) {
		// 1. Jot down the value of num in binary.
		
		int num = 4;
		int numShifted = num << 1;
		
		// 2. Print the value of numShifted, and convert that value to binary.
		System.out.println(numShifted);
	
		System.out.println(DecimalToBinary.convertDecimalToBinary(numShifted));
		
		// 3. Compare the two binary values. Can you figure out what the << operator is for?
		//Shifts the number one binary place. 4 became 8.
		
		// 4. Try shifting num 3 places.
		int x = 16;
		int xShifted = x >>> 1;
		System.out.println(xShifted);
		// FYI: Binary values can be shifted to the right as well using the >> operator.	
	}
}
