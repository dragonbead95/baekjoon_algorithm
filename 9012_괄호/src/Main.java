

/**
 * @title ����
 * @author ���ȯ
 * @date 2019-12-30
 * @problem
 * ������ �����ϴ� ������ ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.

����� �� �ټ� �����̴�.

push X: ���� X�� ���ÿ� �ִ� �����̴�.
pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
top: ������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.

	@input
	ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����. 
	��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����. �־����� ������ 1���� ũ�ų� ����,
	 100,000���� �۰ų� ����. ������ �������� ���� ����� �־����� ���� ����.
	 
	@output
	����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ����Ѵ�.
	
	@input example
	14
	push 1
	push 2
	top
	size
	empty
	pop
	pop
	pop
	size
	empty
	pop
	push 3
	empty
	top

	@output example
	2
	2
	0
	2
	1
	-1
	0
	1
	-1
	0
	3
 *
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		int top=-1;
		String[] arr;
		String input;
		boolean isVPS;
		
		n = sc.nextInt();
		
		
		for(int i=0;i<n;i++)
		{
			//init
			isVPS = true;
			arr = new String[50];
			top = -1;
			
			input = sc.next();	//���ڿ� �Է�
			for(int k=0;k<input.length();k++)
			{
				String str = Character.toString(input.charAt(k));	//���ڿ� ��� ����
				
				//"("�� ��� ���ÿ� ����
				if(str.equals("("))
				{
					top++;
					arr[top] = str;
					
				}
				/*")"�� ��� ������ ������� �˻�
				 * ����ִ°�� )�� �Է��̾ ��ȿ���� �ʴ´�.
				 * ������� �ʴ� ��� ���ÿ� (�� ��쿩�� ������ pop�Ѵ�.*/
				else if(str.equals(")"))	
				{
					if(top!=-1)
					{
						arr[top--]= null;
					}else {
						isVPS = false;
						break;
					}
				}
				
			}
			
			//������ ������� ������� (((...�� ���� ����Դϴ�.
			if(top!=-1)
			{
				isVPS = false;
			}
			
			if(isVPS)
			{
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	
		
		
	}

}
