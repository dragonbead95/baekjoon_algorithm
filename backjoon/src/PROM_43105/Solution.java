package PROM_43105;

public class Solution {
	public static int[][] cache;
	public static int down(int[][] triangle, int row, int col)
	{
		if(row>=triangle.length)
		{
			return triangle[row-1][col];
		}
		if(row==0 && col==0)
		{
			return down(triangle, row+1, col);
		}
		if(cache[row][col]!=0)
		{
			return cache[row][col];
		}
		return cache[row-1][col] = triangle[row-1][col] + Math.max(down(triangle,row+1,col), down(triangle,row+1,col+1));
		
	}
	
	public static void print(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int solution(int[][] triangle)
	{
		cache = new int[triangle.length][triangle.length];
		int answer = down(triangle, 0,0);
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] triangle = {{8},{2,7},{4,5,2}};
		int[][] triangle = {{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}};
		System.out.println(solution(triangle));
	}
}