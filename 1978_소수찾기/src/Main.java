/**
 * @title : 소수찾기 (백준 1978)
 * @author : 김용환
 * @date : 2020-02-20
 * @content : 소수는 1과 숫자 자신의 수로 밖에 나눠지지 않는다.
 * 			즉 1과 그 숫자 자신말고 다른수로 나눠지면 그 수는 소수가 아니다.
 * 			단, 1은 소수가 아니다.
 * @example
 * 숫자 7의 경우 2~6까지의 수로 나누었을때 나머지가 0이 없다. 그러므로 7은 소수이다.
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
