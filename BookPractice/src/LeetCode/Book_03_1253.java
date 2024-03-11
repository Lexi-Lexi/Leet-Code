package LeetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Book_03_1253 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		int n = Integer.parseInt(stringTokenizer.nextToken());
		long[] nums = new long[n];
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		for (int i = 0; i < n; i++)
		{
			nums[i] = Long.parseLong(stringTokenizer.nextToken());
		}
		Arrays.sort(nums);
		int count = 0;
		
		for (int k = 0; k < n; k++)
		{
			long goal = nums[k];
			int i = 0;
			int j = n - 1;
			while (i < j)
			{
				if (nums[i] + nums[j] == goal)
				{
					if (i != k && j != k)
					{
						count++;
						break;
					}
					else if (i == k)
					{
						i++;
					}
					else if (j == k)
					{
						j--;
					}
				}
				else if (nums[i] + nums[j] < goal)
				{
					i++;
				}
				else
				{
					j--;
				}
			}
		}
		
		System.out.println(count);
		
		
	}

}
