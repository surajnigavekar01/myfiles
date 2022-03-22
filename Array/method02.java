package Array;

public class method02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] age = { 12, 5, 6, 84, 52, 5, 45, 54 };
		System.out.println("starts the program here ");
		System.out.println("Fristh access element " + age[0]);
		System.out.println("Scecondth  access element " + age[1]);
		System.out.println("Thirdth  access element " + age[2]);
		System.out.println("fourth access element " + age[3]);
		System.out.println("fifth access element " + age[4]);
		System.out.println("sixth access element " + age[5]);
		System.out.println("seventh access element " + age[6]);
		System.out.println("Eighth access element " + age[7]);

		System.out.println("For loop program starts the program here XXXXXXXXXXXXXX ");

		for (int s = 0; s < age.length; s++) {
			System.out.println("access element " + s + " : " + age[s]);
		}

		System.out.println("For each loop program starts the program here XXXXXXXXXXXXXX ");
		for (int suso : age) {
			System.out.println("access element " + suso);
		}

	}
}
