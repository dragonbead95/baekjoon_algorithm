

/**
 * @title 균형잡힌 세상
 * @author 김용환
 * @date 2019-12-30
 * @problem
 * 세계는 균형이 잘 잡혀있어야 한다. 양과 음, 빛과 어둠 그리고 왼쪽 괄호와 오른쪽 괄호처럼 말이다.

정민이의 임무는 어떤 문자열이 주어졌을 때, 괄호들의 균형이 잘 맞춰져 있는지 판단하는 프로그램을 짜는 것이다.

문자열에 포함되는 괄호는 소괄호("()") 와 대괄호("[]")로 2종류이고, 문자열이 균형을 이루는 조건은 아래와 같다.

모든 왼쪽 소괄호("(")는 오른쪽 소괄호(")")와만 짝을 이룰 수 있다.
모든 왼쪽 대괄호("[")는 오른쪽 대괄호("]")와만 짝을 이룰 수 있다.
모든 오른쪽 괄호들은 자신과 짝을 이룰 수 있는 왼쪽 괄호가 존재한다.
모든 괄호들의 짝은 1:1 매칭만 가능하다. 즉, 괄호 하나가 둘 이상의 괄호와 짝지어지지 않는다.
짝을 이루는 두 괄호가 있을 때, 그 사이에 있는 문자열도 균형이 잡혀야 한다.
정민이를 도와 문자열이 주어졌을 때 균형잡힌 문자열인지 아닌지를 판단해보자.

	@input
	하나 또는 여러줄에 걸쳐서 문자열이 주어진다. 각 문자열은 영문 알파벳, 공백, 소괄호("( )") 대괄호("[ ]")등으로 이루어져 있으며, 길이는 100글자보다 작거나 같다.

입력의 종료조건으로 맨 마지막에 점 하나(".")가 들어온다.
	 
	@output
	각 줄마다 해당 문자열이 균형을 이루고 있으면 "yes"를, 아니면 "no"를 출력한다.
	
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
 *해설
 *일단 코드를 작성하기 전에 문제가 되는 경우들을 고려해봐야 한다.

1. 왼쪽 소괄호인데 오른쪽 대괄호가 오는 경우와

   왼쪽 대괄호인데 오른쪽 소괄호가 오는 경우

2. 왼쪽 소괄호나 왼쪽 대괄호 없이 오른쪽 소괄호나 오른쪽 대괄호가 나온 경우

즉 오른쪽 괄호를 넣어줄 때만 체크를 해주면 된다.

오른쪽 괄호를 넣을 때, 괄호가 없는 상태이면 안되고, 마지막에 있는 왼쪽 괄호가 자신과 짝인 괄호이어야 한다.

Stack으로 구성을 했고 오른쪽 괄호 존재가 잘못되어 no를 출력해야 하는 부분에서 stack.push를 해준 이유는 마지막에 "yes"와 "no"를 출력하는 부분에서 stack이 비어있는지로 판단을 할 건데, stack이 비어있는데 오른쪽 괄호가 와서 break를 해버리게 되면 그대로 "yes"가 출력되기 때문이다.

출처: https://suri78.tistory.com/47 [공부노트]
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
					/*stack.isEmpty()를 넣은 이유는 닫는괄호가 먼저 온 경우입니다.*/
					/*두번째와 세번째 조건은 괄호가 서로 맞지 않는 경우입니다. ex) input: (aaaaa], [aaaaa)
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
