package BOJ_9184;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Main {
	static final Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	public static int w(int a, int b, int c)
	{
		int value;
		if(a<=0 || b<=0 || c<=0)
		{
			return 1;
		}
		else if(a>20 || b>20 || c>20)
		{
			value = w(20,20,20);
			map.put(value, value);
			return map.get(value);
		}
		else if(a<b && b<c)
		{
			int v1 = w(a,b,c-1);
			int v2 = w(a,b-1,c-1);
			int v3 = w(a,b-1,c);
			map.put(v1, v1);
			map.put(v2, v2);
			map.put(v3, v3);
			return map.get(v1) + map.get(v2) + map.get(v3);
		}
		else
		{
			
			int v1 = w(a-1,b,c);
			int v2 = w(a-1,b-1,c);
			int v3 = w(a-1,b,c-1);
			int v4 = w(a-1,b-1,c-1);
			map.put(v1, v1);
			map.put(v2, v2);
			map.put(v3, v3);
			map.put(v4, v4);
			return map.get(v1) + map.get(v2) + map.get(v3) - map.get(v4);
		}
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true)
		{
			String str[] = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			int c = Integer.parseInt(str[2]);
			
			if(a==-1 && b==-1 && c==-1)
			{
				break;
			}
			
			int answer = w(a, b, c);
			System.out.printf("w(%d, %d, %d) = %d\n", a, b, c, answer);
		}
		
		
		
	}
}
