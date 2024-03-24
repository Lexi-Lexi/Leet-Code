package LeetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Book_04_1377 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		int n = Integer.parseInt(stringTokenizer.nextToken());
		dataArray[] array = new dataArray[n];
		
		for (int i = 0; i < n; i++)
		{
			array[i] = new dataArray(Integer.parseInt(bufferedReader.readLine()), i);
		}
		
		Arrays.sort(array); // O(nlogn)
		
		int max = 0;
		for (int i = 0; i < n; i++)
		{
			if (max < array[i].index - i)
			{
				max = array[i].index - i;
			}
		}
		System.out.println(max + 1);

	}

}


class dataArray implements Comparable<dataArray> {
	int value;
	int index;
	
	public dataArray(int value, int index) {
		super();
		this.value = value;
		this.index = index;
	}
	
	@Override
	public int compareTo(dataArray a) {
		return this.value - a.value;
	}
}