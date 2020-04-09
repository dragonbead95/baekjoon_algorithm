import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int croatiaSearch(String pattern, int pattern_size)
	{
		int i=0;
		int cnt=0;
		
		for(i=0;i<pattern_size;i++)
		{
			cnt++;
			if(pattern.charAt(i)=='c')
			{
				if(i<pattern_size-1 && (pattern.charAt(i+1)=='=' || pattern.charAt(i+1)=='-'))
				{
					i++;
				}
			}else if(pattern.charAt(i)=='d')
			{
				if(i<pattern_size-2 && pattern.charAt(i+1)=='z' && pattern.charAt(i+2)=='=')
				{
					i+=2;
				}
				else if(i<pattern_size-1 && pattern.charAt(i+1)=='-')
				{
					i++;
				}
			}else if(pattern.charAt(i)=='l' || pattern.charAt(i)=='n')
			{
				if(i<pattern_size-1 && pattern.charAt(i+1)=='j')
				{
					i++;
				}
			}else if(pattern.charAt(i)=='s' || pattern.charAt(i)=='z')
			{
				if(i<pattern_size-1 && pattern.charAt(i+1)=='=')
				{
					i++;
				}
			}
		}
		
		return cnt;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		String line = BR.readLine();
		
		int cnt = croatiaSearch(line, line.length());
		System.out.println(cnt);
		BR.close();
	}

}
