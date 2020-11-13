package test;

public class Test070 {

	public static void main(String[] args) {
		int x = 10;
		int y = ++x;
		System.out.println("y : "+y);
		int z = 0;
		System.out.println("x1 : "+x);
		if(y <= 10 || y <= x++) {
			System.out.println("x2 : " +x);
			z =x;
		}else {
			z = x++;
		}
	}

}
