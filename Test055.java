package test;

public class Test055 {
	public static void main(String[] args) {
		int x = 5;
		while(isAvailable(x)) {
			System.out.println(x);
		}
	}
	
	private static boolean isAvailable(int x) {
		return x--> 0? true :  false;
	}
}
