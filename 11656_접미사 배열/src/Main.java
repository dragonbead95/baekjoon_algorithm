
/* 	���̻� �迭�� ���ڿ� S�� ��� ���̻縦 ���������� ������ ���� �迭�̴�.
 *  baekjoon�� ���̻�� baekjoon, aekjoon, ekjoon, kjoon, joon, oon, on, n ���� �� 8������ �ְ�, 
 *  �̸� ���������� �����ϸ�, aekjoon, baekjoon, ekjoon, joon, kjoon, n, on, oon�� �ȴ�.
 *	���ڿ� S�� �־����� ��, ��� ���̻縦 ���������� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = null;
		String str_arr[] = null;
		
		str = sc.nextLine();				// �Է�
		str_arr = new String[str.length()];	// �迭 ũ�� ����
		
		str_substring(str_arr, str);		// ���̻�� �ɰ���
		Arrays.sort(str_arr);				// ���ĺ� ������ ����
		print(str_arr);						// ���
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
			str_arr[i] = str.substring(i,str.length());	// i~���ڿ��� ���������� �����Ͽ� ���� �迭�� ����
		}
	}

}
