import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
	public static int OutputPerson(int k, int n)
	{
		if(k<0 || n<=0)
		{
			return 0;
		}
		
		if(k==0)
		{
			return n;
		}else {
			return (OutputPerson(k, n-1) + OutputPerson(k-1, n));
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Testcase;
		int k,n;
		
		Testcase = Integer.parseInt(br.readLine());
		
		for(int i=0;i<Testcase;i++)
		{
			k = Integer.parseInt(br.readLine());
			n = Integer.parseInt(br.readLine());
			int ans =OutputPerson(k, n);
			System.out.println(ans);
		}
		
	}

}
