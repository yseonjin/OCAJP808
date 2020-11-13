package test;
class Caller{
	protected void init() {
		System.out.println("Initialized");
	}
	void start() {
		init();
		System.out.println("Started");
	}
}
public class Test067 extends Caller {

	public static void main(String[] args) {
		Caller c = new Caller();
		c.start();
		c.init();
	}

}
