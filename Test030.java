package test;

import java.util.ArrayList;
import java.util.List;

public class Test030 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Robb");
		names.add("Brian");
		names.add("Rick");
		names.add("Bran");
		names.add("Jon");
		names.add("Jon");
		
		if(names.remove("Bran")) {
			names.remove("Jon");
		}
		System.out.println(names);
		
	}

}
