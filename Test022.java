package test;

public class Test022 {
	
	public static void main(String[] args) {
		 int ans =0;
		System.out.println(ans);
		try {
			int num = 10;
			int div = 0;
			ans = num/div;
			System.out.println("ans : "+ ans);
		}catch(Exception e) {
			System.out.println("Invalid calculation" + e.getMessage());
		}
	
}
}
