import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int staticCost = sc.nextInt();	//임대비
		int cost = sc.nextInt();	//비용
		int price = sc.nextInt();	//판매가격
		int result;	//생산대수
		
		
		if(price<=cost)
		{
			result = -1;
		}else {
			result = staticCost / (price-cost) +1;
		}
		System.out.println(result);
		
		
	}

}
