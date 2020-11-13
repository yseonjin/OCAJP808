package test;

public class Test017 {
	int x,y;
	
	public Test017(int x, int y) {
		initialize(x, y);
	}
	public void initialize(int x, int y) {
		this.x = x*x;
		this.y = y*y;
	}
	public static void main(String[] args) {
		int x= 3, y = 5;
		Test017 obj = new Test017(x, y);
		System.out.println(obj.x+" , "+obj.y);
		System.out.println(x+" , "+y);
	}
}
