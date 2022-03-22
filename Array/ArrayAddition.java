package Array;

public class ArrayAddition {

	public static void main(String[] args) {

		int[] sorab = { 25, 5, 56, 52, 33, 85, 6, 92, 33, 5, 5, 5, 65 };
		int sum = 0;
		int average;

//		System.out.println("For each loop program starts the program here XXXXXXXXXXXXXX ");
//		for (int i : sorab) {
//			sum = i + sum;
//		}

		System.out.println("For loop program starts the program here XXXXXXXXXXXXXXXXXXX ");
		for (int s = 0; s < sorab.length; s++) {
			sum = sorab[s] + sum;
		}

		int length = sorab.length;

		average = sum / length;

		System.out.println("the value of sum is " + sum);
		System.out.println("the value of average is " + average);
		System.out.println("The value of length is " + length);

	}
}