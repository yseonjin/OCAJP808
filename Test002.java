package testPractice;

public class Test002 {

	public static void main(String[] args) {
		int arr[] = {4,3,2,1};
		int answer[] = {};
		int max = arr[0];
		if(arr.length > 1) {
			for(int i = 1 ; i < arr.length ; i ++) {
				answer = new int[arr.length-1];
				if(arr[i] < max) {
					for(int j=0;j<answer.length;j++) {
						answer[j] = max;						
						max = arr[i];
					}
				}
			}
		}else {
			answer = new int[1];
			answer[0] = -1;
		}
		
		for(int x :  answer) {
			System.out.println(x);
		}
	}

}
