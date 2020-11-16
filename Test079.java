package test;

class C{
	public void C() {
		System.out.println("C");
	}
}
class B1 extends C{
	public B1() {
		System.out.println("B");
	}
}


public class Test079 extends B1 {
	public Test079() {
		System.out.println("A");
	}
	public static void main(String[] args) {
		Test079 a = new Test079();
	}

}
