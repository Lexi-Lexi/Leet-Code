package LeetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Book_03_1940 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		int n = Integer.parseInt(stringTokenizer.nextToken());
		int goal = Integer.parseInt(new StringTokenizer(bufferedReader.readLine()).nextToken());
		int[] nums = new int[n];
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		for (int i = 0; i < n; i++)
		{
			nums[i] = Integer.parseInt(stringTokenizer.nextToken());
		}
		Arrays.sort(nums);
		
		int count = 0;
		int i = 0;
		int j = n - 1;
		
		while (i < j)
		{
			if (nums[i] + nums[j] < goal)
			{
				i++;
			}
			else if (nums[i] + nums[j] > goal)
			{
				j--;
			}
			else
			{
				count++;
				i++;
				j--;
			}
		}
		System.out.println(count);
	}

}
