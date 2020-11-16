package test;

public class Test093 {
	int id;
	String name;
	public Test093(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public static void main(String[] args) {
		Test093 p1 = new Test093(101, "Pen");
		Test093 p2 = new Test093(101, "Pen");
		Test093 p3 = p1;
		boolean ans1 = p1 ==p2;
		boolean ans2 = p1.name.equals(p2.name);
		boolean ans3 = p1 ==p3;
		boolean ans4 = p1.id == p2.id;
		System.out.println(ans1 + ":" + ans2 + ": "+ans3 + ":" +ans4);
	}
}
