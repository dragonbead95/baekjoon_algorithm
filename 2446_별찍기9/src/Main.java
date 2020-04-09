import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void printTab(int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(" ");
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		
		
		for(int i=1; i<=N*2-1; i+=2)
		{
			for(int j=0;j<i/2;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=N*2-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<N;i++)
		{
			for(int j=1;j<N-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<i*2+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
				
	}

}
