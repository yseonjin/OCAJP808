package test;

public class Test072 {

	public static void main(String[] args) {
		System.out.println(isAvailable + "");
		isAvailable = doStuff();
		System.out.println(isAvailable);
	}
	public static boolean doStuff() {
		return !isAvailable;
	}
	static boolean isAvailable = false;

}
