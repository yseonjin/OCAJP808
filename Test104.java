package test;

class Base{
	public void test() {
		System.out.println("Base");
	}
}
class DerivedA extends Base{
	public void test() {
		System.out.println("DerivedA");
	}
}

public class Test104 extends DerivedA{
	public void test() {
		System.out.println("Test104");
	}
	public static void main(String[] args) {
		Base b1 = new Test104();
		Base b2 = new DerivedA();
		Base b3 = new Test104();
		Base b4 = b3;
		b1 = b2;
		b1.test();
		b4.test();
	}

}
