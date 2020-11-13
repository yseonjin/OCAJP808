package test;

import java.util.Arrays;

public class Test025_1 {

	public static void main(String[] args)  {
	        int[] a = { 1, 2, 3, 4 };
	        int[] b = Arrays.copyOfRange(a, 1, 3);
	        
	        for(int x : b) {
	        	System.out.println(x);
	        }
    }
}
