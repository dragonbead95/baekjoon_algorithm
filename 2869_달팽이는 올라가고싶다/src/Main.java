import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long A,B,V,day;
		
		String[] str;
		str = br.readLine().split(" ");
		A = Integer.parseInt(str[0]);	//�ö�
		B = Integer.parseInt(str[1]);	//������
		V = Integer.parseInt(str[2]);	//����
		day = 0;						//����

		
		day = (V-B)/(A-B);
		if((V-B)%(A-B)!=0)
		{
			day++;
		}
		System.out.println(day);
	}
}
