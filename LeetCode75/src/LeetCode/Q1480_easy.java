package LeetCode;

public class Q1480_easy {

	/* Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]�nums[i]).
	Return the running sum of nums. */
	
	// test part. Only the most basic test is implemented here.
	public static void main(String[] args) {
		int[] nums = { 1, 7, 3, 6, 5, 6 };
		for (int i = 0; i < nums.length; i++) {
			System.out.println(Solution1480.runningSum(nums)[i]);
		}
	}

}

// implemented code
class Solution1480 {
	public static int[] runningSum(int[] nums) {
		int result[] = new int[nums.length];
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
			result[i] = sum;
		}
		return result;
	}
}