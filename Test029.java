package test;

import java.util.ArrayList;

public class Test029 {

	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(1);
		points.add(2);
		points.add(3);
		points.add(4);
		points.add(null);
		System.out.println(points);
		points.remove(1);
		points.remove(null);
		System.out.println(points);
		System.out.println(points.get(2));
		System.out.println(points.contains(1));
		System.out.println(points.indexOf(1));
		
	}

}
