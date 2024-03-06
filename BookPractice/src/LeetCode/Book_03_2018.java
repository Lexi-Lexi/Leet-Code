package LeetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Book_03_2018 {
	/* The cows in farmer John's herd are numbered and branded with consecutive integers from 1 to N (1 <= N <= 10,000,000).
	When the cows come to the barn for milking, they always come in sequential order from 1 to N.
	Farmer John, who majored in mathematics in college and loves numbers, often looks for patterns. 
	He has noticed that when he has exactly 15 cows in his herd, there are precisely four ways that the numbers on any set of one or more consecutive cows can add up to 15
	(the same as the total number of cows). They are: 15, 7+8, 4+5+6, and 1+2+3+4+5.
	When the number of cows in the herd is 10, the number of ways he can sum consecutive cows and get 10 drops to 2: namely 1+2+3+4 and 10.
	Write a program that will compute the number of ways farmer John can sum the numbers on consecutive cows to equal N.
	Do not use precomputation to solve this problem. */

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		int n = Integer.parseInt(stringTokenizer.nextToken());
		
		int start = 1;
		int end = 1;
		int sum = 1;
		int counter = 1; // n itself
		
		while (end != n)
		{
			if (sum == n)
			{
				counter++;
				end++;
				sum = sum + end;
			}
			else if (sum > n)
			{
				sum = sum - start;
				start++;
			}
			else
			{
				end++;
				sum = sum + end;
			}
		}
		
		System.out.println(counter);
	}

}
