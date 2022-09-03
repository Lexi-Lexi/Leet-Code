package LeetCode;

public class Q5_medium {

	/* Given a string s, return the longest palindromic substring in s. */
	public static void main(String[] args) {
		System.out.println(Solution5.longestPalindrome("aaaaahth"));
		System.out.println(0/2);
	}
                                        
}

class Solution5 {
	
	public static String longestPalindrome(String s) { 
		int start = 0, end = 0;
		
		if (s.length() < 2) { // no need to check
			return s; 
		}
		
		for (int i = 0; i < s.length(); i++) {
			int l1 = calculate(s, i, i); // odd length
			int l2 = calculate(s, i, i + 1); // even length
			int length = Math.max(l1, l2);
			
			if (length > end - start) { // update
				start = i - (length - 1) / 2;
				end = i + length / 2;
			}
		}
		return s.substring(start, end + 1);
	}
	
	private static int calculate(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			// check if chars are same
			// extend the length of the string being checked, by reducing left and incrementing right
            left--;
            right++;
        }
        return right - left - 1;
	}

}
