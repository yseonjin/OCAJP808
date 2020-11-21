package testPractice;

import java.util.*;

public class Test001 {

	public static void main(String[] args) {
			int arr[] = {5,9,7,10};
			int cnt = 0;
			int divisor = 5;
	        List<Integer> temp = new ArrayList<Integer>();
	        
	        for(int i =0 ; i<arr.length;i++){
	            if((arr[i]%divisor) == 0 ){
	               temp.add(arr[i]);
	               cnt++;
	               System.out.println("cnt :  " +cnt);
	            }
	        }
	        int answer[] = new int[temp.size()];
	        for(int i =0 ; i < temp.size(); i++){
	            answer[i] = temp.get(i);
        }
	        int idx = temp.indexOf(5);
	        System.out.println(idx);
	        Arrays.sort(answer);
	        if(cnt == 0) {
	        	answer[1]=-1;
	        }
	        for(int x : answer) {
	        	System.out.println("x : " +x);
	        }
	        
	        
	}
}
