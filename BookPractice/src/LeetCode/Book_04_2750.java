package LeetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Book_04_2750 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		int n = Integer.parseInt(stringTokenizer.nextToken());
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++)
		{
			array[i] = Integer.parseInt((new StringTokenizer(bufferedReader.readLine())).nextToken());
		}
		
		for (int i = 0; i < n-1; i++)
		{
			for (int j = 0; j < n-1; j++)
			{
				if (array[j] > array[j+1])
				{
					int tmp = array[j+1];
					array[j+1] = array[j];
					array[j] = tmp;
				}
			}
		}
		
		for (int i = 0; i < n; i++)
		{
			System.out.println(array[i]);
		}
	}

}
