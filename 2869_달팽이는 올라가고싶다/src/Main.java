import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long A,B,V,day;
		
		String[] str;
		str = br.readLine().split(" ");
		A = Integer.parseInt(str[0]);	//올라감
		B = Integer.parseInt(str[1]);	//내려감
		V = Integer.parseInt(str[2]);	//높이
		day = 0;						//날자

		
		day = (V-B)/(A-B);
		if((V-B)%(A-B)!=0)
		{
			day++;
		}
		System.out.println(day);
	}
}
