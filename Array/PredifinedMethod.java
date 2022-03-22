package Array;

public class PredifinedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] sun = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K' };

		char[] CopyTo = new char[8];
		System.arraycopy(sun, 2, CopyTo, 0, 8);
		for (int i = 0; i < CopyTo.length; i++) {
			System.out.print(CopyTo[i]);
		}
        
		System.out.println(String.valueOf(CopyTo));
	}

}
