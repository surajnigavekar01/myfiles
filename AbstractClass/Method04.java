package AbstractClass;

		abstract class Bike1 {
			abstract void run();
			
		final void surya() {
				System.out.println("The method in abstract class");
			}
		static final void surya1() {
			System.out.println("The static method in abstract class");
		}
			void speed(int spd) {
				System.out.println("Bike speed: "+spd);
			}
		}
		class Honda4 extends Bike1 {
			void run() {
				System.out.println("running safely");
			}
			void speed(int spd) {
				System.out.println("Honda4 speed: "+spd);
			}
			void color() {
				System.out.println("Honda1 color is blue");
			}
		}
		public class Method04 {
			public static void main(String args[]) {
				Honda4 obj = new Honda4();
				obj.run();
				obj.speed(60);
				obj.color();		
				//Bike1 b1=new Bike1();
				Bike1 b2=new Honda4();
				b2.run();
				b2.speed(20);
				b2.surya();
				Bike1.surya1();
				//b2.color();
			}
		}

