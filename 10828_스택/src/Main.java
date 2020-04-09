

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
		int result;
		int top=-1;
		int[] arr;
		String input;
		
		n = sc.nextInt();
		arr = new int[n];
		
		for(int i=0;i<n;i++)
		{
			input = sc.next();
				
			if(input.equals("push"))
			{
				top++;
				arr[top] = sc.nextInt();
			}
			else if(input.equals("pop"))
			{
				if(top==-1)
				{
					System.out.println(-1);
				}else {
					System.out.println(arr[top]);
					top--;
				}
				
			}else if(input.equals("size"))
			{
				System.out.println(top+1);
			}else if(input.equals("empty"))
			{
				if(top==-1)
				{
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}else if(input.equals("top"))
			{
				if(top==-1)
				{
					System.out.println(-1);
				}else {
					System.out.println(arr[top]);
				}
				
			}
			
		}
		
		
	}

}
