package LeetCode;

import java.util.TreeMap;

public class Q4_Hard {

	public static void main(String[] args) {
		/* Given two sorted arrays nums1 and nums2 of size m and n respectively,
		 * return the median of the two sorted arrays.
		 * The overall run time complexity should be O(log (m+n)).
		 * 0 <= m <= 1000, 0 <= n <= 1000, 1 <= m + n <= 2000, -106 <= nums1[i], nums2[i] <= 106 */
		int[] l1 = new int[] {50};
		int[] l2 = new int[] {5, 8, 10, 20};
		System.out.println(Solution4.findMedianSortedArrays(l1, l2));
		
		
		

	}

}

class Solution4{
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length, n = nums2.length;
	    int i = 0, j = 0; // index for nums1 and nums 2
	    int med1 = 0; // save value for even number
	    int med2 = 0; // main 
	    for (int k = 0; k <= (m + n) / 2; k++) {
	        med1 = med2;
	        if (i == m) { // one array is fully traversed.
	            med2 = nums2[j];
	            j++;
	        } else if (j == n) { 
	            med2 = nums1[i];
	            i++;
	        } else if (nums1[i] < nums2[j] ) {
	            med2 = nums1[i];
	            i++;
	        }  else {
	            med2 = nums2[j];
	            j++;
	        }
	    }

	    // the median is the average of two numbers
	    if ((m+n)%2 == 0) {
	        return (double)(med1+med2)/2;
	    }

	    return med2;
	}
}
