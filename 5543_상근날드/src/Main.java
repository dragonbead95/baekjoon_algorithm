import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int burger = 2001;
		int drink = 2001;
		
		for(int i=0;i<3;i++)
		{
			int ham = Integer.parseInt(br.readLine());
			
			if(ham<burger) {
				burger = ham;
			}
		}
		
		for(int i=0;i<2;i++)
		{
			int d = Integer.parseInt(br.readLine());
			
			if(d < drink)
			{
				drink = d;
			}
		}
		
		System.out.println(burger+drink-50);
		
				
	}

}
