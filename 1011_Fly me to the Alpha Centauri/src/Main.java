/**
 * @title : Fly me to the Alpha Centauri (백준 1011) 
 * @author : 김용환
 * @date : 2020-02-20
 * @content : 이동거리(d)가 데칼코마니 형식으로 초기에 점점 증가했다가 감소하는 모양으로 나타난다.
 * 처음 x(시작좌표)에서 이동거리를 더하면서 y와 같거나 이상인지 검사한다. x가 y와 같아지거나 y값을 넘으면 도착한 것이기 때문이다.
 * x가 y에 도착하지 못하였으면 y값에서 같은 이동거리(d)를 빼주어 이동횟수를 증가시킨다. 이동거리(d)를 y를 뺄때 증가시키지 않은 이유는
 * 데칼코마니 형식으로 점점 증가하였다가 감소하는 모양이기 때문입니다.
 * 이렇게 반복하다가 서로 엇갈릴때 도착한 것이기 때문에 x의 이동횟수(xJump)와 y의 이동횟수(yJump)를 더한 값이 총 이동횟수입니다.
 * @example
 * 	x=0 y=6
 * 1 2 2 1 (이동거리)
 * 이동횟수 4번
 * 
 *  x=0 y=7
 * 1 2 2 1 1 (이동거리)
 * 이동횟수 5번
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int FlyCount(int x, int y)
	{
		int d=0;		//이동거리
		int xJump=0;	// x 이동횟수
		int yJump=0;	// y 이동횟수
		
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
