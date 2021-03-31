package ±∏±€ƒ⁄µÂ¿Î2021.Reversort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		
		// testcase
		for(int i=0;i<tc;i++)
		{
			// input
			int n = Integer.parseInt(br.readLine());
			List<Integer> L = new ArrayList<Integer>();
			
			String[] str = br.readLine().split(" ");
			for(int j=0;j<str.length;j++)
			{
				L.add(Integer.parseInt(str[j]));
			}
			
			int answer = 0;
			
			for(int k=0;k<L.size()-1;k++)
			{
				List<Integer> dummy = L.subList(k, L.size());
				int j = L.indexOf(Collections.min(dummy));
				
				dummy = L.subList(k, j+1);
				Collections.reverse(dummy);
				answer += (j-k+1);
			}
			
			System.out.printf("Case #%d: %d\n", i+1,answer);
			
		}
	}

}
