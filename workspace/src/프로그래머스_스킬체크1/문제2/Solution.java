package 프로그래머스_스킬체크1.문제2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static String solution(String s)
	{
		int len = s.length();
		int idx = len/2;
		if(len%2==0)
		{
			return s.substring(idx-1,idx+1);
		}
		else
		{
			return s.charAt(idx)+"";
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(solution(s));
	}

}
