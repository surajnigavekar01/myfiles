package Array;

public class LogicalMinAndMax {
	
	static void min(int suraj[]) {
		int min=suraj[0];
		for (int i=0;i<suraj.length;i++) {
			if(min>suraj[i]) {
				min=suraj[i];
			}
		}
		System.out.println("The vale of minimum is "+ min);
		}
	
		static void max(int suraj[]) {
		int max=suraj[0];
		for (int i=0;i<suraj.length;i++) {
			if(max<suraj[i]) {
				max=suraj[i];
			}
		}
		System.out.println("The vale of maximum is "+ max);
	
	}
		
		void surya(int suraj[]) {
			for (int i= 0;i<suraj.length;i++) {
//				System.out.println("the value of the array "+suraj[i]);
				if(suraj[i]==25) {
					System.out.println("The value of the array "+suraj[i]);
					break;
				}else {
					continue;
				}
				
			}
		}
		
		
		
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[] suraj= {5,65,65,95,4,63,4,2,69,64,45,68,651,463,31,84,84,25,163,51};
  LogicalMinAndMax.min(suraj);
  LogicalMinAndMax.max(suraj);
  LogicalMinAndMax s1 =new LogicalMinAndMax();
  s1.surya(suraj);
	}

}
