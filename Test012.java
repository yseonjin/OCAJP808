package test;

public class Test012 {
	
	
	/*public static void doSum(int x, int y) {
		System.out.println("int sum is "+ (x + y) );
	}*/
	public static void doSum(Integer x, Integer y) {
		System.out.println("int sum is "+ (x + y) );
	}
	/*public static void doSum(double x, double y) {
		System.out.println("double sum is "+(x + y) );
	}
	*/
	public static void doSum(float x, float y) {
		System.out.println("float sum is "+ (x + y) );
	}
	
	public static void main(String[] args) {
		
		doSum(10, 20);
		System.out.println("");
		doSum((int)10.0, (int)20.0);
		doSum((float)10.0,(float) 20.0);
		doSum(10.0f, 20.0f);
	}
	
}
