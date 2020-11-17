package test;

public class starMake {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int cnt = 0;
		if(a <= b) {
			for(int i = a ; i <= b;i++) {
				cnt += i;
			}
		}else {
			for(int i = b ; i <= a;i++) {
				cnt += i;
			}
		}
		System.out.println(cnt);
	}

}
