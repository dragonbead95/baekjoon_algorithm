import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		//N번 반복
		for(int line=0;line<N;line++)
		{
			//2줄 반복
			for(int i=1;i<=2;i++)
			{
				//2줄중에 2번재 줄이라면 공백과 별이 반복하여 출력된다.
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
				}else {	//2줄중에 1번째 줄이라면 별과 공백이 반복하여 출력된다.
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
