package Array;  // Single dimensional array 

public class ArrayBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a[]; //  Declaration of array 

		a = new double [5];  // Initialization of array is

		// Or

	//	int a[] = new int[5]; // Declaration and Initialization
		// By Default array value 0 before initialization
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		
		System.out.println("Array Length Count " + a.length);
		
		for (int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("XXXXXXXXXXXXXXX   For each loop  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		
		for(double suraj: a) {
			System.out.println(suraj);
		}
				
	}

}
