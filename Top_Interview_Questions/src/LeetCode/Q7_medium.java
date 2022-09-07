package LeetCode;

import java.util.Stack;

public class Q6_medium {
	/* Given a signed 32-bit integer x, return x with its digits reversed.
	 * If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
	 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned). 
	 */

	public static void main(String[] args) {
		System.out.println(Solution6.reverse(-12340));
	}

}

class Solution6 {
	public static int reverse(int x) {
		
		// I first tried using stack, but it exceeded time limit.
		
		long reverse = 0;
		while (x != 0) {
			reverse = reverse * 10 + x % 10;
			x = x / 10;
		}
		if (reverse >= Integer.MIN_VALUE && reverse <= Integer.MAX_VALUE) {
			return (int) reverse;
		}
		else {
			return 0;
		}
	}
}
