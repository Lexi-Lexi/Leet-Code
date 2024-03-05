package LeetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Book_03_11659 {
	/* Practicing prefix sum */
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		int n = Integer.parseInt(stringTokenizer.nextToken());
		int iterations = Integer.parseInt(stringTokenizer.nextToken());
		long[] prefixSum = new long[n+1];
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		for (int i = 1; i <= n; i++)
		{
			prefixSum[i] = prefixSum[i-1] + Integer.parseInt(stringTokenizer.nextToken());
		}
		
		for (int i = 0; i < iterations; i++)
		{
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int first = Integer.parseInt(stringTokenizer.nextToken());
			int last = Integer.parseInt(stringTokenizer.nextToken());
			System.out.println(prefixSum[last] - prefixSum[first-1]);
		}
	}
}
