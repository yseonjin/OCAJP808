package test;

import java.util.ArrayList;
import java.util.List;

public class tocharArray {
	public static void main(String[] args) {
		int[] arr= {4,4,4,3,3};
		int num = 10;
		List<Integer> temp = new ArrayList<Integer>();
		
		for(int i : arr) {
			if(i != num) {
				temp.add(i);
				num = i;
			}
		}
		int answer[] = new int[temp.size()];
		for(int i = 0 ; i < answer.length;i++) {
			answer[i] = temp.get(i);
			System.out.println(answer[i]);
		}
		
		
	}
}
