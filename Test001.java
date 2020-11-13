package test;

public class Test001 {

	public static void main(String[] args) {
		int x =1;
		int y =1;
		
		if(x++ < ++y) {
			System.out.println("hello");
		}else {
			System.out.println("Welcome");
		}
		System.out.println("Log"+x+":"+y);
	}

}
