package Array;

class A{
       
       }
class B extends A{
    
                  }
class C extends B{
 
	             }


public class Method04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A[] Array = new A[6];
		
		Array[0] = new A();
		Array[1] = new C();
		Array[2] = new B();
		Array[3] = new A();
		Array[4] = new C();
		Array[5] = new B();

		for (A k : Array) {
			System.out.println("The elemnts are " + k);
		}

//		System.out.println(Array.length);
//		Arrays.sort(Array);
		
		for (A k : Array) {
			System.out.println("The elemnts are " + k);
		}
	}

	}

