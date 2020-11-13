package test;
class A{
	public A() {
		System.out.println("A");
	}
}
class B extends A{
	public B() {
		System.out.println("B");
	}
}
public class Test024 extends B {
	public Test024() {
		System.out.println("C");
	}
	public static void main(String[] args) {
		Test024 c = new Test024();
	}
}
