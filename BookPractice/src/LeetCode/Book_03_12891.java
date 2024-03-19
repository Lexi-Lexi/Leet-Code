package LeetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Book_03_12891 {
	
	static int answer = 0;
	static int[] correctArray;
	static int[] currentArray;

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		int length = Integer.parseInt(stringTokenizer.nextToken());
		int subLength = Integer.parseInt(stringTokenizer.nextToken());
		
		char[] fullStringArray = bufferedReader.readLine().toCharArray();
		
		correctArray = new int[4]; /* A C G T */
		currentArray = new int[4];
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		for (int i = 0; i < correctArray.length; i++)
		{
			correctArray[i] = Integer.parseInt(stringTokenizer.nextToken());
		}
		
		for (int i = 0; i < length; i++)
		{
			if (i <= subLength - 1) // Keep adding as long as the it hasn't reached the subLength
			{
				addLetter(fullStringArray[i]);
				if (i == subLength - 1) // Can start comparing
				{
					compareArrays();
				}
			}
			else // Start adding/removing letters as the sliding window proceeds in the fullStringArray
			{
				addLetter(fullStringArray[i]);
				removeLetter(fullStringArray[i-subLength]);
				compareArrays();
			}
		}
		System.out.println(answer);	
	}
	
	private static void compareArrays()
	{
		for (int i = 0; i < correctArray.length; i++)
		{
			if (correctArray[i] > currentArray[i]) // when there is not enough occurrence of A C G or T
			{
				return;
			}
		}
		answer++;
	}
	
	private static void removeLetter(char letter)
	{
		switch (letter)
		{ // Make sure the number of occurrence doesn't become negative
		case 'A':
			currentArray[0] = Math.max(0, currentArray[0] - 1);
			break;
		case 'C':
			currentArray[1] = Math.max(0, currentArray[1] - 1);
			break;
		case 'G':
			currentArray[2] = Math.max(0, currentArray[2] - 1);
			break;
		case 'T':
			currentArray[3] = Math.max(0, currentArray[3] - 1);
			break;
		}
	}
	
	private static void addLetter(char letter)
	{
		switch (letter)
		{
		case 'A':
			currentArray[0]++;
			break;
		case 'C':
			currentArray[1]++;
			break;
		case 'G':
			currentArray[2]++;	
			break;
		case 'T':
			currentArray[3]++;
			break;
		}
	}
}
