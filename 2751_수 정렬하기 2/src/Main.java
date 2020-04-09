/**
 * ����
N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ���� ���� N(1<=N<=1,000,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ���ڰ� �־�����. �� ���� ���밪�� 1,000,000���� �۰ų� ���� �����̴�. ���� �ߺ����� �ʴ´�.

���
ù° �ٺ��� N���� �ٿ� ������������ ������ ����� �� �ٿ� �ϳ��� ����Ѵ�.
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
