package 프로그래머스_스킬체크1.문제1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



public class Solution {
	public static int solution(int n)
	{
		int answer = 0;
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=n;i++)
		{
			int mok = n/i;
			if((n%i==0) && !list.contains(mok))
			{
				if(i==mok)
				{
					list.add(i);
					answer += i;
					continue;
				}
				else 
				{
					list.add(i);
					list.add(mok);
					answer += i;
					answer += mok;
				}
				
			}
		}
		return answer;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		System.out.println(solution(n));
	}
}
