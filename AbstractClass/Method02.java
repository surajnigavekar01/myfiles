package AbstractClass;

abstract class A {
	abstract void test_01();

	abstract void test_02();

	static void suraj(double i) {
		System.out.println("The out put of class is " + i);
	}

	void sun() {
		System.out.println("I am from sun method in abstract class");
	}
}

abstract class B extends A {

	void test_01() {
		System.out.println("The abstract class test 01");
	}

//	void test_02() {
//		System.out.println("The abstract class test 02");
//	}
}

	class Method02 extends B {
		void test_02() {
			System.out.println("The abstract class test 02");
		}

	
	public static void main(String[] args) {

		Method02 s1 = new Method02();
		s1.test_01();
		s1.test_02();
		A.suraj(25.45);
		s1.sun();
	}

}
