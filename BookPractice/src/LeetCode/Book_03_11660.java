package LeetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Book_03_11660 {
	/* practicing 2-d prefix sum */

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		int size = Integer.parseInt(stringTokenizer.nextToken());
		long iterations = Long.parseLong(stringTokenizer.nextToken());
		int[][] table = new int[size+1][size+1];
		int[][] prefixSumTable = new int[size+1][size+1];
		
		for (int i = 1; i <= size; i++)
		{
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			for (int j = 1; j <= size; j++)
			{
				table[i][j] = Integer.parseInt(stringTokenizer.nextToken());
			}
		}
		
		for (int i = 1; i <= size; i++)
		{
			for (int j = 1; j <= size; j++)
			{
				prefixSumTable[i][j] = prefixSumTable[i][j-1] + prefixSumTable[i-1][j] + table[i][j] - prefixSumTable[i-1][j-1];
			}
		}
		
		for (int i = 0; i < iterations; i++)
		{
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int x1 = Integer.parseInt(stringTokenizer.nextToken());
			int y1 = Integer.parseInt(stringTokenizer.nextToken());
			int x2 = Integer.parseInt(stringTokenizer.nextToken());
			int y2 = Integer.parseInt(stringTokenizer.nextToken());
			System.out.println(prefixSumTable[x2][y2] - prefixSumTable[x1-1][y2] - prefixSumTable[x2][y1-1] + prefixSumTable[x1-1][y1-1]);
		}
		
	

	}

}
