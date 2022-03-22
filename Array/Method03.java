package Array;

import java.util.Arrays;

public class Method03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Array = new String[6];
		
		Array[0] = "abc";
		Array[1] = "kjk";
		Array[2] = "dfj";
		Array[3] = "df2";
		Array[4] = "lkb";
		Array[5] = "310";

		for (String k : Array) {
			System.out.println("The elemnts are " + k);
		}
		
		System.out.println();
		System.out.println("The array will be "+Array [2]);
		Array [2]= "sjhd";
		System.out.println("The array will be "+Array [2]);
		
		System.out.println();
		System.out.println(Array.length);
		Arrays.sort(Array);
		
		for (String k : Array) {
			System.out.println("The elemnts are " + k);
		}
	}


	}


