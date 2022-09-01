package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Q3_medium {
	/* Given a string s, find the length of the longest substring without repeating characters.
	 * s consists of English letters, digits, symbols and spaces. */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution3.lengthOfLongestSubstring("abcabcbb")); // 3
		System.out.println(Solution3.lengthOfLongestSubstring("bbbbb")); // 1
		System.out.println(Solution3.lengthOfLongestSubstring("pwwkew")); // 3
		
		
	}

}


class Solution3{
	public static int lengthOfLongestSubstring(String s) {
		int i = 0, j = 0, max = 0; // i is for marking where to start deleting. 
	    Set<Character> set = new HashSet<>();
	    
	    while (j < s.length()) {
	        if (!set.contains(s.charAt(j))) {
	            set.add(s.charAt(j++));
	            max = Math.max(max, set.size());
	        } else {
	            set.remove(s.charAt(i++));
	        }
	    }
	    
	    return max;
	 
    }
}