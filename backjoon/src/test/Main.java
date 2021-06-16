package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {
	public static int[] solution(int[] arr)
	{
		Map<Integer,Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		int[] answer;
		for(int item : arr)
		{
			if(!map.containsKey(item))
			{
				map.put(item, 1);
			}
			else
			{
				map.put(item, map.get(item)+1);
			}
		}
		
		for(Integer key : map.keySet())
		{
			if(map.get(key)>1)
			{
				list.add(map.get(key));
			}
		}
		if(list.size()==0)
		{
			list.add(-1);
		}
		
		answer = new int[list.size()];
		for(int i=0;i<answer.length;i++)
		{
			answer[i] = list.get(i);
		}
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {1,2,3,3,3,3,4,4};
//		int[] arr = {3,2,4,4,2,5,2,5,5};
		int[] arr = {3,5,7,9,1};
		int[] answer = solution(arr);
		
		System.out.println(Arrays.toString(answer));
	}

}
