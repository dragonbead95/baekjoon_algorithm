import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		//N�� �ݺ�
		for(int line=0;line<N;line++)
		{
			//2�� �ݺ�
			for(int i=1;i<=2;i++)
			{
				//2���߿� 2���� ���̶�� ����� ���� �ݺ��Ͽ� ��µȴ�.
				if(i%2==0)
				{
					for(int j=1;j<=N;j++)
					{
						if(j%2==0)
						{
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
					}
				}else {	//2���߿� 1��° ���̶�� ���� ������ �ݺ��Ͽ� ��µȴ�.
					for(int j=1;j<=N;j++)
					{
						if(j%2==1)
						{
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
					}
				}
				System.out.println();
			}
		}
		
	}

}
