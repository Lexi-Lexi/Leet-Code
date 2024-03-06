package LeetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Book_03_10986 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		int n = Integer.parseInt(stringTokenizer.nextToken());
		int divisor = Integer.parseInt(stringTokenizer.nextToken());
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		long counter = 0;
		long[] prefixSum = new long[n+1];
		long[] remainders = new long[divisor];
		prefixSum[0] = Integer.parseInt(stringTokenizer.nextToken());
		for (int i = 1; i < n; i++)
		{
			prefixSum[i] = prefixSum[i-1] + Integer.parseInt(stringTokenizer.nextToken());
		}
		
		for (int i = 0; i < n; i++)
		{
			int remainder = (int)(prefixSum[i] % divisor);
			if (prefixSum[i] % divisor == 0)
			{
				counter++; 
			}
			remainders[remainder]++;
		}
		
		for (int i = 0; i < divisor; i++)
		{
			if (remainders[i] > 1)
			{
				counter = counter + (remainders[i] * (remainders[i] - 1) / 2);
			}
		}
		System.out.println(counter);
	}

}
