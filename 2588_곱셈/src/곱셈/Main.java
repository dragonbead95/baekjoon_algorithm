package °ö¼À;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int A,B,C;
		int result =1;
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		sc.nextLine();
		B = sc.nextInt();
		sc.nextLine();
		C = sc.nextInt();
		sc.nextLine();
		sc.close();
		
		System.out.println((int)(Math.pow(A, B)%C));
	}
}

