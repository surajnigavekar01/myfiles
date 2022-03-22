package Array;

import java.util.Arrays;

public class method01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Array = new int[6];
		Array[0] = 28;
		Array[1] = 26;
		Array[2] = 23;
		Array[3] = (int)221.32;
		Array[4] = 22;
		Array[5] = 30;

		for (int k : Array) {
			System.out.println("The elemnts are " + k);
		}

		System.out.println(Array.length);
		Arrays.sort(Array);
		
		for (int k : Array) {
			System.out.println("The elemnts are " + k);
		}
	}

}
