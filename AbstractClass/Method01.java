package AbstractClass;
abstract class surat {
	surat() {
		System.out.println("I am from abstrscat constractor ");
	}

	abstract void surat01();

	static void surat001() {
		System.out.println("I am from abstrscat concreet method ");
	}

}

abstract class sun extends surat {

	sun() {
		super();
		System.out.println("I am from abstrscat constractor in class sun");
	}

}

class moon extends sun {
	void surat01() {
		System.out.println("I am from abstrscat calss method and called from moon");
	}
}

public class Method01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		moon s1 = new moon();
		s1.surat01();
		// System.out.println("Print sun method"+ s1.surat01(););
		surat.surat001();
	}

}


