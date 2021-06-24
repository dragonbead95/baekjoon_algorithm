package BOJ_1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
	public static LinkedList<Integer>[] nodeList;
	public static int m;
	public static int n;

	public static void bfs(int[][] map, int i, int j)
	{
		
		
		if(map[i-1][j]==1)	// 상
		{
			map[i-1][j] = -1;
			bfs(map,i-1,j);
		}
		
		if(map[i+1][j]==1)	// 하
		{
			map[i+1][j] = -1;
			bfs(map,i+1,j);
		}
		
		if(map[i][j-1]==1)	// 좌
		{
			map[i][j-1] = -1;
			bfs(map,i,j-1);
		}
		
		if(map[i][j+1]==1)	// 우
		{
			map[i][j+1] = -1;
			bfs(map,i,j+1);
		}
	}
	
	public static void solution(int[][] map)
	{
		for(int i=0;i<map.length;i++)
		{
			for(int j=0;j<map[i].length;j++)
			{
				if(map[i][j]==1)
				{
					bfs(map,i,j);
				}else 
				{
					continue;
				}
			}
		}
		
		print(map);
	}
	
	public static void print(int[][] map)
	{
		for(int i=0;i<map.length;i++)
		{
			for(int j=0;j<map[i].length;j++)
			{
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		
		for(int i=0;i<tc;i++)
		{
			String[] str = br.readLine().split(" ");
			m = Integer.parseInt(str[0]);	// 가로 길이
			n = Integer.parseInt(str[1]);	// 세로 길이
			int k = Integer.parseInt(str[2]);	// 배추가 심어져 있는 개수
			
			int[][] map = new int[m][n];
			for(int j=0;j<k;j++)
			{
				String[] str2 = br.readLine().split(" ");
				int x = Integer.parseInt(str2[0]);
				int y = Integer.parseInt(str2[1]);
				map[x][y] = 1;
			}
			
			solution(map);
		}
		
		
		
	}
}
