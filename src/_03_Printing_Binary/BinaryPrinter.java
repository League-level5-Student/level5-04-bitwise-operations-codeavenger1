package _03_Printing_Binary;

public class BinaryPrinter {
	// Complete the methods below so they print the passed in parameter in binary.
	// Use bit shifting and bit masking to print the binary numbers.
	// Do not use the Integer.toBinaryString method!
	// Don't be afraid to use the methods that are already complete to finish the
	// others.
	// Create a main method to test your methods.

	public static void main(String[] args) {
		BinaryPrinter print = new BinaryPrinter();
		print.printByteBinary(00000001);
	}

	public void printByteBinary(byte b) {
		//8
		String byteStr = "";
		System.out.println(convert(4));
	}

	public void printShortBinary(short s) {
		// 16
	}

	public void printIntBinary(int i) {
		// 32
	}

	public void printLongBinary(long l) {
		// 64
	}
	
	public String convert(int n) {
		String biStr = "";
		
		do {
			int quotient = n >>> 1;
			
			if (n % 2 != 0) {
				biStr += '1';
			} else {
				biStr += '0';
			}
			
			n = quotient;
		} while (n != 0);
		return biStr;
	}
}
