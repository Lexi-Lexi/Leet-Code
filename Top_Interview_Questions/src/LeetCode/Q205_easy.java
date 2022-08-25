package LeetCode;

public class Q205_easy {

	/* Given two strings s and t, determine if they are isomorphic.
	Two strings s and t are isomorphic if the characters in s can be replaced to get t.
	All occurrences of a character must be replaced with another character
	while preserving the order of characters. No two characters may map to the same character,
	but a character may map to itself.
	Input: s = "egg", t = "add"
	Output: true
	*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution205.isIsomorphic("paper", "title"));
		System.out.println(Solution205.isIsomorphic("foo", "bar"));
		

	}

}

class Solution205 {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
        	return false;
        } else {
        	
        	return true;
        }
    	
    }
}
