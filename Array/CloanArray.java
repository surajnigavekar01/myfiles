package Array;

import java.util.Arrays;

public class CloanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] aay = {45,83,4,45,20,30,54,65};
		System.out.println("XXXXXXXXXXXXXXXXXXXX  The new methods XXXXXXXXXXXXXXXXXXXXXXXX");
		for(int j:aay) {
			System.out.println(j);
		}
		System.out.println("XXXXXXXXXXXXXXXXXXXX  The new methods XXXXXXXXXXXXXXXXXXXXXXXX");
		int [] surr = aay.clone();
		for(int k:surr) {
			System.out.println(k);
		}
		System.out.println("Both are equals");
		System.out.println(aay==surr);
		System.out.println(Arrays.equals(aay, surr));
		
		System.out.println("XXXXXXXXXXXXXXXXXXXX  The new methods XXXXXXXXXXXXXXXXXXXXXXXX");
		
		Arrays.sort(surr);
		for(int k:surr) {
			System.out.println(k);
		}
		

	}

}
