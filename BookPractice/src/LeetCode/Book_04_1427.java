package LeetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Book_04_1427 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		long num = Long.parseLong((new StringTokenizer(bufferedReader.readLine()).nextToken()));
		int[] array = new int[10]; // max size
		int numOfDigits = 0;
		
		while (num > 0)
		{
			array[numOfDigits] = (int) (num%10);
			numOfDigits++;
			num = (long)(num/10);
		}

		for (int i = 0; i < numOfDigits; i++)
		{
			int maxIndex = i;
			for (int j = i + 1; j < numOfDigits; j++)
			{
				if (array[j] > array[maxIndex])
				{
					maxIndex = j;
				}				
			}
			if (array[maxIndex] > array[i])
			{
				int tmp = array[i];
				array[i] = array[maxIndex];
				array[maxIndex] = tmp;
			}
		}			
		
		for (int i = 0; i < numOfDigits; i++)
		{
			System.out.println(array[i]);
		}
	}

}
