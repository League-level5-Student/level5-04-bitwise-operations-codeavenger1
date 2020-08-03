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
		print.printByteBinary((byte) 8);
		print.printShortBinary((short) 17);	
		print.printIntBinary((int) 30);
		print.printLongBinary((long) 64);
	}

	public void printByteBinary(byte b) {
		//8
		String byteStr = "";
		String output = "";
		do {
			int quotient = b >>> 1;
			
			if (b % 2 != 0) {
				byteStr += '1';
			} else {
				byteStr += '0';
			}
			
			b = (byte) quotient;
			
			
			
		} while (b != 0);
		for (int i = byteStr.length() -1; i >= 0; i--) {
				output = output + byteStr.charAt(i);
			}
		System.out.println(output);
	}
		
	

	public void printShortBinary(short s) {
		// 16
		String shortStr = "";
		String output = "";
		do {
			int quotient = s >>> 1;
			
			if (s % 2 != 0) {
				shortStr += '1';
			} else {
				shortStr += '0';
			}
			
			s = (short) quotient;
		} while (s != 0);
		for (int i = shortStr.length() -1; i >= 0; i--) {
			output = output + shortStr.charAt(i);
		}
	System.out.println(output);
	}
	

	public void printIntBinary(int i) {
		// 32
		String intStr = "";
		String output = "";
		do {
			int quotient = i >>> 1;
			
			if (i % 2 != 0) {
				intStr += '1';
			} else {
				intStr += '0';
			}
			
			i = (int) quotient;
		} while (i != 0);
		for (int j = intStr.length() -1; j >= 0; j--) {
			output = output + intStr.charAt(j);
		}
	System.out.println(output);
	}

	public void printLongBinary(long l) {
		// 64
		String longStr = "";
		String output = "";
		do {
			long quotient = l >>> 1;
			
			if (l % 2 != 0) {
				longStr += '1';
			} else {
				longStr += '0';
			}
			
			l = quotient;
		} while (l != 0);
		for (int i = longStr.length() -1; i >= 0; i--) {
			output = output + longStr.charAt(i);
		}
	System.out.println(output);
	
	}
	}