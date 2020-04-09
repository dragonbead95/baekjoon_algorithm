
/* 	접미사 배열은 문자열 S의 모든 접미사를 사전순으로 정렬해 놓은 배열이다.
 *  baekjoon의 접미사는 baekjoon, aekjoon, ekjoon, kjoon, joon, oon, on, n 으로 총 8가지가 있고, 
 *  이를 사전순으로 정렬하면, aekjoon, baekjoon, ekjoon, joon, kjoon, n, on, oon이 된다.
 *	문자열 S가 주어졌을 때, 모든 접미사를 사전순으로 정렬한 다음 출력하는 프로그램을 작성하시오.
 */
import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = null;
		String str_arr[] = null;
		
		str = sc.nextLine();				// 입력
		str_arr = new String[str.length()];	// 배열 크기 지정
		
		str_substring(str_arr, str);		// 접미사로 쪼개기
		Arrays.sort(str_arr);				// 알파벳 순으로 정렬
		print(str_arr);						// 출력
	}

	public static void print(String str_arr[])
	{
		for(int i=0;i<str_arr.length;i++)
		{
			System.out.print(str_arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void str_substring(String str_arr[], String str)
	{
		for(int i=0;i<str.length();i++)
		{
			str_arr[i] = str.substring(i,str.length());	// i~문자열의 마지막까지 추출하여 각각 배열에 삽입
		}
	}

}
