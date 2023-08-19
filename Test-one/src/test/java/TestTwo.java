import java.util.Arrays;

public class TestTwo {

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		int a[] = { 0, 2, 4, 5, 1, 2, 2, 1 }; // 3
		int b[] = { 0, 0, 1, 5, 1, 0, 2, 0 };// 3
		Arrays.sort(a);
		Arrays.sort(b);
		
		System.out.println("Smalles number in Array a");
		smallestPositive(a);
		System.out.println("Smalles number in Array b");
		smallestPositive(b);

	}

	public static void smallestPositive(int[] ar) {
		int s = 0;
		
		
//		for(int i=0;i<ar.length;i++)
//		{
//			
//			for(int j=i;j<ar.length;j++)
//			{
//				if()
//				
//			}
				
			
		//}
		
		for (int i = 0; i < ar.length; i++) {
			if (s==ar[i]) {
				s++;
//			} else {
//				s=s+1;
//				
//				System.out.println("Smallest positive number is: " + s);
//
//			}
				
				

		}
			System.out.println("Smallest positive number is: " + s);
	}
	}}
