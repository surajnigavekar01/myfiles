package Array;

public class charAndMultiDimension {

	public static void main(String[] args) {
		
		System.out.println("XXXXXXXXXXXXX Numeric Program Start XXXXXXXXXXXXXXXXXXXXXXXXX");
		// TODO Auto-generated method stub
      int [] suraj []= {{25,65,41,52},{42,52},{58,94,62,35,35,52}};
      
      for(int i=0;i<suraj.length;i++) {
    	  for(int j =0;j<suraj[i].length;j++ ) {
    		  System.out.print(suraj[i][j]+",");
    	  }
    	  System.out.println();
      }

	System.out.println("XXXXXXXXXXXXX Charactor Program Start XXXXXXXXXXXXXXXXXXXXXXXXX");
	
	char [] om []= {{'A','B','C','D'},{'F','G'},{'H','I','K','L','M','N'}};
    
    for(int i=0;i<om.length;i++) {
  	  for(int j =0;j<om[i].length;j++ ) {
  		  System.out.print(om[i][j]+" ");
  	  }
  	  System.out.println();

}
}
}
