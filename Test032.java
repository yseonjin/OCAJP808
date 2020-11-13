package test;

public class Test032 {

	public static void main(String[] args) {
		int n = 12345;
		int answer = 0;
		
		while(n > 0 ) {
			answer += n % 10;
			n = n/10;
			System.out.println("answer : "+answer);
			System.out.println("n : "+n);
		}
		System.out.println(answer);
		
	}

}
