package testPractice;

public class Test139 {
	static int count;
	public static void displayMSG() {
		System.out.println("Welcome Visit Count: "+ count++);		
	}
	public static void main(String[] args) {
		Test139.displayMSG();
		displayMSG();
	}

}
