package LeetCode;

import java.util.Scanner;

public class Book_03_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfSubjects = sc.nextInt();
		int max = 0;
		int score;
		int sum = 0;
		while (sc.hasNext())
		{
			score = sc.nextInt();
			if (score > max)
			{
				max = score;
			}
			sum += score;
		}
		System.out.println(sum * 100.0 / numOfSubjects / max);
	}
}
