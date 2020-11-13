package test;

public class Test010 {
	
	public static void doSum(Integer x, Integer y) {
		System.out.println("Integer sum is "+ (x + y) );
	}
	
	public static void main(String[] args) {
		Integer x = 30;
		Integer y = 40;
		int ix = 30;
		int iy =40;
		float fx = 30;
		float fy =40;
		doSum(x, y);
		doSum(ix, iy);

		
	}

}
