package LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q8_testcases {

	Solution8 obj = new Solution8();

	@Test
	public void test() {
		assertEquals(42, obj.myAtoi("42"));
		assertEquals(-42, obj.myAtoi("   -42"));
		assertEquals(4193, obj.myAtoi("4193 with words"));
		assertEquals(0, obj.myAtoi("   w 244 1 5"));
		assertEquals(0, obj.myAtoi("+-12"));
		assertEquals(3, obj.myAtoi("3.123"));
		assertEquals(0, obj.myAtoi("   +0 123"));
		assertEquals(Integer.MAX_VALUE, obj.myAtoi("20000000000000000000"));
	}

}
