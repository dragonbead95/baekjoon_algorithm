import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int line = 0;
		int cnt=0;
		while(cnt<n)
		{
			line++;
			cnt = line *(line+1)/2;
		}
		
		int top,bottom;
		if(line%2!=0)
		{
			top = 1+(cnt-n);
			bottom = line - (cnt-n);
		}else {
			top = line - (cnt-n);
			bottom = 1+(cnt-n);
		}
		System.out.println(top + "/" + bottom);
		
	}
}
