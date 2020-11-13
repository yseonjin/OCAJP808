package test;

public class Test065 {

	public static void main(String[] args) {
		float var1 = (12_345.01 <= 123_45.00) ? 12_456 : 123_56.02f;
		System.out.println(var1);
		float var2 = var1 + 1024;
		System.out.println(var2);
	}

}
