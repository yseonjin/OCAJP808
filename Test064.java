package test;

class MyString{
	String msg;
	MyString(String msg){
		this.msg = msg;
	}
}

public class Test064 {
	public static void main(String[] args) {
		System.out.println("Hello " + new StringBuilder("Java SE 8"));
		System.out.println("Hello " + new MyString("Java SE 8"));
	
		StringBuilder str = new StringBuilder("Hello World");
		str.append(" This is Java");
		System.out.println("append : "+str);
		str.delete(1, 3);
		System.out.println("delete : "+str);
		str.insert(3, "INSERT!!!");
		System.out.println("insert : "+str);
		str.reverse();
		System.out.println("reserve : "+str);
	
	}
}
