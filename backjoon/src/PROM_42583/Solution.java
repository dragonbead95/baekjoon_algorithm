package PROM_42583;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Solution {
	
	// �ٸ� ���� �ö� Ʈ���� ����
	class Truck{
		int weight;
		int time;
		
		public Truck(int weight, int time)
		{
			this.weight = weight;
			this.time = time;
		}
	}
	
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Stack<Truck> bridge = new Stack<Truck>();	// �ٸ�
        List wait_t = Arrays.asList(truck_weights);	// ��� Ʈ��
        int t_idx = 0;				// wait_t index
        int time = 0;				// ��� �ð�
        int cur_bridge_weight = 0;	// ���� �ٸ� ����
        
        while(bridge.size()!=0 && wait_t.size()!=0)
        {
        	int w = (int) wait_t.get(0);
        	if(w+cur_bridge_weight <= weight)
        	{
        		bridge.add(new Truck(w,0));
        	}
        	bridge.add(new Truck(,time));
        	time++;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {

	}
}