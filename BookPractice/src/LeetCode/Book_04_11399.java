package LeetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Book_04_11399 {
	/* Practicing insertion sort */

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		int num = Integer.parseInt(stringTokenizer.nextToken());
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		int[] timeArray = new int[num];
		for (int i = 0; i < num; i++)
		{
			timeArray[i] = Integer.parseInt(stringTokenizer.nextToken());
		}
		
		for (int i = 1; i < num; i++)
		{
			int insertPointer = i;
			int insertValue = timeArray[i];
			for (int j = i - 1; j >= 0; j--) // It is easier to iterate from back, for shifting later
			{
				if (timeArray[j] < timeArray[i])
				{
					insertPointer = j + 1;
					break;
				}
				if (j == 0)
				{
					insertPointer = 0;
				}
				
			}
			
			for (int k = i; k > insertPointer; k--)
			{
				timeArray[k] = timeArray[k-1];
			}
			
			timeArray[insertPointer] = insertValue;
			// shift 
		}
		
		int[] sumArray = new int[num];
		sumArray[0] = timeArray[0];
		for (int i = 1; i < num; i++)
		{
			sumArray[i] = sumArray[i-1] + timeArray[i];
		}
		
		int sum = 0;
		for (int i = 0; i < num; i++)
		{
			sum = sum + sumArray[i];
		}
		
		System.out.println(sum);
				
		
	}

}
