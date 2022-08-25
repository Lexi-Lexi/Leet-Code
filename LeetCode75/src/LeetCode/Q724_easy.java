package LeetCode;

public class Q724_easy {
	
	/* Given an array of integers nums, calculate the pivot index of this array.
	The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
	If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
	Return the leftmost pivot index. If no such index exists, return -1. */
	
	
	// test part. Only the most basic test is implemented here.
	public static void main(String[] args) {
		int[] nums = { 1,7,3,6,5,6 };
		System.out.println(Solution724.pivotIndex(nums));

	}
}


//implemented code
class Solution724 {
    public static int pivotIndex(int[] nums) {
        int left_sum = 0;
		int right_sum = 0;
		for (int i = 1; i < nums.length; i++) {
			right_sum += nums[i];
		}
		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {
				if (left_sum == right_sum) {
					return 0;
				}
			} else {
				left_sum += nums[i - 1];
				right_sum -= nums[i];
				if (left_sum == right_sum) {
					return i;
				}
			}		
		}	
		return -1;
    }
}