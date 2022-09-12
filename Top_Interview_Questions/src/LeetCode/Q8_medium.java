package LeetCode;

import java.math.BigInteger;

public class Q8_medium {
	/* Implement the myAtoi(string s) function, which converts a string
	 * to a 32-bit signed integer (similar to C/C++'s atoi function). */
	public static void main(String[] args) {

		System.out.println("1:" + Solution8.myAtoi("42")); // 42 
		System.out.println("2:" + Solution8.myAtoi("   -42")); // -42
		System.out.println("3:" + Solution8.myAtoi("4193 with words")); // 4193
		System.out.println("4:" + Solution8.myAtoi("   w 244 1 5")); // 0
		System.out.println("5:" + Solution8.myAtoi("+-12")); // 0
		System.out.println("6:" + Solution8.myAtoi("3.123")); // 3
		System.out.println("7:" + Solution8.myAtoi("   +0 123")); // 0 여야
		System.out.println("8:" + Solution8.myAtoi("20000000000000000000"));
	}

}

class Solution8{
	public static int myAtoi(String s) {
		int len = s.length();
		int index = 0;
		int result = 0;
		Boolean positive = true;

		if (len == 0) {
			return 0;
		}
		// skip leading white spaces
		while (s.charAt(index) == ' ') {
			++index;
		}
		
		if (index < len) {
			if (s.charAt(index) == '+') {
				index++;
				
			} else if (s.charAt(index) == '-') {
				positive = false;
				index++;
			}
		}
		
		while (index < len && Character.isDigit(s.charAt(index))) {
			int digit = s.charAt(index) - '0';
			
			if (result > (Integer.MAX_VALUE / 10) || (result == (Integer.MAX_VALUE / 10) && digit > 7)){
				if (positive) {
					return Integer.MAX_VALUE;
				}
				else {
					return Integer.MIN_VALUE;
				}
			}
			result = (result * 10) + digit;
			++index;
		}
		return positive ? result : - result;
		
//      String num_string = "";		
//		for (int i = 0; i < len; i++) {
//			if (s.charAt(i) == ' ') {
//				// whitespace
//				continue;
//			}
//			else {
//				if (s.charAt(i) == '+' || s.charAt(i) == '-') {
//					if (s.charAt(i) == '-') {
//						positive = false;
//					}
//					for (int j = i + 1; j < len; j++) {
//						if (!Character.isDigit(s.charAt(j))) {
//							break;
//						}
//						else {
//							num_string += s.charAt(j);
//						}
//					}
//					break;
//				} else if (Character.isDigit(s.charAt(i))){
//					for (int j = i; j < len; j++) {
//						if (!Character.isDigit(s.charAt(j))) {
//							break;
//						}
//						else {
//							num_string += s.charAt(j);
//						}
//					}
//					break;
//				}
//				else {
//					break;
//				}
//			}
//
//		}
//
//		if (num_string.equals("")) {
//			return 0;
//		}
//		else {
//			if (num_string.length() >= 19) {
//				BigInteger result = new BigInteger(num_string);
//				if (!positive) {
//					result = result.multiply(BigInteger.valueOf(-1));
//				}
//				if (result.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) == -1) {
//					result = BigInteger.valueOf(Integer.MIN_VALUE);
//				} else if (result.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) == 1) {
//					result = BigInteger.valueOf(Integer.MAX_VALUE);
//				}
//				return result.intValue();
//			}
//			else {
//				long num_result = Long.parseLong(num_string);
//				if (!positive) {
//					num_result = -num_result;
//				}
//				if (num_result < Integer.MIN_VALUE) {
//					num_result = Integer.MIN_VALUE;
//				} else if (num_result > Integer.MAX_VALUE) {
//					num_result = Integer.MAX_VALUE;
//				}
//				return (int) num_result;
//			}
//		}
	}
}
