package Array;  

public class getreturnarray {     // Array as return type so
	
	static int[] getarray() {
		return new int[] {10,20,30,40,50};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] array = getreturnarray.getarray();
      
      System.out.println("XXXXXXXXXXX  the for loop is XXXXXXXXXXXXXXXXXXXX");
      
      for (int i=0;i<array.length;i++) {
    	  System.out.println("The length element is "+array[i]);
      }
      
	}

}
