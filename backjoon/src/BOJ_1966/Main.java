package BOJ_1966;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;


public class Main {
	
	static class Document{
		private int id;
		private int priority;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getPriority() {
			return priority;
		}
		public void setPriority(int priority) {
			this.priority = priority;
		}
		
		public Document()
		{
			
		}
		
		public Document(int id, int priority) {
			this.id = id;
			this.priority = priority;
		}
		
		@Override
		public String toString() {
			return "Document [id=" + id + ", priority=" + priority + "]";
		}
		
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		int id = 0;
		
		while(tc-->0)
		{
			String[] strs = br.readLine().split(" ");
			int n = Integer.parseInt(strs[0]);
			int m = Integer.parseInt(strs[1]);
			String [] pri = br.readLine().split(" ");
			List<Document> printer = new ArrayList<>();
			for(String p : pri)
			{
				printer.add(new Document(id, Integer.parseInt(p)));
				id++;
			}
			
			Document target = printer.get(m);
			
			
			
			
			
		}
		
		
	}
}
