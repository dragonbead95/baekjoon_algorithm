

/**
 * @title 스택
 * @author 김용환
 * @date 2019-12-30
 * @problem
 * 나코더 기장 재민이는 동아리 회식을 준비하기 위해서 장부를 관리하는 중이다.

재현이는 재민이를 도와서 돈을 관리하는 중인데, 애석하게도 항상 정신없는 재현이는 돈을 실수로 잘못 부르는 사고를 치기 일쑤였다.

재현이는 잘못된 수를 부를 때마다 0을 외쳐서, 가장 최근에 재민이가 쓴 수를 지우게 시킨다.

재민이는 이렇게 모든 수를 받아 적은 후 그 수의 합을 알고 싶어 한다. 재민이를 도와주자!

	@input
	첫 번째 줄에 정수 K가 주어진다. (1 ≤ K ≤ 100,000)

이후 K개의 줄에 정수가 1개씩 주어진다. 정수는 0에서 1,000,000 사이의 값을 가지며, 정수가 "0" 일 경우에는 가장 최근에 쓴 수를 지우고, 아닐 경우 해당 수를 쓴다.

정수가 "0"일 경우에 지울 수 있는 수가 있음을 보장할 수 있다.
	 
	@output
	재민이가 최종적으로 적어 낸 수의 합을 출력한다.
	
	@input example
	4
	3
	0
	4
	0

	@output example
	10
	1
	3
	5
	4
	0
	0
	7
	0
	0
	6
 *
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n;		//배열의 크기 및  명령 갯수
		int top=-1;	//스택의 탑
		int[] arr;	
		int input;	//입력 정수
		int sum=0;	//합계
		
		n = sc.nextInt();
		arr = new int[n];
		
		for(int i=0;i<n;i++)
		{
			input = sc.nextInt();
			if(input>=0 && input<=1000000)	// 0<= input <=1000000
			{
				//input이 0이라면 가장 최근에 쓴 수를 지운다. 아니라면 스택에 적립
				if(input !=0)
				{
					arr[++top] = input;
				}else {
					arr[top--] = 0;	
				}
			}
		}
		//스택에 있는 정수들을 합한다.
		for(int i=0;i<top+1;i++)
		{
			sum += arr[i];
		}
		System.out.println(sum);
		
		
	}

}
