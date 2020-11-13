package test;

public class Test020 {
	int a1,a;
	public int doProduct(int a) {
		a *= a;
		return a;
	}
	public String doString(String s) {
		return s.concat(s + "World");
	}
	
	public static void main(String[] args) {
		int a1 = 11;
		String sb ="Hello";
		Integer i = 10;
		System.out.println("====메서드 적용전=====");
		System.out.println(i+" "+sb + " " + a1);
		System.out.println("===메서드 적용후=====");
		Test020 item = new Test020();
		System.out.println(item.doProduct(i));
		System.out.println(item.doProduct(a1));
		System.out.println(item.doString(sb));
	}
}
