

/**
 * @title 스택
 * @author 김용환
 * @date 2019-12-30
 * @problem
 * 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 다섯 가지이다.

push X: 정수 X를 스택에 넣는 연산이다.
pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 스택에 들어있는 정수의 개수를 출력한다.
empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

	@input
	첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 
	둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고,
	 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
	 
	@output
	출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
	
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
			
			input = sc.next();	//문자열 입력
			for(int k=0;k<input.length();k++)
			{
				String str = Character.toString(input.charAt(k));	//문자열 요소 참조
				
				//"("인 경우 스택에 저장
				if(str.equals("("))
				{
					top++;
					arr[top] = str;
					
				}
				/*")"인 경우 스택이 비었는지 검사
				 * 비어있는경우 )이 입력이어서 유효하지 않는다.
				 * 비어있지 않는 경우 스택에 (인 경우여서 스택을 pop한다.*/
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
			
			//스택이 비어있지 않은경우 (((...와 같은 경우입니다.
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
