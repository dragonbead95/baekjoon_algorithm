package BOJ_1158;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
	public static List<Integer> solution(int N, int K)
	{
		List<Integer> list = new ArrayList<>();
		List<Integer> answer = new ArrayList<>();
		
		for(int i=1;i<=N;i++)
		{
			list.add(i);
		}
		
		int index = 0;
		while(list.size()!=0)
		{
			index += (K-1);
			
			if(index>=list.size())
			{
				while(index>=list.size())
				{
					index = index - list.size();
				}
			}
			answer.add(list.remove(index));
		}
		return answer;
	}
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String strs[] = br.readLine().split(" ");
		int N = Integer.parseInt(strs[0]);
		int K = Integer.parseInt(strs[1]);
		
		List<Integer> answer = solution(N, K);
		
		for(int i=0;i<answer.size();i++)
		{
			if(i==0)
			{
				System.out.print("<");
				System.out.print(answer.get(i) + ", ");
			}
			else if(i==answer.size()-1)
			{
				System.out.print(answer.get(i) + ">");
			}else 
			{
				System.out.print(answer.get(i) + ", ");	
			}
		}
	}
}
