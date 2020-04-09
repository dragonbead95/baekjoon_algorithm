import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
	public static int blackJak(ArrayList<Integer> list, int M)
	{
		int sum=0;
		int max=-1;
		
		Collections.sort(list,Collections.reverseOrder());
		for(int i=0;i<list.size()-2;i++)
		{
			for(int j=i+1;j<list.size()-1;j++)
			{
				for(int k=j+1;k<list.size();k++)
				{
					sum = list.get(i) + list.get(j) + list.get(k);
					
					if(sum<=M)
					{
						max = Math.max(sum, max);
					}
				}
			}
		}
		return max;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		
		int N = 0;				
		int M = 0;				
		
		ArrayList<Integer> list = new ArrayList<Integer>();

		String str[] = BR.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		
		str = BR.readLine().split(" ");
		for(int i=0;i<N;i++)
		{
			int a = Integer.parseInt(str[i]);
			if(a<=M)
			{
				list.add(a);
			}
		}
			
		System.out.println(blackJak(list, M));
	}
}
