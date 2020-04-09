

/**
 * @title �������� ����
 * @author ���ȯ
 * @date 2019-12-30
 * @problem
 * ����� ������ �� �����־�� �Ѵ�. ��� ��, ���� ��� �׸��� ���� ��ȣ�� ������ ��ȣó�� ���̴�.

�������� �ӹ��� � ���ڿ��� �־����� ��, ��ȣ���� ������ �� ������ �ִ��� �Ǵ��ϴ� ���α׷��� ¥�� ���̴�.

���ڿ��� ���ԵǴ� ��ȣ�� �Ұ�ȣ("()") �� ���ȣ("[]")�� 2�����̰�, ���ڿ��� ������ �̷�� ������ �Ʒ��� ����.

��� ���� �Ұ�ȣ("(")�� ������ �Ұ�ȣ(")")�͸� ¦�� �̷� �� �ִ�.
��� ���� ���ȣ("[")�� ������ ���ȣ("]")�͸� ¦�� �̷� �� �ִ�.
��� ������ ��ȣ���� �ڽŰ� ¦�� �̷� �� �ִ� ���� ��ȣ�� �����Ѵ�.
��� ��ȣ���� ¦�� 1:1 ��Ī�� �����ϴ�. ��, ��ȣ �ϳ��� �� �̻��� ��ȣ�� ¦�������� �ʴ´�.
¦�� �̷�� �� ��ȣ�� ���� ��, �� ���̿� �ִ� ���ڿ��� ������ ������ �Ѵ�.
�����̸� ���� ���ڿ��� �־����� �� �������� ���ڿ����� �ƴ����� �Ǵ��غ���.

	@input
	�ϳ� �Ǵ� �����ٿ� ���ļ� ���ڿ��� �־�����. �� ���ڿ��� ���� ���ĺ�, ����, �Ұ�ȣ("( )") ���ȣ("[ ]")������ �̷���� ������, ���̴� 100���ں��� �۰ų� ����.

�Է��� ������������ �� �������� �� �ϳ�(".")�� ���´�.
	 
	@output
	�� �ٸ��� �ش� ���ڿ��� ������ �̷�� ������ "yes"��, �ƴϸ� "no"�� ����Ѵ�.
	
	@input example
	So when I die (the [first] I will see in (heaven) is a score list).
[ first in ] ( first out ).
Half Moon tonight (At least it is better than no Moon at all].
A rope may form )( a trail in a maze.
Help( I[m being held prisoner in a fortune cookie factory)].
([ (([( [ ] ) ( ) (( ))] )) ]).
 .
.

	@output example
	yes
	yes
	no
	no
	no
	yes
	yes
 *
 *
 *
 *�ؼ�
 *�ϴ� �ڵ带 �ۼ��ϱ� ���� ������ �Ǵ� ������ ����غ��� �Ѵ�.

1. ���� �Ұ�ȣ�ε� ������ ���ȣ�� ���� ����

   ���� ���ȣ�ε� ������ �Ұ�ȣ�� ���� ���

2. ���� �Ұ�ȣ�� ���� ���ȣ ���� ������ �Ұ�ȣ�� ������ ���ȣ�� ���� ���

�� ������ ��ȣ�� �־��� ���� üũ�� ���ָ� �ȴ�.

������ ��ȣ�� ���� ��, ��ȣ�� ���� �����̸� �ȵǰ�, �������� �ִ� ���� ��ȣ�� �ڽŰ� ¦�� ��ȣ�̾�� �Ѵ�.

Stack���� ������ �߰� ������ ��ȣ ���簡 �߸��Ǿ� no�� ����ؾ� �ϴ� �κп��� stack.push�� ���� ������ �������� "yes"�� "no"�� ����ϴ� �κп��� stack�� ����ִ����� �Ǵ��� �� �ǵ�, stack�� ����ִµ� ������ ��ȣ�� �ͼ� break�� �ع����� �Ǹ� �״�� "yes"�� ��µǱ� �����̴�.

��ó: https://suri78.tistory.com/47 [���γ�Ʈ]
 */

import java.io.*;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input_len, i;
		Stack<Character> stack = new Stack<Character>();
		char t;
		
		String input = br.readLine();
		while(!input.equals("."))
		{
			stack.clear();
			
			input_len = input.length();
			for(i=0;i<input_len;i++)
			{
				t = input.charAt(i);
				if(t=='(' || t=='[')
				{
					stack.push(t);
				}
				else if(t==')' || t==']')
				{
					/*stack.isEmpty()�� ���� ������ �ݴ°�ȣ�� ���� �� ����Դϴ�.*/
					/*�ι�°�� ����° ������ ��ȣ�� ���� ���� �ʴ� ����Դϴ�. ex) input: (aaaaa], [aaaaa)
					 * */
					if(stack.isEmpty() || 
							(t==')' && stack.peek() != '(') ||
							(t==']' && stack.peek() != '['))
					{
						stack.push(t);
						break;
					}
					stack.pop();
				}
			}
			
			if(stack.isEmpty())
			{
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
			input = br.readLine();
		}
	}

}
