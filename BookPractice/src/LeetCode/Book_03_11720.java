package LeetCode;
import java.util.Scanner;


public class Book_03_11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String numString = sc.next();
		char[] numChar = numString.toCharArray();
		int sum = 0;
		for (int i = 0; i < numChar.length; i++)
		{
			sum += numChar[i] - '0';
		}
		System.out.print(sum);

	}

}
