import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int staticCost = sc.nextInt();	//�Ӵ��
		int cost = sc.nextInt();	//���
		int price = sc.nextInt();	//�ǸŰ���
		int result;	//������
		
		
		if(price<=cost)
		{
			result = -1;
		}else {
			result = staticCost / (price-cost) +1;
		}
		System.out.println(result);
		
		
	}

}
