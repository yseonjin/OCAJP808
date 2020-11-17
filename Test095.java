package test;

import java.util.ArrayList;
import java.util.List;

public class Test095 {
	int id;
	String name;
	Test095(int id, String name){
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) {
		List<Test095> lst = new ArrayList<Test095>();
		lst.add(new Test095(10, "IceCream"));
		lst.add(new Test095(11, "Chocolate"));
		Test095 p1 = new Test095(10, "IceCream");
		System.out.println(lst.indexOf(p1));
	}

}
