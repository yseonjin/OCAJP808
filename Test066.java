package test;
interface I{
	public void displayI();
}
abstract class C2 implements I{
	public void displayC2() {
		System.out.println("C2");
	}
}
public class Test066 extends C2 {
	public static void main(String[] args) {
		C2 obj1 = new Test066();
		I obj2 = new Test066();
		
		C2 s = (C2) obj2;
		I t = obj1;
		
		t.displayI();
		s.displayC2();
		s.displayI();
		System.out.println("C1");
	}

	@Override
	public void displayI() {
		System.out.println("Test066");		
	}
}
