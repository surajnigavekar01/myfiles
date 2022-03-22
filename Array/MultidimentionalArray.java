package Array;

public class MultidimentionalArray {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[][] array = new int[3][3];
//
//		System.out.println("xxxxxxxxxxxxxx Before Initilization XXXXXXXXXXXXXXXXXX");
//
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array.length; j++) {
//				System.out.print(array[i][j] + " ");
//			}
//			System.out.println();
//		}
//		System.out.println("the length of array is " + array.length);
//
//		array[0][0] = 1;
//		array[0][1] = 2;
//		array[0][2] = 3;
//		array[1][0] = 4;
//		array[1][1] = 5;
//		array[1][2] = 6;
//		array[2][0] = 7;
//		array[2][1] = 8;
//		array[2][2] = 9;
//
//		System.out.println("xxxxxxxxxxxxxx After Initilization XXXXXXXXXXXXXXXXXX");
//
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j <array.length; j++) {
//				System.out.print(array[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//	}
//
//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[3][2];

		System.out.println("xxxxxxxxxxxxxx Before Initilization XXXXXXXXXXXXXXXXXX");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("the length of array is " + array.length);

		array[0][0] = 1;
		array[0][1] = 2;
		//array[0][2] = 3;
		array[1][0] = 4;
		array[1][1] = 5;
		//array[1][2] = 6;
		array[2][0] = 7;
		array[2][1] = 8;
		//array[2][2] = 9;

		System.out.println("xxxxxxxxxxxxxx After Initilization XXXXXXXXXXXXXXXXXX");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j <array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}

