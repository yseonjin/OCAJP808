package test;
class C4{
	public void displayC2() {
		System.out.println("C4");
	}
}
	interface I2{
		public void displayI();
	}
	class Test071 extends C4 implements I2 {

	@Override
	public void displayI() {
		System.out.println("C1");
		
	}
	}


