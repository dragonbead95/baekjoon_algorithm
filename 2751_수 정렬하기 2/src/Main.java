/**
 * 문제
N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

입력
첫째 줄에 수의 개수 N(1<=N<=1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 절대값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.

출력
첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 */
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a;
		int size;
		
		
		size = sc.nextInt();
		if(size>=1 && size<=1000000)
		{
			a = new int[size];
		}else {
			return;
		}
		
		input(a);
		sort(a);
		print(a);
	}
	
	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public static void sort(int[] a)
	{
		int temp;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j-1]>a[j])
				{
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	
	public static void input(int[] a)
	{
		int number;
		
		for(int i=0;i<a.length;i++)
		{
			number = sc.nextInt();
			if(number>=(-1000000) && number<=1000000)
			{
				if(inspection(a, number))
				{
					a[i] = number;
				}
			}
		}
	}
	
	public static boolean inspection(int[] a,int number)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==number)
			{
				return false;
			}
		}
		return true;
	}

}
