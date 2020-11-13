package test;

public class Test007 {
	static int i;
	int j;
	
	public static void main(String[] args) {
		Test007 x1 = new Test007();
		Test007 x2 = new Test007();
		x1.i = 3;
		x2.i = 5;
		System.out.println(x1.i+""+x1.j +""+x2.i+""+x2.j);
		
		System.out.println(i);
		
	}
}
