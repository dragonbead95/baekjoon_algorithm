import java.util.Scanner;

class Test{
	long sum(int[] a) {
		int i, sum=0;
		
		for(i=0;i<a.length;i++) {
			sum += a[i];
		}
		
		return sum;
	}
}

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Test t = new Test();
		int arr[];
		int len,i;
		long result;	//�հ��� �����
		System.out.print("�迭�� ������ �Է����ּ��� : ");
		len = sc.nextInt();
		arr = new int[len];
		
		for(i=0;i<arr.length;i++) 
		{
			System.out.print((i+1)+"��° ���ڸ� �Է����ּ��� : ");
			arr[i] = sc.nextInt();
		}
		
		result = t.sum(arr);
		
		for(i=0;i<arr.length;i++) 
		{
			if(i!=arr.length-1) {
				System.out.print(arr[i] + "+");
			}else {
				System.out.print(arr[i]);
			}
			
		}
		System.out.print("=" + result);
	}

}
