/**
 * @title : Fly me to the Alpha Centauri (���� 1011) 
 * @author : ���ȯ
 * @date : 2020-02-20
 * @content : �̵��Ÿ�(d)�� ��Į�ڸ��� �������� �ʱ⿡ ���� �����ߴٰ� �����ϴ� ������� ��Ÿ����.
 * ó�� x(������ǥ)���� �̵��Ÿ��� ���ϸ鼭 y�� ���ų� �̻����� �˻��Ѵ�. x�� y�� �������ų� y���� ������ ������ ���̱� �����̴�.
 * x�� y�� �������� ���Ͽ����� y������ ���� �̵��Ÿ�(d)�� ���־� �̵�Ƚ���� ������Ų��. �̵��Ÿ�(d)�� y�� ���� ������Ű�� ���� ������
 * ��Į�ڸ��� �������� ���� �����Ͽ��ٰ� �����ϴ� ����̱� �����Դϴ�.
 * �̷��� �ݺ��ϴٰ� ���� �������� ������ ���̱� ������ x�� �̵�Ƚ��(xJump)�� y�� �̵�Ƚ��(yJump)�� ���� ���� �� �̵�Ƚ���Դϴ�.
 * @example
 * 	x=0 y=6
 * 1 2 2 1 (�̵��Ÿ�)
 * �̵�Ƚ�� 4��
 * 
 *  x=0 y=7
 * 1 2 2 1 1 (�̵��Ÿ�)
 * �̵�Ƚ�� 5��
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int FlyCount(int x, int y)
	{
		int d=0;		//�̵��Ÿ�
		int xJump=0;	// x �̵�Ƚ��
		int yJump=0;	// y �̵�Ƚ��
		
		while(true)
		{
			d++;
			x += d;
			xJump++;
			if(x>=y)
			{
				break;
			}
			
			y -= d;
			yJump++;
			if(y<=x)
			{
				break;
			}
		}
		
		return (xJump+yJump);
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Testcase;
		int x,y;
		String str[];
		
		Testcase = Integer.parseInt(br.readLine());
		
		
		for(int i=0;i<Testcase;i++)
		{
			str = br.readLine().split(" ");
			x = Integer.parseInt(str[0]);
			y = Integer.parseInt(str[1]);
			int ans = FlyCount(x, y);
			System.out.println(ans);
		}
	}

}
