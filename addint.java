package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class addint {

	public static void main(String[] args) {
		int[] answer = {};
		int[] numbers = {2,1,3,7,8,4,1,0,2,3};
		List<Integer> temp = new ArrayList<Integer>();
		int sum = 0;
		Arrays.sort(numbers);
		
		for(int i = 0 ;i < numbers.length;i++) {
			for(int j = i+1; j < numbers.length;j++) {
				sum = numbers[i]+numbers[j];
				if(temp.contains(sum) == false) {
					temp.add(sum);
				}
			}
		}
		answer  = new int[temp.size()];
		for(int i = 0; i<temp.size();i++) {
			answer[i] = temp.get(i);
		}
		for(int x :answer) {
			System.out.println(x);
		}
	
	}

}
