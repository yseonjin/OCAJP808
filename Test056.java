package test;

public class Test056 {

	public static void main(String[] args) {
		String str = " A";
		String trim_str = str.trim();
		System.out.println(str.length());
		System.out.println(trim_str.length());
		System.out.println(str.equals("A")+""+str.isEmpty());
		System.out.println(trim_str.equals("A")+""+str.isEmpty());
		
		String str2 = "";
		System.out.println(str2.isEmpty());
	}

}
