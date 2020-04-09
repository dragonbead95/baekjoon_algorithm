import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase;
		int H;	
		int W;	
		int N;	
		int Hotel[][];	
		
		testcase = Integer.parseInt(br.readLine());
		
		
		for(int i=0;i<testcase;i++)
		{
			/*input*/
			String str[] = br.readLine().split(" ");
			H = Integer.parseInt(str[0]);
			W = Integer.parseInt(str[1]);
			N = Integer.parseInt(str[2]);
			int floor = N%H;
			int room = N/H+1;
			
			if(N%H==0)
			{
				room = N/H;
				floor = H;
			}
			System.out.println(floor*100+room);
		}
	}

}
