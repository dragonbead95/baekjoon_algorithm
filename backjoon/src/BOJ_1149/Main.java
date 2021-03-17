package BOJ_1149;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
	public static int[][] dp;
	public static int solution(int[][] cost, int n)
	{
		return 0;
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[][] cost = new int[n][3];
		
		for(int i=0;i<n;i++)
		{
			String[] str = br.readLine().split(" ");
			for(int j=0;j<3;j++)
			{
				cost[i][j] = Integer.parseInt(str[j]);
			}
		}
		
	}
}
