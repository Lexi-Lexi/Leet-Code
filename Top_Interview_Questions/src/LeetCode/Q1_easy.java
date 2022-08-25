package LeetCode;

import java.util.HashMap;

public class Q1_easy {

	/*
	 * Given an array of integers nums and an integer target, return indices of the
	 * two numbers such that they add up to target. You may assume that each input
	 * would have exactly one solution, and you may not use the same element twice.
	 * You can return the answer in any order.
	 */

	// test part. Only the most basic test is implemented here.
	public static void main(String[] args) {
		int[] nums = { 2, 5, 5, 11 };
		int target = 10;
		int[] indices = Solution1.twoSum(nums, target);
		System.out.printf("[%d, %d]", indices[0], indices[1]);
	}

}

// implemented code
class Solution1 {
	public static int[] twoSum(int[] nums, int target) {
		/* soltuion 1: slow, easy
		int[] indices = new int[2];
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 1; j < nums.length; j++) {
				if (i != j && nums[i] + nums[j] == target) {
					indices[0] = i;
					indices[1] = j;
				}
			}
		}
		return indices; */
		
		/* soltuion 2: fast, using hash map */
		int[] result = new int[2];
    	HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        
		for (int i = 0; i < nums.length; i++) {

			if (!hash.containsKey(nums[i])) {
				hash.put(target - nums[i], i);
			} else {
				result[0] = i;
				result[1] = hash.get(nums[i]);
				break;
			}
		}
		
		return result;
	}
}