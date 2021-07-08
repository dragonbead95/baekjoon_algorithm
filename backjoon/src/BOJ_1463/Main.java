package BOJ_1463;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static int solution(int n)
	{
		if(n==1)
		{
			return 0;
		}
		else if(n%2==0)
		{
			return 1 + solution(n/2);
		}
		else if(n%3==0)
		{
			return 1 + solution(n/3);
		}
		else
		{
			return 1 + solution(n-1);
		}
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		System.out.println(solution(n));
	}
}
