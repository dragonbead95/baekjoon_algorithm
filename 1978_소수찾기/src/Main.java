/**
 * @title : �Ҽ�ã�� (���� 1978)
 * @author : ���ȯ
 * @date : 2020-02-20
 * @content : �Ҽ��� 1�� ���� �ڽ��� ���� �ۿ� �������� �ʴ´�.
 * 			�� 1�� �� ���� �ڽŸ��� �ٸ����� �������� �� ���� �Ҽ��� �ƴϴ�.
 * 			��, 1�� �Ҽ��� �ƴϴ�.
 * @example
 * ���� 7�� ��� 2~6������ ���� ���������� �������� 0�� ����. �׷��Ƿ� 7�� �Ҽ��̴�.
 * 
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
	public static int SearchPrime(int arr[])
	{
		boolean isPrime = true;
		int count=0;
		for(int k=0;k<arr.length;k++)
		{
			isPrime = true;
			for(int i=2;i<arr[k];i++)
			{
				if(arr[k]%i==0)
				{
					isPrime = false;
					break;
				}
			}
			
			if(isPrime && arr[k]!=1)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[];
		
		String line = br.readLine();
		int N = Integer.parseInt(line);
		int arr[] = new int[N];
		
		
		str = br.readLine().split(" ");
		for(int i=0;i<N;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		int count = SearchPrime(arr);
		System.out.println(count);
	}

}
