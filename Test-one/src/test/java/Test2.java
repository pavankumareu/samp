import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 0, 3, 4, 6, 1, 2, 2, 1 }; // 3
		int b[] = { 0, 3, 1, 5, 1, 0, 2, 0 };// 3
		int c[] = { 1, 3, 7, 6, 8, -1, -10, 15 };

		System.out.println("SMALLEST NUMBER IN ARRAY A");
		smallestPositive(a);
		System.out.println("SMALLEST NUMBER IN ARRAY B");
		smallestPositive(b);
		System.out.println("SMALLEST NUMBER IN ARRAY C");
		smallestPositive(c);

	}

	public static int max(int[] ar) {
		int max = ar[0];
		for (int i = 1; i < ar.length; i++) {
			if (max < ar[i]) {
				max = ar[i];
			}

		}
		return max;
	}

	public static void smallestPositive(int[] ar) {

		Arrays.sort(ar);
		int count = 0;
		// System.out.println(ar[ar.length-1]+1);
		for (int i = 1; i <= max(ar) + 1; i++) {
			for (int j = 0; j < ar.length; j++) {

				if (i == ar[j]) {
					count++;
				}

			}
			//System.out.println(i + " " + count);
			if (count == 0) {

				System.out.println("the smallest positive number is " + i);
				return;
			} else {
				count = 0;
			}
		}

	}
}
