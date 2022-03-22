package AbstractClass;

	//Abstract class
	abstract class Animal {
		// Abstract method (does not have a body)
		public abstract void animalSound();
		// Regular method
		public void sleep() {
			System.out.println("Zzz");
		}
	}
	// Subclass (inherit from Animal)
	class Pig1 extends Animal {
		public void animalSound() {
			// The body of animalSound() is provided here
			System.out.println("The pig says: wee wee");
		}
	}
	//Subclass (inherit from Animal)
	class Dog extends Animal {
		public void animalSound() {
			// The body of animalSound() is provided here
			System.out.println("The dog says: bow bow");
		}
	}
	public class method03 {
			public static void main(String[] args) {
				Pig1 myPig = new Pig1(); // Create a Pig object
				myPig.animalSound();
				myPig.sleep();
				Dog d1=new Dog();
				d1.animalSound();
				d1.sleep();
			}
	
			}

