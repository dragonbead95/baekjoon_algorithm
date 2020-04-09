import java.util.Scanner;

public class main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println(loop(a));	
	}
	
	static int loop(int a)
	{
		int num=1;
		for(int i=a;i>0;i--) {
			num *= i;
		}
		return num;
	}
}
