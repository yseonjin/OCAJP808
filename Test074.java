package test;

public class Test074 {
	void readCard(int cardNo) throws RuntimeException{
		System.out.println("Reading Card");
	}
	void checkCard(int cardNo) throws RuntimeException{
		System.out.println("Checking Card");
	}
	public static void main(String[] args) {
		Test074 ex = new Test074();
		int cardNo = 12344;
		ex.readCard(cardNo);
		ex.checkCard(cardNo);
	}

}
